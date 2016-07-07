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
	} //main
} //ClientEx
