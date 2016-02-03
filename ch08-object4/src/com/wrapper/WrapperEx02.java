/*
//Auto boxing/unboxing
	• Auto Boxing과 Unboxing은 다양한 형태로 진행됩니다.
	• 특히 산술연산의 과정에서 자동으로 발생 한다점을 주목할 필요가 있습니다.

//1)기존 boxing/unboxing
//• int 객체 생성 하기 (boxing)
//• int 객체 생성 하기 (boxing)
//• unboxing 하기

//2) JDK5.0이상부터 Auto boxing/unboxing: boxing과 unboxing을 자동적으로 수행
//• Auto unboxing 하기
//• Auto boxing 하기
//• Auto boxing/unboxing 하기
//-------------------------------------
//Auto Boxing과 Auto Unboxing은 다양한 형태로 진행됩니다.
//특히 산술연산의 과정에서 자동으로 발생 한다점을 주목할 필요가 있습니다.



[Wrapper클래스의 Boxing & UnBoxing]
Boxing		• 기본자료형 -> 참조자료형
			• 기본 자료형 데이터를 Wrapper 인스턴스로 감싸는 것
			
UnBoxing	• 참조자료형 -> 기본자료형
			• Wrapper 인스턴스에 저장된 데이터를 꺼내는 것



[Wrapper클래스의 Auto Boxing & Auto UnBoxing]
Auto Boxing		• 기본 자료형 데이터가 자동으로 Wrapper 인스턴스로 감싸지는 것
				• 기본 자료형 데이터와 와야 하는데, Wrapper 인스턴스가 있다면, Auto Boxing 수행
				
Auto UnBoxing	• Wrapper 인스턴스에 저장된 데이터가 자동으로 꺼내지는 것
				• 인스턴스가 와야 하는데, 기본 자료형 데이터가 있다면, Auto Unboxing 수행 

*/
package com.wrapper;

public class WrapperEx02 {

	public static void main(String[] args) {
		
		System.out.println("기존 boxing/unboxing =========");
		// Integer 객체 생성, 명시적으로 new예약어를 통해 생성자 호출하여 Wrapper 클래스의 객체 생성 (boxing)
		Integer obj1 = new Integer(10);
		Integer obj2 = new Integer(20);
		
		//기본자료형에 넣기 위해 참조자료형 -> 기본자료형 (unboxing)
		int sum = obj1.intValue() + obj2.intValue();
		System.out.println("sum = " + sum); //sum = 30
		System.out.println();
		
		
		System.out.println("Auto boxing/unboxing =======");
		//Auto unboxing
		//인스턴스가 와야 하는데, 기본 자료형 데이터가 있다면, Auto Unboxing 수행 
		int result1 = obj1 * obj2;
		System.out.println("result1 = " + result1); //result1 = 200
		
		//Auto boxing
		//기본 자료형 데이터와 와야 하는데, Wrapper 인스턴스가 있다면, Auto Boxing 수행
		Integer obj3 = 15;
		Integer obj4 = 20;
		
		//Auto boxing/unboxing
		//산술연산의 과정에서 자동으로 이루어집니다. 
		//산술연산을 위해 unboxing이 일어난후 =연산자로 저장하기 위해 다시 boxing이 일어나고 출력을 위해 다시 unboxing이 일어납니다.)
		Integer result2 = obj3 + obj4;
		System.out.println("result2 = " + result2); //result2 = 35
	}
}


/*
기존 boxing/unboxing =========
sum = 30

Auto boxing/unboxing =======
result1 = 200
result2 = 35

*/