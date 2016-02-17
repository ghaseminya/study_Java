package com.adapter3;
/*
//Adapter Class - 익명 내부 클래스 생성하여 이벤트 처리
 
new KeyAdapter(){ } - 익명내부 클래스로 이벤트 리스너 연결 - KeyEvent 
@Override 	public void keyTyped(KeyEvent e){}
  
new WindowAdapter(){ } - 익명내부 클래스로 이벤트 리스너 연결- WindowEvent 
@Override	public void windowClosing(WindowEvent e){}
 
//----------------------------------------------
//내부 클래스를 익명 내부 클래스로 변경하여 코드 길이를 줄여봅니다
처리방식 비교하기
com.adapter1\AdapterEx.java	외부 클래스를 이용하여 이벤트 처리
com.adapter2\AdapterEx.java	내부 클래스 생성하여 이벤트 처리
*com.adapter3\AdapterEx.java	익명 내부 클래스 생성하여 이벤트 처리
//----------------------------------------------

익명 내부 클래스 사용시 이점

특징
	• 익명 클래스를 이용해서 클래스가 정의된 경우
	• 코드 파악 쉽다.
	• 코드 길이 짧아진다.
	• local Inner클래스의 변형된 형태
	• 일반적으로 인터페이스 또는 추상클래스를 구현하는 클래스로 자주 사용
	• 일회성 처리를 수행할 경우 많이 사용합니다.
	• Android에서 이벤트 처리시 익명 내부 클래스로 많이 사용합니다. 
	그러므로 사용 형태 및 구조 잘 파악해 두시기 바랍니다.
	

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


public class AdapterEx extends Frame implements ActionListener{
	
	Panel p1, p2, p3;
	TextField tf;
	TextArea ta;
	Button bClear, bExit;

	
	public AdapterEx(){
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
		
		//TODO : 이벤트 리스너 연결 - KeyEvent
		//익명내부 클래스 사용
		tf.addKeyListener(new KeyAdapter(){
			//원하는 메소드만 재정의		
			@Override
			public void keyTyped(KeyEvent e){
				if(e.getKeyChar()==KeyEvent.VK_ENTER){
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}
			}			
		});		
		
		//TODO : 이벤트 리스너 연결 - WindowEvent
		//익명내부 클래스 사용
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});			
	}	
	
	@Override
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		if( str.equals("Clear") ){
			ta.setText(" ");
			tf.setText(" ");	
			ta.setText("");
			tf.setText("");			
		}else if(str.equals("Exit")){
			System.exit(0);
		}		
	}	
	
	public static void main(String[] args) {
		new AdapterEx();
	}
}