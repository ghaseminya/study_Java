/*
클라이언트

ClientEx.java	• 클라이언트용 프로그램
				• 서버측 5000번 포트로 접속을 요청합니다.

*/
package com.socket1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientEx {
	
	static String serverIP = "127.0.0.1";
	
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
