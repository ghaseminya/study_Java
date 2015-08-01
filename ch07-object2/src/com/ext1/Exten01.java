// 상속 - 멤버변수 
 
//1)상속후 상위클래스의 멤버변수와 서브클래스의 지역변수 출력 
//2)상위클래스의 a값 변경한 후 확인

package com.ext1;

//부모 클래스, 상위 클래스, 기초 클래스
//class Parent extends Object{}	//extends Object는 생략
class Parent{
	int a = 100;
}

//자식 클래스, 하위 클래스, 유도 클래스
class Child extends Parent{
	
	int b = 200;

	//2)상위클래스의 a값 변경한 후 다시 결과 확인
//	int a = 300;
}

public class Exten01 {
	public static void main(String[] args){		
		
		Child ch = new Child();
		//Parent클래스를 상속했기 때문에 a 호출가능
		System.out.println(ch.a);
		System.out.println(ch.b);
		
	}
}