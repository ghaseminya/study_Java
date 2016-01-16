package com.awt03.menu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenubarEx01 extends Frame{

	MenuBar mb;

	public MenubarEx01() {
		super("Menu Test");
		
		//메뉴 바 생성
		mb = new MenuBar();
		setMenuBar(mb);

		//주메뉴 생성
		Menu mn_mode = new Menu("Mode");
		Menu mn_options = new Menu("Options");
		Menu mn_help = new Menu("Help");

		//서브메뉴 생성
		MenuItem basic = new MenuItem("Basic");
		MenuItem advance = new MenuItem("Advance");
		CheckboxMenuItem check1 = new CheckboxMenuItem("Expert", true);
		
		//서브메뉴 및 항목 생성
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

		
		MenuItem userdefine = new MenuItem("User define");
		MenuItem windowsetting = new 
				MenuItem("Window setting");

		mn_options.add(userdefine);
		mn_options.add(windowsetting);

		MenuItem about = new MenuItem("About");

		mn_help.add(about);

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
