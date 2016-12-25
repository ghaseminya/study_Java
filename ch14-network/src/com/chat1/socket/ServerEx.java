/*
//서버소켓

//Socket응용 - Server/Client 접속 프로그램
File Info
com.chat1.socket
->ServerEx.java	• 서버의 역할
				• 서버소켓을 사용하여 5000번 포트를 열어 놓고 대기하다가 
				클라이언트의 접속 요청이 있을 때 새로운 소켓 클래스를 생성하는 역할
				
SocketEx.java	• 서버 프로그램의 일부로서 클라이언트의 접속이 있을 때마다 객체가 생성되며 스레드로 구성
				• 클라이언트에 1:1로 대응하기 위한 클래스로써 스레드로 구현
				• 하나의 클라이언트에 대해서 하나의 스레드를 만들게 됩니다.
				• 클라이언트와 서버 스레드는 1:1로 대응

ClientEx.java	• 클라이언트용 프로그램
				• 서버측 5000번 포트로 접속을 요청합니다.

*/
package com.chat1.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	//ServerSocket 클래스: 
	//특정 포트를 열어 놓은 상태에서 대기하다가 클라이언트의 접속 요청이 있으면 이를 새로운 소켓으로 연결하여 처리하는 클래스
	ServerSocket server;
	Socket socket;
	SocketEx client;
	
	public ServerEx(){
		try{
			//5000번 포트를 이용하여 객체 생성
			server = new ServerSocket(5000);
			
			//무한대기 상태에서 클라이언트의 접속 요청이 들어오면 SocketEx 스레드 객체를 생성
			while(true){
				//accept() : 서버소켓에서 클라이언트의 소켓이 접속되기를 기다리는 메소드
				//accept() 메소드는 서버소켓이 대기중인 상태로 만들게 되며 접속이 이루어지면 소켓이 생성됩니다.
				socket = server.accept();
				//클라이언트 소켓 생성
				client = new SocketEx(this, socket);
				client.start();
			}
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {

		ServerEx se = new ServerEx();
	}
}
