//참조 자료형: 호출 범위 강제 - 업 캐스팅/다운 캐스팅
// 
//객체 생성시 자료형을 부모자료형으로 교체가능
//참조변수를 통해 부모클래스 인스턴스변수와 자식클래스의 인스턴스 변수 호출

package com.ext3;


//부모 클래스
class Parent{
	int a = 100;	
}

//자식 클래스
class Child extends Parent{
	int b = 200;
}

public class Exten01 {

	public static void main(String[] args) {

		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);

		
		System.out.println("\n업캐스팅(자식클래스 -> 부모클래스): ");
		//업 캐스팅: 자식 클래스 타입에서 부모 클래스 타입으로 변경, 자동적으로 형변환	
		//자식 클래스 타입지정시 호출영역: 부모클래스 + 자식클래스  
		//부모 클래스 타입지정시 호출영역: 부모클래스
		//객체 생성시 자료형을 부모자료형로 지정
		Parent pa = ch;
		System.out.println(pa.a);
		//호출범위를 범어나 호출출가
//		System.out.println(pa.b);	//ERROR: b cannot be resolved or is not a fields

		
		System.out.println("\n부모 클래스 -> 자식클래스로 명시적 형변환: ");
		//부분(부모) -> 전체(자식)로 형변환시 명시적으로 명시 
		Child ch2 = (Child)pa;
//		Child ch2 = pa;	//ERROR-Type mismatch: cannot convert from Parent to Child
						//명시적으로 형변환 주지 않으면 에러
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
	}
}


/*//출력결과
100
200

업캐스팅(자식클래스 -> 부모클래스): 
100

부모 클래스 -> 자식클래스로 명시적 형변환: 
100
200
*/