package com.awt02.component;
/*//Checkbox-체크 박스
Checkbox 
	• 여러 종류의 옵션항목을 선택할 수 있게 해주는 컴포넌트
	• 체크 박스나 라디오 버튼을 만들때 사용
	• 여러 개의 체크박스를 묶어 하나의 그룹으로 만들면 그룹내에서는 하나의 선택 값만 유지할 수 있는 라디오 버튼 형태로도 사용할 수 있는 컴포넌트


 */

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CheckBoxEx01 extends Frame {

	public static void main(String args[]) {
		// Frame 생성
		CheckBoxEx01 cbt = new CheckBoxEx01();
		// Frame 제목 설정
		cbt.setTitle("Checkbox Test");
		// FlowLayout으로 배치관리자(LayoutManager) 설정
		cbt.setLayout(new FlowLayout());

		// 체크 박스 생성
		Checkbox cb1 = new Checkbox();
		Checkbox cb2 = new Checkbox("Checkbox 2");

		// 체크 박스에 레이블 지정
		cb1.setLabel("Checkbox1 label");

		// 체크 박스에 배경 지정
		cb2.setBackground(Color.green);

		// 프레임에 부착
		cbt.add(cb1);
		cbt.add(cb2);

		// 체크 박스의 인스턴스를 바로 프레임에 부착
		cbt.add(new Checkbox("Checkbox 3"));

		// 기본값으로 체크된 상태를 가진 체크박스 생성
		Checkbox cb4 = new Checkbox("Checkbox 4", true);
		// 프레임에 부착
		cbt.add(cb4);

		// pack() : 프레임이 포함하고 있는 모든 컴포넌트들을 표시할 수 있도록 프레임의 크기를 자동으로 맞춰주는 메소드
		cbt.pack();

		// Frame 화면 노출 여부 지정
		cbt.setVisible(true);
	}
}
