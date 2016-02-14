package com.javasocket.android;
/*
표준 자바로 만든 서버 소켓
 
1. 클라이언트로부터의 연결 요청을 받으면,
2. Object 데이터를 받은 후,
3. Object 데이터에 문자열을 붙여서 보냄

*/
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaServerSocket {

	public static void main(String[] args) {
		int port = 11004;

		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("서버 소켓이 만들어졌습니다. 포트 : " + port);
			
			while(true) {
				//accept() : 클라이언트와 접속한 정보를 위용하여 소켓을 생성, 소켓을 통해 서버와 클라이언트가 접속할 수 있습니다.
				Socket socket = server.accept();
				System.out.println("클라이언트와 연결되었습니다.");
				
				//상대방이 보내온 데이터를 받을 수 있는 Stream객체 생성
				//ObjectInputStream은 객체단위로 주고 받을 수 있는 클래스
				//문자열도 객체이기 때문에 문자열을 가장 간단한 형태로 주고 받을 수 있습니다.
				ObjectInputStream instream = new ObjectInputStream(socket.getInputStream());
				Object input = instream.readObject();
				System.out.println("클라이언트로 부터 받은 데이터 : " + input);

				String output = input + " Hi! from Server.";
				ObjectOutputStream outstream = new ObjectOutputStream(socket.getOutputStream());
				outstream.writeObject(output);
				//버퍼안의 정보 모두 써주기
				outstream.flush();
				System.out.println("클라이언트로 보낸 데이터 : " + output);
				
				outstream.close();
				instream.close();
				socket.close();
				
				//ServerSocket을 닫을 경우 Client에서 ERROR발생합니다.
				//ERROR-java.net.SocketException: Socket is closed
//				server.close();
				System.out.println("소켓이 닫혔습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
