/*
프레임의 우측 상단부에 있는 윈도우 닫기 버튼을 눌렀을 경우 프레임이 종료되는 이벤트를 처리

*/
package com.awt04.adapter;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterEx01 extends Frame{
	//버특 객체를 선언
	Button button;
	
	public AdapterEx01(){
		super("AdapterClass 테스트");
		//FlowLayout 을 지정
		setLayout(new FlowLayout());
		
		//버튼 객체를 button 변수로 생성
		button = new Button("Click to Exit icon");
		
		//프레임에 버튼을 부착한다
		add(button);
		
		//이벤트 소스인 btn 과 이벤트 핸들러 클래스인 11행의 BtnHandler 클래스를 연결한다. 인라인 인스턴스 생성 기법을 사용했다
		this.addWindowListener(new ButtonHandler());
	}
	
	public class ButtonHandler extends WindowAdapter{
		//구현해야 될 메소드가 여러 개인 리스너 인터페이스는 어댑터 클래스를 별도로 가지고 있으며 
		//어댑터 클래스에서는 필요한 메소드만 재정의하여 사용하면 됩니다.
		//윈도우 상단부의 종료버튼을 눌렀을 경우 발생되는 이벤트를 처리하기 위한 메소드(windowClosing)입니다. 
		//이 처리에 의해 윈도우 종료 버튼을 누르면 윈도우가 종료되게 됩니다. 
		//이전까지는 이러한 이벤트 처리가 없었기 때문에 윈도우 종료버튼이 작동되지 않았습니다.
		@Override
		public void windowClosing(WindowEvent e) {
			super.windowClosing(e);
			//윈도우를 종료시키는 메소드
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		AdapterEx01 ae = new AdapterEx01();
		ae.setSize(300, 200);
		ae.setVisible(true);
	}
}
