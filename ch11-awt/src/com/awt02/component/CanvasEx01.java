package com.awt02.component;
/*
//캔버스 생성후 빨간색 사각형 그리기


Canvas  
	• 특정한 모양을 갖고 있지 않고 단지 사각형의 영역만을 가지고 있는 컴포넌트
	• 이 컴포넌트는 그림을 그릴 수 있는 도화지의 역할을 하는 컴포넌트로 컨테이너에 포함되어 그래픽 처리를 하는 기능을 수행합니다.

*/

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

//Canvas클래스를 상속받아 사용자 정의 켄버스 클래스 정의
class DrawingCanvas extends Canvas {
	
	//void paint(Graphics g): 캔버스를 업데이트할 때 사용
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(30, 30, 230, 100);
	}
}

public class CanvasEx01 extends Frame{

	public CanvasEx01() { //생성자
		super("Canvas Test");

		//도화지 역할을 하는 캔버스 객체 생성
		DrawingCanvas dc = new DrawingCanvas();
		//캔버스 가로, 세로 크기 설정
		dc.setSize(200, 100);
		//캔버스 바탕색 지정
		dc.setBackground(Color.yellow);

		//프레임에 추가
		add(dc);

		//프레임 크기 지정
		setSize(300, 200);
		//프레임을 화면에 표시하기
		setVisible(true);       
	}

	public static void main(String args[]) {
		new CanvasEx01();
	}
}
