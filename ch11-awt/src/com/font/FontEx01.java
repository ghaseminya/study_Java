package com.font;
/*
회색 바탕에 다양한 색깔의 글씨를 출력하는 프로그램



Graphics 클래스
	• 그래픽을 관련 기능을 구현한 클래스로 Graphics 클래스와 이를 상속하는 Graphics2D 클래스가 있습니다.
	• Graphics2D 클래스는 JDK1.2 이후에 추가된 것으로 2D(평면) 그래픽 환경을 강력히 지원하는 API입니다.



*/
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class FontEx01 extends Frame{
	
	// paint()가 호출되면 인자로 전달된 Graphics 인스턴스를 통해 그림을 그립니다.
	// Graphics 인스턴스는 그림을 그릴 수 있는 객체
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		
		// Frame에 배경색 지정
		setBackground (Color.lightGray);
		
		//
	    g.setColor (Color.red);
	    //public void drawString(String str, int x, int y): 좌표 x, y에 str문자열을 표시합니다.
	    g.drawString ("String is red", 30, 50);
	    
	    g.setColor (Color.orange);
	    g.drawString ("String is orange", 30, 70);
	    
	    g.setColor (Color.pink);
	    g.drawString ("String is pink", 30, 90);
	    
	    g.setColor (Color.black);
	    g.drawString ("String is black", 30, 110);
	    
	    g.setColor (Color.green);
	    g.drawString ("String is green", 30, 130);
	    
	    g.setColor (Color.blue);
	    g.drawString ("String is blue", 30, 150);
	    
//	    System.out.println("Drawing Color: " + g.getColor()); 
//	    setSize(300, 200);
	    
	}

	public static void main(String[] args) {
		FontEx01 fe = new FontEx01();
		fe.setTitle("Font Color");
		fe.setSize(300, 200);
		fe.setVisible(true);
	}
}
