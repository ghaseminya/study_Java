/*
BigDecimal클래스

강의 내용
	• double으로 생성자 호출시 오차발생 결과확인
	• double형을 문자열로 생성자 호출시 오차없는 결과 확인


*/
package com.mathex;

import java.math.BigDecimal;

public class BigDecimalEx01 {

	public static void main(String[] args) {
		
		//double으로 생성자 호출시 오차발생 결과확인
		//실수 2,7과 0.1을 숫자로 표현하는 순간(컴퓨터에서 표현하는 순간)오차가 발생합니다.
		BigDecimal bd1=new BigDecimal(2.7);
		BigDecimal bd2=new BigDecimal(0.1);
		
		//double형을 문자열로 생성자 호출시 오차없는 결과 확인
//		BigDecimal bd1=new BigDecimal("2.7");
//		BigDecimal bd2=new BigDecimal("0.1");
		System.out.println("두 실수의 덧셈결과: "+ bd1.add(bd2));
		System.out.println("두 실수의 곱셈결과: "+ bd1.multiply(bd2));
	}

}
