package com.awt02.component;
/*
Checkbox 
	• 여러 종류의 옵션을 선택할 수 있도록 지정할 때 사용

 */

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CheckBoxEx01 extends Frame{

	public static void main(String args[]) {
		CheckBoxEx01 cbt = new CheckBoxEx01();
		cbt.setTitle("Checkbox Test");
		cbt.setLayout(new FlowLayout());

		//체크 박스 생성
		Checkbox cb1 = new Checkbox();
		Checkbox cb2 = new Checkbox("Checkbox 2");

		//체크 박스에 레이블 지정
		cb1.setLabel("Checkbox1 label");

		cb2.setBackground(Color.green);

		//프레임에 부착
		cbt.add(cb1);
		cbt.add(cb2);

		cbt.add(new Checkbox("Checkbox 3"));

		Checkbox cb4 = new Checkbox("Checkbox 4", true);
		cbt.add(cb4);

		//pack() : 프레임이 포함하는 컴포넌트들을 모두 표시할 수  있도록 프레임의 크기를 자동으로 맞춰주는 메소드
		cbt.pack();
		cbt.setVisible(true);       
	}
}
