/* KeyEvent
 *  
 * 방향키 입력시 TextArea에 키입력 출력하기
 * 
 * TextArea 객체 생성
 * Frame에 TextArea 등록(Frame전체에 TextArea가 위치하게 됩니다)
 * implements KeyListener
 * TextArea에 이벤트리스트 연결
 * 추상 메소드 구현
 * Frame 위치, 넓이, 높이 설정
 * Frame 노출 여부 설정
 * 
 */

package com.event;

import java.awt.Frame;
import java.awt.TextArea;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx extends Frame implements KeyListener{
	//TextArea 객체 생성
	TextArea ta = new TextArea();
	
	public KeyEventEx(){
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
		if(e.getKeyChar() == KeyEvent.VK_DOWN){
			ta.append("DOWN Key \n");			
		}else if( e.getKeyCode() == KeyEvent.VK_UP){
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
	@Override
	public void keyTyped(KeyEvent e){		
	}
	
	// 추상 메소드 구현
	@Override
	public void keyReleased(KeyEvent e){			
	}	
	
	public static void main(String[] args) {
		// 객체 생성
		new KeyEventEx();
	}
}
