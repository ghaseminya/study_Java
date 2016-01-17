/*
JButton Mouse Event

*/
package com.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx09 {

	public static void main(String[] args) {
		JFrame frm=new JFrame("JButton Event");
		frm.setBounds(120, 120, 250, 100);
		frm.setLayout(new FlowLayout());
		
		MouseListener mouseHandler=new MouseHandler();
	
		//ActionEvent가 발생하는 상황은 컴포넌트에 따라 결정된다.
		//JButton의 경우 JButton이 눌렸을때 ActionEvent가 발생핚다
		JButton btn1=new JButton("Button One");
		btn1.addMouseListener(mouseHandler);
		JButton btn2=new JButton("Button Two");
		btn2.addMouseListener(mouseHandler);
		
		frm.add(btn1);
		frm.add(btn2);
		//setEnable(false)에 의해서 컴포넌트가 비활성화되면, 
		//버튼이 눌리지 않기 때문에 ActionEvent가 발생하지 않습니다. 
		//그러나 MouseEvent는 발생합니다
		btn1.setEnabled(false);
	
		frm.setVisible(true);
	}
}


class MouseHandler implements MouseListener {
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 버튼 클릭됨");
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}