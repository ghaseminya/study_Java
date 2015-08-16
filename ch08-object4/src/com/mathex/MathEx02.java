//Math클래스 - 수학관련 메소드

//강의 내용
//	• 원주율
//	• 2의 제곱근
//	• 파이에 대한 Degree
//	• 2파이에 대한 Degree
//	• 싸인 43
//	• 코싸인 43
//	• 탄젠트 43
//	• 로그 27
//	• 2의 4승


package com.mathex;

public class MathEx02 {
	
	public static void main(String[] args)
	{
		System.out.println("원주율: " + Math.PI); //원주율: 3.141592653589793
		System.out.println("2의 제곱근: " + Math.sqrt(2)); //2의 제곱근: 1.4142135623730951
		
		System.out.println(
				"파이에 대한 Degree: " + Math.toDegrees(Math.PI)); //파이에 대한 Degree: 180.0
		System.out.println(
				"2파이에 대한 Degree: " + Math.toDegrees(2.0*Math.PI)); //2파이에 대한 Degree: 360.0
		
		//각도는 라디안 단위로 반환됩니다.
		double radian43=Math.toRadians(43);
		System.out.println("싸인 43: " + Math.sin(radian43)); //싸인 43: 0.6819983600624985
		System.out.println("코싸인 43: " + Math.cos(radian43)); //코싸인 43: 0.7313537016191705
		System.out.println("탄젠트 43: " + Math.tan(radian43)); //탄젠트 43: 0.9325150861376618
		
		System.out.println("로그 27: " + Math.log(27)); //로그 27: 3.295836866004329
		System.out.println("2의 4승: "+ Math.pow(2, 4)); //2의 4승: 16.0
	}

}
