package com.awt03.menu;
/*
메뉴 선택시 문자열 출력해 주는 프로그램
TODO 1: 서브메뉴2을 선택한 순간 ActionEvent가 발생되어 콘솔에 문자열이 출력하기
TODO 2: 어떤 메뉴 든지 선택하면 해당 항목을 문자열로 출력하기
TODO 3: 세번째 메뉴 클릭시 프로그램 종료시키기

*/

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
		
		//TODO 1-1: 이벤트 핸들러와 m1_mi2 서브메뉴를 연결
//		m1_mi2.addActionListener(new MenuHandler());
		
		//TODO 2-1: 선택한 항목 출력해 주기
		m1.addActionListener(new MenuHandler());
		
	}
	
	//이벤트 핸들러 클래스로서 액션 리스너 사용
	public class MenuHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//TODO 1-2: 
//			System.out.println("서브메뉴2가 선택되었습니다.");
			
			//TODO 2-2:
			System.out.println(e.getActionCommand() + "가 선택되었습니다.");
			
			
			//TODO 3: 세번째 메뉴 클릭시 프로그램 종료시키기
			// 버튼에 적힌 문자열을 읽어온다.
			String command=e.getActionCommand();

			if(command.equals("SubMenu3")){
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			else{ // 특별한 작업 안함
			}
		}
	}
	

	public static void main(String[] args) {
		MenuEventEx01 me = new MenuEventEx01();
		me.setSize(300, 200);
		me.setVisible(true);
	}
}
