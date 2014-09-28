/* 상속 - 멤버변수 
 * 
 */

package com.ext1;

//부모 클래스, 상위 클래스, 기초 클래스
//class Parent extends Object{}	//extends Object는 생략
class Parent{
	int a = 100;
}

//자식 클래스, 하위 클래스, 유도 클래스
class Child extends Parent{
	
	int b = 200;

	//int a = 300;	
}

public class Exten01 {
	public static void main(String[] args){		
		
		Child ch = new Child();
		//Parent클래스를 상속했기 때문에 a 호출가능
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		System.out.println(ch.a);		
	}
}