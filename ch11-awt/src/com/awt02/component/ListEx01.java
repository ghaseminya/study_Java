package com.awt02.component;

import java.awt.Frame;
import java.awt.List;

public class ListEx01 extends Frame{

	public static void main(String args[]) {
		ListEx01 lt = new ListEx01();
        lt.setTitle("List Test");
        
        //항목 5개의 단일 선택 리스트 생성
        List lst = new List(5, true);
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
        System.out.println("2th item is seelcted : "+
              lst.isIndexSelected(1));
        System.out.println("3th item is seelcted : "+
              lst.isIndexSelected(2));
        
//        System.out.println("A number of lists is "+
//              lst.getRows());
        
        String[] selitems = new String[3];
        selitems = lst.getSelectedItems();
        System.out.println("=== Slected items ===");
        for(int i=0; i<selitems.length; i++)
            System.out.println("List["+i+
              "] = "+selitems[i]);
        
        System.out.println("mutiple mode : "+
             lst.isMultipleMode());
             
        lst.replaceItem("First list", 0);
              
        lt.pack();
        lt.setVisible(true);       
  }
}
