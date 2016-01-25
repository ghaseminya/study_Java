/*
//메서드 Overriding
//오버라이딩 관계에서의 메소드 호출
//오버라이딩된 메소드를 부모로부터 메소드 호출
//오버라이딩된 메소드를 자식로부터 메소드 호출

참조변수의 자료형에 상관없이 오버라이딩 된 메소드는 외부로부터 가려지므로,
마지막으로 오버라이딩 한 메소드가 호출됩니다.
*/

package com.ext4;

class Parent{
	String msg = "Parent 클래스";
	
	public String getMessage(){
		return msg;
	}
}

class Child extends Parent{
	String msg = "Child 클래스";
	
	//메서드 Overriding
	@Override
	public String getMessage(){
		return msg;
	}
}

public class OverridingEx03 {

	public static void main(String[] args){
		//참조변수의 자료형을 자식클래스로 지정
		Child child = new Child();
		System.out.println("child : " + child.getMessage()); //child : Child 클래스
		
		//참조변수의 자료형을 부모클래스로 지정
		Parent parent = new Child();
		System.out.println("parent : " + parent.getMessage()); //parent : Child 클래스
	}
}

