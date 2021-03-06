/* ArrayList - 제네릭 표현

File Info
/ch10-Collection/src/com/list/ArrayListEx03_Before.java	ArrayList에 서로 다른 자료형 저장 - 다운캐스팅시 에러발생

->/ch10-Collection/src/com/list/ArrayListEx03_After.java	에러 발생을 제네릭으로 해결
															제네릭 표현으로 바꾼 코드



//--------------------
제네릭 표현:
	• 컬렉션 프레임워크 계열의 클래스들은 객체를 저장할 때 Object타입으로 저장합니다.
	• 그래서, 여러 타입의 데이터를 저장 할 수 있습니다.
	• 이럴 경우, 저장된 데이터를 단일한 타입으로 다운캐스팅하는 것이 불가능하기 때문에 작업이 불편합니다.
	• 이런 문제점을 해결하기 위해 객체 생성시 타입을 지정하는 방법을 도입하였습니다.(제네릭 사용)
	• 제네릭 표현을 사용하면 지정한 타입으로 객체를 저장 및  관리할 수 있습니다. 
	• JDK 5.0이상부터 사용가능


 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx03_After {

	public static void main(String[] args) {		

		//제네릭 표현으로 하나의 타입 지정
		ArrayList<String> al = new ArrayList<String>();
		
		//데이터 추가
		al.add("배트맨");	// String -> Object 업캐스팅
		al.add("홍길동");	// String -> Object 업캐스팅
		al.add("일지매");	// String -> Object 업캐스팅
		al.add("강하늘");	// String -> Object 업캐스팅
		
		//제네릭 표현을 통해 String타입의 객체만 저장하게 명시해서 다른 타입의 객체는 저장 불가능
		//컴파일시에 컴파일 에러로 걸러집니다.
//		al.add(new Integer(1000));	//ERROR: The method add(String) in the type ArrayList<String> is not applicable for the arguments (Integer)
		al.add("아이언맨");		
		
		for(int i=0; i<al.size(); i++){
			
			//형변환 불필요
			String name = al.get(i);
			
			//출력
			System.out.println(name);
		}
	}
}

/* 출력결과 - ArrayListEx03_After.java
배트맨
홍길동
일지매
강하늘
아이언맨





*/
