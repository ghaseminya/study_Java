/*
Iterator의 사용 

*/
package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx01 {
	
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		
		//iterator 메소드가 생성하는 인스턴스를 가리켜 ‘반복자’라고 합니다.
		Iterator<String> itr=list.iterator();
		
		System.out.println("반복자를 이용한 1차 출력과 \"Second\" 삭제");
		//hasNext(): 참조할 다음 번 요소(element)가 존재하면 true를 반
		while(itr.hasNext())
		{
			String curStr=itr.next();	//next(): 다음 번 요소를 반환
			System.out.println(curStr);
			if(curStr.compareTo("Second")==0)
				itr.remove();	//remove(): 현재 위치의 요소를 삭제

		}
		
		System.out.println("\n\"Second\" 삭제 후 반복자를 이용한 2차 출력 ");		
		itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
