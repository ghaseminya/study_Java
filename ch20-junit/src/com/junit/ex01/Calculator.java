package com.junit.ex01;
/*

Step by Step
	• TODO 1: Test Case 작성하기
	• TODO 2: 테스트하고자 하는 메소드의 내용 구현하기
	• TODO 3: Test Suite 작성하기

*/
public class Calculator {

	//두수의 더하기 연산을 수행
	public static double sum(double num1, double num2){
		return num1 + num2;
	}
	
	//두수의 빼기 연산을 수행
	public static double substract(double num1, double num2){
		return num1 - num2;
	}
	
	//두수의 곱하기 연산을 수행
	public static double multiply(double num1, double num2){
		return num1 * num2;
	}
	
	//두수의 나누기 연산을 수행
	public static double divide(double num1, double num2){
		return num1 / num2;
	}
	
	//지정된 숫자를 올림 하는 연산을 수행
	public static double ceil(double num1){
		//올림
		return Math.ceil(num1);
	}
	
	//지정된 숫자보다 작거나 같은 가장 작은 정수를 double형태로 반환하는 연산을 수행
	public static double floor(double num1){
		//내림
		return Math.floor(num1);
	}
	
	//지정된 숫자의 절대값을 계산하고 반환하는 연산을 수행
	public static double abs(double num1){
		//절대값
		return Math.abs(num1);
	}
}
