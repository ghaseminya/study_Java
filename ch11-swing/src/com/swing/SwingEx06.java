/*
BorderLayout 배치관리자

BorderLayout.NORTH	북(North)
BorderLayout.WEST	서(West)
BorderLayout.CENTER	중앙(Center)
BorderLayout.EAST	동(East)
BorderLayout.SOUTH	남(South)
---------------------------------------
CENTER를 채우지 않을 경우 WEST와 EAST의 크기로 채워지지 않기 때문에 
CENTER는 무조건 채워줘야 합니다.

*/
package com.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx06 {

	public static void main(String[] args) {
		JFrame frm=new JFrame("BorderLayout Demo");
		frm.setBounds(120, 120, 400, 300);
		frm.setLayout(new BorderLayout());	//배치관리자
		
		
		frm.add(new JButton("EAST"), BorderLayout.EAST);
		frm.add(new JButton("WEST"), BorderLayout.WEST);
		frm.add(new JButton("SOUTH"), BorderLayout.SOUTH);	
		frm.add(new JButton("NORTH"), BorderLayout.NORTH);
		frm.add(new JButton("CENTER"), BorderLayout.CENTER);
		
		
		//EAST, SOUTH를 채우지 않았을 때
		/*
		//frm.add(new JButton("EAST"), BorderLayout.EAST);		//
		frm.add(new JButton("WEST"), BorderLayout.WEST);
		//frm.add(new JButton("SOUTH"), BorderLayout.SOUTH);	//
		frm.add(new JButton("NORTH"), BorderLayout.NORTH);
		frm.add(new JButton("CENTER"), BorderLayout.CENTER);
		 */
		
		
		//CENTER를 채우지 않았을 때
		/*
		frm.add(new JButton("EAST"), BorderLayout.EAST);
		frm.add(new JButton("WEST"), BorderLayout.WEST);
		frm.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frm.add(new JButton("NORTH"), BorderLayout.NORTH);
		//frm.add(new JButton("CENTER"), BorderLayout.CENTER);
		*/
		
		frm.setVisible(true);
	}
}
