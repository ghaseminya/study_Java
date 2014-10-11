/*
Event Listener


*/
package com.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx04 {
	
	public static void main(String[] args) {
		JFrame frm=new JFrame("Swing Event Listener Demo");
		frm.setBounds(120, 120, 400, 200);
		frm.setLayout(new FlowLayout());
		
		//MouseListener를 구현한 클래스(이벤트핸들러)의 인스턴스 생성
		MouseListener listener=new MouseEventHandler();
				
		JButton btn1=new JButton("Button One");
		//Button에서 발생하는 이벤트를 처리하는 역할을 하는 listener를 추가
		btn1.addMouseListener(listener);
		
		JButton btn2=new JButton("Button Two");
		btn2.addMouseListener(listener);
		
		JButton btn3=new JButton("Button Three");
		btn3.addMouseListener(listener);		
		
		frm.add(btn1);		
		frm.add(btn2);		
		frm.add(btn3);
		frm.setVisible(true);
	}

}

//MouseListener구현한 이벤트 핸들러
class MouseEventHandler implements MouseListener {
	/* 마우스 버튼이 클릭되었을 때(눌렸다 풀렸을 때) 호출됩니다.  */
	public void mouseClicked(MouseEvent e) {
		//이벤트가 발생한 컴포넌트의 참조값
		JButton button=(JButton)e.getComponent();
		//버튼의 문자열 변경
		button.setText("Clicked");
		//어떤 마우스 버튼이 눌렸는지 확인
		//System.out.println("Clicked Button "+e.getButton());
		System.out.println("마우스 - 버튼 클릭됨");
	}
	
	/* 마우스 커서가 버튼 위에 올라가면 호출됩니다. */
	public void mouseEntered(MouseEvent e) { 
		System.out.println("커서 - 버튼 위 진입");
	}
	
	/* 마우스 커서가 버튼을 빠져나가면 호출됩니다. */
	public void mouseExited(MouseEvent e) {
		System.out.println("커서 - 버튼 위 탈출");
	}
	
	/* 마우스 버튼이 눌리는 순간 호출됩니다. */
	public void mousePressed(MouseEvent e) { 
		System.out.println("마우스 - 버튼 눌림");		
	}
	
	/* 마우스 버튼이 풀리는 순간 호출됩니다. */
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 - 버튼 풀림");	
	}	
	
}