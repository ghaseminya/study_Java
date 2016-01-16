package com.awt02;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class DrawingCanvas extends Canvas {
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(30, 30, 230, 100);
	}
}

public class CanvasEx01 extends Frame{

	public CanvasEx01() { //생성자
		super("Canvas Test");

		DrawingCanvas dc = new DrawingCanvas();
		//캔버스 가로, 세로 크기 설정
		dc.setSize(200, 100);
		//캔버스 바탕색 지정
		dc.setBackground(Color.yellow);

		add(dc);

		setSize(300, 200);
		setVisible(true);       
	}

	public static void main(String args[]) {
		new CanvasEx01();

	}

}
