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


package com.display;

import java.awt.Frame;
import java.awt.Button;

//Frame 상속
public class ButtonEx01 extends Frame{
	
	//생성자 생성
	public ButtonEx01(){
		//제목 설정
		super("Button 테스트");		
		//width, hegith설정
		 setSize(300,  300);		 
		 //Framew 노출 여부 지정
		 setVisible(true);
		 
		 
		 //Button지정
		 //Button객체 생성
		 Button b = new Button("확인");
		 // setSize로 지정한 버튼 크기로 표지되지 않고 전테 Frame크기로 확대되는 현상 발생
		 b.setSize(100,  50); 	//width, height 설정		 
		 //Button을 Frame에 등록
		 add(b);
		
	}

	public static void main(String[] args) {
		new ButtonEx01(); 

	}

}
