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

//------------------------------------------------
ActionEvent
	• ActionEvent는 버튼이 눌렸거나, 리스트, 메뉴 등의 컴포넌트가 선택이 되었을 때 발생하는 이벤트
	• 텍스트 필드에서 엔터를 쳤을 때도 발생되는 이벤트

ActionListener
ActionEvent를 처리하는 이벤트 리스너 

//------------------------------------------------
FlowLayout
	• 컴포넌트가 컨터이너에 한 줄로 배치되는 형태
	• 한줄에 포함되지 않으면 다음주로 내려가며 컨테이너의 크기에 따라 컴포넌트의 크기도 자동 조절
	• 컴포넌트들을 수평(왼쪽에서 오른쪽)으로 순서대로 배치 합니다.
	• 처음에 배치를 하게되면 상단, 중앙부터 배치가 되는데 배치를 하다가 더 이상 배치할 공간이 없으면 자동으로 다음 줄로 이동하여 배치하게 됩니다.
	• 컴포넌트를 배치할 때 컴포넌트의 간격을 갭(gap)이라고 하는데 컴포넌트들 사이의 수평, 수직간 간격을 설정할 수 있습니다.

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
//	String chatid="[butterfly]";
	
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
	
	//TODO 11: run() 오버라이드
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
//			dout.writeUTF(chatid+msg);
			dout.writeUTF(msg);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	//TODO 9: 이벤트 핸들러
	public class TfHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			sendMsg(tf.getText());
			tf.setText("");
		}
	}
	
	//TODO 12:
	public static void main(String args[]) {
		Client chatc = new Client();
		//Frame 크기
		chatc.setSize(300,220);
		//Frame 보여주기
		chatc.setVisible(true);
		
		Thread t = new Thread(chatc);
		t.start();
	}
}
