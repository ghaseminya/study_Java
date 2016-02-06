package com.awt02.component;
/*
List 
	• Choice와 유사한 기능이지만 여러 개의 항목을 보여주고 사용자가 하나 또는 여러 개의 항목을 선택할 수 있도록 지원하는 컴포넌트
	• 기본적으로는 하나의 항목만을 선택할 수 있지만 MultipleMode를 설정하면 한번에 여러 개의 항목을 선택할 수 있습니다.

 */

import java.awt.Frame;
import java.awt.List;

public class ListEx01 extends Frame{

	public static void main(String args[]) {
		ListEx01 lt = new ListEx01();
		lt.setTitle("List Test");

		//항목 5개의 단일 선택 리스트 생성
		List lst = new List(9, true);
		//항목 추가
		lst.add("Mercury");
		lst.add("Venus");
		lst.add("Earth");
		lst.add("Mars");
		lst.add("Jupiter");
		lst.add("Saturn");
		lst.add("Uranus");
		lst.add("Neptune");
		lst.add("Pluto");

		lt.add(lst);

		String[] items = new String[10];
		items = lst.getItems();
		for(int i=0; i<items.length; i++)
			System.out.println("List["+i+
					"] = "+items[i]);

		lst.select(1);
		System.out.println("Selected items are "+
				lst.getSelectedIndex());

		lst.select(3);

		//해당 인덱스의 항목이 선택되었는지 확인하기
		System.out.println("2th item is seelcted : "+ lst.isIndexSelected(1));
		System.out.println("3th item is seelcted : "+ lst.isIndexSelected(2));

		//텍스트 영역의 행수 얻기
		//리스트 객체 생성시 설정항 항목 개수대로 나옵니다. 실제 항목 갯수가 나오는 것이 아닙니다.(참고)
		System.out.println("A number of lists is "+ lst.getRows());

		String[] selitems = new String[3];
		selitems = lst.getSelectedItems();
		System.out.println("=== Slected items ===");
		for(int i=0; i<selitems.length; i++)
			System.out.println("List["+i+"] = "+selitems[i]);

		System.out.println("mutiple mode : "+ lst.isMultipleMode());

		lst.replaceItem("First list", 0);

		lt.pack();
		lt.setVisible(true);       
	}
}

/*//출력결과
List[0] = Mercury
List[1] = Venus
List[2] = Earth
List[3] = Mars
List[4] = Jupiter
List[5] = Saturn
List[6] = Uranus
List[7] = Neptune
List[8] = Pluto
Selected items are 1
2th item is seelcted : true
3th item is seelcted : false
A number of lists is 9
=== Slected items ===
List[0] = Venus
List[1] = Mars
mutiple mode : true


*/
