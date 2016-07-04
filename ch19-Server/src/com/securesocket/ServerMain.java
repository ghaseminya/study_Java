//보안소켓을 이용해서 클라이언트와 서버간 통신하기


package com.securesocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

public class ServerMain {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException, KeyManagementException{
		
		//포트 설정
		int port = 10789;
		Scanner scan = new Scanner(System.in);
		
		SSLContext context = SSLContext.getInstance("SSL");
		context.init(null,  null, null);
		
		//SSLServerSocketFactory 클래스는 SSL Socket에 인스턴스를 생성하기 위해 사용됩니다.
		//(SSLServerSocket,SSLSocket에 SSL Socket에 인스턴스를 생성하기 위해 사용)
		//SSLServerSocket,SSLSocket클래스는 추상클래스로 단독으로 인스턴스 생성이 불가능하며
		//반드시 Factory클래스를 통해서 인스턴스가 생성가능하도록 되어져 있습니다.(디자인패턴)
		SSLServerSocketFactory factory = context.getServerSocketFactory();
		
		String[] suites = factory.getSupportedCipherSuites();
		SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(port);
		//인코더 방식 설정
		serverSocket.setEnabledCipherSuites(suites);
		
		SSLSocket socket = (SSLSocket)serverSocket.accept();
		//상용중인 암호군을 받아서 출력
		System.out.println(socket.getSession().getCipherSuite());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true); 
		
		//무한루프로 클라이언트에 대해 응답 수행
		while(true){
			String text = bufferedReader.readLine();
			if(text!=null){
				System.out.println("Client> " + text);
				
				if(text.equals("FIN")){ //FIN인 경우
					//ACK 메시지 출력 후
					System.out.println("Send ACK");
					text="ACK";
					printWriter.println(text);
					
					
					System.out.println("Send FIN");
					text="FIN";
				}else if(text.equals("ACK")){
					break; //반복문 종료
				}
				
				printWriter.println(text);
				
			}
		}
		System.out.println("Send EXIT");
	}

}
