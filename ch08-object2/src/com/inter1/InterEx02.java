//인터페이스 - 추상 메소드 구체화

//인터페이스 정의 및 사용 단계
//인터페이스 정의
//class에 implements하고 인터페이스 추상 메소드 구체화
//class의 객체 생성
//객체를 통해 메소드 호출


//인터페이스의 특징
//	1) 상속구조를 통해서 둘 이상의 클래스의 상속의 관계를 형성하기 위한 클래스(다중상속 가능)
//	2) 인스턴스화 하기 위해 정의된 클래스 아님
//	3) 인터페이스 내에 선언된 변수는 무조건 public static final로 선언 (상수)
//	4) 인터페이스 내에 선언된 메소드는 무조건 public abstract로 선언	(추상 메소드)
//	5) 인터페이스도 참조변수 선언 가능하고, 
//	6) 메소드 오버라이딩 원칙 그대로 적용되며 인터페이스가 가지는 추상 메서드 모두 재정의해야 함

package com.inter1;

interface A2{
	//추상 메소드
	public abstract void getB();	//추상 메소드 선언 원형
	void getC();					//public abstract생략된 것임, 추상 메소드 선언
}

//A2인터페이스를 B2에 구현
class B2 implements A2{
	@Override
	public void getB(){
		System.out.println("getB 메소드");		
	}
	
	@Override
	public void getC(){
		System.out.println("getC 메소드");		
	}
}

public class InterEx02 {

	public static void main(String[] args) {
		B2 b2b2 = new B2();
		b2b2.getB();
		b2b2.getC();
	}
}
