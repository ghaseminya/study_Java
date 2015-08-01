
//메서드 Overriding
//오버라이딩 관계에서의 메소드 호출


package com.ext4;

class Parent{
	String msg = "Parent 클래스";
	public String getMessage(){
		return msg;
	}
}
class Child extends Parent{
	String msg = "Child 클래스";
	public String getMessage(){ //메서드 Overriding
		return msg;
	}
}

public class OverridingEx03 {

	public static void main(String[] args){
		Child child = new Child();
		System.out.println("child : " + child.getMessage());
		
		Parent parent = new Child();
		System.out.println("parent : " + parent.getMessage());
	}
}
