/*
Math클래스 - 수학관련 메소드

강의 내용
	• 원주율
	• 2의 제곱근
	• 파이에 대한 Degree
	• 2파이에 대한 Degree
	• 싸인 43
	• 코싸인 43
	• 탄젠트 43
	• 로그 27
	• 2의 4승

*/
package com.mathex;

public class MathEx02 {
	
	public static void main(String[] args)
	{
		System.out.println("원주율: " + Math.PI);
		System.out.println("2의 제곱근: " + Math.sqrt(2));
		
		System.out.println(
				"파이에 대한 Degree: " + Math.toDegrees(Math.PI));
		System.out.println(
				"2파이에 대한 Degree: " + Math.toDegrees(2.0*Math.PI));	
		
		//각도는 라디안 단위로 변환
		double radian43=Math.toRadians(43);
		System.out.println("싸인 43: " + Math.sin(radian43));
		System.out.println("코싸인 43: " + Math.cos(radian43));
		System.out.println("탄젠트 43: " + Math.tan(radian43));
		
		System.out.println("로그 27: " + Math.log(27));
		System.out.println("2의 4승: "+ Math.pow(2, 4));
	}

}
