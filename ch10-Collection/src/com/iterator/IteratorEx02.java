/*
LinkedList<E>에서 컬렉션 클래스를 HashSet<E>로 변경

IteratorEx01.java에서 LinkedList<E>를 HashSet<E>변경시 반복자를 사용하기 때문에
컬렉션 선먼만 바뀌고 나머지 부분은 모두 동일하게 사용할 수 있습니다.

//--------------------

IteratorEx01 예제는 반복자를 사용했기 때문에, 
LinkedList<E>가 어울리지 않아서, 컬렉션 클래스를 HashSet<E>로 변경해야 할 경우, 
다음과 같이 변경하는 것이 전부입니다.
LinkedList<String> list=new LinkedList<String>(); => HashSet<String> set = new HashSet<String>();

*/
package com.iterator;

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
		
		//list의 요소를 순차 검색할 Iterator 객체 리턴
		//iterator 메소드가 생성하는 인스턴스를 가리켜 '반복자'라고 합니다.
		Iterator<String> iterator=set.iterator();
		
		System.out.println("반복자를 이용한 1차 출력과 \"Second\" 삭제");
		//hasNext(): 참조할 다음 번 요소(element)가 존재하면 true를 반
		while(iterator.hasNext()){
			//next(): 다음 번 요소를 반환
			String curStr=iterator.next();
			System.out.println(curStr);
			
			//curStr과 "Second" 이 두 문자열이 같으면 0
			if(curStr.compareTo("Second")==0)
				iterator.remove();	//remove(): 현재 위치의 요소를 삭제

		}
		
		System.out.println("\n\"Second\" 삭제 후 반복자를 이용한 2차 출력 ");		
		iterator=set.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
/*//출력결과
반복자를 이용한 1차 출력과 "Second" 삭제
Second
Third
First
Fourth
Fifth

"Second" 삭제 후 반복자를 이용한 2차 출력 
Third
First
Fourth
Fifth

*/

