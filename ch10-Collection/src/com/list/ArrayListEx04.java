/*//ArrayList 데이터 삽입/삭제, 확장 For문
	• ArrayList의 데이터 삽입
	• ArrayList의 데이터를 확장For문으로 출력 
	• ArrayList의 데이터 삭제-index통해
	• ArrayList의 데이터 삭제-객체(요소)통해

//--------------------
JDK5.0이상 부터 사용가능
내부적으로 indexing하면서 데이터를 뽑아주게 됩니다. 

*/

package com.list;

import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// 제네릭 표현으로 스트링만 입력받도록 선언
		ArrayList<String> al = new ArrayList<String>();
		
		//ArrayList의 데이터 삽입
		al.add("배트맨");	// String -> Object 업캐스팅
		al.add("홍길동");	// String -> Object 업캐스팅
		al.add("강하늘");	// String -> Object 업캐스팅
		al.add("일지매");	// String -> Object 업캐스팅
		
		//ArrayList의 데이터를 확장For문으로 출력
		for(String name : al){
			System.out.println(name);
		}
		
		
		System.out.println();
		//ArrayList의 데이터 삭제-index통해
		al.remove(2);	//해당 인덱스 삭제
						//강하늘 삭제

		for(String name : al){
			System.out.println(name);
		}

		
		System.out.println();
		//ArrayList의 데이터 삭제-객체(요소)통해
		al.remove("홍길동");	//해당 객체(요소) 

		for(String name : al){
			System.out.println(name);
		}
	}
}

/*
배트맨
홍길동
강하늘
일지매

배트맨
홍길동
일지매

배트맨
일지매



*/
