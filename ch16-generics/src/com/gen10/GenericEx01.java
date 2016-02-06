package com.gen10;
/* 
제네릭의 제한(class)
	• extends 예약어로 제네릭으로 올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한할 수 있습니다.
	• extends를 통해 부모클래스가 무엇인지 지정하여 제네릭에 올수 있는 타입을 지정(제한)하게 됩니다.
	• extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있습니다.


[제네릭의 제한(class) 형식]
class Person<T extends Info>{ }
T가 Info를 상속(Info가 클래스인 경우) 또는 구현(Info가 인터페이스인 경우)하는 클래스의 자료형이 되어야 함을 명시하게 됩니다.


*/

//부모 클래스 (꼭 추상클래스일 필요는 없음)
abstract class Info{
	//추상 메소드
	public abstract int getInfo();
}

class EmployeeInfo extends Info{
	public int position;
	
	EmployeeInfo(int position){ 
		this.position = position;
	}

	//추상 메소드 구현
	@Override
	public int getInfo(){
		return this.position;
	}
}

//Person의 T는 Info 클래스나 그 자식 외에는 올 수 없습니다.
//extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있습니다.
//Info클래스의 자식클래스들 만이 T로 올수 있습니다.
class Person<T extends Info>{
	public T info;
	Person(T info){ this.info = info; }
}
public class GenericEx01 {
	public static void main(String[] args) {
		//TODO 1: 제네릭 타입을 생략한 형태 
		//Info의 자식인 타입을 지정
//		Person p1 = new Person(new EmployeeInfo(1));
		
		//TODO 2: 위의 코드(제네릭 타입을 생략)를  명시적으로 정의한 코드
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		
		System.out.println(p1.info.getInfo()); //10

		//TODO 3: Info의 자식이 아닌 타입을 지정
		//ERROR-Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Info> of the type Person<T>
//		Person<String> p2 = new Person<String>("사장");	//컴파일 에러
	}
}

