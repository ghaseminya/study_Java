//서버

package com.chatting02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer{
	
	//TODO 1:서버소켓과 클라이언트 연결 소켓 선언
	//서버 소켓 
	private ServerSocket serverSocket = null;
	// 클라이언트 연결 소켓
	private Socket socket = null;

	// TODO 2:연결된 클라이언트 스레드를 관리하는 ArrayList
	ArrayList<ChatThread> chatlist = new ArrayList<ChatThread>();

	// 멀티쳇 메인 프로그램부
	public void start(){
		try{
			//서버소켓 생성
			serverSocket = new ServerSocket(8888);
			System.out.println("[ChatServer]Server Start...");
			
			//무한루프를 돌면서 클라이언트 연결을 기다리기
			while(true){
				socket = serverSocket.accept(); //클라이언트의 요청 대기
								//클라이언트의 요청을 받게 되면 서로 입력과 출력에 대한 스트림이 연결됩니다.
				
				//연결된 클라이언트에서 스레드 클래스 생성
				ChatThread chat = new ChatThread();
				//클라이언트 리스트 추가
				chatlist.add(chat);
				//스레드 시작
				chat.start();
			}
		}catch(Exception e){
			System.out.println("[MultiChatServer]start( )Exception 발생!");
		}
	} //start

	public static void main(String[] args) throws IOException{
		MultiChatServer server = new MultiChatServer();
		server.start();
	}

	// 연결된 모든 클라이언트에 메시지 중계
	void msgSendAll(String msg) {
		for (ChatThread ct : chatlist) {
			ct.outMsg.println(msg);
		}
	}

	// 각 클라이언트 관리를 위한 스레드 클래스
	class ChatThread extends Thread {

		// 수신 메시지와 파싱 메시지 처리하는 변수 선언
		String msg;
		String[] rmsg;

		// 입출력 스트림 생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		@Override
		public void run() {
			// super.run();
			
			boolean status = true;
			System.out.println("##ChatThread start...");
			try {
				// 입출력 스트림 생성
				inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				outMsg = new PrintWriter(socket.getOutputStream(), true);
				
				//상태 정보가 true이면 루프를 돌면서 사용자로부터 수신된 메시지를 처리
				while (status) {
					//수신된 메시지를 변수에 저장
					msg = inMsg.readLine();
					//구분자를 기준으로 메시지를 문자열 배열로 파싱
					rmsg = msg.split("/");
					
					//파싱된 문자열 배열의 두번째요소 값에 따라 처리하는 부분 
					if (rmsg[1].equals("logout")) {
						//로그아웃메시지일때 해당 클라이언트 스레드 종료로 status값을 false로 설정
						chatlist.remove(this);
						msgSendAll("server/" + rmsg[0] + "님이 종료했습니다.");
						status = false;
					} else if (rmsg[1].equals("login")) {
						//로그인 메시지일 때 처리
						msgSendAll("server/" + rmsg[0] + "님이 로그인했습니다.");
					} else {
						//그 밖의 메시지 처리
						msgSendAll(msg);
					}
				}
				//while문을 종료하고 루프를 벗어나면 클라이언트 연결이 종료되므로 Thread가 interrupt됩니다.
				this.interrupt();
				System.out.println("##" + this.getName() + " Stop!!");
			} catch (IOException e) {
				chatlist.remove(this);
				// e.printStackTrace( );
				System.out.println("[ChatThread]run( ) IOException 발생!!");
			}
		} //run
	} //Thread
} //MultiChatServer