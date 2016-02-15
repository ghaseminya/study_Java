package com.awt02.component;
/*
//레이블 생성


Label 
	• 사각형의 영역에 문자열을 표시할 때 사용하는 컴포넌트
	• 레이블은 경계선이 없고 특별한 상태를 가지지도 않는 컨트롤
	• 레이블을 컨테이너에 포함시키게되면 레이블의 문자열만 화면에 표시됩니다.
	• 레이블의 문자열은 좌, 우, 중앙으로 정렬시킬 수 있습니다.

*/

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
