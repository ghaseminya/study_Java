package com.awt03.event;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListEventEx01 extends Frame{
	
	List fruits;
	
	public ListEventEx01(){
		setLayout(new FlowLayout());
		setTitle("ListEvnet Test");
		
		fruits = new List();
		
		//리스트 생성
		fruits.add("StrawBerry");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Banana");
		fruits.add("Apple");
		
		//이벤트 소스와 이벤트 핸들러 연결
		fruits.addItemListener(new FruitsHandler());
		
		add(fruits);
		
	}
	
	
	//이벤트 핸들러 클래스
	public class FruitsHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) { //ItemEvent: 리스트 항목을 선택할 때 발생하는 이벤트
			System.out.println(fruits.getSelectedIndex() + " : " + fruits.getSelectedItem());
		}
		
	}
	
	public static void main(String[] args) {
		ListEventEx01 le = new ListEventEx01();
		le.setSize(300, 200);
		le.setVisible(true);
	}

}
