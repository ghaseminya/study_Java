/*
JLabel & JTextField Demo

JTextField와 JPasswordField의 텍스트상에서 엔터 키가 입력되면
ActionEvent가 발생

*/
package com.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingEx16 {
	public static void main(String[] args) {
		JFrame frm=new JFrame("JLabel & JTextField Demo");		
		frm.setBounds(120, 120, 180, 80);
		frm.setLayout(new GridLayout(2, 2));
		
		JLabel idLabel=new JLabel("ID ", SwingConstants.RIGHT);
		JTextField idText=new JTextField(10);
		
		JLabel pwLabel=new JLabel("Password ", SwingConstants.RIGHT);
		JPasswordField pwText=new JPasswordField(10);
		pwText.setEchoChar('*');	//에코문자열
		
		pwText.addActionListener(new PWHandler(idText, pwText));
		
		frm.add(idLabel); frm.add(idText);
		frm.add(pwLabel); frm.add(pwText);
		
		frm.setVisible(true);	
		frm.setDefaultCloseOperation(
				WindowConstants.DISPOSE_ON_CLOSE);
	}
}

class PWHandler implements ActionListener {
	JTextField id;
	JPasswordField pw;
	
	public PWHandler(JTextField id, JPasswordField pw) {
		this.id=id;
		this.pw=pw;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("ID: "+id.getText());
		System.out.println("Password: "+new String(pw.getPassword()));	
		id.setText("");
		pw.setText("");
	}
}