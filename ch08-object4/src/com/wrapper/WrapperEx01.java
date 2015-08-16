//boxing/unboxing

//boolean boxing/unboxing하기
//int boxing/unboxing하기


package com.wrapper;

public class WrapperEx01 {

	public static void main(String[] args) {
		
		//기본자료형
		boolean b = true;
		
		//객체 생성
		//참조자료형(객체 자료형): 자바 내부에서 제공되는 클래스 또는 프로그래머에 의해 만들어진 사용자 정의 클래스 등을 자료형으로 하는 것
		//기본자료형 데이터를 생성자를 통해 객체 생성(참조자료형) 즉, 기본자료형 -> 참조자료형 (boxing, 박싱)
		Boolean wrap_boolean = new Boolean(b);
		
		//출력할때 원래의 자료형으로 출력하기
		//참조자료형 -> 기본자료형 (unboxing, 언박싱)
		System.out.println("b: " + b); //b: true
		System.out.println("wrap_boolean: " + wrap_boolean.booleanValue()); //wrap_boolean: true
		System.out.println();
		
		//기본자료형 -> 참조자료형 (boxing)
		Integer wrap_integer = new Integer(100);
		//참조자료형 -> 기본자료형 (unboxing)
		int i = wrap_integer.intValue();
		System.out.println("i: " + i); //i: 100
		System.out.println("wrap_integer: " + wrap_integer.intValue()); //wrap_integer: 100
	}
}
