/*
화면 표시영역을 벗어나는 내용이 포함될 경우
스크롤 바가 자동으로 생성됩니다.

JScrollPane
VERTICAL_SCROLLBAR_ALWAYS	항상 세로 스크롤 바를 표시
HORIZONTAL_SCROLLBAR_ALWAYS	항상 가로 스크롤 바를 표시
HORIZONTAL_SCROLLBAR_NEVER	스크롤 바를 표시하지 않음


*/
package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

public class SwingEx18 {
	public static void main(String[] args)
	{
		JFrame frm=new JFrame("JScrollPane Demo");		
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());
	
		JTextArea textArea=new JTextArea(10, 20);
		textArea.append("원하는 내용을 입력하세요. \n");
		textArea.setCaretPosition(textArea.getText().length());
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JButton btn=new JButton("Clear");
		btn.addActionListener(new ButtonTextHandler18(textArea));
		
		//JScrollPane에 TextArea에 설정
		//JScrollPane simpleScroll=new JScrollPane(textArea);
		JScrollPane simpleScroll=new JScrollPane(textArea, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		frm.add(simpleScroll); frm.add(btn);
		
		frm.setVisible(true);	
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}

class ButtonTextHandler18 implements ActionListener
{
	JTextArea textArea;
	
	public ButtonTextHandler18(JTextArea area)
	{
		textArea=area;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		textArea.setText("모두 지웠습니다. \n");
		textArea.append("원하는 내용을 입력하세요. \n");
	}
}