/*
//Static 내부 클래스

//일반멤버 클래스는 static한 변수를 쓰지 못하며 
//ERROR:The field cv cannot be declared static in a non-static inner type, unless initialized with a constant expression
//static변수를 포함한 내부 클래스는 static 클래스여야 합니다.

static 내부 클래스
	• static 내부 클래스로 어쩔 수 없이 정의하는 경우가 있는데 그것은 바로 
	내부 클래스 안에 static변수를 가지고 있다면 어쩔 수 없이 해당 내부 클래스는 static으로 선언하여야 합니다. 

*/
package com.inner3;

//public, final, abstract만 가능(일반 지정자-클래스의 종류 지정)
public class StaticEx01 {
	
	//일반멤버 클래스는 static한 변수를 쓰지 못하며(컴파일ERROR)
	//static변수를 포함한 내부 클래스는 static 클래스여야 합니다.
	//ERROR:The field cv cannot be declared static in a non-static inner type, unless initialized with a constant expression
//	public class StaticInner{ //일반클래스
//		int iv = 200;
//		static int cv = 300; //static변수
//	}
	public static class StaticInner{ //static 내부 클래스
		int iv = 200;
		static int cv = 300; //static변수
	}
	
	
	public static void main(String[] args){
		//가능
//		StaticEx01.StaticInner i = new StaticInner();
//		System.out.println(i.iv);
//		System.out.println(i.cv);
		
		//static 내부 클래스를 객체 생성, Outer에 있는 StaticEx01을 객체생성하지 않음
		StaticEx01.StaticInner ii = new StaticEx01.StaticInner();
		
		//인스턴스 변수 호출
		System.out.println(ii.iv); //200
		System.out.println(ii.cv); //300
		
		
		//static변수 호출
		System.out.println(StaticEx01.StaticInner.cv); //300
//		System.out.println(StaticInner.cv); //가능
	}
}
