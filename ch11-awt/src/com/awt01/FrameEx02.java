//프레임 생성하기 2
//AWT 사용 기본 구조

//프로그램 종료방법
//Console창 상단의 빨간색의 중지버튼을 눌러 프로그램을 종료합니다.


package com.awt01;
//java.awt 패키지를 임포트 
import java.awt.Frame;

//java.awt패키지에 포함된 Frame 클래스를 상속받아 새로운 클래스를 생성
public class FrameEx02 extends Frame {
	
	//생성자
	public FrameEx02(){
		//이 부분에 각종 컴포넌트를 생성
	}
	
	public static void main(String args[]) {
		//객체 생성(클래스 인스턴스를 생성)
		FrameEx02 frame = new FrameEx02();
        
		//프레임의 제목 설정
		frame.setTitle("Frame Test");
		
        //프레임 사이즈 설정(가로, 세로)
        frame.setSize(400, 300);
        
        //프레임 보이게 설정
        frame.setVisible(true);       
  }
}
