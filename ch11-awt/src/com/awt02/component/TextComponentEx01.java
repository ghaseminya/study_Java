package com.awt02.component;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextComponentEx01 extends Frame{
	
	TextField tf;
	TextArea ta;
	
	public TextComponentEx01(){
		setLayout(new FlowLayout());
		//TextField 객체
		//지정한 컬럼수만큼 문자를 보여줄 수 있는 크기로 텍스트 필드 객체를 생성합니다.
		tf = new TextField(30);
		//TextArea 객체를 생성
		//TextArea(int rows, int columns) : 지정된 행수와 컬럼수만큼 표현할 수 있는 텍스트 영역 객체를 생성
		ta = new TextArea(7, 30);
		
		add(tf);
		add(ta);
		
	}
	
	public static void main(String args[]){
		TextComponentEx01 tc = new TextComponentEx01();
		
		tc.setSize(300, 200);
		tc.setVisible(true);
	}

}
