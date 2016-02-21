/*
클라이언트 

//--------------------------------
File Info
com.chat1.socket
ServerEx.java	• 서버의 역할
				• 서버소켓을 사용하여 5000번 포트를 열어 놓고 대기하다가 클라이언트의 접속 요청이 있을 때 새로운 소켓 클래스를 생성하는 역할
				
SocketEx.java	• 서버 프로그램의 일부로서 클라이언트의 접속이 있을 때마다 객체가 생성되며 스레드로 구성
				• 클라이언트에 1:1로 대응하기 위한 클래스로써 스레드로 구현
				• 하나의 클라이언트에 대해서 하나의 스레드를 만들게 됩니다.
				• 클라이언트와 서버 스레드는 1:1로 대응

*ClientEx.java	• 클라이언트용 프로그램
				• 서버측 5000번 포트로 접속을 요청합니다.


*/
package com.chat1.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientEx {
	
//	static String serverIP = "127.0.0.1";
	static String serverIP = "192.168.0.2";
	
	public static void main(String[] args) {

		try{
			//서버 쪽에서 전송되는 문자열을 저장하기 위한 변수
			String str;
			//포트 5000번을 열어놓은 서버에 접속하기 위한 소켓을 생성
			//생성자의 인자로서 서버의 주소와 포트번호가 필요하다. 서버주소는 “127.0.0.1”이고 포트는 5000이다.
			Socket socket = new Socket(serverIP, 5000);
			//소켓과 입력 스트림을 연결
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			//소켓과 출력 스트림을 연결
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			System.out.println("서버에 접속되었습니다.");
			
			//서버와 계속 연결한 상태에서 데이터를 전송 받기 위해 무한루프
			while(true){
				//서버 측의 스레드에서 문자열이 전송되어 올 경우 수신하여 데이터를 읽어낸다. 
				//readUTF() 메소드는 한글 데이터를 바로 처리할 수 있다
				str = dataInputStream.readUTF();
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	
	

}
