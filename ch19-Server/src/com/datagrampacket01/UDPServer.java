package com.datagrampacket01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws IOException{

		//서버 소켓에 필요한 데이터 그램 소켓 생성
		DatagramSocket socket = new DatagramSocket(1234);
		boolean listen = true;
		System.out.println("Server :: Start");
		
		//while 무한반복을 하면서 메뉴 가져오기 
		while(listen){
			//바이트 버퍼설정
			byte buffer[] = new byte[256];
			//데이터그램패킷 생성
			DatagramPacket packet = new DatagramPacket(buffer, 256);
			//소켓을 통해서 받기
			socket.receive(packet);
			
			String menu = MenuMgmt.selectMenu();
			//바이트 단위로 끊어서 가져오기
			buffer = menu.getBytes();
			
			InetAddress address = packet.getAddress();
			int portNo = packet.getPort();
			
			//결정된 메뉴를 클라이언트로 전달하는 모듈
			packet = new DatagramPacket(buffer, buffer.length, address, portNo);
			//소켓을 통해서 메시지 보지기
			socket.send(packet);
		}
		//소켓 닫기
		socket.close();
		System.out.println("Server :: Close");
		
	} //main

} //UDPServer
