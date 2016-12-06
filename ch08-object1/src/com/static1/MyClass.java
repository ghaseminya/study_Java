/*
//main() 위치 및 인스턴스 생성


public static void main( ){  }
	• main메소드는 프로그램의 시작과 끝 명시
	• main메소드안의 실행문을 차례로 수행
	• main메소드의 위치는 static의 형태로 정의하기로 약속했으므로, 어디에 위치하든(존재하든) 상관없습니다. 
	다만 실행하는 방식에만 차이가 있을 뿐입니다


*/
package com.static1;

public class MyClass {

	//모든 메소드는 자신이 속한 클래스의 인스턴스 생성이 가능합니다. 
	//이는 main 메소드도 마찬가지입니다. 
	public void makeMyClass( ){
		MyClass myclass = new MyClass( ); //자신이 속한 클래스의 인스턴스 생성
		System.out.println("자신이 속한 클래스의 인스턴스 생성");
		System.out.println(myclass);
	}
	
	//클래스안에 있는 메소드 밖에서 클래스의 인스턴스 생성시 실행하면 예외가 발생됩니다.
	//ERROR-Exception in thread "main" java.lang.StackOverflowError
	//at com.static1.MyClass.<init>(MyClass.java:23)
	MyClass myclass = new MyClass( ); 
	
	//main 메소드의 위치는 static으로 정의되어있어  어디든 존재할 수 있습니다.
	public static void main(String[] args) {

		MyClass myClass1 = new MyClass(); //자신이 속한 클래스의 인스턴스 생성
		myClass1.makeMyClass();
		//makeMyClass( )메소드는 인스턴스를 통해 호출되는 것이므로 MyClass 클래스밖에 있는 것이기 때문에
		//메소드안에 다시 자신이 속한 클래스의 인스턴스 생성이 가능합니다.
		
		
		MyClass myClass2 = new MyClass(); //자신이 속한 클래스의 인스턴스 생성
		myClass2.makeMyClass();
	}
}
