package com.awt01;
/*
//프레임 생성하기 2
//AWT 사용 기본 구조


[AWT 프로그래밍 절차]
단계					설명
컨테이너 클래스 의 객체생성	GUI 가 가능한 컨테이너 클래스를 상속받아 새로운 클래스를 생성합니다.
컴포넌트 생성				프로그램에 사용될 각종 컴포넌트를 생성합니다.
컨테이너에 부착			생성된 컴포넌트를 컨테이너에 부착합니다.
이벤트 처리				이벤트 핸들러를 작성합니다.



프로그램 종료방법 방법
Console창 상단의 빨간색의 중지버튼을 눌러 프로그램을 종료합니다.


윈도우 닫기가 이루어 지지 않는 이유는 
닫기 버튼이 눌려지는 상황인 윈도우 종료 이벤트가 발생될 때 윈도우가 닫히는 처리를 프로그래머가 구사해 주지 않았기 때문입니다


*/

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
