package com.awt02.component;
/*
List 
	• Choice와 유사한 기능이지만 여러 개의 항목을 보여주고 사용자가 하나 또는 여러 개의 항목을 선택할 수 있도록 지원하는 컴포넌트
	• 기본적으로는 하나의 항목만을 선택할 수 있지만 MultipleMode를 설정하면 한번에 여러 개의 항목을 선택할 수 있습니다.
	• list의 인덱스는 0번 부터 시작합니다.

 */

import java.awt.Frame;
import java.awt.List;

public class ListEx01 extends Frame{

	public static void main(String args[]) {
		//Frame 생성
		ListEx01 lt = new ListEx01();
		//Frame 제목 설정
		lt.setTitle("List Test");

		
		//List(int rows, Boolean multipleMode)
		//지정한 숫자만큼(rows)의 항목을 보여주는 새로운 리스트 객체를 생성하며, 
		//단일 선택 모드(false)나 다중 선택 모드(true)를 지정할 수 있습니다.

		//항목 9개인 다중 선택 리스트 생성
		List lst = new List(9, true);
		//단일 선택 리스트 생성
//		List lst = new List();
		
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

		
		// TODO : list의 모든 항목 출력하기
		String[] items = new String[10];
		//String[] getItems( ): List의 항목들을 문자열 배열로 얻어옵니다.
		items = lst.getItems();
		for(int i=0; i<items.length; i++)
			System.out.println("List["+i+
					"] = "+items[i]);

		//void select(int index): 지정한 위치의 항목을 선택합니다.
		//int getSelecedIndex(): 현재 선택된 항목의 위치를 얻어옵니다.
		//String getSelectedItem(): 현재 선택된 항목의 문자열을 얻어옵니다.
		lst.select(1); //List[1] = Venus 선택
		System.out.println("Selected items are "+ lst.getSelectedIndex() 
			+ " : " + lst.getSelectedItem());

		//3번 인덱스 항목 선택
		lst.select(3); //List[3] = Mars 선택

		//해당 인덱스의 항목이 선택되었는지 확인하기
		System.out.println("2th item is selected : "+ lst.isIndexSelected(1));
		System.out.println("3th item is selected : "+ lst.isIndexSelected(2));
		System.out.println("3th item is selected : "+ lst.isIndexSelected(3));

		//텍스트 영역의 행수 얻기
		//리스트 객체 생성시 설정항 항목 개수대로 나옵니다. 실제 항목 갯수가 나오는 것이 아닙니다.(참고)
		System.out.println("A number of lists is "+ lst.getRows());

		
		
		// TODO : 선택된 모든 항목 출력하기
		String[] selitems = new String[3];
		//String[] getSelectedItems(): 다중 선택 모드일 때, 현재 선택된 항목들을 문자열 배열로 얻어옵니다.
		selitems = lst.getSelectedItems();
		System.out.println("=== Slected items ===");
		for(int i=0; i<selitems.length; i++)
			System.out.println("List["+i+"] = "+selitems[i]);
		//boolean isMultipleMode(): 다중 선택 모드인지 확인
		System.out.println("mutiple mode : "+ lst.isMultipleMode());

		
		// TODO: 단일선택/다중선택 변경하기
		//단일 선택 리스트 일 경우 단일선택에서 다중 선택으로 변경가능
		//다중 선택 리스트 일 경우 단일선택으로 변경가능
//		lst.setMultipleMode(false);
//		System.out.println("mutiple mode : "+ lst.isMultipleMode());
		

		// TODO : 0번 인덱스 항목의 내용 변경하기
		//void replaceItem(String newValue, int index):
		//지정한 위치(index)의 항목을 newValue값으로 바꿔줍니다.
		lst.replaceItem("First list", 0); //List[0] = Mercury -> "First list"

		// pack() : 프레임이 포함하고 있는 모든 컴포넌트들을 표시할 수 있도록 프레임의 크기를 자동으로 맞춰주는 메소드
		lt.pack();
		// Frame 화면 노출 여부 지정
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
