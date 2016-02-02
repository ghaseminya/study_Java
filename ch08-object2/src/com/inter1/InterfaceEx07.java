/*
//인터페이스 - 인터페이스의 상수 응용

//요일(曜日)에 의미를 부여 및 동음(同音)의 동사형 한자를 그날의 행동강령으로 요일에 의미 부여하여 예제 구성
// 요(曜)는 ‘빛나다’라는 뜻. 오늘도 빛나는 하루 되세요
月요일: 달처럼 차분하게. 한계를 극복하는 날=越(넘을 월) 
火요일: 불처럼 열정적으로. 사람들과 화합하는 날=和(화할 화) 
水요일: 물처럼 자연스럽게. 마음을 수양하는 날=修(닦을 수) 
木요일: 나무처럼 생명력 넘치게. 몸을 깨끗이 하는 날=沐(씻을 목) 
金요일: 쇠처럼 튼튼하게. 나쁜 습관과 이별하는 날=禁(금할 금) 
土요일: 흙처럼 부드럽게. 몰입해서 공부하는 날=討(연구할 토) 
日요일: 해처럼 찬란하게. 안식하는 날=逸(편안할 일)

//---------------------------------------
//클래스의 상수
public class Week{
	public static final int MON=1;
	public static final int TUE=2, 
	public static final int WED=3,
	public static final int THU=4,
	public static final int FRI=5,
	public static final int SAT=6,
	public static final int SUN=7
}

//인터페이스의 상수
interface Week{
   int MON=1, TUE=2, WED=3, 
   THU=4, FRI=5, SAT=6, SUN=7;
}
*/

package com.inter1;

import java.util.Scanner;

interface Week{
	//인터페이스 상수 정의
	int MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6, SUN=7;
}

public class InterfaceEx07 {

	public static void main(String[] args)
	{
		System.out.println("좋아하는 요일의 숫자를 선택하세요... ");
		System.out.println("1.월요일, 2.화요일, 3.수요일");
		System.out.println("4.목요일, 5.금요일, 6.토요일, 7.일요일");
		System.out.print("당신의 선택은 > ");

		Scanner scanner=new Scanner(System.in);
		int select=scanner.nextInt();

		switch(select)
		{
		case Week.MON:
			System.out.println("달처럼 차분하게. 한계를 극복하는 날.");
			break;
		case Week.TUE:
			System.out.println("불처럼 열정적으로. 사람들과 화합하는 날");
			break;
		case Week.WED:
			System.out.println("물처럼 자연스럽게. 마음을 수양하는 날");
			break;
		case Week.THU:
			System.out.println("나무처럼 생명력 넘치게. 몸을 깨끗이 하는 날");
			break;
		case Week.FRI:
			System.out.println("쇠처럼 튼튼하게. 나쁜 습관과 이별하는 날");
			break;
		case Week.SAT:
			System.out.println("흙처럼 부드럽게. 몰입해서 공부하는 날");
			break;
		case Week.SUN:
			System.out.println("해처럼 찬란하게. 안식하는 날");
		default:
			System.out.println("오늘도 활기차고 빛나는 하루 되세요!");
		}

		scanner.close();
	}
}
