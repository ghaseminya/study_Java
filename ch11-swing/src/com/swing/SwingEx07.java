/*
GridLayout

*/
package com.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx07 {

	public static void main(String[] args) {
		JFrame frm=new JFrame("GridLayout Test");
		frm.setBounds(120, 120, 300, 300);
		//세로 3, 가로 2 Grid
		frm.setLayout(new GridLayout(3, 2));
		
		//세로, 가로, 높이gap, 넓이gap
		frm.setLayout(new GridLayout(3, 2, 15, 10));
		
		//올리는 대로 왼쪽에서 오른쪽으로, 위에서 아래로
		frm.add(new JButton("One")); frm.add(new JButton("Two"));
		frm.add(new JButton("Three")); frm.add(new JButton("Four"));
		frm.add(new JButton("Five")); frm.add(new JButton("Six"));
		
		frm.setVisible(true);
	}
}
