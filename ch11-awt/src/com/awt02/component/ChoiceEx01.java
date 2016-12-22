package com.awt02.component;
/*
같은 의미
초이스 = 드롭박스 = 콤보박스


Choice
	• List 클래스와 거의 유사한 기능을 가지고 있는 컴포넌트
	• 사용자가 드롭 다운 버튼을 사용하여 여러 아이템 중에 하나를 선택할 수 있는 기능을 제공
	• 컴포넌트를 생성한 후 드롭 다운 리스트 항목을 추가시켜서 사용합니다.
	• 메뉴항목인 아이템의 인덱스는 0번부터 시작합니다.

*/

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceEx01 extends Frame {

	public static void main(String args[]) {
		// Frame 생성
		ChoiceEx01 cht = new ChoiceEx01();
		// Frame 제목 설정
		cht.setTitle("Choicebox Test");
		// FlowLayout으로 배치관리자(LayoutManager) 설정
		cht.setLayout(new FlowLayout());

		// 드롭다운리스트 객체 생성
		Choice ch = new Choice();

		// 항목 추가
		ch.add("Item 1");
		ch.add("Item 2");
		ch.add("Item 3");
		ch.add("Item 4");

		// 프레임에 추가
		cht.add(ch);

		// TODO : 아이템 수 확인
		System.out.println("A number of item : " + ch.getItemCount());
		// A number of item : 4

		// TODO : 항목추가
		ch.addItem("Item 5");
		System.out.println("A number of item : " + ch.getItemCount());
		// A number of item : 5

		// TODO : 두번째 아이템에 +1하기 -> 문자열 연결이 일어남
		System.out.println("The 2th item : " + (ch.getItem(1) + 1));
		// The 2th item : Item 21

		// TODO : 인덱스 확인하기
		ch.select(2);
		System.out.println("Item 3는 " + ch.getSelectedIndex() + "번째 item.");
		// Item 3는 2번째 item.

		// TODO : 아이템 선택 설정하기
		ch.select("Item 4");
		System.out.println("The 4th item : " + ch.getSelectedItem());
		// The 4th item : Item 4

		// TODO : 항목 삭제
		ch.remove(4);
		System.out.println("아이템의 총 수: " + ch.getItemCount());
		// 아이템의 총 수: 4

		// TODO : 항목 삭제
		ch.remove("Item 2");
		System.out.println("Current items");
		// Current items

		// TODO : 전체 항목 출력 1 (동일코드)
		for (int i = 0; i < 3; i++)
			System.out.print(ch.getItem(i) + "  ");
		System.out.println("");
		// Item 1 Item 3 Item 4

		// TODO : 전체 항목 출력 2 (동일코드)
		System.out.println("A number of item : " + ch.getItemCount());
		for (int i = 0; i < ch.getItemCount(); i++)
			System.out.print(ch.getItem(i) + "  ");
		System.out.println("");

		// 프레임 사이즈 설정(가로px, 세로px)
		cht.setSize(300, 200);
		// 프레임 보이게 설정
		cht.setVisible(true);
	}
}
