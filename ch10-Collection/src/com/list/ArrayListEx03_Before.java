/* ArrayList - 에러발생 (다운캐스팅시)
ArrayList에 서로 다른 자료형 저장 - 다운캐스팅시 에러발생
ArrayList에 서로 다른 자료형이 저장되어 있는 경우 출력시 에러가 발생하게 됩니다.


File Info
->/ch10-Collection/src/com/list/ArrayListEx03_Before.java	ArrayList에 서로 다른 자료형 저장 - 다운캐스팅시 에러발생

/ch10-Collection/src/com/list/ArrayListEx03_After.java	에러 발생을 제네릭으로 해결
														제네릭 표현으로 바꾼 코드

//--------------------
String값이 아닌 다른 데이터형이 입력되어 
다운캐스팅시 에러발생(컴파일시 문제는 없으나 실행시 에러발생)
제네릭 표현으로 에러 수정(ArrayList03_After.java)하여 해결  

 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx03_Before {

	public static void main(String[] args) {
		// 
		ArrayList al = new ArrayList();
		al.add("배트맨");	// String -> Object 업캐스팅
		al.add("홍길동");	// String -> Object 업캐스팅
		al.add("일지매");	// String -> Object 업캐스팅
		al.add("강하늘");	// String -> Object 업캐스팅

		al.add(new Integer(1000));	//Integer -> Object 업캐스팅
		al.add("헐크");		
		
		//컴파일시 문제는 없으나 실행시 에러발생
		//String값이 아닌 다른 데이터형이 입력되어 다운캐스팅시 에러발생(컴파일시 문제는 없으나 실행시 에러발생)
		for(int i=0; i<al.size(); i++){
			String name = (String)al.get(i);
			//ERROR: java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			
			System.out.println(name);
		}
	}
}


/*//출력결과(컴파일 ERROR)

배트맨
홍길동
일지매
강하늘
Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	at com.list.ArrayListEx03.main(ArrayListEx03.java:27)



*/
