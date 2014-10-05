/* Chatting 프로그램 - MultiClient
 * 
 *  MultiClient
 *  MultiClientThread
 *  MultiServer
 *  MultiServerThread
 * 
 * -----------------------------------------
 * Swing으로 구현된 클라이언트 클래스.
 * 이 클래스에서는 메시지를 보낼 때는 이벤트에서 처리했고,
 * 다른 클라이언트가 보낸 메시지를 받기 위해 MultiClientThread객체를 생성하였습니다.
 * UI 디자인
 * 
 * ID#메시지
 * 
 */


package com.socket;

import java.net.Socket;
import java.nio.ByteOrder;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class MultiClient extends JFrame implements ActionListener {
	//변수 선언
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jlb1, jlb2;
	private JPanel jp1, jp2;
	private String ip;
	private String id;
	private JButton jbtn;
	
	public MultiClient(String ip, String id){
		//제목 생성
		super("Multi Chatting");
		
		this.ip = ip;
		this.id = id;
		
		//컴포넌트 생성
		jtf = new JTextField(30);
		jta = new JTextArea("", 10, 50);
		jlb1 = new JLabel("User ID : [" + id +"]");
		jlb2 = new JLabel("IP : " + ip );
		jbtn = new JButton("종료");
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		//TextArea의 배경색 지정
		jta.setBackground(Color.ORANGE);
		//명시적으로 BoraderLayout사용하도록 명시
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());		
		
		jp1.add(jtf, BorderLayout.CENTER);
		jp1.add(jbtn, BorderLayout.EAST);
		jp2.add(jlb1, BorderLayout.CENTER);
		jp2.add(jlb2, BorderLayout.EAST);
		
		//JFrame에 연결
		add(jp1, BorderLayout.SOUTH);
		add(jp2, BorderLayout.NORTH);
		
		//TextArea에 스크롤 처리
		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//JFrame에 등록
		add(jsp, BorderLayout.CENTER);
		//편집 불가능
		jta.setEditable(false);
		
		//이벤트 소스와 이벤트리스너 연결
		jtf.addActionListener(this);
		jbtn.addActionListener(this);		
		//종료시 메시지 처리를 하기 위한 처리하기 위한 익명 내부 클래스
		addWindowListener(new WindowAdapter() {
			//이벤트 핸들러 구현
			@Override
			public void windowClosing(WindowEvent e){
				
				try{
					//서버에 종료메시지 전달
					oos.writeObject(MultiClient.this.id + "#exit");
				}catch(IOException ie){
					ie.printStackTrace();					
				}
				//프로그램 종료
				System.exit(0);
			}			
			@Override
			public void windowOpened(WindowEvent e){
				//Frame이 디스플레이되면 포커스를 JTextField에 가져감
				jtf.requestFocus();
			}
		});		
		 		
		//스크린 크기 읽어오기(넓이와 높이)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int screenWidth = d.width;
		int screenHeight = d.height;		
		// 모니터 정중앙에 배치
		setLocation( (screenWidth-getWidth())/2, (screenHeight-getHeight())/2);
		
		//크기 지정하지 않을 경우 자연스럽게 사이즈 지정되도록 pack()
		pack();
				
		//Frame의 사이즈 변경 불가능
		setResizable(false);
		
		//Frame 노출여부 설정
		setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		//이벤트 발생 객체 구하기
		Object obj = e.getSource();
		
		//조건 체크
		if( obj == jtf){
			String msg = jtf.getText();
			//입력하지 않은 경우
			if(msg ==null || msg.length() ==0){
				JOptionPane.showMessageDialog(this, "메시지를 입력하세요", "경고", JOptionPane.WARNING_MESSAGE);				
			}
			else{
				//데이터를 입력했을  경우
				try{
					//데이터를 서버로 전송
					oos.writeObject(id + "#" + msg);
					
				}catch(IOException ie){
					ie.printStackTrace();					
				}
				//JTextField를 초기화
				jtf.setText("");
			}
			
		}else if( obj == jbtn){
			//서버에 종료메시지 전달
			try{
				oos.writeObject(id +"#exit");
				
			}catch(IOException ie){
				ie.printStackTrace();				
			}
		}		
	}
	
	//종료처리
	public void exit(){
		System.exit(0);
	}
	
	//입력 스트림 반환
	public ObjectInputStream getOis(){
		return ois;
	}

	//JTextArea반환
	public JTextArea getJta(){
		return jta;
	}
	
	//ID반환
	public String getId(){
		return id;
	}
	
	//초기화
	public void init() throws IOException{
		//소켓 생성, 서버와 같은 포트번호 명시
		socket = new Socket(ip, 5000);
		System.out.println("Connected.......");
		
		//입출력 객체 생성
		//서버에 데이터를 전송할 객체 생성
		oos = new ObjectOutputStream(socket.getOutputStream());		
		//서버로부터 전달받은 데이터를 처리(입력)할 객체
		ois = new ObjectInputStream(socket.getInputStream());
		
		//데이터 처리를 위한 스레드 생성
		//실제 데이터 처리
		MultiClientThread ct = new MultiClientThread(this);
		ct.start();
	}
	
	public static void main(String[] args) {
		// 옛날 MAC스타일 지정
		JFrame.setDefaultLookAndFeelDecorated(true);
		//객체 생성, 서버IP와 ID
		MultiClient cc = new MultiClient("192.168.0.10", "dregon");
		
		
		try{
			//호출
			cc.init();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
