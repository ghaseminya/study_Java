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

//계산기 클래스
//외부에 노출시킬 클래스는 public으로 선언
public class Calculator {

	private Adder adder;
	private  Multiplier multiplier;
	private  Divider divider;
	private  Substractor substractor;
	
	public Calculator( ){
		adder = new Adder();
		multiplier = new Multiplier();
		divider = new Divider();
		substractor = new Substractor();
	}
	
	public int add(int num1, int num2){
		return adder.add(num1, num2);
	}
	int times(int num1, int num2){
		return multiplier.times(num1, num2);
	}
	int divide(int num1, int num2){
		return divider.divide(num1, num2);
	}
	int subtract(int num1, int num2){
		return substractor.subtract(num1, num2);
	}
}
