package com.awt02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;

public class ScrollbarEx01 extends Frame{
	public ScrollbarEx01() {
		super("Scrollbar Test");
		setLayout(new BorderLayout(10, 10));

		Panel panel1 = new Panel();
		panel1.setLayout(new GridLayout(2, 2));

		//스크롤바 생성
		
		Scrollbar sc1 = new Scrollbar();
		Scrollbar sc2 = new Scrollbar(Scrollbar.VERTICAL);
		sc1.setValues(50, 20, 0, 100);

		panel1.add(new Label("Level"));
		panel1.add(new Label("Pressure"));
		panel1.add(sc1);
		panel1.add(sc2);
		panel1.setBackground(Color.orange);

		
		Panel panel2 = new Panel();
		panel2.setLayout(new GridLayout(2, 2));
		
		//Scrollbar(수직수평여부, 초기값, 스크롤단추두께, 최소값, 최대값)
		Scrollbar sc3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
		Scrollbar sc4 = new Scrollbar(Scrollbar.HORIZONTAL, 50, 30, 0, 100);
		panel2.add(new Label("OP time"));
		panel2.add(sc3);
		panel2.add(new Label("Voltage"));
		panel2.add(sc4);
		panel2.setBackground(Color.cyan);

		
		Panel panel3 = new Panel();
		Scrollbar sc5 = new Scrollbar(Scrollbar.VERTICAL);
		sc5.setOrientation(Scrollbar.HORIZONTAL);
		panel3.add(sc5);
		panel3.setBackground(Color.pink);

		add("North", panel1);
		add("Center", panel2);
		add("South", panel3);

		System.out.println("Orientation of Scrollbar 1 : "+
				sc1.getOrientation());
		System.out.println("Orientation of Scrollbar 3 : "+
				sc3.getOrientation());
		System.out.println("Value of Scrollbar 2 : "+
				sc2.getValue());
		System.out.println("Value of Scrollbar 4 : "+
				sc4.getValue());

		sc3.setMinimum(-50);
		sc3.setMaximum(50);

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
