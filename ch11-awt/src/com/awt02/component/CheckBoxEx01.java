package com.awt02.component;
/*
Checkbox 
	• 여러 종류의 옵션을 선택할 수 있도록 지정할 때 사용
	• 여러 개의 체크박스를 묶어 하나의 그룹으로 만들면 
	그룹내에서는 하나의 선택 값만 유지할 수 있는 라디오 버튼 형태로도 사용할 수 있는 컴포넌트
	• 그룹으로 묶을 때는 CheckboxGroup 클래스를 사용


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

		//pack() : 프레임이 포함하는 컴포넌트들을 모두 표시할 수  있을 정도로 프레임의 크기를 자동으로 맞추는 메소드
		cbt.pack();
		cbt.setVisible(true);       
	}
}
