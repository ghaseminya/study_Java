package com.swing.calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JButtonEx extends JFrame {
	
	public JButtonEx() {
		
		super("Swing Button Test");

		setLayout(new GridLayout(0,1));
	
		JPanel buttonPanel = new JPanel();
		
		JButton b1 = new JButton("Button");
		JButton b2 = new JButton("Action");
		b2.setMnemonic('a');

		ImageIcon icon1 = new ImageIcon("../../images/image1.png");		
		ImageIcon icon2 = new ImageIcon("../../images/image2.gif");		

		JButton b3 = new JButton(icon1);
		b3.setPressedIcon(icon2);
		b3.setMnemonic('b');
		
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(b3);
		
		JPanel togglePanel = new JPanel();
		togglePanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED), "Toggle Group"));
		
		JToggleButton tbutton1 = new JToggleButton("ONE");
		JToggleButton tbutton2 = new JToggleButton("TWO");
		JToggleButton tbutton3 = new JToggleButton("THREE");

		ButtonGroup group = new ButtonGroup();
		group.add(tbutton1);
		group.add(tbutton2);
		group.add(tbutton3);
		
		tbutton1.setSelected(true);

		togglePanel.add(tbutton1);
		togglePanel.add(tbutton2);
		togglePanel.add(tbutton3);
		
		JPanel selectPanel = new JPanel();
		JCheckBox check1 = new JCheckBox("checkbox1");
		JCheckBox check2 = new JCheckBox("checkbox2");
		JRadioButton rb = new JRadioButton("radio");

		selectPanel.add(check1);
		selectPanel.add(check2);
		selectPanel.add(rb);
	
		ButtonGroup radioGroup = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("ONE");
		JRadioButton rb2 = new JRadioButton("TWO");
		JRadioButton rb3 = new JRadioButton("THREE");
		
		radioGroup.add(rb1);
		radioGroup.add(rb2);
		radioGroup.add(rb3);
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBorder(new TitledBorder(new LineBorder(Color.black, 3), "Radio Group"));
		radioPanel.add(rb1);
		radioPanel.add(rb2);
		radioPanel.add(rb3);
		rb1.setSelected(true);
		
		add(buttonPanel);
		add(togglePanel);
		add(selectPanel);
		add(radioPanel);
		
		pack();
		setLocation(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		JButtonEx demo = new JButtonEx();		
	}
}