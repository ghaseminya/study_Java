//LayoutManager 이해

package com.awt01;

import java.awt.Button;
import java.awt.Frame;


public class LayoutEx01 extends Frame{
	
	Button btn1, btn2;
	
	public LayoutEx01(){
		
		//setLayout() 메소드의 인자가 null, null로 설정함으로써 레이아웃 관리자를 사용하지 않게 됩니다.
		setLayout(null);
		//제목 설정
		setTitle("Layout Test");
		
		//버튼 객체를 생성
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		
		//버튼 객체의 위치와 크기를 지정합니다. 단위는 픽셀입니다.
		//setBounds(left, top, width, height) 
		btn1.setBounds(0, 30, 150, 170);
		btn2.setBounds(150, 30, 150, 170);
		
		//프레임에 버튼 부착
		add(btn1);
		add(btn2);
	}
	
	public static void main(String[] args) {
		LayoutEx01 le = new LayoutEx01();
		//프레임 크기를 지정
		le.setSize(300, 200);
		//프레임을 화면에 나타내는 메소드 호출
		le.setVisible(true);
		
	}
}
