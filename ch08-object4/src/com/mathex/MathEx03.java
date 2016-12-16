//소수점 자릿수 지정
//소수 둘째자리에서 반올림하기
//소수 셋째자리에서 반올림하기

/*
#	숫자표시
	0일 경우 숫자를 표시하지 않음
	
0	숫자표시
	0은 0일 경우에도 숫자를 표시

*/
package com.mathex;

public class MathEx03 {

	public static void main(String[] args) {
		
		double a = 100.123456;
		
		double d = Math.round(a);
		System.out.println(d);
		//100.0
		
		//TODO : 소수 둘째자리에서 반올림하기
		double b = Math.round(a*100d)/100d;
				
		System.out.println(b);	//100.12
		
		
		//TODO : 소수 셋째자리에서 반올림하기
		double c = Math.round(a*1000d)/1000d;
		
		System.out.println(c);	//100.123
	}

}
