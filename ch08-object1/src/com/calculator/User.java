/*
//외부 제공 클래스 정의하기
//파일당 하나의 외부 제공 클래스 정의하기

//File Info (계산기 객체 분석)
//com.calculator	User.java			main부, 사용자 사용 클래스
//com.calculator	Calculator.java		외부에 노출된 클래스, public으로 클래스 정의
//com.calculator	Adder.java			외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Multiplier.java		외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Divider.java		외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근
//com.calculator	Substractor.java	외부에 노출되지 않는 클래스, Calculator클래스를 통해서만 접근

• 외부에서는 Calculaor 클래스의 존재만 알면 되고
• Adder, Multiplier, Divider, Substractor 클래스의 존재는 알 필요 없습니다.
• 그리고 이렇게 외부에 노출시킬 클래스를 public으로 선언합니다.
• 계산기 기능의 완성도를 높이기 위해서 
• Calculator 클래스 이외에 Adder, Multiplier, Divider, Substractor클래스를 별도로 구분하면 이점이 있습니다. (모듈화)


클래스를 나누면 이점
	• 객체지향에서는 아주 큰 하나의 클래스보다, 아주 작은 열 개의 클래스가 더 큰 힘과 위력을 발휘합니다.
	• 변경이 있을 때, 변경되는 클래스의 범위를 줄일 수 있습니다.
	• 작은 크기의 클래스를 다른 클래스의 정의에 활용할 수 있습니다.
*/

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
