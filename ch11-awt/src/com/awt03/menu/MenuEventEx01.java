/*
서브메뉴11을 선택한 순간 ActionEvent가 발생되어 콘솔에 문자열이 출력된다
*/
package com.awt03.menu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEventEx01 extends Frame{

	MenuBar mb;
	
	public MenuEventEx01(){
		setLayout(new FlowLayout());
		setTitle("MenuEvent Test");
		setBackground(Color.lightGray);
		
		mb = new MenuBar();
		
		//주 메뉴 생성
		Menu m1 = new Menu("MainMenu1");
		//서브 메뉴 생성
		MenuItem m1_mi1 = new MenuItem("SubMenu1");
		MenuItem m1_mi2 = new MenuItem("SubMenu2");
		MenuItem m1_mi3 = new MenuItem("SubMenu3");
		
		m1.add(m1_mi1);
		m1.add(m1_mi2);
		m1.add(m1_mi3);
		mb.add(m1);
		setMenuBar(mb);
		
		//이벤트 핸들러와 m11 서브메뉴를 연결
//		m1_mi2.addActionListener(new MenuHandler());
		
		m1.addActionListener(new MenuHandler());
		
	}
	
	//이벤트 핸들러 클래스로서 액션 리스너 사용
	public class MenuHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("서브메뉴2가 선택되었습니다.");
			
			System.out.println(e.getID() + "가 선택되었습니다.");
		}
		
	}
	

	public static void main(String[] args) {
		MenuEventEx01 me = new MenuEventEx01();
		me.setSize(300, 200);
		me.setVisible(true);

	}
}
