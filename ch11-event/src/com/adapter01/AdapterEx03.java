package com.adapter01;
/*
//Adapter Class - 내부 클래스 생성하여 이벤트 처리


[작업단계]
멤버 내부 클래스 생성 - KeyAdapter 클래스를 상속하는
이벤트 리스너 연결 - KeyEvent
@Override 	public void keyTyped(KeyEvent e){}

멤버 내부 클래스 생성 - WindowAdapet클래스를 상속하는
이벤트 리스너 연결 - WindowEvent
@Override	public void windowClosing(WindowEvent e){}
 * 

//----------------------------------------------
//외부 클래스를 내부 클래스로 정의하여 멤버변수를 바로 호출할 수 있도록 하여 코드 길이를 줄여봅니다.
처리방식 비교하기
/ch11-event/src/com/adapter01/AdapterEx02.java		외부 클래스를 이용하여 이벤트 처리
->/ch11-event/src/com/adapter01/AdapterEx03.java	내부 클래스 생성하여 이벤트 처리
/ch11-event/src/com/adapter01/AdapterEx04.java		익명 내부 클래스 생성하여 이벤트 처리


*/

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;	
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;		//Adapter class
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;	//Adapter class


public class AdapterEx03 extends Frame implements ActionListener{
	
	Panel p1, p2, p3;
	TextField tf;
	TextArea ta;
	Button bClear, bExit;
	
	public AdapterEx03(){
		//Frame 제목 설정
		super("Adapter Class Test");
		
		//Panel 생성
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		//TextField, TextArea 생성
		tf = new TextField(35);
		ta = new TextArea(10, 35);
		
		//Button 생성
		bClear = new Button("Clear");
		bExit = new Button("Exit");
		
		//Panel에 컨트롤 추가
		p1.add(tf);
		p2.add(ta);
		p3.add(bClear);
		p3.add(bExit);
		
		//Frame에 각 Panel을 BorderLayour영역에 등록
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		//Frame의 위치, 넓이, 높이 설정
		setBounds(300,  200,  300,  300);
		//Frame 노출여부 설정
		setVisible(true);
		
		//이벤트 리스너 연결 - Button의 이벤트
		bClear.addActionListener(this);
		bExit.addActionListener(this);
		
		//이벤트 리스너 연결 - KeyEvent
		//내부 클래스에서 바로 이벤트 리스너에 연결시켜줍니다.
		tf.addKeyListener(new KeyEventHandlers());		
		
		//이벤트 리스너 연결 - WindowEvent
		//내부 클래스에서 adapter클래스를 상속받아 객체를 생성해서 이벤트 리스너에 연결시켜줍니다.
		addWindowListener(new WindowEventHandlers());		
		
	}
	
	// TODO : 멤버 내부 클래스 생성 - WindowAdapet클래스를상속하는
	class WindowEventHandlers extends WindowAdapter{
		//종료버튼 클릭시 프로그램 종료
		@Override
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	
	// TODO : 멤버 내부 클래스 생성 - KeyAdapter 클래스를 상속하는
	class KeyEventHandlers extends KeyAdapter{
		//원하는 메소드만 재정의		
		@Override
		public void keyTyped(KeyEvent e){
			if(e.getKeyChar()==KeyEvent.VK_ENTER){
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		}	
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		if( str.equals("Clear") ){
			ta.setText("");
			tf.setText("");	
			tf.requestFocus();
		}else if(str.equals("Exit")){
			System.exit(0);
		}		
	}	
	
	
	public static void main(String[] args) {
		new AdapterEx03();
	}
}