package com.awt01;
/*
//LayoutManager 이해


LayoutManager (배치관리자)
	• 컨테이너는 자기 자신의 컨테이너에  컴포넌트를 붙일 때 어디에, 어떤방식으로 배치하여 붙일것인가를 이미 결정하고 있습니다. 
	• 즉, 컨테이너들은 미리 정해진 레이아웃에 따라 컴포넌트들을 자동으로 배치하는 기능을 가지고 있는 객체
	• 배치관리자는 서로 다른 운영체제에서도 레이아웃이 적절하게 이루어지도록 컴포넌트의 위치 및 크기를 관리해 주는 클래스 입니다.


레이아웃(Layout)
	• 배치 그 자체, 배치 설계, 출력양식이나 양식의 설계등과 같은 컴퓨터의 각 장치를 배치하는 것
	• 컨테이너에 컴포넌트의 위치를 결정하는 것을 배치(Layout)
	


컨테이너의 기본 배치관리자(Default LayoutManager)
	• 레이아웃관리자를 지정하지 않았을 경우 자동으로 설정되는 레이아웃관리자가 디폴트 레이아웃 관리자 입니다.
	• 자바에서 사용하는 배치관리자는 FlowLayout, BorderLayout, GridLayout, GridBagLayout, CardLayout의 5가지가 있습니다. 
	• 배치관리자는 각자 다른 방식으로 배치하는 기능을 가지고 있으며 컨테이너는 기본적으로 하나의 배치관리자를 가지고 있습니다. 
	• 사용자가 임의로 배치관리자를 다시 설정할 수 있으며 배치관리자를 제거하고 수동으로 좌표를 이용해서 배치할 수도 있습니다. 

컨테이너	기본 배치관리자
Frame	BorderLayout
Dialog	BorderLayout
Panel	FlowLayout
Applet	FlowLayout



레이아웃 관리자 사용 방법
	• setLayout() 메소드를 이용하여 레이아웃 관리자를 생성합니다
	• setLayout() 메소드의 인자는 레이아웃 관리자의 인스턴스를 필요로 합니다..

setLayout(new FlowLayout());
setLayout(new BorderLayout());
setLayout(new GridLayout());
setLayout(new CardLayout());


add() 메소드로 해당 레이아웃에 컴포넌트 객체를 부착합니다.
add(btn);

*/

import java.awt.Button;
import java.awt.Frame;


public class LayoutEx01 extends Frame{
	
	Button btn1, btn2;
	
	public LayoutEx01(){
		
		//setLayout() 메소드의 인자가 null, null로 설정하게되면 레이아웃 관리자를 사용하지 않게 됩니다.
		setLayout(null);
		
		//제목 설정
		setTitle("Layout Test");
		
		//버튼 객체를 생성
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		
		//버튼 객체의 위치와 크기를 지정합니다. 단위는 픽셀입니다.
		//setBounds(left, top, width, height) 
		btn1.setBounds(0, 30, 150, 170);
		btn2.setBounds(150, 30, 150, 170);
		
		//프레임에 버튼 부착
		add(btn1);
		add(btn2);
	}
	
	public static void main(String[] args) {
		//프레임 생성
		LayoutEx01 le = new LayoutEx01();
		
		//프레임 크기를 지정
		le.setSize(300, 200);
		
		//프레임을 화면에 나타내는 메소드 호출
		le.setVisible(true);
	}
}
