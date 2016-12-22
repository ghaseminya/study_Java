package com.awt01;
/* Button 생성 - Panel 생성 후 Button크기 지정
버튼의 크기는 버튼의 레이블을 감쌀수 있는 최소 크기로 button이 생성됩니다.
Panel은 기본 중앙정렬됩니다.
//------------------------------------------------------

Panel 클래스 
	• 컴포넌트들을 그룹별로 묶어서 처리할 때 주로 사용
	• 컴포넌트들을 Panel 에 배치하고 Panel을 Frame에 부착합니다.
	• Frame에 컴포넌트를 직접 붙이지 않고 Panel에 그룹별로 붙이고, 다시 Panel을 Frame에 붙이는 경우가 일반적입니다.
	• 다른 Panel을 생성하여 자신에게 붙일 수 있어 윈도우 프로그램을 만들때는 여러 개의 Panel을 사용하여 만들게 됩니다.

*/

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

//Frame 클래스를 상속
public class PanelEx01 extends Frame{
	
	public PanelEx01(){
		//setLayout() : 컴포넌트 레이아웃 변경하는 메소드
		setLayout(new FlowLayout());
		
		//제목 설정
		setTitle("Panel Test");
		//프레임 크기를 설정
		setSize(300, 300);
		//배경색상 설정
		setBackground(Color.yellow);
		
		
		//Panel 생성
		Panel p = new Panel();
		//Panel의 배경색상 지정
		p.setBackground(Color.green);
				

		//Button 인스턴스를 생성 
		Button b = new Button("확인");
		
		//Button을 Panel에 등록
		p.add(b);
		
		//Panel을 Frame에 등록
		add(p);
		
		//Frame 노출 여부 설정 
		setVisible(true);
	}

	public static void main(String[] args) {
		new PanelEx01();
		
	}
}
