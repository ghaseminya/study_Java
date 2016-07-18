/*
telnet를 활용하여 TCP를 이용한 네트워크에서 읽고 쓰기가 가능한 프로그램
ServerSocket01는 네트워크를 이용해서 읽고 쓰기를 하려고 할 때 서버의 역할을 합니다.

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
