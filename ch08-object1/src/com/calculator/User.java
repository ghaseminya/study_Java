
//외부 제공 클래스 정의하기
//
//File Info
//com.calculator	User.java			main부, 사용자 사용 클래스
//com.calculator	Calculator.java		외부에 노출된 클래스, public으로 클래스 정의
//com.calculator	Adder.java			외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Multiplier.java		외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Divider.java		외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Substractor.java	외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근

package com.calculator;

public class User {

	public static void main(String[] args){
		
		Calculator calcu = new Calculator();

		System.out.println(calcu.add(10, 7));
		System.out.println(calcu.divide(10, 7));
		System.out.println(calcu.subtract(10, 7));
		System.out.println(calcu.times(10, 7));
		
		
		//직접 객체를 만들어서 사용할 수있지만 공개된어 있는 것은 Calculator이므로 내부에 있는 
		//Adder, Multiplier, Divider, Substractor 클래스의 존재는 알수가 없습니다.
		System.out.println();System.out.println();
//		Adder ad = new Adder();
//		System.out.println(calcu.add(10, 7));
		
//		Divider dv = new Divider();
//		System.out.println(calcu.divide(10, 7));
	}
}
