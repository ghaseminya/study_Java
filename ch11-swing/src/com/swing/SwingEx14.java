/*
SwingEx09의 Button ActionEvent를 
MouseListener가 아닌 Adapter클래스로 구현


MouseListener의 추상메소드(5개)를 모두 구현해 줘야 함
Adapter클래스로 구현시 필요한 추상메소드만 구현
 

Adapter클래스는 
인터페이스의 추상메소드가 빈 상태로 구현되어 필요한 메소드만 오버라이드하여 사용하면 됩니다.
*/
package com.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingEx14 {

	public static void main(String[] args)
	{
		JFrame frm=new JFrame("Mouse Motion Demo");		
		frm.setBounds(120, 120, 250, 150);		
		frm.addMouseListener(new MouseEventHandler14());
		
		frm.setVisible(true);	
		frm.setDefaultCloseOperation(
				WindowConstants.DISPOSE_ON_CLOSE);
	}
}

//인터페이스의 모든 메소드를 빈 상태로 구현해 놓은 것이 Adapter 클래스이다.

class MouseEventHandler14 extends MouseAdapter
{
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("마우스 버튼 클릭됨");
	}
}