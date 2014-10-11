/*

AWT Button확인 및 프로그램 종료

GUI 창의 우측 상단의 x 버튼을 눌러도 프로그램은 종료되지 않는다. 
x 버튼이 눌렸을 때 프 로그램이 종료되기를 원한다면 그에 따른 이벤트 핸들링이 필요합니다


*/
package com.swing;

import java.awt.*;
import java.awt.event.*;

class SwingEx02
{	
	public static void main(String[] args)
	{
		Frame frm=new Frame("AWT Button");
		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());
		
		WindowListener listen=new WindowAdapter()
		{
			public void windowClosing(WindowEvent ev)
			{
				System.exit(0);	// 프로그램의 종료를 명령하는 메소드  
			}
		};
		
		frm.addWindowListener(listen);
		
		Button btn1=new Button("Button One");
		Button btn2=new Button("Button Two");
		Button btn3=new Button("Button Three");
		
		frm.add(btn1);		
		frm.add(btn2);		
		frm.add(btn3);
		frm.setVisible(true);
	}
}