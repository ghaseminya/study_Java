package com.adapter01;
/*
프레임의 우측 상단부에 있는 윈도우 닫기 버튼을 눌렀을 경우 프레임이 종료되는 이벤트를 처리

[Listener vs Adapter]
구분			설명
Listener 	• Listener는 자체적으로 메소드의 내용을 가지고 있지 않은 인터페이스
			• 인터페이스를 다른 클래스에 구현하게 되면 Listener 가 가지고 있는 모든 추상메소드를 완성해야 합니다.
			
Adapter		• 불편한 점을 해결하기 위해 Listener를 클래스로 변형한 형태가 Adapter 클래스
			• Adapter는 클래스이므로 필요한 메소드만 재정의해서 사용하면 됩니다.



이벤트 어댑터 클래스(Adapter Class)
	• 이벤트를 처리하기 위하여 이벤트 리스너를 등록하여 처리를 해주어야 합니다.
	• 리스너가 인터페이스로 되어 있어 리스너에 선언되어 있는 추상메서드를 모두 오버라이드해야 사용이 가능합니다.
	• 즉, 사용하지 않는 메서드까지도 모두 오버라이드하여 완성을 시켜야 사용 할 수 있습니다.(번거로운 작업)
	• 그래서 자바 API에는 이러한 작업을 좀 더 쉽게 처리할 수 있도록 Adapter라는 클래스를 제공합니다.
	• Adapter 클래스는 이벤트 리스너 인터페이스들 중에서 추상메서드가 2개 이상 존재하는 인터페이스를 구현한 추상 클래스입니다.
	• 인터페이스에 있는 모든 메서드를 빈(Empty) 메서드로 재정의 하였기 때문에 
	인터페이스를 구현하여 불필요한 메서드를 재정의하는 작업을 하지 않아도 됩니다.
	• Adapter 클래스를 상속받은 클래스에서는 자신이 필요로하는 메서드만 재정의해서 사용하면 됩니다.



Adapter 클래스 종류
이벤트					이벤트 리스너				이벤트 어댑터
ComponentEvent			ComponentListener		ComponentAdapter
ContainerEvent			ContainerListener		ContainerAdapter
FocusEvent				FocusListener			FocusAdapter
KeyEvent				KeyListener				KeyAdapter
MouseEvent				MouseListener			MouseAdapter
MouseMotionEvent		MousMotionListener		MouseMotionAdapter





*/


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
