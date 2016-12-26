package com.itemevent;
/*
//리스트의 특정 항목 선택시 해당 항목을 출력하는 프로그램

ItemEvent
체크박스, 리스트, 초이스 컴포넌트에서 항목을 선택되거나 선택이 해제 되었을 때 발생하는 이벤트 


ItemListener
ItemEvent를 처리하는 이벤트 리스너
*/

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
		
		//리스트 항목 생성
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
			System.out.println(fruits.getSelectedIndex() + 
					" : " + fruits.getSelectedItem());
		}
		
	}
	
	public static void main(String[] args) {
		ListEventEx01 le = new ListEventEx01();
		le.setSize(300, 200);
		le.setVisible(true);
	}
}
