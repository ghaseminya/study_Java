package com.awt02.component;
/*
여러 형태의 TextArea 추가하기

//--------------------
GridLayout
	• 격자모양(모눈종이)의 가로와 세로가 같은 크기의 비율로 나누어져 있고 각 공간(셀)에 컴포넌트을 배치할 수 있는 관리자
	//• 컨테이너의 크기가 변경되면 컴포넌트들의 위치는 고정되고, 크기는 모두 동일한 크기로 변경합니다.
	• GridLayout 배치 관리자를 만들 때 행과 열의 수를 지정하는데, 
	• 값은 0이상의 값을 지정하며 만약 0으로 지정하게 되면 무한대로 컴포넌트를 추가하여 붙일 수 있습니다. 
	• 행의 수가 열의 개수보다 붙이는 컴포넌트의 개수가 더 많은 경우는 행의 수를 우선으로 맞추게 됩니다.

//--------------------
TextArea 클래스의 주요 멤버필드 
멤버필드										설명
static int SCROLLBARS_BOTH				0	수평/수직 스크롤바를 모두 표시
static int SCROLLBARS_VERTICAL_ONLY		1	수직 스크롤바만 표시
static int SCROLLBARS_HORIZONTAL_ONLY	2	수평 스크롤바만 표시
static int SCROLLBARS_NONE				3	스크롤바 미표시

*/
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;

public class TextAreaEx01 extends Frame{

	public static void main(String args[]) {
		TextAreaEx01 tae = new TextAreaEx01();
		tae.setTitle("TextArea Test");
		
		//행(Row), 열(Column)
		tae.setLayout(new GridLayout(2,4));

		
		//TextArea 객체를 생성
		TextArea ta1 = new TextArea();
		ta1.append("TextArea 1"); //지정된 문자열을 기존 내용의 끝에 추가
		ta1.setColumns(10); //열의 개수 설정
		ta1.setRows(4); //행의 개수 설정
		tae.add(ta1);

		//문자열을 설정하여 생성
		TextArea ta2 = new TextArea("TextArea 2");
		ta2.setColumns(10); //열의 개수 설정
		ta2.setRows(4); //행의 개수 설정
		tae.add(ta2);

		
		//행과 열을 설정하여 TextArea 생성하기
		TextArea ta3 = new TextArea("TextArea 3", 10, 4);
		tae.add(ta3);

		//TextArea("label", 행수, 열수, 스크롤바 표시방식)
		TextArea ta4 = new TextArea("TextArea 4", 10, 4,
				TextArea.SCROLLBARS_NONE); //스크롤바 미표시
		tae.add(ta4);

		
		TextArea ta5 = new TextArea("TextArea 5", 10, 4,
				TextArea.SCROLLBARS_HORIZONTAL_ONLY); //수평 스크롤바만 표시
		tae.add(ta5);

		
		TextArea ta6 = new TextArea("TextArea 6", 10, 4,
				TextArea.SCROLLBARS_VERTICAL_ONLY); //수직 스크롤바만 표시
		tae.add(ta6);


		TextArea ta7 = new TextArea("TextArea 7", 10, 4,
				TextArea.SCROLLBARS_BOTH); //수평/수직 스크롤바를 모두 표시
		tae.add(ta7);

		
		//TextArea의 속성값 확인하기
		System.out.println("TextArea 1 열 수 : "+
				ta1.getColumns()+".");
		System.out.println("TextArea 1 행 수 : "+
				ta1.getRows()+".");
		System.out.println("Visibility of TextArea 2 :"+
				ta2.getScrollbarVisibility());
		System.out.println("Visibility of TextArea 4 :"+
				ta4.getScrollbarVisibility());
		
		
		//해당 인덱스에 문자열 추가하기
		ta2.insert("Inserted string", 5);
		
		//기존 문자열 변경하기
		ta3.replaceRange(" replace ", 1, 10);

		// pack() : 프레임이 포함하고 있는 모든 컴포넌트들을 표시할 수 있도록 프레임의 크기를 자동으로 맞춰주는 메소드
		tae.pack();
		// Frame 화면 노출 여부 지정
		tae.setVisible(true);       
	}
}
