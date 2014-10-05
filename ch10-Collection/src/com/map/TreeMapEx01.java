/*
TreeMap<K, V> 클래스 활용 

키들의 모임을 얻어와야 키를 순차적으로 검색할 수 있다. 
navigableKeySet 메소드는 키들이 모여있는 컬렉션 인스턴스의 참조 값을 반환합니다.


descendingIterator 메소드는 내림차순의 검색을 위한 반복자를 생성합니다. 
그리고 NavigableSet<E> 클래스도 Set<E> 클래스를 상속하는 컬렉션 클래스입니다

*/
package com.map;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapEx01 {
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tMap=new TreeMap<Integer, String>();

		tMap.put(7, "data 7");
		tMap.put(1, "data 1");
		tMap.put(3, "data 3");
		tMap.put(5, "data 5");
		tMap.put(2, "data 2");
		tMap.put(4, "data 4");
		tMap.put(6, "data 6");
		
		//navigableKeySet 메소드는 키들이 모여있는 컬렉션 인스턴스의 참조 값을 반환
		NavigableSet<Integer> navi=tMap.navigableKeySet();
		
		System.out.println("[오름차순 출력]");
		Iterator<Integer> itr=navi.iterator();	//iterator()호출해서 map에 저장되어있는 키를 참조할 수 있는 반복자를 얻어오기 
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));	//value 얻기
		
		System.out.println("");
		System.out.println("[내림차순 출력]");
		//내림차순으로 데이터를 접근하는 반복자 생성
		itr=navi.descendingIterator();
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));	
	}
}
