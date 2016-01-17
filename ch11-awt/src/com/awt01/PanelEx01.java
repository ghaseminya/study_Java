/* Button 생성 - Panel 생성으로 Button크기 지정
 * 
 * 
 * ------------------------------------------------------
 * 버튼의 레이블을 감쌀수 있는 최소 크기로 button이 생성됨
 * Panel은 기본 중앙정렬됨
 * 
 */

package com.awt01;

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
		setBackground(Color.yellow);
		
		
		//Panel 생성
		Panel p = new Panel();
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
