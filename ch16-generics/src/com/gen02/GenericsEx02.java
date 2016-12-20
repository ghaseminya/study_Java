package com.gen02;
/* 
제네릭 객체 생성 방법 확인

제네릭(Generics) :
클래스를 정의 할 때는 s의 데이터 타입을 확정하지 않고 
인스턴스를 생성할 때 데이터 타입을 지정하는 기능 


T s; 또는 T[] arr; -> String s; 또는 String[] arr;
객체가 생성시 전달된 상징적 자료형(Generic Type)이  String형이었다면 왼쪽의 코드는 다음과 같이 대체(代替)됩니다.


<1글자로 된 영문대문자>
	• API에서는 전달되는 객체가 현 객체 내에서 자료형(Type)으로 쓰일 때 <T>로 유도를 하고 있으며 
	• 만약 전달되는 객체가 현 객체 내에서 하나의 요소(Element)로 자리를 잡을 때는 <E>로
	• 전달되는 객체가 현 객체 내에서 Key값으로 사용될 때는 <K>로, 
	• 만약 전달되는 객체가 현 객체 내에서 Value값으로 사용될 때는 <V>로 표현하고 있습니다. 

구분	설명
<T>	자료형(Type)
<E>	요소(Element)
<K>	Key값
<V>	Value값


★ Generics 자료형 도식형
http://codedragon.tistory.com/4646
http://cfile26.uf.tistory.com/image/24638F4F584DBE542E00B9
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

//TODO 2: 표준 사용방법 (권장)
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


//TODO 1: 자료형 타입 미지정하여 객체 생성(좋은 방법 아닙니다), 경고메시지 발생
//Warnning -GenericsEx is a raw type. References to generic type GenericsEx<T> should be parameterized
public class GenericsEx02 {

	public static void main(String[] args){

		//자료형 타입 미지정하여 객체 생성
		GenericsEx t = new GenericsEx();
		
		String[] aStr ={"가", "나", "다", "라", "마", "바", "사"};
		t.set(aStr);
		t.print();
	}
}


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
