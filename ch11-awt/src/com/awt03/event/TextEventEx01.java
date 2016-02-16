package com.awt03.event;
/*
//TextEvent와 ActionEvent 동시 처리하기

[작업단계]
관련 클래스 import
생성자 생성
Frame상속받은 객체생성
객체생성 (TextFiled, Button, TextArea)

Frame 타이틀
초기 버튼상태 지정 - 비활성화 
Panel 객체 생성
Frame에 Panel, TextArea, Button을 순차적으로 등록

Frame의 위치, 넓이, 높이 설정
Frame의 노출여부 설정
implements ActionListener
Button과 이벤트 연결
@Override actionPerformed 구현

implements TextListener
TextField에 이벤트 연결
@Override textValueChanged 

//-------------------------

TextEvent
	• 텍스트 컴포넌트(TextField, TextArea)에서 키가 입력이 되어 내용이 바뀌었을 때 발생하는 이벤트
	• 내용이 바뀔때마다 발생하므로 주의해서 사용해야 하며
	• 사용자가 입력할때마다 처리해야 할 것이 있을 경우에 사용하는 이벤트


TextListener
TextEvent를 처리하는 이벤트 리스너

*/

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextEventEx01 extends Frame implements ActionListener, TextListener{	
	
	TextField tf = new TextField(20);
	Button input = new Button("입력");
	Button exit = new Button("종료");
	TextArea ta = new TextArea();	
	
	public TextEventEx01(){
		//Frame 타이틀 설정
		super("TextEvent Test");
		
		//초기 버튼상태 지정 - 비활성화
		input.setEnabled(false);
		
		//Panel 객체 생성
		Panel p = new Panel();
		p.add(new Label("제목:"));
		p.add(tf);
		p.add(input);
		
		//Frame에 Panel, TextArea, Button을 순차적으로 등록
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(exit, BorderLayout.SOUTH);
		
		//Button과 이벤트 연결
		input.addActionListener(this);
		exit.addActionListener(this);
		
		//TextField에 이벤트 연결
		tf.addTextListener(this);
		
		//Frame의 위치, 넓이, 높이 설정
		setBounds(300, 300, 300, 300);			
		
		//Frame의 노출여부 설정
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if( e.getActionCommand().equals("입력")){
			ta.append(tf.getText() + "\n");
			tf.setText("");
			//포커스를 TextField에 두기
			tf.requestFocus();
		}else if( e.getActionCommand().equals("종료")){
			System.exit(0);
		}		
	}
	@Override
	public void textValueChanged(TextEvent e){
		
		if(tf.getText().equals("")){ //입력한 데이터가 없는 경우
			input.setEnabled(false);					
		}else{ //입력한 데이터가 있는 경우
			input.setEnabled(true);	
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEventEx01();
	}
}
