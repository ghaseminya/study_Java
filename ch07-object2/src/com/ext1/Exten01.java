/* 상속 - 멤버변수 
 * 
 */

package com.ext1;

//부모 클래스
//class Parent extends Object{}	//extends Object는 생략
class Parent{
	int a = 100;
}

//자식 클래스
class Child extends Parent{
	
	int b = 200;

	//int a = 300;	
}

public class Exten01 {
	public static void main(String[] args){		
		
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		System.out.println(ch.a);		
	}
}