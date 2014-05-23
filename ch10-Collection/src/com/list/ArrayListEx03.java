/* ArrayList - 에러발생 (다운캐스팅시)
 * 
 * String값이 아닌 다른 데이터형이 입력되어 
 * 다운캐스팅시 에러발생(컴파일시 문제는 없으나 실행시 에러발생)
 * 제네릭 표현으로 에러 수정(ArrayList03_1.java)하여 해결  
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// 
		ArrayList al = new ArrayList();
		al.add("배트맨");	// String -> Object 업캐스팅
		al.add("홍길동");	// String -> Object 업캐스팅
		al.add("일지매");	// String -> Object 업캐스팅
		al.add("강하늘");	// String -> Object 업캐스팅

		al.add(new Integer(100));	//Integer -> Object 업캐스팅
		al.add("헐크");		
		
		//컴파일시 문제는 없으나 실행시 에러발생
		for(int i=0; i<al.size(); i++){
			String name = (String)al.get(i);	//ERROR: java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			//출력
			System.out.println(name);
		}
	}
}
