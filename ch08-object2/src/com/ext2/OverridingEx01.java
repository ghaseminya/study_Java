//Overriding
//	• 부모클래스 상속받은 자식 클래스에서
//	• 부모클래스의 멤버메소드를 재정의합니다.


package com.ext2;

//부모 클래스
class Parent{
	public void make(){
		System.out.println("부모 클래스");
	}
}

//자식 클래스
class Child extends Parent{
	
	//메서드 오버라디팅(메소드 재정의)
	@Override
	public void make(){
		System.out.println("자식 클래스");
	}
	
	//@Override: JDK 5.0이상부터 사용 가능
	//재정의가 문법에 맞게 적용되었는지 검증하는 구문
//	@Override
//	public void meke(){
//		System.out.println("자식 클래스");
//	}
	//ERROR:The method meke() of type Child must override or implement a supertype method	
	
}

public class OverridingEx01 {
	
	public static void main(String[] args){
		Child ch = new Child();
		ch.make();
	}
}
