/* EchoClient
 * 
 * -------------------------------------------------------
 * EchoClient
 * EchoServer
 * -------------------------------------------------------
 * 생성자에서 정보 받고
 * 소켓 생성 getsocket()
 * 입출력 스트림(바이트스트림) -> 문자스트림
 *  
 */

package com.socket;

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
	private String str;
	BufferedReader br_file;
	
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
		//바이트스트림 -> 문자스트림
		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));		
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(is_socket));
		
		//데이터 입력용 입력스트림 생성
		System.out.print("입력 >");
		br_file = new BufferedReader(new InputStreamReader(System.in));
		
		//표준 입력
		str = br_file.readLine();
		//EOF
		str += System.getProperty("line.separator");
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
	}	
	
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
	}
	
	public static void main(String[] args){
		
		try{
			//new EchoClient("192.168.0.20", 3000);
			new EchoClient("192.168.0.113", 3000);
		}
		catch(IOException e){
			e.printStackTrace();			
		}		
	}
}
