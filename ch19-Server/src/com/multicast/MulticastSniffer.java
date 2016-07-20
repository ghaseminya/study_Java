/*
서버에 요청해서 데이터를 수신하고 확인하기


DatagramPacket 생성에는 송신용 DatagramPacket생성자와 수신용 DatagramPacket생성자가 있습니다.

송신용 DatagramPacket생성자
DatagramPacket(byte[] buf, int length, InetAddress addr, int port);

수신용 DatagramPacket생성자
DatagramPacket(byte[] buf, int length);

//---------------------
실행을 위한 MulticastAddress와 port정보
239.255.255.250 1900


MulticastSniffer를 두개 실행시켜줘야 결과가 빨리 나오는 듯!!!

*/
package com.multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class MulticastSniffer {

	public static void main(String[] args) {

		//InetAddress 객체와 포트 정의
		InetAddress group = null;
		int port = 0;
		
		//명령라인에서 주소를 읽어들여 멀티캐스트 그룹의 이름과 포트를 명령라인의 처음 두 인자에서 읽어오도록 하기
		try{
			group = InetAddress.getByName(args[0]);
			port = Integer.parseInt(args[1]);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException | UnknownHostException e){
			System.err.println("Usage: java MlticastSniffer multicaseAddress port");
			
			//시스템 종료
			System.exit(1);
		}
		
		//해당 포트에 대한 멀티캐스트 소켓 객체를 생성
		MulticastSocket ms = null;
		try{
			//멀티캐스트패킷을 수신하기위해 MulticastSocket을 만들고 
			//joinGroup()를 이용하여 멀티캐스트 그룹에 가입시킵니다.
			ms = new MulticastSocket(port);
			//멀티캐스트 주소에 가입
			ms.joinGroup(group);
			
			//패킷의 도착을 기다리는 루프
			byte[] buffer = new byte[8192];
			while(true){
				//UDP패킷을 송수신하기 위하여 IP패킷을 담기 위한 DatagramPacket을 만듭니다.
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length); //수신용 DatagramPacket 생성자
				ms.receive(dp);
				
				//각각의 패킷이 도착하면 데이터를 읽고 해당 데이터를 라틴문자로 변경한 다음 출력하기
				String s = new String(dp.getData(), "8859_1");
				System.out.println(s);
			}
		}catch(IOException e){
			System.err.println(e);
		}finally{
			//사용자가 프로그램의 인터럽트를 걸거나 예외가 발생할 경우 소켓은 그룹을 탈퇴하고 소켓 닫기
			if(ms !=null){
				try{
					//leaveGroup(): 소켓을 그룹으로 부터 제외할 때 사용하는 메소드
					ms.leaveGroup(group);
					ms.close();
				}catch(IOException e){
					System.err.println(e);
				}
			}
		} //try
	} //main
} //class MulticastSniffer
