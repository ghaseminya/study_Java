package com.awt02;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class LabelEx01 extends Frame{
	
	Label lbl1;
	Label lbl2;
	
	public LabelEx01(){
		setLayout(new FlowLayout());
		
		//레이블 생성
		lbl1 = new Label("레이블1");
		lbl2 = new Label();
		
		//레이블 생성 후에 메소드를 통해 문자열을 넣어 레이블 생성
		lbl2.setText("레이블2");
		
		//레이블 객체의 바탕색을 지정
		lbl2.setBackground(Color.yellow);
		
		//프레임에 추가
		add(lbl1);
		add(lbl2);
	}
	
	public static void main(String args[]) {
		LabelEx01 le = new LabelEx01();
		le.setSize(300, 200);
		le.setVisible(true);
	}

}
