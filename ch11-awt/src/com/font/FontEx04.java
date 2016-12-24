package com.font;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class FontEx04 extends Frame {
	
	@Override
	public void paint(Graphics g) {

		Font serif = new Font("Serif", Font.PLAIN, 30);
		g.setFont(serif);
		g.drawString("CODEDRAGON", 30, 70);
		g.drawString("CodeDragon코드드레곤", 30, 120);
		g.drawString("Dragon", 30, 170);

		int ascent, descent, height, leading;

		// FontMatrics 객체는 Component 클래스에 정의된 getFontMatrics() 메소드로 구할 수 있습니다.
		ascent = g.getFontMetrics().getAscent();
		descent = g.getFontMetrics().getDescent();
		height = g.getFontMetrics().getHeight();
		leading = g.getFontMetrics().getLeading();

		System.out.println("Ascent : " + ascent);
		System.out.println("Descent : " + descent);
		System.out.println("Height : " + height);
		System.out.println("Leading : " + leading);
		System.out.println("D stringWidth : " + g.getFontMetrics().stringWidth("D"));
		System.out.println("Dragon stringWidth : " + g.getFontMetrics().stringWidth("Dragon"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FontEx04 fe = new FontEx04();
		fe.setTitle("FontMatrics");
		fe.setSize(500, 200);
		fe.setVisible(true);
	}

}
