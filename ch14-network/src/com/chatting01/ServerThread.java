package com.chatting01;
/*
//채팅 프로그램(AWT) - Server Thread
//------------------------------------------------
File Info
com.chatting01
Server.java			• 서버 프로그램
					• 콘솔 프로그램
					
*ServerThread.java	• 서버 스레드
					• 데이터를 클라이언트로 보내기 위해 writeUTF() 메소드 호출
					
Client.java			• 클라이언트 프로그램
					• GUI 프로그램을 AWT를 이용하여 작성 
					• 보통 채팅 프로그램들은 텍스트 상자와 다중 텍스트 상자로 구현됩니다.
					• 클라이언트간 입력되는 내용을 다른 클라이언트에도 모두 뿌려주기
					• 데이터를 보낼 때는 writeUTF() 메소드를 사용하고 데이터를 받을 때는 readUTF() 메소드를 사용합니다.
제한사항				• Vector 클래스를 사용해보기
					• Vector 클래스를 사용하여 접속자의 소켓을 저장하기
//---------------------------------
소켓(Socket)
	• TCP/IP의 복잡한 프로토콜을 단순화시켜 네트워크 프로그램을 편리하게 작성할 수 있도록 한 API
	• 자바 네트워크 프로그램은 소켓이라는 개념을 통해서 네트워크 통신을 수행합니다.
	• 네트워크 계층과 전송 계층이 캡슐화 되어 있기 때문에 두 개의 계층을 신경 쓰지 않고 프로그램을 만들 수 있습니다.
	• 소켓을 이용하면 TCP/IP 네트워크에서 양쪽 응용 프로그램의 TCP 연결해 줍니다. 즉, 네트워크 상에서 서버와 클라이언트 두 개의 프로그램이 특정 포트를 통해 양방향통신이 가능하도록 만들어주는 소프트웨어 장치입니다.

전화 		vs	소켓
IP 주소		전화번호
포트번호		교환번호
소켓			전화기가 울리고 원하는 사람과 통화가 연결된 것


자바 소켓(Socket)
	• 자바에서는 소켓 클래스가 서버와 클라이언트 프로그램들 간의 연결을 가능하도록 해줍니다.
	• TCP/IP 계층의 TCP를 지원하기 위해서 Socket, ServerSocket 클래스를 제공합니다.
	• 클라이언트는  Socket 객체를 생성하여 TCP 서버와 연결을 시도하고
	• 서버는 ServerSocket 객체를 생성하여 TCP 연결을 청취하여 클라이언트와 서버가 연결되도록 합니다.

*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
	Server server;
	Socket sock;
	DataInputStream din;
	DataOutputStream dout;
	String ipAddr;
	
	//TODO 1: 생성자
	public ServerThread(Server server, Socket socket) {
		try {
			this.server = server;
			//소켓 생성
			sock = socket;
			//입출력 스트림 생성
			//DataInputStream: 입력 스트림으로 부터 기본 자료형 데이터을 읽을 수 있는 각종 메서드와 문자를 읽을 수 있는 메서드를 정의 
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			
			//소켓의 로컬 주소를 가져옵니다. (소켓 객체를 InetAddess객체로 반환합니다.)
			ipAddr = sock.getInetAddress().toString();
			System.out.println(ipAddr + "에서 접속하였습니다.");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//TODO 2:
	public void sendMsg(String msg) {
		try {
			//데이터를 클라이언트로 보내기 위해 writeUTF() 메소드 호출
			dout.writeUTF(msg);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//TODO 5:
	public void run() {
		System.out.println("##ChatThread start...");
		
		String str;
		try {
			while (true) {
				//UTF-8 인코딩 값을 얻어 문자열로 반환
				str = din.readUTF();
				server.sendAll(str); //모든 클라이언트에서 문자열 전송
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
} //ServerThread
