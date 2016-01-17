/*
Look And Feel
 */
package com.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class SwingEx22 {

	public static void main(String[] args) throws Exception {
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

		//Quaqua Look and Feel:	quaqua.jar 
//		UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
//		JFrame.setDefaultLookAndFeelDecorated(true);

		//Liquid Look and Feel:	liquidlnf.jar 
//		UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");

		//InfoNodeLookAndFeel: idw-gpl.jar
//		 UIManager.setLookAndFeel("net.infonode.gui.laf.InfoNodeLookAndFeel");

		//JTattoo Look and Feel: JTattoo.jar 
//		UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

		
		//Napkin Look And Feel:jdom-1.0.jar, napkinlaf-1.2.jar, napkinlaf-swingset-1.2.jar
//		UIManager.setLookAndFeel("net.sourceforge.napkinlaf.NapkinLookAndFeel");

		//조합
		UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		UIManager.setLookAndFeel("net.sourceforge.napkinlaf.NapkinLookAndFeel");
	
		
		JFrame frm=new JFrame("Look And Feel Demo");
		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());

		JLabel label1=new JLabel("첫 번째 버튼 : ");
		JLabel label2=new JLabel("두 번째 버튼 : ");

		JButton btm1=new JButton("Button One");
		JButton btm2=new JButton("Button Two");

		frm.add(label1);		
		frm.add(btm1);		
		frm.add(label2);		
		frm.add(btm2);		

		frm.setVisible(true);
	}
}
