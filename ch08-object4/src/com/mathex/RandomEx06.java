package com.mathex;

/*

int nextInt( )
• int형 난수 반환
• int의 전체범위에서 랜덤값을 추출
• -2,147,483,648 ~2,147,483,647


int nextInt(int n)
• 0이상 n미만의 범위 내에 있는 int형 난수 반환
• 0~n-1 까지의 범위에서 랜덤값을 추출



일정 범위에서 시작하는 랜덤한 수 추출하기
nextInt()에서 시작 범위를 변경하고 싶다면 그 수만큼 더해주면 됩니다.

*/

import java.util.Random;

public class RandomEx06 {

	public static void main(String[] args) {

		// Random() 객체 생성
		Random generator = new Random();        

		int num1;
		float num2;

		// nextInt() 인자를 지정하지 않은 경우
		// int 값의 범위에서 정수 랜덤값을 추출한다.
		// (-2,147,483,648 ~2,147,483,647)
		num1= generator.nextInt();         
		System.out.println("A random integer: "+num1);  

		// 0~9 사이의 정수 랜덤값을 추출한다.
		// 0~n-1 ( 1~(10-1) )
		num1= generator.nextInt(10);            
		System.out.println("from 0 to 9: " + num1);

		// 1~10 사이의 정수랜덤값을 추출한다.
		num1= generator.nextInt(10) + 1;        
		System.out.println("from 1 to 10 : " + num1);
		
		// 1~16 사이의 정수랜덤값을 추출한다.
		num1= generator.nextInt(16) + 1;        
		System.out.println("from 1 to 16 : " + num1);
		
		// 20~25 사이의 정수 랜덤값을 추출한다.
		// 0~5 (20~ 25)
		num1= generator.nextInt(6) + 20;      
		System.out.println("from 20 to 25: " + num1);

		// 20~34 사이의 정수 랜덤값을 추출한다.
		// 0~14 (20~ 34)
		num1= generator.nextInt(15) + 20;      
		System.out.println("from 20 to 34: " + num1);

		// -10 ~ 19 사이의 정수 랜덤값을 추출한다.
		// 0~29 (-10~ 19)
		num1= generator.nextInt(30) - 10;      
		System.out.println("from -10 to 19: " + num1);
		

		System.out.println();
		//실수형태의 난수 추출하기
		// 0.0(포함) ~ 1.0(포함안함) 사이의 난수를 추출한다.
		num2= generator.nextFloat();            
		System.out.println("A random float: " + num2);

		// 1~6 사이의 난수 추출하기
		// 0.0 ~ 5.9999999 사이의 난수를 추출한다.
		// 1~6 사이의 난수를 출력한다.
		num2 = generator.nextFloat()*6;
		// int로 형 변환(0~5) 후 1을 더한다.
		num1 = (int)num2 + 1;         
		System.out.println("from 1 to 6: " + num1);  
	}
}
/*
//== 6단 == 
//6X1 = 6	6X0.1 = 0.6
//6X2 = 12	6X0.2 = 1.2
//6X3 = 18	6X0.3 = 1.8
//6X4 = 24	6X0.4 = 2.4
//6X5 = 35	6X0.5 = 3.5
//6X6 = 36	6X0.6 = 3.6
//6X7 = 42	6X0.7 = 4.2
//6X8 = 48	6X0.8 = 4.8
//6X9 = 54	6X0.9 = 5.4

*/

/*
//출력결과
A random integer: 1987442777
from 0 to 9: 6
from 1 to 10 : 6
from 1 to 16 : 5
from 20 to 25: 20
from 20 to 34: 31
from -10 to 19: -2

A random float: 0.24905765
from 1 to 6: 2
*/

