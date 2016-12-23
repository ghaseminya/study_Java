package com.awt02.component;
/*//Checkbox-라이오버튼
//Checkbox를 그룹으로 묶어 RadioButton 형태로 활용

RadioButton
	• Checkbox 컴포넌트를 여러 개의 체크박스를 묶어 하나의 그룹으로 만들면 
	그룹내에서는 하나의 선택 값만 유지할 수 있는 라디오 버튼 형태로도 사용할 수 있습니다.
	• 그룹으로 묶을 때는 CheckboxGroup 클래스를 사용
*/

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class RadioButtonEx01 extends Frame {

	public static void main(String args[]) {
		// Frame 생성
		RadioButtonEx01 cbt = new RadioButtonEx01();
		// Frame 제목 설정
		cbt.setTitle("RadioButton Test");
		// FlowLayout으로 배치관리자(LayoutManager) 설정
		cbt.setLayout(new FlowLayout());

		// 체크 박스를 하나로 묶는 CheckboxGroup 객체 생성
		// 체크박스를 그룹화하게 되면 라디오 버튼 형태가 됩니다.
		// 그룹화 되어 있으면 특정 항목을 하나 선택하면 다른 것들의 선택은 해제 됩니다.
		CheckboxGroup cbg = new CheckboxGroup();

		// 그룹객체에 체크박스을 생성 시키면서 추가
		Checkbox cb1 = new Checkbox("Radio button 1", cbg, false);
		Checkbox cb2 = new Checkbox("Radio button 2", cbg, false);
		Checkbox cb3 = new Checkbox("Radio button 3", cbg, true);
		Checkbox cb4 = new Checkbox("Radio button 4", cbg, false);

		// 컨테이너에 추가
		cbt.add(cb1);
		cbt.add(cb2);
		cbt.add(cb3);
		cbt.add(cb4);

		// pack() : 프레임이 포함하고 있는 모든 컴포넌트들을 표시할 수 있도록 프레임의 크기를 자동으로 맞춰주는 메소드
		cbt.pack();

		// Frame 화면 노출 여부 지정
		cbt.setVisible(true);
	}
}
