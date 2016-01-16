/* Button 생성 - 기본 Frame에 표시
 * 
 * Frame상속
 * 생성자 생성
 * 객체 생성
 * Button 생성
 * Button 사이즈 지정
 * Button을 Frame에 등록 
 * 
 * ------------------------------------------------------
 * Button 생성 - 확대되는 현상 확인
 * 패널을 사용해 Button 크기 지정 (PanelEx01.java)  
 * 
 **setSize로 지정한 버튼 크기로 표지되지 않고 Frame크기로 확대되는 현상 발생
 * 레이아웃을 사용해 버튼의 크기를 강제해야 하는데 레이아웃을 사용하지 않아서 버튼이 확대되는 현상 발생
 * 
 * 컴포넌트는 기본적으로 setSize가 안먹혀 확대됨 (setLayout 기본 적용되어 있음)
 **해결방법:
 * 1)setSize를 사용하고 layout을 사용안할려면 layout사용 안한다고 지정해 줘야 합니다.
 * 2)layout을 써서 틀을 만들고 이 틀안에 컴포넌트를 만들어야 합니다.
 * 3)컴포넌트 사용시 패널로 묶어서 표현한다.(패널도 layout지정되어 있음)
 * 
 */


package com.awt02;

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
