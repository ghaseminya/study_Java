package com.keyevent;
/*
//방향키 입력시 TextArea에 어떤 키를 눌렀는지 출력하기


[작업단계]
TextArea 객체 생성
Frame에 TextArea 등록(Frame전체에 TextArea가 위치하게 됩니다)
implements KeyListener
TextArea에 이벤트리스트 연결
추상 메소드 구현
Frame 위치, 넓이, 높이 설정
Frame 노출 여부 설정

//----------------------

KeyEvent
사용자가 키보드와 같은 입력장치를 통해서 키 입력을 했을 때 발생하는 이벤트


KeyListener
KeyEvent를 처리하는 이벤트 리스너

*/

import java.awt.Frame;
import java.awt.TextArea;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx01 extends Frame implements KeyListener{
	//TextArea 객체 생성
	TextArea ta = new TextArea();
	
	public KeyEventEx01(){
		//제목 설정
		super("KeyEvent Test");
		
		//Frame에 TextArea등록(Frame전체에 TextArea가 위치하게 됩니다)
		add(ta);
		
		//TextArea에 이벤트리스트 연결
		ta.addKeyListener(this);
		
		//Frame 위치, 넓이, 높이 설정
		setBounds(300, 300, 300, 300);
		
		//Frame 노출 여부 설정
		setVisible(true);		
	}
	
	// 추상 메소드 구현 (키가 눌렸을 때)
	@Override
	public void keyPressed(KeyEvent e){
		//getKeyChar()로는 이벤트 비교안되며 KeyCode로 가져와서 비교
//		if(e.getKeyChar() == KeyEvent.VK_DOWN){ 
//			ta.append("DOWN Key \n");			
//		} 
		if( e.getKeyCode() == KeyEvent.VK_UP){
			ta.append("UP Key \n");
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			ta.append("DOWN Key \n");
		}else if( e.getKeyCode() == KeyEvent.VK_LEFT){
			ta.append("LEFT Key \n");
		}else if( e.getKeyCode() == KeyEvent.VK_RIGHT){
			ta.append("RIGHT Key \n");
		}else if( e.getKeyCode() == KeyEvent.VK_ENTER){
			ta.append("ENTER Key \n");
		}
	}	
	
	// 추상 메소드 구현
	// 컴포넌트에 키보드를 통해 문자가 입력되었을 때 호출
	@Override
	public void keyTyped(KeyEvent e){		
	}
	
	// 추상 메소드 구현
	// 컴포넌트에 키가 눌려졌다가 띄어졌을 때 호출
	@Override
	public void keyReleased(KeyEvent e){			
	}	
	
	
	public static void main(String[] args) {
		// 객체 생성
		new KeyEventEx01();
	}
}
