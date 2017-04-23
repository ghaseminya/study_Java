/*
Iterator의 사용 

Iterator를 이용한 인스턴스의 순차적 접근
Iterator: 반복자


Iterator<E> 인터페이스
	• 자바 컬렉션 프레임워크(Java Collections Framework)에서 Enumeration을 대체하는 인터페이스로 객체들의 집합을 구성하는 각각의 요소를 순차적으로 추출할 때 사용된다. Enumeration과 비교해 메서드명이 개선되었으며 호출측에서 집합의 요소를 삭제할 수 있게 한다.
	즉, Vector, ArrayList, LinkedList, Set과 같은 어떤 요소를 순차적으로 검색할 때는 
	java.util 패키지의 Iterator<E> 인터페이스를 사용합니다.
	• Collection<E> 인터페이스에는 iterator라는 이름의 메소드가 다음의 형태로 정의되어 있습니다.
	• Iterator<E> iterator( ) { . . . . }
	• iterator 메소드가 반환하는 참조 값의 인스턴스는 Iterator<E> 인터페이스를 구현하고 있습니다.
	• iterator 메소드가 반환한 참조 값의 인스턴스를 이용하면, 컬렉션 인스턴스에 저장된 인스턴스의 순차적 접근이 가능합니다.
	• iterator 메소드의 반환형이 Iterator<E>이니, 
	반환된 참조 값을 이용해서 Iterator<E>에 선언된 함수들만 호출하면 됩니다.


int compareTo(String anotherString)
문자열의 사전적 값을 비교하여, 만약 처음 문자열이 두 번째 문자열보다 적거나 같거나, 혹은 크다면 해당하는 정수 값을 반환합니다.
(비교 문자열의 길이가 같은지 비교한 결과를 반환)

s1 과 s2 두 문자열 비교를 통한 반환값
s1 == s2	0
s1 > s2		긍정값 
s1 < s2		부정값


*/
package com.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx01 {
	
	public static void main(String[] args)
	{
		//객체 생성
		LinkedList<String> list=new LinkedList<String>();
		//데이터 추가
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		
		//list의 요소를 순차 검색할 Iterator 객체 리턴
		//iterator() 메소드가 생성하는 인스턴스를 가리켜 ‘반복자’라고 합니다.
		Iterator<String> iterator=list.iterator();
		
		System.out.println("반복자를 이용한 1차 출력과 \"Second\" 삭제");
		//hasNext(): 참조할 다음 번 요소(element)가 존재하면 true를 반
		while(iterator.hasNext())
		{
			//next(): 다음 번 요소를 반환
			String curStr=iterator.next();
			System.out.println(curStr);
			
			//curStr과 "Second" 이 두 문자열이 같으면 0
			if(curStr.compareTo("Second")==0){
				//remove(): 현재 위치의 요소를 삭제
				iterator.remove();	
			}
		}
		
		System.out.println("\n\"Second\" 삭제 후 반복자를 이용한 2차 출력 ");		
		iterator=list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}

/*//출력결과
반복자를 이용한 1차 출력과 "Second" 삭제
First
Second
Third
Fourth
Fifth

"Second" 삭제 후 반복자를 이용한 2차 출력 
First
Third
Fourth
Fifth

*/
