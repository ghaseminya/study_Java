package com.awt03.event;
/*
//MouseEvent
마우스 클릭시의 마우스 포인터의 X, Y좌표에 원 그리기

*/

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MousEventEx03 extends Frame{
	
	int x, y;

	public MousEventEx03(){
		//레이아웃 관리자를 FlowLayout 으로 설정
		setLayout(new FlowLayout());
		setTitle("MouseEvent Test");
		
		//현재 프레임이 이벤트 소스
		this.addMouseListener(new MouseHandler());
	}
	
	//TODO : 이벤트 핸들러 클래스 - MouseAdapter
	public class MouseHandler extends MouseAdapter{
		//mousePressed(): 마우스 버튼을 클릭했할 때  호출되는 메소드
		@Override
		public void mousePressed(MouseEvent e){
			//마우스 좌표를 얻어 콘솔에 출력
//			System.out.println("X(" + e.getX() + "), Y(" + e.getY() + ")");
			x = (int)e.getX();
			y = (int)e.getY();
			
			////repaint() 메서드는 내부적으로 update() 메서드를 호출합니다.
			repaint();
		}
	}
	
	
	//update() 메소드를 오버라이딩하여 그리기 작업을 수행
	@Override
	public void update(Graphics g){
		//배경을 지우지 않고 x, y 좌표를 원의 중심으로 하여 직경 30픽셀의 원을 그리기
		g.drawOval(x, y, 30, 30);
		
	}
	
	
	public static void main(String[] args) {
		MousEventEx03 me = new MousEventEx03();
		me.setSize(300, 200);
		me.setVisible(true);
	}
}
