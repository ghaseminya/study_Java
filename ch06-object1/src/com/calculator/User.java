
//외부 제공 클래스 정의하기
//
//File Info
//com.calculator	User.java		사용자 사용 클래스
//com.calculator	Calculator.java	외부에 노출된 클래스
//com.calculator	Adder.java		외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Multiplier.java	외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Divider.java	외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Substractor.java	외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근

package com.calculator;

public class User {

	public static void main(String[] args){
		
		Calculator calcu = new Calculator();

		System.out.println(calcu.add(10, 7));
		System.out.println(calcu.divide(10, 7));
		System.out.println(calcu.subtract(10, 7));
		System.out.println(calcu.times(10, 7));
	}
}
