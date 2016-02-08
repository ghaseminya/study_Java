package com.awt03.event;
/*
이벤트 처리 3단계 이해하기 or 4단계

[컴포넌트 이벤트 처리 3단계]
1단계	: 이벤트 소스 결정	
		• 하나의 윈도우에는 여러 개의 컴포넌트가 존재할 수 있으므로 실제로 이벤트가 발생되면 처리할 컴포넌트를 결정합니다.
		• 컴포넌트의 이벤트 클래스를 결정하는 것으로 예를 들어 버튼이 눌렸을 때 이벤트라면 ActionEvent 클래스가 됩니다.
				
2단계	: 이벤트 리스너 작성	
		• 이벤트를 실제적으로 처리할 수 있도록 해당 이벤트를 처리할 이벤트 리스너 인터페이스를 이용해서 이벤트 리스너 클래스를 작성합니다.
 
3단계	: 이벤트 소스와 이벤트 리스너 연결	
		• 이벤트 리스너가 작성이되면 리스너와 이벤트 소스와 연결을 하여 이벤트 소스에서 
		     실제적으로 이벤트가 발생이 되면 처리할 수 있도록 addXXXXListener()함수를 통해 연결을 시켜줍니다.
		• XXXX부분은 해당 컴포넌트에 붙일 수 있는 리스너 이름을 의미합니다. 
		• 예) 버튼에 ActionEvent을 처리하기 위하여 버튼에다가 addActionListener를 붙이는 경우

//TODO 4.이벤트 핸들러 내용 구현
 * 리스너의 추상메소드 구체화
 * 실제 이벤트 발생시 수행되는 부분


[이벤트 처리 작업 단계]
TODO 1: 이벤트 소스 결정
Button이 눌려졌을 때 발생되는 ActionEvent 처리하기

TODO 2: 이벤트 리스너 작성
ActionEvent처리를 위한 이벤트 핸들러 클래스 작성(내부 클래스로 작성)

TODO 3: 이벤트 소스와 이벤트 리스너 연결
Button와 ButtonHandler를 연결

//TODO 4.이벤트 핸들러 내용 구현



[이벤트 핸들러 연결방법 2 가지]
• 클래스의 인스턴스 생성 후 사용
• 인라인(inline) 인스턴스 생성 기법 사용


[클래스의 인스턴스 생성 후 사용]
• 클래스를 사용하려면 인스턴스를 생성해야 한다. (정적(static) 클래스는 예외) 
• 인스턴스가 생성된다는 것은 객체변수가 만들어지는 것을 의미한다.
• 생성된 btnHandler 변수를 다른 부분에서 계속 사용할 수 있습니다.
 
문법 : 
BtnHandler btnHandler = new BtnHandler(); 
btn.addActionListener(btnHandler); 


[인라인(inline) 인스턴스 생성 기법 사용]
• 단 한곳에서만 사용할 경우 사용하는 방법
• 이와 같은 방법을 인라인 인스턴스 생성 기법이라 합니다.
 
문법 : 
btn.addActionListener(new BtnHandler()); 

*/


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx01 extends Frame{
	
	Button button;
	
	public ActionEventEx01(){
		setLayout(new FlowLayout());
		setTitle("MouseEvnet Test");
		
		//TODO 1: 이벤트 소스 결정
		button = new Button("Click me");
		
		//TODO 3: 이벤트 소스와 이벤트 리스너 연결
		//이벤트 소스(Button)와 이벤트 리스너(ButtonHandler) 연결
		//이벤트 리스너  추가 메소드는 addXXXListener형태를가지며 XXX는 해당 이벤트 클래스의 이름과동일합니다.
		//인라인(inline) 인스턴스 생성 기법
		button.addActionListener(new ButtonHandler());
		
		add(button);
	}
	
	//TODO 2: 이벤트 리스너 작성
	//ActionEvent처리를 위한 이벤트 핸들러 클래스 작성(내부 클래스로 작성)
	//ActionListener 를 구현하여 TfHandler 클래스를 생성
	public class ButtonHandler implements ActionListener {

		//TODO 4.이벤트 핸들러 내용 구현
		//actionPerformed() 메소드를 반드시 작성해야 한다. 인자도 반드시 이와 똑 같이 작성해야 합니다. 
		//이러한 내용은 ActionLIstener 인터페이스에 이미 정의되어 있습니다.
		@Override
		public void actionPerformed(ActionEvent e) { 
			//ActionEvent: Button이 눌려졌을 때 발생되는 이벤트
			
			System.out.println("버튼이 클릭되었습니다.");
		}
	}

	public static void main(String[] args) {
		ActionEventEx01 ae = new ActionEventEx01();
		ae.setSize(300, 200);
		ae.setVisible(true);
	}
}
