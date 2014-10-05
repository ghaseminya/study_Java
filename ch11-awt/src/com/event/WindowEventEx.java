/* WindowEvent
 * 
 * 종료버튼 클릭시 프로그램 종료
 * 
 */

package com.event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class WindowEventEx extends Frame implements WindowListener{
	Label lb;
	
	public WindowEventEx(){
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
	//추상 메소드 구현
	//WindowListener인터페이스의 7개의 추상메소드를 모두 구현해야 됨
	//프레임의 종료버튼 클릭시 프로그램 종료
	@Override
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}	
	@Override	
	public void windowDeactivated(WindowEvent e){}
	@Override
	public void windowIconified(WindowEvent e){}
	@Override
	public void windowActivated(WindowEvent e){}
	@Override
	public void windowOpened(WindowEvent e){}
	@Override
	public void windowClosed(WindowEvent e){}
	@Override
	public void windowDeiconified(WindowEvent e){}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowEventEx();
	}
}