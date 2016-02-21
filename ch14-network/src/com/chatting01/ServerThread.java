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
	
	//TODO 1:
	public ServerThread(Server server, Socket socket) {
		try {
			this.server = server;
			sock = socket;
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			
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
}
