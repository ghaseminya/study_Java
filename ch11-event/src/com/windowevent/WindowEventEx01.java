package com.windowevent;
/* WindowEvent
종료버튼 클릭시 프로그램 종료


WindowEvent
	• 윈도우와 관련되어 윈도우가 활성화, 아이콘화, 최대화, 윈도우의 크기 조절, 비활성화 및 창이 닫힐 때 발생하는 이벤트
	• 프로젝트 생성후 AWT상에서 프레임의 종료버튼을 눌러도 아무런 변화가 없는 것을 확인 할 수 있는데 
	바로 종료버튼을 눌렸을 때 이벤트 처리를 해주지 않았기 때문입니다.


WindowListener
WindowEvent를 처리하는 이벤트 리스너가 WindowListener


*/

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class WindowEventEx01 extends Frame implements WindowListener{
	Label lb;
	
	public WindowEventEx01(){
		//Frame의 타이틀 설정
		super("WindowEvent Test");
		
		//Label에 종료를 위한 안내문구 입력
		lb = new Label("프레임의 종료버튼을 눌러주세요!");
		
		//Frame을 이벤트 리스너에 연결
		addWindowListener(this);
		
		//Label을 Frame에 등록
		add(lb);
		
		//Frame의 위치, 넓이, 높이 설정
		setBounds(300, 300, 300, 300);
		//Frame 노출여부 설정
		setVisible(true);
	}
	
	//윈도우가 시스템 메뉴에 의해 닫힐 때 호출
	//TODO : 추상 메소드 구현
	//WindowListener인터페이스의 7개의 추상메소드를 모두 구현해야 됨
	//프레임의 종료버튼 클릭시 프로그램 종료
	@Override
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	
	//윈도우가 비활성화될 때 호출
	@Override	
	public void windowDeactivated(WindowEvent e){}
	
	//윈도우가 최소화 상태로 될 때 호출
	@Override
	public void windowIconified(WindowEvent e){}
	
	//윈도우가 활성화될 때 호출
	@Override
	public void windowActivated(WindowEvent e){}
	
	//윈도우가 열릴 때 호출
	@Override
	public void windowOpened(WindowEvent e){}
	
	//윈도우가 닫혀질때 호출
	@Override
	public void windowClosed(WindowEvent e){}
	
	//윈도우가 최소화 상태에서 원래 상태로 되돌아 올 때 호출
	@Override
	public void windowDeiconified(WindowEvent e){}	

	
	public static void main(String[] args) {
		new WindowEventEx01();
	}
}