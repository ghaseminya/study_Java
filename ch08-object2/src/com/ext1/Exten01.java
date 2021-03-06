/*
// 상속 - 멤버변수 

[Inheritance(상속)]
	• 객체의 특성을 그대로 물려받는 또 다른 객체를 만드는 것
	• 특정 클래스(super class)가 가지는 일부 속성과 기능을 
	     다른 새로운 클래스(sub class)에게 제공하기 위해 맺는 클래스들간의 관계
	• extends 예약어를 사용
	• 멤버변수, 멤버메소드는 상속되지만
	• 생성자는 상속이 안됩니다.


[상속의 목적]
상속을 통해 연관된 일련의 클래스에 대한 공통적인 규약을 정의하고 적용하는 것이 상속의 실질적인 목적입니다.


[상속을 위한 기본조건]
	• 상속관계에 있는 두 클래스 사이에는 IS-A 관계가 성립해야 합니다.
	• IS-A 관계가 성립하지 않는 경우에는 상속의 타당성을 면밀히 검토해야 합니다.
	• IS-A 이외에 HAS-A 관계도 상속으로 표현 가능합니다. 
	     그러나 HAS-A를 대신해서 Composition 관계(구성관계)를 유지하는 것이 보다 적절한 경우가 많습니다


[상속의 사전적 의미]
일정한 친족 관계가 있는 사람 사이에서 한쪽이 죽었을 때 다른 한쪽이 호주권이나 재산에 관한 권리, 의무 일체를 이어받는 것을 의미합니다.


[클래스의 상속]
	• 사전적 의미와 비슷하게 적용되며 한쪽이 다른 한쪽으로 자신의 속성과 메서드 등을 물려주어 사용할 수 있도록 하는 것입니다. 
	• 실 세계에서는 다중 상속이 가능하지만
	• JAVA는 클래스들간의 다중 상속을 지원하지 않으며 이를 통해 객체의 명확성을 높였습니다. (자바는 단일 상속만 지원)
	• C#는 파생클래스가 단 하나의 베이스 클래스로부터 상속되어져야 합니다. 즉, 하나의 파생클래스는 2개 이상의 베이스 클래스를 가질 수 없습니다. (단일 상속)


//-------------------------------------------

클래스 상속의 정의 법
	• 자바에서 말하는 상속은 특정 클래스가 가지는 일부 속성과 기능을 다른 새로운 클래스에게 제공하기 위해 맺는 클래스들간의 관계를 말합니다.
	• super클래스를 새로운 sub클래스에서 extends라는 예약어를 사용하여 서로 관계를 맺은 상태를 의미합니다. 

class [sub클래스명] extends [super클래스명] {
   …;
} 



클래스 상속의 중요성
	• 클래스 상속은 객체의 재사용이라는 장점뿐만 아니라 코드의 간결성을 제공해 주는 객체지향적 언어의 장점과 특징으로 중요합니다. 
	• 잘 정의된 super클래스가 있다면 sub클래스의 작성이 간편해지고 
	그러므로 해서 개발 시간이 단축되는 것들이 상속의 중요성과 장점이라고 할 수 있습니다 


//-------------------------------------------

[상속관계 용어 정리 (동일 용어)]
상속을하기 위해 준비된 특정 클래스, 물려 주는 클래스, 상속을 해주는 쪽:
• Base Class(기본 클래스, 기초클래스, 기반클래스)
• Super Class(상위클래스, 슈퍼 클래스)				
• Parent Class(부모 클래스)


특정 클래스로부터 상속을 받아 새롭게 정의되는 클래스, 물려 받는 클래스, 상속을 받는 쪽:						
• Derivation Class(유도 클래스, 파생클래스)
• Sub Class(하위 클래스)
• Child Class(자식 클래스)


상속도식도
http://codedragon.tistory.com/4620


//-----------------------------------------
//TODO 1:상속후 상위클래스의 멤버변수와 서브클래스의 지역변수 출력 
//TODO 2: 상위클래스의 a값 변경한 후 확인
//-----------------------------------------
*/
package com.ext1;

//부모 클래스, 상위 클래스, 기초 클래스
//class Parent extends Object{}	//extends Object는 생략
class Parent{
	int a = 100;
}

//상속 관계 맺기
//상속은 특정 클래스가 가지는 일부 속성과 기능을 다른 새로운 클래스에 제공하기 위해 맺는 클래스들간의 관계
//extends라는 예약어를 사용하여 서로 관계를 맺은 상태
//class [sub클래스명] extends [super클래스명] {}
//자식 클래스, 하위 클래스, 유도 클래스
class Child extends Parent{
	//int a = 100; //물려받은 속성
	int b = 200;

	//TODO 2: 상위클래스의 a값 변경한 후 다시 결과 확인
//	int a = 300;
}

public class Exten01 {
	public static void main(String[] args){		
		
		Child ch = new Child();
		
		//서브클래스의 멤버변수 출력
		System.out.println(ch.b);
		
		//상위클래스의 멤버변수 출력
		//Parent클래스를 상속했기 때문에 a 호출가능
		System.out.println(ch.a);
	}
}


//출력결과
/*//TODO 1: 상속후 상위클래스의 멤버변수와 서브클래스의 지역변수 출력 
200
100
*/

/*//TODO 2: 상위클래스의 a값 변경한 후 다시 결과 확인
200
300
*/