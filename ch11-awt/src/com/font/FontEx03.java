package com.font;
/*
FontMetrics 객체를 이용하여 폰트에 관한 정보를 검색하기


FontMatrics 클래스
- Font의 크기에 대한 상세한 정보가 정의되어 있다.
- FontMatrics 객체는 Component 클래스에 정의된 getFontMatrics() 메소드로 구할 수 있습니다.

*/
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class FontEx03 extends Frame{

	public void paint(Graphics g) {
		
		Font serif = new Font("Serif", Font.PLAIN, 15);
		g.setFont(serif);
		g.drawString("Serif plain 12 point", 30, 50);
		
		int ascent, descent, height, leading;
		
		//FontMatrics 객체는 Component 클래스에 정의된 getFontMatrics() 메소드로 구할 수 있습니다.
		ascent = g.getFontMetrics().getAscent();
		descent = g.getFontMetrics().getDescent();
		height = g.getFontMetrics().getHeight();
		leading = g.getFontMetrics().getLeading();

		
		g.drawString("Ascent : " + ascent, 30, 75);
		g.drawString("Descent : " + descent, 30, 90);
		g.drawString("Height : " + height, 30, 110);
		g.drawString("Leading : " + leading, 30, 130);
//		setSize(250, 140);
	}

	public static void main(String[] args) {
		FontEx03 fe = new FontEx03();
		fe.setTitle("FontMatrics");
		fe.setSize(300, 200);
		fe.setVisible(true);
	}

}
