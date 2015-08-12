// 상속 - 멤버 메소드
// 부모 클래스와 자식클래스의 메소드 호출

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
		
		//부모 클래스의 메소드 호출
		bb.make();
		//자식 클래스의 메소드 호출
		bb.fun();		
	}
}