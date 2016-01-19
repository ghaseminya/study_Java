/*
//윈도우 안에서 마우스 버튼을 클릭할  때마다 이벤트를 발생시켜 마우스 포인터의  X, Y좌표를 콘솔에 출력시키는 프로그램
//좌표의 범위는 윈도우의 크기와 동일합니다.

이벤트 핸들러 클래스 만들 때  MouseAdapter vs MouseListener 차이 확인하기 

*/
package com.awt03.event;

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
	
	//이벤트 핸들러 클래스 - MouseAdapter
	public class MouseHandler extends MouseAdapter{
		//mousePressed(): 마우스 버튼을 클릭했할 때  호출되는 메소드
		@Override
		public void mousePressed(MouseEvent e){
			//마우스 좌표를 얻어 콘솔에 출력
			System.out.println("X(" + e.getX() + "), Y(" + e.getY() + ")");
			
		}
	}
	
	
	//이벤트 핸들러 클래스 - MouseListener
//	public class MouseHandler implements MouseListener{
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		//mousePressed(): 마우스 버튼을 클릭했할 때  호출되는 메소드
//		@Override
//		public void mousePressed(MouseEvent e) {
//
//			//마우스 좌표를 얻어 콘솔에 출력
//			System.out.println("X(" + e.getX() + "), Y(" + e.getY() + ")");
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//	}
	

	public static void main(String[] args) {
		MousEventEx02 me = new MousEventEx02();
		me.setSize(300, 200);
		me.setVisible(true);
	}
}
