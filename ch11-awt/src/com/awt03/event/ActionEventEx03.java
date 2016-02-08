package com.awt03.event;
/* Event 처리
텍스트 필드에서 문자열 입력 후 엔터키를 눌렀을 때 
ActionEvent가 발생되어 문자열을 TextArea에 추가하는 프로그램
 
 */


import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//extends Frame: Frame상속
//implements ActionListener: ActionEventEx가 ActionListner역할을 함
public class ActionEventEx03 extends Frame {

	TextField tf; //단일 텍스트 상자용 인스턴스를 선언
	TextArea ta; //다중 텍스트 상자용 인스턴스를 선언

	public ActionEventEx03() {		
		super("ActionEvent 테스트");
		setLayout(new BorderLayout());


		//TextArea 객체 생성, 다중 텍스트 상자 생성
		tf = new TextField();
		ta = new TextArea();


		//Frame에 등록
		//위쪽에 버튼이 포함되어 있는 Panel를 배치하고 중앙에 다중 텍스트 상자를 배치합니다.
		add(BorderLayout.NORTH, tf);
		add(BorderLayout.CENTER, ta);

		
		//이벤트 소스인 tf 변수에 이벤트 핸들러 클래스인 TfHandler 클래스를 연결
		tf.addActionListener(new TfHandler() );

	}

	//이벤트 핸들러 클래스 부분입니다. (내부 클래스 )
	//ActionListener 를 구현하여 TfHandler 클래스를 생성
	public class TfHandler implements ActionListener{

		//이벤트 핸들러(이벤트가 발생하면 호출됨)
		@Override
		public void actionPerformed(ActionEvent e) {
			//다중 텍스트 상자에 단일 텍스트 상자에서 타이핑한 문자열을 추가하고 “\n” 은 줄바꿈 문자를 연결하고 있습니다.
			ta.append(tf.getText() + "\n");

		}
	}


	public static void main(String[] args) {
		// Frame을 상속받은 클래스의 객체 생성
		ActionEventEx03 ae = new ActionEventEx03();
		ae.setSize(300, 200);
		ae.setVisible(true);
	}
}
