/* Chatting 프로그램 - MultiServerThread
 * 
 *  
 *  MultiClient
 *  MultiClientThread
 *  MultiServer
 *  MultiServerThread
 *  
 * ------------------------------------------------
 * 각각의 클라이언트의 소켓 객체를 유지하기 위한 클래스.
 * 이 클래스는 멀티서버에 있는 컬렉션을 가지고 있기 때문에 다른 클라이언트에게 메시지를 보낼수 있습니다. 
 *  
 */

package com.chat3.multi;

import java.net.*;
import java.io.*;
public class MultiServerThread implements Runnable{
	//멤버변수
	private Socket socket;
	private MultiServer ms;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public MultiServerThread(MultiServer ms){
		this.ms = ms;
	}
	
	//데이터 처리시 데이터 외곡을 방지하기 위해 synchronized 블록 생성
	//run()에 하나의 객체만 접근하도록 함
	public synchronized void run(){
		boolean isStop = false;
		try{
			//소켓 생성
			socket = ms.getSocket();
			
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			String message = null;
			//무한 루프
			while(!isStop){
				//클라이언트가 보낸 메시지를 받음
				message = (String)ois.readObject();
				//ID와 메시지 분리
				String[] str = message.split("#");
				if(str[1].equals("exit")){	//종료
					broadCasting(message);
					isStop = true;
				}else{	//계속 채팅
					broadCasting(message);
				}
			}
			//ArrayList 객체를 제거
			ms.getList().remove(this);
			
			System.out.println(socket.getInetAddress()+ "정상적으로 종료하셨습니다");
			System.out.println("list size : "+ms.getList().size());
		}catch(Exception e){
			//오류가 발생한 클라이언트 빼기
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+ "비정상적으로 종료하셨습니다");
			System.out.println("list size : "+ms.getList().size());
		}
	}
	
	public void broadCasting(String message)throws IOException{
		//ArrayList가져와서 다른 유저들에게 메시지를 보냄
		for(MultiServerThread ct : ms.getList()){
			ct.send(message);
		}
	}
	
	//메시지를 보냄
	public void send(String message)throws IOException{
		oos.writeObject(message);        
	}
}
