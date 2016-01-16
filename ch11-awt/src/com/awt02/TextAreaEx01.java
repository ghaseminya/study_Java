package com.awt02;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;

public class TextAreaEx01 extends Frame{

	public static void main(String args[]) {
		TextAreaEx01 tae = new TextAreaEx01();
		tae.setTitle("TextArea Test");
		tae.setLayout(new GridLayout(2,4));

		//TextArea 객체를 생성
		TextArea ta1 = new TextArea();
		ta1.append("TextArea 1");
		ta1.setColumns(10);
		ta1.setRows(4);
		tae.add(ta1);

		TextArea ta2 = new TextArea("TextArea 2");
		ta2.setColumns(10);
		ta2.setRows(4);
		tae.add(ta2);

		
		//행과 열을 설정하여 TextArea 생성하기
		TextArea ta3 = new TextArea("TextArea 3", 10, 4);
		tae.add(ta3);

		
		TextArea ta4 = new TextArea("TextArea 4", 10, 4,
				TextArea.SCROLLBARS_NONE);
		tae.add(ta4);

		
		TextArea ta5 = new TextArea("TextArea 5", 10, 4,
				TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		tae.add(ta5);

		
		TextArea ta6 = new TextArea("TextArea 6", 10, 4,
				TextArea.SCROLLBARS_VERTICAL_ONLY);
		tae.add(ta6);


		TextArea ta7 = new TextArea("TextArea 7", 10, 4,
				TextArea.SCROLLBARS_BOTH);
		tae.add(ta7);

		
		//TextArea의 속성값 확인하기
		System.out.println("TextArea 1 열 수 : "+
				ta1.getColumns()+".");
		System.out.println("TextArea 1 행 수 : "+
				ta1.getRows()+".");
		System.out.println("Visilbility of TextArea 2 :"+
				+ta2.getScrollbarVisibility());
		System.out.println("Visilbility of TextArea 4 :"+
				+ta4.getScrollbarVisibility());
		
		
		//해당 인덱스에 문자열 추가하기
		ta2.insert("Inserted string", 5);
		
		//기존 문자열 변경하기
		ta3.replaceRange(" replace ", 1, 10);

		tae.pack();
		tae.setVisible(true);       
	}
}
