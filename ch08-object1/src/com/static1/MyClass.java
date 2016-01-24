/*
//main() 위치 및 인스턴스 생성


public static void main( ){  }
	• main메소드는 프로그램의 시작과 끝 명시
	• main메소드안의 실행문을 차례로 수행
	• main메소드의 위치는 static의 형태로 정의하기로 약속했으므로, 어디에 존재하든 상관없으며 다만 실행하는 방식에만 차이가 있을 뿐입니다


*/
package com.static1;

public class MyClass {

	public void makeMyClass( ){
		MyClass myclass = new MyClass( ); //자신이 속한 클래스의 인스턴스 생성
		System.out.println("자신이 속한 클래스의 인스턴스 생성");
		System.out.println(myclass);
	}
	
	public static void main(String[] args) {

		MyClass myClass1 = new MyClass(); //자신이 속한 클래스의 인스턴스 생성
		myClass1.makeMyClass();
		
		
		MyClass myClass2 = new MyClass(); //자신이 속한 클래스의 인스턴스 생성
		myClass2.makeMyClass();
	}
}
