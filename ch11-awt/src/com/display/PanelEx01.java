/* Button 생성 - Panel 생성으로 Button크기 지정
 * 
 * 
 * ------------------------------------------------------
 * 버튼의 레이블을 감쌀수 있는 최소 크기로 button이 생성됨
 * Panel은 기본 중앙정렬됨
 * 
 */

package com.display;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;

public class PanelEx01 extends Frame{
	
	public PanelEx01(){
		//제목 설정
		setTitle("Panel Test");
		setSize(300, 300);
		
		//Panel 생성
		Panel p = new Panel();
						
		//Button 생성
		Button b = new Button("확인");
		//Button을 Panel에 등록
		p.add(b);
		
		//Panel을 Frame에 등록
		add(p);
		
		//Frame 노출 여부 설정 
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx01();

	}
}
