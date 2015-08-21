// 상속 - 멤버변수 
 
//1)상속후 상위클래스의 멤버변수와 서브클래스의 지역변수 출력 
//2)상위클래스의 a값 변경한 후 확인

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
	
	int b = 200;

	//2)상위클래스의 a값 변경한 후 다시 결과 확인
//	int a = 300;
}

public class Exten01 {
	public static void main(String[] args){		
		
		Child ch = new Child();
		
		//서브클래스의 멤버변수 출력
		System.out.println(ch.b);
		
		//상위클랫의 멤버변수 출력
		//Parent클래스를 상속했기 때문에 a 호출가능
		System.out.println(ch.a);
	}
}


/*//1)상속후 상위클래스의 멤버변수와 서브클래스의 지역변수 출력 
200
100
*/

/*//2)상위클래스의 a값 변경한 후 다시 결과 확인
200
300
*/