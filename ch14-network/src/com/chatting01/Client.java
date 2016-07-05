package com.chatting01;
/*
//채팅 프로그램(AWT) - Client
//------------------------------------------------
File Info
com.chatting01
Server.java			• 서버 프로그램
					• 콘솔 프로그램
					
ServerThread.java	• 서버 스레드
					• 데이터를 클라이언트로 보내기 위해 writeUTF() 메소드 호출
					
*Client.java		• 클라이언트 프로그램
					• GUI 프로그램을 AWT를 이용하여 작성 
					• 보통 채팅 프로그램들은 텍스트 상자와 다중 텍스트 상자로 구현됩니다.
					• 클라이언트간 입력되는 내용을 다른 클라이언트에도 모두 뿌려주기
					• 데이터를 보낼 때는 writeUTF() 메소드를 사용하고 데이터를 받을 때는 readUTF() 메소드를 사용합니다.
제한사항				• Vector 클래스를 사용해보기
					• Vector 클래스를 사용하여 접속자의 소켓을 저장하기

*/

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client extends Frame implements Runnable {
	
	TextField tf;
	TextArea ta;
	Socket sock;
	DataInputStream din;
	DataOutputStream dout;
	
//	String chatid="[codedragon]";
	String chatid="[butterfly]";
	
	//TODO 7:
	public Client() {
		setLayout(new FlowLayout());
		
		ta = new TextArea(7,30);
		tf = new TextField(30);
		add(tf);
		add(ta);
		
		//TODO 10: 이벤트 소스와 이벤트 리스너 연결
		tf.addActionListener(new TfHandler());
	}
	
	//TODO 11:
	@Override
	public void run() {
		try {
			sock = new Socket("127.0.0.1", 5000);
			
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			
			ta.append("서버로 접속되었습니다.\n");
			
			while (true) {
				//UTF-8 인코딩 값을 얻어 문자열로 반환
				String str = din.readUTF();
				ta.append(str + "\n");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//TODO 8: 출력메소드 작성
	public void sendMsg(String msg) {
		try {
			//UTF-8 인코딩을 사용해서 문자열을 출력
			dout.writeUTF(chatid+msg);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//TODO 9: 이벤트 핸들러
	public class TfHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			sendMsg(tf.getText());
			tf.setText("");
		}
	}
	
	//TODO 12:
	public static void main(String args[]) {
		Client chatc = new Client();
		chatc.setSize(300,220);
		chatc.setVisible(true);
		
		Thread t = new Thread(chatc);
		t.start();
	}
}
