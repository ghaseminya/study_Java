package com.chat2.echo;
/*
//EchoClient


EchoClient 생성자에서 정보 받고
소켓 생성 getsocket() 정의후 호출
입출력 스트림(바이트스트림) -> 문자스트림
//---------------------------------------------------
File Info
com.chat2.echo
EchoServer.java	• EchoServer
					• 포트번호 넘겨주면서 서버 소켓 생성
					• while에서 accept()에서 클라이언트가 들어오면 tcp소켓 생성(클라이언트 소켓 생성)
	
->EchoClient.java		• EchoClient
					• 생성자에서 정보 받고
					• 소켓 생성 getsocket() 호출
					• 입출력 스트림(바이트스트림) -> 문자스트림

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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {
	
	//서버 IP 저장 변수
	private String ip;
	//서버 포트 저장 변수
	private int port;
	
	private String str; //읽어온 데이터 임시 저장
	BufferedReader br_file;
	
	//TODO 2:
	public EchoClient(String ip, int port) throws IOException{
		
		this.ip = ip;
		this.port = port;
		
		//서버로 연결되며 tcp소켓 생성
		Socket tcpSocket = getSocket();
		
		//바이트 스트립
		//출력 스트림 (서버에 데이터 전송)
		OutputStream os_socket = tcpSocket.getOutputStream();
		//입력 스트림 ( 서버에서 클라이언트로 전송된 데이터 처리)
		InputStream is_socket =  tcpSocket.getInputStream();
		
		//OutputStreamWriter: 바이트스트림 -> 문자스트림
		//BufferedWriter: 문자 출력 스트림의 효율적인 버퍼링 기능을 제공
		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));		
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(is_socket));
		//TODO : 인코딩 해결 (한글 깨짐현상 해결, 도스창)
//		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os_socket, "UTF-8"));		
//		BufferedReader bufferR = new BufferedReader(new InputStreamReader(is_socket, "UTF-8"));
		
		//데이터 입력용 입력스트림 생성
		System.out.print("입력 >");
		br_file = new BufferedReader(new InputStreamReader(System.in));
		
		//표준 입력
		str = br_file.readLine();
		//현재 OS의 줄바꿈 문자 반환
		str += System.getProperty("line.separator"); //EOF
		
		//데이터를 버퍼에 저장
		bufferW.write(str);
		
		
		//데이터를 서버에 전송
		bufferW.flush();
		//서버에서 전송된 데이터 처리
		str = bufferR.readLine();
		
		//Echo결과 출력
		System.out.println("Echo Result: " + str);
		
		//자원관리
		br_file.close();
		bufferW.close();
		os_socket.close();
		is_socket.close();
		bufferR.close();
		tcpSocket.close();
	} //EchoClient()
	
	//TODO 1:
	public Socket getSocket(){
		Socket tcpSocket = null;
		try{
			//소켓 생성
			tcpSocket = new Socket(ip, port);
			
		}catch(IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		return tcpSocket;
	} //getSocket
	
	public static void main(String[] args){
		
		try{
//			new EchoClient("192.168.0.2", 3000);
			new EchoClient("192.168.123.30", 3000);
		}
		catch(IOException e){
			e.printStackTrace();			
		}		
	} //main
} //EchoClient
