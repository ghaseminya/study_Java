/*
JComboBox

인스턴스를 대상으로 클래스를 정의하고 그 인스턴스를 콤보박스에 저장하는 것 의 의미
->//getItem()선택된 인스턴스를 얻어와서 인스턴스에 저장한 다양한 정보를 선택하고 데이터화하고 구분할 수 있습니다.
*/
package com.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class SwingEx21 {

	public static void main(String[] args)
	{
		JFrame frm=new JFrame("ComboBox Demo");		
		frm.setBounds(120, 120, 250, 120);
		frm.setLayout(new GridLayout(0, 2));

		Vector<Fruit> fruit=new Vector<Fruit>();
		fruit.add(new Fruit("Apple", 17));
		fruit.add(new Fruit("Orange", 23));
		fruit.add(new Fruit("Tomato", 30));
		fruit.add(new Fruit("WaterMelon", 40));
		
		JLabel label1=new JLabel(" ComboBox");
		//fruit의 toString()반환값으로 목록 생성
		JComboBox cmbBox1=new JComboBox(fruit);	
		cmbBox1.setMaximumRowCount(3);
		cmbBox1.addItemListener(new ChoiceHandler());
		
		JLabel label2=new JLabel(" Editable ComboBox");
		JComboBox cmbBox2=new JComboBox(fruit);
		cmbBox2.setEditable(true);	//Editable ComboBox화
		cmbBox2.addActionListener(new TextChangedHandler());	
		
		frm.add(label1); frm.add(cmbBox1);
		frm.add(label2); frm.add(cmbBox2);
				
		frm.setVisible(true);	
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}

class Fruit {
	String name;
	int number;
	
	public Fruit(String name, int number) {
		this.name=name;
		this.number=number;
	}
	//toString()잘 정의하면 문자열 뿐 아니라 인스턴스로 목록을 구성할 수 있습니다.
	public String toString() {
		return name;
	}
	public void showFriendInfo() {
		System.out.println("fruit: "+ name);
		System.out.println("number: "+ number);
	}
}

//ItemEvent는 선택 받은 컴포넌트를 대상으로도 선택을 잃은 컴포넌트를 대상으로도 발생한다
class ChoiceHandler implements ItemListener {	
	public void itemStateChanged(ItemEvent e) {
		//선택되었을 때
		if(e.getStateChange()==ItemEvent.SELECTED){
			System.out.println("Selected... ");
			//getItem()선택된 인스턴스를 얻어오기
			((Fruit)e.getItem()).showFriendInfo();
			//인스턴스에 저장한 다양한 정보를 선택하고 데이터화하고 구분할 수 있습니다.
		}
		else{
			System.out.println("Deselected... ");
			((Fruit)e.getItem()).showFriendInfo();
		}
	}
}


class TextChangedHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		//Action 확인
		if((e.getActionCommand()).compareTo("comboBoxEdited")==0)
			System.out.println("ComboBox Edited");
		else //comboBoxChanged
			System.out.println("ComboBox Changed");
	}
}