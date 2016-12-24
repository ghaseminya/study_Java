package com.awt03.menu;
/*


MenuComponent 
	• 사용자가 항목을 선택하여 항목에 따른 변화가 일어날 수 있도록 구현한 클래스
	• 메뉴는 보통 최상위 레벨의 윈도우 타이틀바 아래에 존재하는 것으로 
	사용자가 프로그램의 기능을 선택할 수 있도록 해주는 기능을 가지고 있는 컴포넌트
	• 메뉴의 구성은 MeunBar, Menu, MenuItem으로 구성


MenuComponent 클래스의 Sub 클래스 
하위 클래스				기능
MenuBar				메뉴를 올려 놓을 수 있는 메뉴바를 만들 때 사용
Menu				메뉴 바에 올려 놓을 수 있는 메뉴를 만들 때 사용
MenuItem			메뉴의 하위 메뉴를 만들 때 사용
CheckboxMenuItem	체크박스가 들어 있는 메뉴 아이템을 만들 때 사용
PopupMenu			동적으로 표현할 수 있는 메뉴를 만들 때 사용



메뉴 사용법 (단계)
메뉴바 객체를 생성
메뉴바에 삽입할 메뉴를 생성
서브 메뉴 항목 추가
메뉴를 메뉴바에 붙이기
메뉴에 붙일 메뉴아이템을 생성한 후 해당 메뉴에 붙이기
메뉴바를 윈도우에 붙이기


*/

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenubarEx01 extends Frame{

	//메뉴 바 객체 선언
	MenuBar mb;

	public MenubarEx01() {
		super("Menu Test");
		
		//메뉴 바 생성
		mb = new MenuBar();
		// 프레임의 메뉴바를 지정합니다.
		setMenuBar(mb);

		//주메뉴 생성
		Menu mn_mode = new Menu("Mode");
		Menu mn_options = new Menu("Options");
		Menu mn_help = new Menu("Help");

//--------------------------------------------		
		//서브메뉴 생성 - Mode
		MenuItem basic = new MenuItem("Basic");
		MenuItem advance = new MenuItem("Advance");
		CheckboxMenuItem check1 = new CheckboxMenuItem("Expert", true);
		
		//서브메뉴 및 서브 항목 생성
		Menu mn_morelang = new Menu("More Language");
		MenuItem mi1 = new MenuItem("C");
		MenuItem mi2 = new MenuItem("HTML5");
		MenuItem mi3 = new MenuItem("Java");
		MenuItem mi4 = new MenuItem("Android");
		CheckboxMenuItem check2 = new CheckboxMenuItem("Check");
		MenuItem exit = new MenuItem("Exit");

		//서브 메뉴에 항목 등록
		mn_morelang.add(mi1);
		mn_morelang.add(mi2);
		mn_morelang.add(mi3);
		mn_morelang.add(mi4);
		mn_morelang.add(check2);
		
		
		//주메뉴에 서브메뉴 등록
		mn_mode.add(basic);           
		mn_mode.add(advance);           
		mn_mode.add(check1);           
		mn_mode.addSeparator();           
		mn_mode.add(mn_morelang);           
		mn_mode.addSeparator();           
		mn_mode.add(exit);           

//--------------------------------------------		
		//서브메뉴 생성 - Options
		MenuItem userdefine = new MenuItem("User define");
		MenuItem windowsetting = new 
				MenuItem("Window setting");

		mn_options.add(userdefine);
		mn_options.add(windowsetting);

		
//--------------------------------------------		
		//서브메뉴 생성 - Help
		MenuItem about = new MenuItem("About");

		mn_help.add(about);

		
		//메뉴바에 추가
		mb.add(mn_mode);
		mb.add(mn_options);
		mb.add(mn_help);
		mb.setHelpMenu(mn_help);

//---------------------------------------------------------		
//		System.out.println("Item count of Examples menu : "+
//				mn_mode.getItemCount());
//		System.out.println("3th Item of Examples menu : "+
//				mn_mode.getItem(2));
//
//		mn_options.insertSeparator(2);
//		mn_options.insert("add item", 3);
//		mn_options.remove(1);
//
//		System.out.println("A number of menu : "+ 
//				mb.getMenuCount());
//		System.out.println("Help menu : "+ 
//				mb.getHelpMenu());
//
//		mb.remove(mn_options);
//
//		System.out.println("Check state of Check menu : "+
//				check1.getState());

		setSize(300, 200);
		setVisible(true);       
	}

	public static void main(String args[]) {
		new MenubarEx01();

	}
}
