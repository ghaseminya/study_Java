/*
//Overriding
//	• 부모클래스 상속받은 자식 클래스에서  부모클래스의 멤버메소드를 재정의합니다.

오버라이딩(Overriding)
	• 오버라이딩은 메서드 재정의라고도 불리며 이는 서로 상속관계로 이루어진 객체들간의 관계에서 비롯됩니다.
	• super클래스가 가지고 있는 메서드를 sub클래스에서 똑 같은 것을 새로 만들게 되면 
	     더 이상 super클래스에 있는 이름이 같은 메서드로 호출할 수 없게 됩니다. 이를 오버라이딩 또는 멤버 은폐라고도 합니다.
	• 다시 정리하면, 상위 클래스에 정의된 메소드의 이름, 반환형, 매개변수 선언까지 완전히 동일한 메소드를 
	    하위 클래스에서 다시 정의하는 것으로 하위 클래스에 정의된 메소드에 의해 상위 클래스의 메소드는 가리워집니다.


오버라이딩 규칙
	• 상속이 전제
	• 메소드이름과 메소드 리턴타입이 반드시 동일
	• 메소드 인자 리스트 반드시 동일
	• static, final, private지정자를 가진 메소드는 오버라이딩 불가

*/
package com.ext2;

//부모 클래스
class Parent{
	public void make(){
		System.out.println("부모 클래스");
	}
}

//자식 클래스
class Child extends Parent{
	
	//TODO : 메서드 오버라이딩(메소드 재정의)
	//@Override: JDK 5.0이상부터 사용 가능
	@Override
	public void make(){
		System.out.println("자식 클래스");
	}
	//참조변수의 자료형에 상관없이 오버라이딩 된 메소드는 외부로부터 가려지므로, 마지막으로 오버라이딩한 메소드가 호출됩니다.
	
	
	//TODO : 재정의가 문법에 맞게 적용되었는지 검증하는 구문
//	@Override
//	public void meke(){	//메소드명이 달라 재정의 문법에 맞지않는다고 에러가 표시됩니다.
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


//출력결과
//자식 클래스