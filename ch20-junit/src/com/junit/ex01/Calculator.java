package com.junit.ex01;

public class Calculator {

	//두수의 더하기 연산을 수행
	public static double sum(double num1, double num2){
		return num1 + num2;
	}
	
	public static double substract(double num1, double num2){
		return num1 - num2;
	}
	
	public static double multiply(double num1, double num2){
		return num1 * num2;
	}
	
	public static double divide(double num1, double num2){
		return num1 / num2;
	}
	
	public static double ceil(double num1){
		//올림
		return Math.ceil(num1);
	}
	
	public static double floor(double num1){
		//내림
		return Math.floor(num1);
	}
	
	public static double abs(double num1){
		//절대값
		return Math.abs(num1);
	}
}
