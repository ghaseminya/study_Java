/*
//추상 클래스


추상화(Abstract)
	• 추상화는 구체적인 개념으로부터 공통된 부분들만 추려내어 일반화 하는 것을 의미합니다.
	• 다시 말해서 일반화, 추상화 되었기 때문에 일반적으로 사용할 수 있는 단계가 아닌 아직 미완성(未完成)적인 개념적인 상태가 됩니다.
	• 자바의 추상화(abstract)작업을 수행하기 위해서는 먼저 추상 메서드를 이해해야 합니다. 



추상메소드 형식
	• 메서드 정의시 중괄호({ })를 생략하여 메서드가 하는 일(body) 없이 세미콜론(;)으로 문장이 끝 납니다. (빈 메서드 정의)
	• 그리고 abstract라는 예약어를 통해 현재 메서드가 추상 메서드임을 표시하고 있습니다. 

[접근제한] abstract void [메소드명]( );



추상클래스 형식
	• 추상 메서드를 하나라도 가지게 되는 클래스가 바로 추상 클래스
	• 하나이상 abstract 메소드를 포함하는 클래스는 abstract로 선언되어야하며, 인스턴스생성은 불가능합니다.
	• 인스턴스생성은 불가능 하나, 참조변수 선언은 가능하고, 오버라이딩의 원리 그대로 적용하여 추상메소드도 구현가능합니다.

[접근제한] abstract class [클래스명]{ }


*/

package com.abs1;

//추상 클래스
//단독으로 객체생성이 불가능하고 상속되어져서 사용되어져야 합니다.
//추상 클래스는 추상메서드가 없는 경우도 있지만 일반적으로 추상메소드를 한개 이상 갖고 있습니다.
abstract class A{

	int a=100;	//변수
	
	//추상 메소드:
	public abstract void number();	//미구현된 메소드
									//반드시 자식 클래스에서 일반 메소드로 구현해 줘야 합니다.
									//abstract라는 예약어를 통해 현재 메서드가 추상 메서드임을 표시
									//추상 메서드는 몸체(body, {})가 없이 세미콜론(;)으로 문장이 끝납니다.
	
	//일반 메소드
	public void setA(int a){
		this.a = a;
	}
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
//		A a1 = new A(); //ERROR: Cannot instantiate the type A
		
		B b1 = new B();
		System.out.println(b1.a); //100
		System.out.println(b1.b); //200
		b1.number(); //number 메서드
		
		b1.setA(500);
		System.out.println(b1.a); //500
		
	}
}


/*//출력결과
100
200
number 메서드
500
*/
