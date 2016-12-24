package com.font;
/*
// 
Font객체를 통해 다양한 글씨체 설정하기


Font 클래스
	• 글꼴이나 크기 정보 등을 가지고 있는 클래스입니다.
	• 자바의 AWT 에 사용하는 문자열의 폰트 (font) 를 지정할 수 있습니다. 
	• 폰트를 지정할 때는 setFont( ) 를 사용하는데, 이때 사용되는 폰트는 java.awt.Font 클래스의 객체를 이용하게 됩니다.
	• 폰트는 컴포넌트에도 이용되고 그래픽 컨텍스트에서 문자열을 그릴 때도 이용할 수 있습니다.




*/
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class FontEx02 extends Frame{

	
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		
		// Font(글자의 글꼴, 스타일, 글자크기 지정)
	    Font serif = new Font("Serif", Font.PLAIN, 12);
	    Font monospaced = new Font("Monospaced", Font.ITALIC, 24);
	    Font sansSerif = new Font("SansSerif", Font.BOLD, 10);
	    Font clearGothic = new Font("맑은 고딕", Font.BOLD, 20);

	    g.setFont(serif);
	    g.drawString("Seref plain 12 point", 30, 50);

	    g.setFont(monospaced);
	    g.drawString("Monospaced italic 24 point", 30, 80);

	    g.setFont(sansSerif);
	    g.drawString("SansSeref bold 10 point", 30, 110);
	    
 		g.setFont(clearGothic);
	    g.drawString("맑은 고딕 굵게 10포인트", 30, 150);
	    
	    g.setFont(new Font("Serif", Font.PLAIN, 15));
 		// drawString(표시할 글자, 위치x, 위치y)
 		g.drawString("Graphics를 이용해서 글씨를 그립니다.", 30, 180);
 		
//	    System.out.println("current font : " + g.getFont().toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FontEx02 fe = new FontEx02();
		fe.setTitle("Font Style");
		fe.setSize(500, 300);
		fe.setVisible(true);

	}
}
