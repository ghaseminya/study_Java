/*
//MouseMotionListener를 사용하여 마우스가 움직일 때마다 콘솔에 현재 마우스 좌표를 출력하는 프로그램

*/
package com.mouseevent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionEventEx01 extends Frame{
	
	public MouseMotionEventEx01(){
		setLayout(new FlowLayout());
		setTitle("MouseMotionEvent Test");
		setBackground(Color.ORANGE);
		
		this.addMouseMotionListener(new MouseMotionHandler());
	}
	
	//이벤트 핸들러 클래스를 작성, 어댑터 클래스를 상속받아 구현
	public class MouseMotionHandler extends MouseMotionAdapter{
		
		//mouseMoved(): 마우스 포인터가 움직일 때 마다 호출되는 메소드
		@Override
		public void mouseMoved(MouseEvent e){
			//마우스 좌표를 얻어 콘솔에 출력
			System.out.println("X(" + e.getX() + "), Y(" + e.getY() + ")");
		}
		
	}

	public static void main(String[] args) {
		MouseMotionEventEx01 mme = new MouseMotionEventEx01();
		mme.setSize(300, 200);
		mme.setVisible(true);
	}

}
