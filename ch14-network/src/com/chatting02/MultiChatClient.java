//클라이언트
//클라이언트와 서버 두개의 클래스로 구성되어 있습니다.
//클라이언트와 서버의 MultiChat프로그램을 통해서 다중 프로그래밍형식의 채팅 프로그램 구현하기

package com.chatting02;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient implements ActionListener, Runnable {

	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	//로그인 패널
	private JPanel loginPanel;
	//로그인 버튼
	private JButton loginButton;
	//대화명 라벨
	private JLabel label1;
	//대화명 입력 텍스트 필드
	private JTextField idInput;

	//로그아웃 패널 구성
	private JPanel logoutPanel;
	//로그아웃 화면에서 대화명 출력 레이블
	private JLabel label2;
	//로그아웃 버튼
	private JButton logoutButton;
	
	//입력 패널 구성
	private JPanel msgPanel;
	//메시지 입력 텍스트 필드
	private JTextField msgInput;
	//종료 버튼
	private JButton exitButton;
	
	//메인 윈도우
	private JFrame jframe;
	//채팅 내용 출력창
	private JTextArea msgOut;

	//카드 레이아웃 관련 객체 선언
	// import java.awt.Container;
	private Container tab;
	private CardLayout clayout;
	private Thread thread;

	//상태 플래그
	boolean status;

	public MultiChatClient(String ip) {
		this.ip = ip;
		
		//로그인 패널 구성을 위한 패널 객체 생성
		loginPanel = new JPanel();
		//레이아웃 설정(로그인 패널의 레이아웃을 보더레이아웃으로 설정)
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");
		
		//로그인버튼에 이벤트 리스너 들록
		loginButton.addActionListener(this);
		label1 = new JLabel("대화명");
		
		//로그인 패널의 위젯 구성
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);

		
		
		//로그 아웃 패널 구성
		logoutPanel = new JPanel();
		//레이아웃 설정(로그아웃 패널의 레이아웃을 보더레이아웃으로 설정)
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("로그아웃");

		//로그아웃 버튼에 이벤트 리스너 등록
		logoutButton.addActionListener(this);
		
		//로그아웃 패널의 위젯 구성
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		
		
		//입력 패널 구성
		msgPanel = new JPanel();
		//레이아웃 설정(입력 패널의 레이아웃을 보더레이아웃으로 설정)
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		//메시지 입력 버튼에 이벤트 리스너 등록
		msgInput.addActionListener(this);
		exitButton = new JButton("종료");
		exitButton.addActionListener(this);
		//입력 패널의 위젯 구성
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);

		//로그인/로그아웃 패널 선택을 위한 카드 레이아웃(CardLayout) 패널
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");

		
		//메일 프레임 구성
		jframe = new JFrame("MultiChat");
		msgOut = new JTextArea(" ", 10, 30);
		//JTextArea의 내용을 수정하지 못하게 하기(출력전용으로 사용)
		msgOut.setEditable(false);
		//JTextArea가 스크크롤 바를 지원하지 않기 때문에 
		//JScrollPane위젯이 JTextArea를 포함하는 컨테이너 형식으로 스크롤바를 지원할 수 있습니다.
		JScrollPane jsp = new JScrollPane(msgOut, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, //수직 스크롤바는 항상 나타내고, 
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //수평 스크롤바는 필요할 때만 나타나게 합니다.
		//로그인 패널 표시
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);
		
		//로그인 패널을 우선 표시
		clayout.show(tab, "login");
		//프레임 크기 자동 설정
		jframe.pack();
		//프레임 크기를 조정 불가능하도록 설정
		jframe.setResizable(false);
		//프레임 표시
		jframe.setVisible(true);
	} //MultiChatClient

	//통신을 위한 소캣 생성 메소드
	public void connectServer() {
		try {
			//소켓 생성
			//통신을 하기 위해서는 클라이언트 소켓이 서버IP의 8888포트로 접속하여 통신을 할 수 있도록 소켓을 생성합니다.
			socket = new Socket(ip, 8888); 
			System.out.println("[ChatClient]Server 연결 성공!!");
			
			//입출력 스트림 생성
			//접미사에 Reader, Writer가 붙게 되면 문자 단위의 입력과 출력을 생성하게됩니다.
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(), true);
			
			//서버에 로그인 메시지 전달
			outMsg.println(id + "/" + "login");
			
			//메시지 수신을 위한 스레드 생성
			thread = new Thread(this);
			thread.start();
		} catch (Exception e) {
			System.out.println("[MultiChatClient]connectServer( )Exception 발생!");
		}
	} //connectServer

	//이벤트 처리
	//모든 위젯의 이벤트를 하나의 actionPerformed()메소드로 처리
	// import java.awt.event.ActionEvent;
	public void actionPerformed(ActionEvent arg0) {
		//어떤 위젯에서 발생한 이벤트인지 확인하기
		//getSource()를 이용해 이벤트를 생성시킨 객체의 레퍼런스를 가져와서 
		//if문으로 확인하여 각각의 이벤트 코드를 작성합니다.
		Object obj = arg0.getSource();
		
		//종료 버튼 처리
		if (obj == exitButton) { //종료버튼
			System.exit(0);
		} else if (obj == loginButton) { //로그인 버튼
			id = idInput.getText();
			label2.setText("대화명: " + id);
			clayout.show(tab, "logout");
			connectServer();
		} else if (obj == logoutButton) { //로그아웃 버튼
			//로그아웃 메시지 전송
			outMsg.println(id + "/" + "logout");
			//대화창 클리어
			msgOut.setText(" ");
			
			//로그인 패널로 전환
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			status = false;
		} else if (obj == msgInput) { //메시지를 입력창에 입력한 경우
			//메시지 전송
			outMsg.println(id + "/" + msgInput.getText());
			//입력창 클릭어
			msgInput.setText(" ");
		}
	} //actionPerformed

	//수신 메시지를 처리하는 메소드
	public void run() {
		//수신 메시지를 처리하는 변수
		String msg;
		String[] rmsg;
		
		status = true;
		while (status) {
			try {
				//메시지 수신과 파싱
				msg = inMsg.readLine(); //메시지를 한줄 단위로 읽어오기
				rmsg = msg.split("/"); //구분자에 의해 파싱

				//JTextArea에 수신된 메시지 추가
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");

				//커서를 현재 대화 메시지에 표시
				msgOut.setCaretPosition(msgOut.getDocument().getLength());
			} catch (IOException e) {
				// e.printStackTrace( );
				status = false;
			}
		}
		System.out.println("[MultiChatClient]" + thread.getName() + "종료되었습니다.");
	} //run

	public static void main(String[] args) {
		MultiChatClient mcc = new MultiChatClient("127.0.0.1");
	}
} //MultiChatClient
