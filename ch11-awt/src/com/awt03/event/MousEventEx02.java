package com.awt03.event;
/* MouseEvent


이벤트 핸들러 클래스 만들 때  MouseAdapter vs MouseListener 차이 확인하기 

//--------------------------------------

MouseEvent
	• 마우스 관련 이벤트는 마우스 이벤트와 마우스 모션 이벤트 두가지로 나뉘어집니다. 
	• MouseEvent는 마우스가 눌려지거나 컴포넌트 영역내에 들어오거나 벗어날 때 발생하는 이벤트
	

MouseListener
	• 마우스와 관련 있는 이벤트 중 MouseEvent를 처리하는 이벤트 리스너
	• 마우스 클릭, 마우스 포인터가 특정 영역으로 들어오는 경우, 나가는 경우, 버튼을 누르는 경우, 마우스를 눌렀다가 띠는 경우에 발생하는 이벤트를 처리하는 리스너


TODO 1: 이벤트 핸들러 클래스 - MouseListener

LAB -> MouseListener로 구현한 것을 MouseAdapter로 바꿔주세요
TODO 2: 이벤트 핸들러 클래스 - MouseAdapter

*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousEventEx02 extends Frame{
	
	public MousEventEx02(){
		//레이아웃 관리자를 BorderLayout 으로 설정
		setLayout(new FlowLayout());
		setTitle("MouseEvnet Test");
		setBackground(Color.PINK);
		
		//현재 프레임이 이벤트 소스
		this.addMouseListener(new MouseHandler());
	}
	
	//TODO 2: 이벤트 핸들러 클래스 - MouseAdapter
//	public class MouseHandler extends MouseAdapter{
//		//mousePressed(): 마우스 버튼을 클릭했할 때  호출되는 메소드
//		@Override
//		public void mousePressed(MouseEvent e){
//			//마우스 좌표를 얻어 콘솔에 출력
//			System.out.println("X(" + e.getX() + "), Y(" + e.getY() + ")");
//		}
//	}
	
	
	//TODO 1: 이벤트 핸들러 클래스 - MouseListener
	public class MouseHandler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		//mousePressed(): 마우스 버튼을 클릭했할 때  호출되는 메소드
		@Override
		public void mousePressed(MouseEvent e) {

			//마우스 좌표를 얻어 콘솔에 출력
			System.out.println("X(" + e.getX() + "), Y(" + e.getY() + ")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	

	public static void main(String[] args) {
		MousEventEx02 me = new MousEventEx02();
		me.setSize(300, 200);
		me.setVisible(true);
	}
}
