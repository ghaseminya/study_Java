/*
telnet를 활용하여 TCP를 이용한 네트워크에서 읽고 쓰기가 가능한 프로그램
ServerSocket01는 네트워크를 이용해서 읽고 쓰기를 하려고 할 때 서버의 역할을 합니다.


//--------------------
출력결과 확인 방법
서버 구동 후 콘솔창에서 서버에 접속하여 결과를 확인해야 합니다.
서버 실행 후 클라이언트에서 연결 요청 후 서버와 클라이언트간 연결을 맺은 후 서버연결 끊기

클라이언트 연결 요청(cmd)
telnet localhost 8989

*/
package com.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket01 {

	public static void main(String[] args) {

		//서버소켓
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		//출력을 위해 스트림 객체 생성
		//OutputStream : • OutputStream은 바이트 출력을 수행하는 데 필요한 메서드를 정의한 추상 클래스
		// 				 • 출력 스트림을 다루는 모든 클래스의 슈퍼 클래스
		//PrintStream : PrintStream은 모든 자료형을 출력할 수 있는 print(), println() 메서드가 오버로딩 되어 있습니다.
		OutputStream  outputStream = null;
		PrintStream printStream = null;
		
		try{
			//포트번호를 인자로 하여 서버소켓 생성
			//클라이언트로 부터 TCP연결을 기다리는 서버소켓 객체가 반환됩니다.
			serverSocket = new ServerSocket(8989);
			
			//DOS창에서 한글 깨짐(한글 사용하지 말것)
//			System.out.println("서버가 실행되었습니다."); 
			System.out.println("Server waitting!");
			
			//클라이언트가 연결 요청을 한 경우
			socket = serverSocket.accept();
			outputStream = socket.getOutputStream();
			printStream = new PrintStream(outputStream);
//			printStream.println("안녕하세요. 서버에 접속되었습니다.");
			printStream.println("Hello. Server connected!");
			
			//스트림에 있는 내용 모두 출력하기
			printStream.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				//ServerSocket이 열려 있다면 ServerSocket을 닫습니다.
				if(serverSocket!=null){
					serverSocket.close();
				}
				if(outputStream!=null){
					outputStream.close();
				}
				if(printStream!=null){
					printStream.close();
				}
				if(socket !=null){
					socket.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
//			System.out.println("서버가 종료되었습니다.");
			System.out.println("Server disconnected!");
		} //finally
	}
} //NameServer
