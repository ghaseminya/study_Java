/*
//JCheckBox & JRadioButton & ButtonGroup


package com.swing;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class SwingEx19 {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component Demo");		
		frm.setBounds(120, 120, 250, 250);
		frm.setLayout(new GridLayout(0, 1));   //가로는 1, 세로는 자유롭게
		
		JCheckBox checkBox = new JCheckBox("Are you a programmer? Choose one.");
		
		JRadioButton rbtn1 = new JRadioButton("I love C");
		JRadioButton rbtn2 = new JRadioButton("I love C#");
		JRadioButton rbtn3 = new JRadioButton("I love Python");
		JRadioButton rbtn4 = new JRadioButton("I love Java", true);
		
		//그룹지정
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rbtn1); bGroup.add(rbtn2); bGroup.add(rbtn3);bGroup.add(rbtn4);
		//체크박스 핸들러에 연결
		checkBox.addItemListener(new CheckBoxHandler(rbtn1, rbtn2, rbtn3, rbtn4));
		//프레임에 체크박스와 라이오버튼 추가
		frm.add(checkBox); frm.add(rbtn1);	frm.add(rbtn2); frm.add(rbtn3); frm.add(rbtn4);
		
		rbtn1.setEnabled(false);
		rbtn2.setEnabled(false);
		rbtn3.setEnabled(false);
		
		//익명내부클래스로 RadioButton의 이벤트 핸들러 구현
		rbtn1.addItemListener(
			new ItemListener() { 
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==ItemEvent.SELECTED)
						System.out.println("I like C too");
				}
			}
		);
		
		rbtn2.addItemListener(
			new ItemListener() { 
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==ItemEvent.SELECTED)
						System.out.println("I like C# too");
				}
			}
		);
		
		rbtn3.addItemListener(
			new ItemListener() { 
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==ItemEvent.SELECTED)
						System.out.println("I like Python too");
				}
			}
		);
		
		rbtn4.addItemListener(
				new ItemListener() { 
					public void itemStateChanged(ItemEvent e) {
						if(e.getStateChange()==ItemEvent.SELECTED)
							System.out.println("I like Java too");
					}
				}
				);
				
		frm.setVisible(true);	
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}

class CheckBoxHandler implements ItemListener {
	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;
	JRadioButton btn4;
	
	public CheckBoxHandler(JRadioButton b1, JRadioButton b2, JRadioButton b3, JRadioButton b4) {
		btn1=b1;
		btn2=b2;
		btn3=b3;
		btn4=b4;
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
			btn4.setEnabled(true);
		}
		else {//ItemEvent.DESELECTED
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
		}
	}
}*/