/* 상속 - 멤버 메소드
 * 
 */

package com.ext1;

//부모 클래스
class A{
	public void make(){
		System.out.println("부모 클래스");
	}
}

//자식 클래스 -> 상속
class B extends A{
	public void fun(){
		System.out.println("자식 클래스");
	}
}

public class Exten02 {
	
	public static void main(String[] args){
		
		B bb = new B();
		bb.make();
		bb.fun();		
	}
}