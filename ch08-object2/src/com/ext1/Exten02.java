/*
// 상속 - 멤버 메소드
// 부모 클래스와 자식클래스의 메소드 호출


[상속 특징]
IS-A 관계						
	• 객체간에 IS-A 관계가 성립되어야 합니다.

단일 상속(Single Inheritance)
	• 자바는 단일 상속(Single Inheritance)만 지원합니다
	• 부모 클래스는 여러 자식 클래스를 가질 수 있지만 자식 클래스는 하나의 부모 클래스만 가질 수 있습니다
							
부모 클래스를 먼저 객체 생성		
• 클래스 객체가 생성될 때 자동으로 부모 클래스를 먼저 객체 생성 한 후에 자신의 클래스가 생성됩니다.
• 부모 클래스가 먼저 생성되어야 자식 클래스가 부모의 멤버를 사용할 수 있기 때문입니다.

					
java.lang.Object클래스		
• 가장 상위 클래스는 java.lang.Object클래스입니다. 따라서 모든 클래스는 Object 클래스를 상속받게 됩니다.

*/
package com.ext1;

//부모 클래스, 상위 클래스, 기초 클래스
class A{
	public void make(){
		System.out.println("부모 클래스");
	}
}

//자식 클래스 -> 상속
//자식 클래스, 하위 클래스, 유도 클래스
class B extends A{
	public void fun(){
		System.out.println("자식 클래스");
	}
}

public class Exten02 {
	
	public static void main(String[] args){
		
		B bb = new B();
		
		//자식 클래스의 메소드 호출
		bb.fun();
		
		//부모 클래스의 메소드 호출
		bb.make();
	}
}


//출력결과
//자식 클래스
//부모 클래스