package com.awt02.component;
/* Button 생성

Component(컴포넌트)
	• 추상클래스로서 AWT의 각종 컴포넌트들의 최상위 클래스, 모든 컴포넌트들의 super 클래스
	• GUI 프로그램을 구성하는 구성단위로 각 컴포넌트들에서 공통으로 사용되어지는 메서드들을 가지고 있습니다.
	• GUI환경에서 버튼, 리스트등과 같은 각각의 구성요소를 이루는 객체


기본 컴포넌트 종류
Button, Canvas, Checkbox, Choice, Label, List, Scrollbar


Button 
	• 버튼을 만들 때 사용
	• 버튼을 사용자가 눌렸을 때 특정한 액션을 실행할 수 있도록 만든 컴포넌트

*/

import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;

//Frame 상속
public class ButtonEx01 extends Frame{
	
	//멤버변수로서 Button 타입의 변수인 button1 과 button2 를 선언 
	//멤버변수는 이 클래스의 모든 영역에서 사용 가능한 변수
	//그러므로, 컴포넌트는 멤버변수로 선언되어야 여러곳에서 쉽게 사용할 수 있습니다.
	Button button1;
	Button button2;
	
	//생성자 생성
	public ButtonEx01(){ //생성자
		//프레임의 레이아웃관리자 지정, 컴포넌트 객체를 배치하기 위해 setLayout() 메소드 호출 
		//이 메소드는 컴포넌트의 위치 지정을 하지 않더라도 적당히 윈도우 내에 위치시킬 수 있도록 레이아웃 메니저를 통해 표시합니다.
		setLayout(new FlowLayout());
		
		//각각 btn1버튼과 btn2버튼 객체를 생성하고 있다. 
		//생성자를 각기  다른 방법으로 사용했다
		button1 = new Button("버튼1");
		button2 = new Button();
		
		//버튼에 레이블 지정
		button2.setLabel("Button2");
		
		//현재 프레임에 버튼을 부착하는 
		add(button1);
		add(button2);
		
	}

	public static void main(String[] args) {
		//클래스 인스턴스 생성
		ButtonEx01 be = new ButtonEx01();
		//프레임 가로, 세로 크기 설정
		be.setSize(300, 100);
		//프레임 나타내기
        be.setVisible(true);  
	}
}
