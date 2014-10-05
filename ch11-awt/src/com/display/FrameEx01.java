/* Frame창 생성하기
 * 
 * Frame 상속후 객체생성
 * Frame의 생성자에서 기본 셋팅 지정
 * - 제목 설정
 * - 넓이, 높이 설정
 * Frame의 화면 노출 여부 지정 
 * 
 * --------------------------------------
 * 최소화, 최대화는 기본지원(기본)
 * 종료버튼은 작동안됨(기본)
 *  
 **Frame생성방법
 * 1)Frame 상속 (권장) - 모듈화 시킬수 있는 장점이 있어 재활용성 높아짐
 * 2)Frame 객체생성 - 재활용성 떨어짐, 
 */


package com.display;

import java.awt.Frame;

// Frame 상속
public class FrameEx01 extends Frame{
	
	//생성자에서 기본셋팅 지정
	public FrameEx01(){
		//제목 설정
		super("Frame Test");
		
		//넓이, 높이 설정
		setSize(300,  300);
		
		//Frame 화면 노출 여부 지정
		setVisible(true);
	}
	public static void main(String[] args){
		//객체 생성
		new FrameEx01();
	}

}
