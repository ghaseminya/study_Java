package com.awt02.component;
/*
//다양한 형태의 스크롤바 생성하기

Scrollbar
스크롤바를 만들 때 사용


스크롤바 생성 형식
Scrollbar(스크롤바표현방식,현재값,막대가로길이,최소값,최대값)


스크롤 표현방식
구분				스크롤 표현방식				상수값
스평 스크롤바		Scrollbar.HORIZONTAL	0
수직 스크롤바		Scrollbar.VERTICAL		1



//--------------------
GridLayout
	• 격자모양(모눈종이)의 가로와 세로가 같은 크기의 비율로 나누어져 있고 각 공간(셀)에 컴포넌트을 배치할 수 있는 관리자
	• 컨테이너의 크기가 변경되면 컴포넌트들의 위치는 고정되고, 크기는 모두 동일한 크기로 변경합니다.
	• GridLayout 배치 관리자를 만들 때 행과 열의 수를 지정하는데, 
	• 값은 0이상의 값을 지정하며 만약 0으로 지정하게 되면 무한대로 컴포넌트를 추가하여 붙일 수 있습니다. 
	• 행의 수가 열의 개수보다 붙이는 컴포넌트의 개수가 더 많은 경우는 행의 수를 우선으로 맞추게 됩니다. 

http://cfile26.uf.tistory.com/image/232C534F585C44A42E2EF1
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;

public class ScrollbarEx01 extends Frame{
	public ScrollbarEx01() {
		//Frame 제목 설정
		super("Scrollbar Test");
		//LayoutManager 변경
		setLayout(new BorderLayout(10, 10));

		//Panel생성 및 레이아웃 설정
		Panel panel1 = new Panel();
		panel1.setLayout(new GridLayout(2, 2));

		//스크롤바 생성
		Scrollbar sc1 = new Scrollbar();
		Scrollbar sc2 = new Scrollbar(Scrollbar.VERTICAL); //수직 스크롤바
		//초기값, 스크롤단추두께, 최소값, 최대값
		sc1.setValues(50, 20, 0, 100);

		panel1.add(new Label("Level"));
		panel1.add(new Label("Stage"));
		panel1.add(sc1);
		panel1.add(sc2);
		panel1.setBackground(Color.orange);

		
		Panel panel2 = new Panel();
		panel2.setLayout(new GridLayout(2, 2));
		//스크롤 할 방향,초기위치,스크롤바가 표시하는 화면 크기,화면의 넓이 최소값,화면의 넓이 최대값
		//Scrollbar(수직수평여부, 초기값, 스크롤단추두께, 최소값, 최대값)
		Scrollbar sc3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
		Scrollbar sc4 = new Scrollbar(Scrollbar.HORIZONTAL, 50, 30, 0, 100);
		panel2.add(new Label("Speed"));
		panel2.add(sc3);
		panel2.add(new Label("Voltage"));
		panel2.add(sc4);
		panel2.setBackground(Color.cyan);

		
		Panel panel3 = new Panel();
		Scrollbar sc5 = new Scrollbar(Scrollbar.VERTICAL);
		//스크롤 방향 지정
		sc5.setOrientation(Scrollbar.HORIZONTAL);
		panel3.add(sc5);
		panel3.setBackground(Color.pink);

		add("North", panel1); //상단
		add("Center", panel2); //중앙
		add("South", panel3); //하단

		//스크롤 방향 확인하기
		System.out.println("Orientation of Scrollbar 1 : " +
				sc1.getOrientation());
		System.out.println("Orientation of Scrollbar 3 : " +
				sc3.getOrientation());
		System.out.println("Value of Scrollbar 2 : " +
				sc2.getValue());
		System.out.println("Value of Scrollbar 4 : " +
				sc4.getValue());

		//최소값, 최대 값 설정
		sc3.setMinimum(-50);
		sc3.setMaximum(50);

		//최소값, 최대 값 확인하기
		System.out.println("Min value of Scrollbar 3 : "+
				sc3.getMinimum());
		System.out.println("Max value of Scrollbar 3 : "+
				sc3.getMaximum());

		setSize(300, 400);
		setVisible(true);       
	}

	public static void main(String args[]) {
		new ScrollbarEx01();

	}
}
