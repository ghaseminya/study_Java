package com.securesocket;
/*
//보안소켓을 이용해서 클라이언트와 서버간 통신하기

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException, KeyManagementException, NoSuchAlgorithmException{

		//포트 설정
		int port = 10789;
		String host = "192.168.0.2";
		
		SSLContext context = SSLContext.getInstance("SSL");
		context.init(null,  null, null);
		
		SSLSocketFactory factory = context.getSocketFactory();
		//SSL 접속으로 사용가능하게 하는 엔코더 방식으로 이름을 반환받아서 저장
		String[] suites = factory.getSupportedCipherSuites();
		
		SSLSocket socket = (SSLSocket)factory.createSocket(host, port);
		socket.setEnabledCipherSuites(suites);
		System.out.println(socket.getSession().getCipherSuite());
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true); 
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.print("> ");
			String text = scan.nextLine();
			
			printWriter.println(text);
			
			text = bufferedReader.readLine();
			if(text!=null){
				System.out.println("Server> " + text);
				
				if(text.equals("ACK")){ 
					text = bufferedReader.readLine();
					
					if(text.equals("FIN")){
						System.out.println("Server> " + text);
						System.out.println("> ACK");
						printWriter.println("ACK");
						break;
					}
					
				}
				
			} //if(text!=null)
		} //while
		System.out.println("System Exit");
	}
} //ClientMain
