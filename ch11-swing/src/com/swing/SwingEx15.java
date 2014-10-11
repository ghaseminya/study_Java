/*
Anonymous(익명) 클래스

SwingEx14를 익명 내부 클래스형태로 구현

Adapter클래스의 메소드를 하나만 정의하고자 하는 경우에는 
Anonymous 클래스의 형태로정의하는 것도 의미가 있으며 안드로이드에서 많이활용하는 형태입니다.

*/
package com.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingEx15 {
	public static void main(String[] args) {
		JFrame frm=new JFrame("Mouse Motion - Anonymous클리스");		
		frm.setBounds(120, 120, 250, 150);		
		frm.addMouseListener(
				new MouseAdapter()
				{
					public void mouseClicked(MouseEvent e) {
						System.out.println("마우스 버튼 클릭됨");
					}				
				}
		);
		
		frm.setVisible(true);	
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
