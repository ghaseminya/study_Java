package com.gen02;

/* 
제네릭 객체 생성 방법 확인

제네릭 :
클래스를 정의 할 때는 v의 데이터 타입을 확정하지 않고 
인스턴스를 생성할 때 데이터 타입을 지정하는 기능 


★ Generics 자료형 도식형

//---------------------------------
TODO 1: 자료형 타입 미지정하여 객체 생성(좋은 방법 아닙니다)
TODO 2: 표준 사용방법
*/

import static java.lang.System.out;

// 클래스를 정의 할 때 데이터 타입을 확정하지 않습니다.
class GenericsEx<T>{
	// T라는 데이터 타입은 존재하지 않음. 이 값은 아래 코드의 T에서 정해진다.
	T[] v;
	
	public void set(T[] str){
		v = str;
	}
	public void print(){
		for(T s:v)
			out.println(s);
	}
}

//TODO 2: 표준 사용방법
//public class GenericsEx02 {
//
//	public static void main(String[] args){
//		
//		//클래스 선언부에 정의T는 아래 코드의 <> 안에 지정된 데이터 타입에 의해서 결정 
//		//인스턴스를 생성할때 t의 데이터 타입이 결정됩니다.
//		GenericsEx<String> t = new GenericsEx<String>();
//		
//		String[] aStr ={"가", "나", "다", "라", "마", "바", "사"};
//		t.set(aStr);
//		t.print();
//	}
//}


//TODO 1: 자료형 타입 미지정하여 객체 생성(좋은 방법 아닙니다)
//public class GenericsEx02 {
//
//	public static void main(String[] args){
//		
//		GenericsEx t = new GenericsEx();
//		
//		String[] aStr ={"가", "나", "다", "라", "마", "바", "사"};
//		t.set(aStr);
//		t.print();
//	}
//}


/*
//출력결과
가
나
다
라
마
바
사
*/
