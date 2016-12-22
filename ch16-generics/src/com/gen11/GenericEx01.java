package com.gen11;
/* 제네릭의 제한(interface)
제네릭의 extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있습니다.

*/

//인터페이스 정의
interface Info{
	public int getInfo();
}

//인터페이스 구현 클래스
class EmployeeInfo implements Info{
	public int position;

	EmployeeInfo(int position){ 
		this.position = position; 
	}

	public int getInfo(){
		return this.position;
	}
}

//제네릭에서 extends는 상속한다는 의미가 아니라 부모가 누구인지 명시하는 용도로 사용됩니다.
//T가 Info를 상속(Info가 클래스인 경우) 또는 구현(Info가 인터페이스인 경우)하는 클래스의 자료형이 되어야 함을 명시하게 됩니다.
class Person<T extends Info>{
	public T info;
	
	Person(T info){ 
		this.info = info; 
		info.getInfo();
	}
}

public class GenericEx01 {

	public static void main(String[] args) {
		//TODO 1: Info의 자식인 타입을 지정
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(p1.info.getInfo());

		//TODO 2: Info의 자식이 아닌 타입을 지정
		//ERROR-Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Info> of the type Person<T>
//		Person<String> p2 = new Person<String>("사장");	//컴파일 에러
	}
}
