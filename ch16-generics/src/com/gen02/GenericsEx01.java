package com.gen02;
/*
제네릭 클래스 사용 단계
TODO 1: 템플릿 형태의 자료형클래스 정의
TODO 2: 템플릿 형태의 자료형클래스에 필요한 속성과 메서드 정의
TODO 3: 제네릭 객체 생성
TODO 4: 제네릭 객체 사용


제네릭 클래스 정의 형식
[접근제한] class 클래스명<유형1,유형2, … 유형n> {}


객체가 생성시 전달된 상징적 자료형(Generic Type)이  String형이었다면 왼쪽의 코드는 다음과 같이 대체(代替)됩니다.
T s; 		또는 	T[] arr;
String s; 	or	String[] arr;




제네릭 타입 생성 형식 (제네릭 객체 생성) - Generic class의 변수 선언과 생성 
// 선언
GenericClass명<적용할GenericType> 변수명; 

//생성
변수명 = new GenericClass생성자명<적용할GenericType>();



*/

//TODO 1: 템플릿 형태의 자료형클래스 정의
//템플릿 클래스를 문자 <T>를 이용하여 선언
//<T>는 어떤 데이터 타입도 대응할 수 있다는 뜻
class MyGeneric<T>{
	//TODO 2: 템플릿 형태의 자료형클래스에 필요한 속성과 메서드 정의
	private T element;
	
	public void setElement(T data){
		element = data;
	}
	
	public T getElement(){
		return element;
	}
}

public class GenericsEx01 {

	public static void main(String[] args) {
		//String 문자형을 저장
		//TODO 3: 제네릭 객체 생성, Generic class의 변수 선언 및 생성
		MyGeneric<String> mg1 = new MyGeneric<String>();
		
		//TODO 4: 제네릭 객체 사용
		mg1.setElement("안드로이드");
		System.out.println(mg1.getElement()); //안드로이드
		
		//Integer 정수형을 저장
		//주의할 점은 기본 데이터형은 저장할 수 없으며 객체만 저장할 수 있습니다. 
		//그래서 <int> 가 아니고 <Integer>로 선언한 것입니다. (Wrapper클래스 사용)
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>();
		mg2.setElement(2007); // 2007년 11월 안드로이드 1.0 버전
		System.out.println(mg2.getElement()); //2007
	}
}


/*//출력결과
안드로이드
2007

*/
