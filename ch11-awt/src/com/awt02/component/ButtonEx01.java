/* Button 생성
 * 
 */


package com.awt02.component;

import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;

//Frame 상속
public class ButtonEx01 extends Frame{
	
	//멤버변수로서 Button 타입의 변수인 btn1 과 btn2 를 선언하고 있다. 
	//멤버변수는 이 클래스의 모든 영역에서 사용 가능한 변수이다. 
	//그러므로, 컴포넌트는 멤버변수로 선언되어야 여러곳에서 쉽게 사용할 수 있다.
	Button button1;
	Button button2;
	
	//생성자 생성
	public ButtonEx01(){ //생성자
		//프레임의 레이아웃관리자 지정, 컴포넌트 객체를 배치하기 위한 setLayout() 메소드 호출 
		//이 메소드는 컴포넌트의 위치 지정을 하지 않더라도 적당히 윈도우 내에 위치시킬 수 있는 방법을 제공합니다.
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
