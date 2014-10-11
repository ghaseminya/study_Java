/*
Multi Layout Manager Demo


JPanel 컴포넌트
	• Jpanel은 눈에 보이는 컴포넌트가 아닙니다. 
	• JFrame처럼 다른 컴포넌트를 올릴 수 있고, 
	• 배치 관리자의 지정도 가능합니다.

------------------------------------------
JFrame에 배치 관리자 지정해서 두 개의 JPanel을 올립니다. 
각각의 Jpanel에 각각의 배치 관리자를 별도로 지정합니다.

*/
package com.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingEx08 {

	public static void main(String[] args) {
		JFrame frm=new JFrame("Multi Layout Manager Demo");
		frm.setBounds(120, 120, 400, 150);
		frm.setLayout(new BorderLayout());
		
		JButton btn1=new JButton("Button1");
		JButton btn2=new JButton("Button12");
		JButton btn3=new JButton("Button3");
		JButton btn4=new JButton("Button4");
		JButton btn5=new JButton("Button5");
		JButton btn6=new JButton("Button6");
		JButton btn7=new JButton("Button7");
		JButton btn8=new JButton("Button8");
		JButton btn9=new JButton("Button9");
		JButton btn10=new JButton("Button10");
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(btn1); panel1.add(btn2); 
		panel1.add(btn3); panel1.add(btn4);
		
		JPanel panel2=new JPanel();
		panel2.setLayout(new GridLayout(2, 3, 2, 2));
		panel2.add(btn5); panel2.add(btn6); panel2.add(btn7); 
		panel2.add(btn8); panel2.add(btn9); panel2.add(btn10); 
		
		//JFrame에 배치 관리자 지정해서 두 개의 JPanel을 올립니다. 
		//각각의 Jpanel에 각각의 배치 관리자를 별도로 지정합니다.
		frm.add(panel1, BorderLayout.NORTH);
		frm.add(panel2, BorderLayout.CENTER);
		
		frm.setVisible(true);
	}
}
