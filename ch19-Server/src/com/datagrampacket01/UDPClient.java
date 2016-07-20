package com.datagrampacket01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws IOException{

		//통신을 위한 데이터그램소켓 생성
		DatagramSocket socket = new DatagramSocket();
		byte buffer[] = new byte[256];
		
		InetAddress address = InetAddress.getByName("localhost");
		//데이터그램패킷 생성시 서버와 달리 클라이언트는 전송하는 용도의 파라미터가  4개 필요합니다.
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 1234);
		
		//만들어진 패킷을 소켓을 통해 보내기
		socket.send(packet);
		
		//서버에서 보내진 값을 받는 모듈
		packet = new DatagramPacket(buffer, buffer.length);
		socket.receive(packet);
		
		String receiverString = new String(packet.getData());
		System.out.println("오늘의 메뉴는 \"" + receiverString + "\"입니다.");
		//받아온 문자열에서 공백 제거 후 출력
//		System.out.println("오늘의 메뉴는 \"" + receiverString.trim() + "\"입니다.");
		
		//소켓 닫기
		socket.close();
		
	} //main

} //UDPClient


//출력결과
//오늘의 메뉴는 "돈까스"입니다.