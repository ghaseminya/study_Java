/*
MouseMotionEvent


MouseEvent Listener
MouseListener		마우스 관련 이벤트
MouseMotionListener	마우스 움직임 관련 이벤트

마우스 움직임을 통한 X, Y좌표출력

*/
package com.swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingEx13 {

	public static void main(String[] args) throws Exception {
		JFrame frm=new JFrame("Mouse Motion Demo");		
		frm.setBounds(120, 120, 250, 250);		
		frm.addMouseMotionListener(new MouseMotionHandler());
		
		frm.setVisible(true);	
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}

class MouseMotionHandler implements MouseMotionListener {
	public void mouseDragged(MouseEvent e) {
		System.out.printf("Drag [%d, %d] \n", e.getX(), e.getY());
	}
	
	
	//마우스 버튼이 눌린 상태에서의 움직임
	public void mouseMoved(MouseEvent e) {
		System.out.printf("Move [%d, %d] \n", e.getX(), e.getY());
	}
}