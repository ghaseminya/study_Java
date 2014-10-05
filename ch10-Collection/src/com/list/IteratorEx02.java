/*
LinkedList<E>에서 컬렉션 클래스를 HashSet<E>로 변경

IteratorEx01 예제는 반복자를 사용했기 때문에, 
LinkedList<E>가 어울리지 않아서, 컬렉션 클래스를 HashSet<E>로 변경해야 할 경우, 
다음과 같이 변경하는 것이 전부입니다.
LinkedList<String> list=new LinkedList<String>(); => HashSet<String> set = new HashSet<String>();

*/
package com.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx02 {
	
	public static void main(String[] args)
	{
		//LinkedList<String> list=new LinkedList<String>();
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
		
		//iterator 메소드가 생성하는 인스턴스를 가리켜 ‘반복자’라고 합니다.
		Iterator<String> itr=set.iterator();
		
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
		itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
