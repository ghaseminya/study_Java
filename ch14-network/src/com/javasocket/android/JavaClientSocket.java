package com.javasocket.android;
/*
표준 자바로 만든 클라이언트 소켓

1. 서버에 연결한 후,
2. 문자열을 Object 타입으로 보내고,
3. Object를 받아 출력함.

*/
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class JavaClientSocket {

	public static void main(String[] args) {
		String host = "localhost";
		int port = 11004;

		try {
			Socket socket = new Socket(host, port);
			System.out.println("클라이언트 소켓이 생성되었습니다.");
			System.out.println("호스트 :" + host +", 포트 : " + port);
			
			String output = "Hello form Client";
			ObjectOutputStream outstream = new ObjectOutputStream(socket.getOutputStream());
			outstream.writeObject(output);
			outstream.flush();
			System.out.println("서버로 보낸 데이터 : " + output);

			ObjectInputStream instream = new ObjectInputStream(socket.getInputStream());
			Object input = instream.readObject();
			System.out.println("서버로 부터 받은 데이터 : " + input);
			

			instream.close();
			outstream.close();
			socket.close();

			System.out.println("소켓이 닫혔습니다.");

		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
