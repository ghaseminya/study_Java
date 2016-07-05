package com.chatting01;
/*
//채팅 프로그램(AWT) - Server

제네릭(Generics)
	• Generics는 컬렉션(자료구조), 객체들을 저장(수집)하는 구조적인 성격을 제공되는 것
	• 제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미
//------------------------------------------------
File Info
com.chatting01
*Server.java		• 서버 프로그램
					• 콘솔 프로그램
					
ServerThread.java	• 서버 스레드
					• 데이터를 클라이언트로 보내기 위해 writeUTF() 메소드 호출
					
Client.java			• 클라이언트 프로그램
					• GUI 프로그램을 AWT를 이용하여 작성 
					• 보통 채팅 프로그램들은 텍스트 상자와 다중 텍스트 상자로 구현됩니다.
					• 클라이언트간 입력되는 내용을 다른 클라이언트에도 모두 뿌려주기
					• 데이터를 보낼 때는 writeUTF() 메소드를 사용하고 데이터를 받을 때는 readUTF() 메소드를 사용합니다.
제한사항				• Vector 클래스를 사용해보기
					• Vector 클래스를 사용하여 접속자의 소켓을 저장하기


*/

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {
	ServerSocket serv;
	Socket sock;
	Vector vector; //클라이언트 소켓 정보를 저장
	
	//TODO 3:
	public Server() {
		vector = new Vector();
		try {
			serv = new ServerSocket(5000);
			System.out.println("[ChatServer]Server Start...");
			while (true) {
				sock = serv.accept();
				ServerThread client = new ServerThread(this, sock);
				client.start();
				vector.addElement(client);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//TODO 4:접속한 모든 클라이언트에서 메시지 전송하기
	void sendAll(String msg) {
		for (int i = 0; i < vector.size(); i++) {
			ServerThread client = (ServerThread)vector.get(i);
			client.sendMsg(msg);
		}
	}
	
	//TODO 6:
	public static void main(String args[]) {
		Server chats = new Server();
	}
}
