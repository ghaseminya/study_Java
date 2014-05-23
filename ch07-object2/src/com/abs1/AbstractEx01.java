/* 추상 클래스*/

package com.abs1;

//추상 클래스
//단독으로 객체생성이 불가능하고 상속되어져서 사용되어져야 함
//추상 클래스는 추상메서드가 없는 경우도 있지만 일반적으로 추상메소드를 한개 이상 갖고 있음
abstract class A{

	int a=100;
	
	//추상 메소드:
	public abstract void number();	//미구현된 메세지
									//반드시 자식 클래스에서 일반 메소드로 구현해 줘야 합니다.
	
	//일반 메소드
	public void setA(int a){this.a = a;};
	
}
class B extends A{
	int b = 200;
	
	//추상 메소드 -> 일반 메소드로 구현
	//A클래스의 추상 메서드 number()를 일반메소드 number()로 구현
	@Override
	public void number(){
		System.out.println("number 메서드");
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {

		//추상 클래스는 객체 생성 불가능
		//부모 클래스 역할 만 합니다.
		//A a1 = new A(); //ERROR: Cannot instantiate the type A
		
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.number();
		
		
	}
}
