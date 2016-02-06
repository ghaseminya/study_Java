package com.awt02.component;
/*

TextComponent
	• 텍스트를 다루는 클래스의 super 클래스로
	• 텍스트를 처리하는 각종 메서드를 가지고 있습니다.
	• 독립적으로는 생성하지 못합니다.



[TextComponent 클래스의 하위 클래스]
종류			기능
TextField	문자 한 줄만 입력받을 때 사용합니다. 
TextArea	여러 줄의 문자를 입력받을 때 사용합니다.


*/

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
