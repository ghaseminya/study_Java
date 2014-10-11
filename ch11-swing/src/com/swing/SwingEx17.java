package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class SwingEx17 {

	public static void main(String[] args) {
		JFrame frm=new JFrame("JTextArea Demo");		
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());
		//세로 10, 가로 20의 JTextArea 생성
		JTextArea textArea=new JTextArea(10, 20);
		textArea.append("원하는 내용을 입력하세요. \n");
		//커서 다음 행으로 이동
		textArea.setCaretPosition(textArea.getText().length());
		
		//자동 줄 바꿈
		textArea.setLineWrap(true);
		//단어 단위 줄 바꿈
		textArea.setWrapStyleWord(true);

		JButton btn=new JButton("Clear");
		btn.addActionListener(new ButtonTextHandler(textArea));
		frm.add(textArea); frm.add(btn);

		frm.setVisible(true);	
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}


class ButtonTextHandler implements ActionListener
{
	JTextArea textArea;

	public ButtonTextHandler(JTextArea area) {
		textArea=area;
	}

	public void actionPerformed(ActionEvent e) {
		textArea.setText("모두 지웠습니다. \n");
		textArea.append("원하는 내용을 입력하세요. \n");
	}
}