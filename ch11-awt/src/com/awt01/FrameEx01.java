
//프레임 생성하기 1
//AWT 사용 기본 구조

//프로그램 종료방법
//Console창 상단의 빨간색의 중지버튼을 눌러 프로그램을 종료합니다.

//윈도우 닫기가 이루어 지지 않는 이유는 
//닫기 버튼이 눌려지는 상황인 윈도우 종료 이벤트가 발생될 때 윈도우가 닫히는 처리를 프로그래머가 구사해 주지 않았기 때문입니다

package com.awt01;
//awt패키지 사용
import java.awt.Frame;

public class FrameEx01 {
	
	public static void main(String args[]) {
		//객체 생성
        Frame frame = new Frame("Frame Test");
        
        //프레임 사이즈 설정(가로px, 세로px)
        frame.setSize(400, 300);
        
        //프레임 보이게 설정
        frame.setVisible(true);       
  }
}
