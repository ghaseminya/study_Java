package com.nonblock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Server {
	
	//서버의 포트번호 설정
	public static final int PORT_NUMBER = 9898;
	
	private Abortable abortable;
	private ServerThread serverThread;

	public Server(){
		abortable = new Abortable();
	}

	public static void main(String[] args) throws Exception{

		Server server = new Server();
		server.start();
		System.out.println("Server :: START");
		
		//쓰레드가 0.5간 CPU할당을 반납
		Thread.sleep(500);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		reader.readLine();
		
		server.stop();
		
		System.out.println("Server :: BYE");
		
	}

	public void start(){
		abortable.init();
		
		if(serverThread == null || !serverThread.isAlive() ){
			serverThread = new ServerThread(abortable);
			serverThread.start();
		}
	}
	
	public void stop(){
		abortable.done = true;
		
		if(serverThread != null && serverThread.isAlive() ){
			serverThread = new ServerThread(abortable);
			serverThread.interrupt();
		}
	}
	
	public class ServerThread extends Thread{
		private Abortable abortable;
		private List<Thread> clientList = new ArrayList<Thread>();
		
		public ServerThread(Abortable abortable){
			this.abortable = abortable;
		}

		@Override
		public void run() {
			super.run();
			
			ServerSocketChannel server = null;
			//Selector클래스는 일종의 이벤트 리스너
			//Non-blocking모드를 지원하는 채널에 Selector를 등록해 둠으로써
			//Non-blocking채널을 연결요청이 들어오거나 데이터가 도착하는 경우에 그 사실을 Selector에 알리게 됩니다.
			//이 Selector는 어떤 기능을 사용할 수 있는지를 리턴하게 되며 그 리턴값을 통해서 
			//연결요청을 처리할 지 데이터 읽기를 처리할 지 결정하게 됩니다.
			Selector selector = null;
			
			try{
				System.out.println("Server :: Started");
				
				server = ServerSocketChannel.open();
				server.socket().bind(new InetSocketAddress("", PORT_NUMBER));
				server.configureBlocking(false);
				
				//Selector 객체 생성
				selector = Selector.open();
				server.register(selector, SelectionKey.OP_ACCEPT);
				System.out.println("Server :: Waiting for accept");
				
				while(!Thread.interrupted() && !abortable.isDone()){
					selector.select(3000);
					
					Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
					while(iterator.hasNext()){
						
						SelectionKey key = iterator.next();
						if(key.isAcceptable()){
							SocketChannel client = server.accept();
							
							if(client!=null){
								System.out.printf("Server :: Accepted - Client[%s]\n", client.getLocalAddress());
								Thread thread = new ClientHandlerThread(abortable, client);
								thread.start();
								clientList.add(thread);
							}
						} //if
					} //while
				} //while
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				for(Thread t : clientList){
					if(t!=null && t.isAlive())
						t.interrupt();
					
					try{
						t.join(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				} //for
				
				if(server!=null){
					try{
						server.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
				System.out.println("Server :: Done");
			} //try
		} //run
	} //ServerThread
	
	//접속한 클라이언트를 처리하는 쓰레드 
	public class ClientHandlerThread extends Thread{
		private Abortable abortable;
		private SocketChannel client;
		
		public ClientHandlerThread(Abortable abortable, SocketChannel client){
			this.abortable = abortable;
			this.client = client;
		}

		@Override
		public void run() {
			super.run();
			
			Selector selector = null;
			Charset  cs = Charset.forName("UTF-8");
			
			boolean done = false;
			
			try{
				
				System.out.println("Client :: Started");
				
				client.configureBlocking(false);
				selector = Selector.open();
				
				client.register(selector, SelectionKey.OP_READ);
				
				//"Welcome" 메시지 전송
				client.write(ByteBuffer.wrap(new String("Welcome").getBytes()));
				
				ByteBuffer buffer = ByteBuffer.allocate(1024);
				
				while(!Thread.interrupted()&& !abortable.isDone() && !done){
					
					selector.select(3000);
					
					Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
					while(!abortable.isDone() && iterator.hasNext() && !done){
						SelectionKey key = iterator.next();
						if(key.isReadable()){
							int len = client.read(buffer);
							if(len<0){
								done = true;
								break;
							}else if(len==0){
								continue;
							}
							buffer.flip();
							
							CharBuffer charBuffer = cs.decode(buffer);
							System.out.print("From Client: ");
							
							while(charBuffer.hasRemaining()){
								
								System.out.printf("%c", charBuffer.get());
							}
							System.out.println();
							
							buffer.compact();
							
						} //if
					} //while
				} //while
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				if(client!=null){
					try{
						client.socket().close();
						client.close();
						
					}catch(IOException e){
						e.printStackTrace();
					}
				}
				System.out.println("Client :: BYE");
			} //try
		} //run
	} //ClientHandlerThread
} //Server
