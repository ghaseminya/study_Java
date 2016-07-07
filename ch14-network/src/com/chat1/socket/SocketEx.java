package com.chat1.socket;
/*
스레드생성
서버 측에서 클라이언트의 접속 요청이 있을 경우 생성되는 프로그램

//------------------------------------------------------
File Info
com.chat1.socket
ServerEx.java	• 서버의 역할
				• 서버소켓을 사용하여 5000번 포트를 열어 놓고 대기하다가 클라이언트의 접속 요청이 있을 때 새로운 소켓 클래스를 생성하는 역할
				
*SocketEx.java	• 서버 프로그램의 일부로서 클라이언트의 접속이 있을 때마다 객체가 생성되며 스레드로 구성
				• 클라이언트에 1:1로 대응하기 위한 클래스로써 스레드로 구현
				• 하나의 클라이언트에 대해서 하나의 스레드를 만들게 됩니다.
				• 클라이언트와 서버 스레드는 1:1로 대응

ClientEx.java	• 클라이언트용 프로그램
				• 서버측 5000번 포트로 접속을 요청합니다.
*/


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

//Thread 클래스를 상속받아 SocketEx 클래스를 생성한다
public class SocketEx extends Thread{
	//ServerEx 클래스를 사용하겠다고 선언한다
	ServerEx server;
	Socket socket;
	//클라이언트에서 전송하는 데이터를 수신하기 위한 클래스
	DataInputStream dataInputStream;
	//클라이언트로 데이터를 전송하기 위한 클래스
	DataOutputStream dataOutputStream;
	//IP주소를 저장하기 위한 변수
	String ipAddress;
	
	//생성자, 서버용 클래스인 ServerEx 과 서버에서 생성한 소켓 클래스를 인자로 받고 있습니다.
	public SocketEx(ServerEx server, Socket socket){
		try{
			//클래스 생성시에 인자로 받은 변수들을 멤버변수에 저장
			this.server = server;
			this.socket = socket;
			
			//클라이언트에서 데이터를 수신하기 위한 문장으로써 소켓과 입력스트림을 연결
			dataInputStream = new DataInputStream(socket.getInputStream());
			//클라이언트에 데이터를 전송하기 위한 문장으로써 소켓과 출력스트림을 연결
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			//접속요청을 한 클라이언트의 IP 주소를 출력
			//클라이언트측의 IP 주소를 구하는 메소드로써 문자열로 변환하여 저장하고 있습니다.
			ipAddress = socket.getInetAddress().toString();
			System.out.println(ipAddress + "에 접속합니다.");
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	
	//현재 클래스가 스레드이므로 run() 메소드를 구현해야 합니다.
	@Override
	public void run() {
		super.run();
		
		String str;
		
		//무한루프를 작성, 소켓접속이 끊어지면 무한루프를 탈출한다
		try{
			while(true){
				//스레드 프로그램의 일부로서 클라이언트에서 보내오는 문자열을 수신한다.
				//readUTF() 메소드는 다국어 문자를 취급할 수 있으므로 한글을 다루기 위해서는 이 메소드가 필요합니다.
				//이 메소드를 호출하여 클라이언트 소켓에서 보내오는 한글 데이터를 정상적으로 받아올 수 있습니다.
				str = dataInputStream.readUTF();
			}
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
