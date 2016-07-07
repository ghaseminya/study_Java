package com.chat2.echo;
/*
//EchoServer

//---------------------------------------------------
File Info
com.chat2.echo
EchoServer.java		• EchoServer
					• 포트번호 넘겨주면서 서버 소켓 생성
					• while에서 accept()에서 클라이언트가 들어오면 tcp소켓 생성(클라이언트 소켓 생성)
	
*EchoClient.java	• EchoClient
					• 생성자에서 정보 받고
					• 소켓 생성 getsocket()
					• 입출력 스트림(바이트스트림) -> 문자스트림
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {
	private BufferedReader bufferR;
	private BufferedWriter bufferW;
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverS;

	public EchoServer(int port){
		try{
			serverS = new ServerSocket(port);

		}catch(IOException e){
			e.printStackTrace();
			System.exit(0);
		}

		//중단시키지 않으면 계속 클라이언트를 기다리도록 무한루프
		while(true){
			try{
				System.out.println("클라이언트의 요청을 기다리는 중!");

				//소켓 생성, 청취
				Socket tcpSocket = serverS.accept();

				//Client IP주소 구하기
				System.out.println("클라이언트의 IP주소: " + tcpSocket.getInetAddress().getHostAddress());

				//입력 스트림 생성 client에서 전송된 데이터 처리)
				is = tcpSocket.getInputStream();
				//byte스트림 -> char스트림 형변환				
//				bufferR = new BufferedReader(new InputStreamReader(is));
				bufferR = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				
				//출력 스트림 생성 (서버에서 클라이언트로 전송될 데이터 처리)
				os = tcpSocket.getOutputStream();					
//				bufferW = new BufferedWriter(new OutputStreamWriter(os));
				//TODO : 인코딩 해결한 코드 (한글 깨짐현상 해결)
				bufferW = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
				
				//client에서 전송된 데이터를 받음
				String message = bufferR.readLine();
				
				//콘솔에 표시
				System.out.println("수신메시지: " +  message);

				//줄바꿈을 함으로써 더이상 데이터가 없음을 표시
				message = message + System.getProperty("line.separator");

				//서버에서 클라이언트로 전송 (데이터를 버퍼에 저장)
				bufferW.write(message);

				//서버에서 클라이언트로 데이터를 전송(명시적 flush)
				bufferW.flush();			

			}catch(IOException e){
				e.printStackTrace();
			}finally{
				if(bufferW!=null){ try{ bufferW.close();}catch(IOException e){e.printStackTrace();} }
				if(os!=null){ try{ os.close();}catch(IOException e){e.printStackTrace();} }
				if(bufferR!=null){ try{ bufferR.close();}catch(IOException e){e.printStackTrace();} }
				if(is!=null){ try{ is.close();}catch(IOException e){e.printStackTrace();} }
			}
		}
	}

	public static void main(String[] args){
		new EchoServer(3000);
	}
}
