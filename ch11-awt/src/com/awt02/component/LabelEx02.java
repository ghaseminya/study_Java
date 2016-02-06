package com.awt02.component;
/*
//레이블 생성방법 3가지
//레이블 정렬



*/

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class LabelEx02 extends Frame{

	public void printAlignment(int state) {
		switch(state) {
		case 0:
			System.out.println(" Left Alignment");
			break;
		case 1:
			System.out.println(" Left Center");
			break;
		case 2:
			System.out.println(" Right Alignment");

		}
	}
	public static void main(String args[]) {
		LabelEx02 lt = new LabelEx02();
		lt.setTitle("Label Test Window");
		lt.setLayout(new GridLayout(3, 1));

		//TODO 1
		Label label1 = new Label();
		//레이블에 지정한 text를 가지고 왼쪽 정렬이 된 상태로 생성합니다.
		label1.setText("Label 1");
		lt.add(label1);

		//TODO 2
		Label label2 = new Label("Label 2");
		//레이블의 문자를 중앙에 정렬시킵니다.
		label2.setAlignment(Label.CENTER);
		lt.add(label2);

		//TODO 3
		//레이블에 지정한 text를 가지고 지정한 정렬이 된 상태로 생성합니다.
		Label label3 = new Label("Label 3", Label.RIGHT);
		lt.add(label3);

		System.out.print(label1.getText()+" is ");
		lt.printAlignment(label1.getAlignment());
		System.out.print(label2.getText()+" is ");
		lt.printAlignment(label2.getAlignment());
		System.out.print(label3.getText()+" is ");
		lt.printAlignment(label3.getAlignment());

		lt.setSize(200,100);
		lt.setVisible(true);       
	}
}

/*//출력결과
Label 1 is  Left Alignment
Label 2 is  Left Center
Label 3 is  Right Alignment

*/