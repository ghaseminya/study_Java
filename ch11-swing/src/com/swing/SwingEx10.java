/*
Button ActionEvent

버튼의 눌림에 대해서는 ActionEvent를 기반으로 이벤트를 처리하는 것이 타당

*/
package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx10 {
	public static void main(String[] args) {
		JFrame frm=new JFrame("JButton ActionEvent Demo");
		frm.setBounds(120, 120, 250, 100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("Button One");
		JButton btn2=new JButton("Button Two");
		
		ActionListener actionHandler=new ActionEventHandler();
	
		//이벤트 리스터 연결
		btn1.addActionListener(actionHandler);
		btn2.addActionListener(actionHandler);
		
		frm.add(btn1);
		frm.add(btn2);
		btn1.setEnabled(false);	//버튼 ActionEvent 비발생
	
		frm.setVisible(true);
	}
}


class ActionEventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {		
		System.out.println(e.getActionCommand());
	}
}