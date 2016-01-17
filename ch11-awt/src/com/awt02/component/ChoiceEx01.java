/*

같은 의미
초이스 = 드롭박스 = 콤보박스

*/
package com.awt02.component;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceEx01 extends Frame{

	public static void main(String args[]) {
		ChoiceEx01 cht = new ChoiceEx01();
		cht.setTitle("Choicebox Test");
		cht.setLayout(new FlowLayout());

		//드롭다운리스트 객체 생성
		Choice ch = new Choice();
		//항목 추가
		ch.add("Item 1");
		ch.add("Item 2");
		ch.add("Item 3");
		ch.add("Item 4");

		cht.add(ch);

		System.out.println("A number of item : "+ 
				ch.getItemCount());

		ch.addItem("Item 5");
		System.out.println("A number of item : "+
				ch.getItemCount());

		
		System.out.println("The 2th item is \""+
				(ch.getItem(1)+1)+"\".");

		
		ch.select(2);
		System.out.println("Item 3는 "+
				ch.getSelectedIndex()+"번째 item.");

		
		ch.select("Item 4");
		System.out.println("The 4th item is \""+
				ch.getSelectedItem()+"\".");

		
		ch.remove(4);
		System.out.println("아이템의 총 수: "+
				ch.getItemCount());

		
		ch.remove("Item 2");
		System.out.println("Current items");
		
		
		for(int i=0; i<3; i++)
			System.out.print(ch.getItem(i) + "  ");
		System.out.println("");

		cht.setSize(300, 200);
		cht.setVisible(true);       
	}
}
