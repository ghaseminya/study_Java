//main() 위치 및 인스턴스 생성


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
