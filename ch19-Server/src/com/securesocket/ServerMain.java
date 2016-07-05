
/*
//(인증서 없이) 서버와 클라이언트간 SSL통신하는 예제 프로그램

보안 통신 SSL(SecureSocketLayer)
Transport Layer계층의 보안을 담당하는 프로토콜
즉, Socket통신에 대해 보안을 제공하는 프로토콜로 그룹으로 이루어져 있습니다.
SSL 버전 3까지는 비표준이며
SSL 버전 3.1부터 TLS라는 이름으로 표준화되었습니다. (SSL3를 기반으로 표준화하였기 때문에 내부적으로 좀 다를 수 있지만 제공하는 서비스는 동일합니다.)
*/

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
		//자바의 Socket은 기본 제공하는 Socket이외에 임의로 제작이 가능하며 이들 사이에 인스턴스 생성시 Factory패턴을 사용하면 좀 더 쉽게 프로그램밍할 수 있습니다.
		SSLServerSocketFactory factory = context.getServerSocketFactory();
		
		//SSL의 엔코더 방식을 가져오기
		String[] suites = factory.getSupportedCipherSuites();
		SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(port);
		//인코더 방식 설정
		serverSocket.setEnabledCipherSuites(suites);
		
		SSLSocket socket = (SSLSocket)serverSocket.accept();
		//사용중인 암호군을 받아서 출력
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
		System.out.println("System EXIT");
	}

}
