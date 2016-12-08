package com.breakpoint.ex01;
/*
테스트 코드 작성 후 디버거 사용법 익히기

Eclipse 디버거 사용법 (All that Debug)
	• 이클립스 디버거 모드
	• 디버깅 모드로 프로그램 시작하기
	• 브레이크 포인트 설정/해제
	• Breakpoints View 오픈하기
	• Debug View 오픈하기
	• 스텝 단위 진행(Step-by-Step)
	• 변수 뷰(Variables View)
	• Expression View
	• Display View
	• Conditional Break Point (Breakpoint Properties…)
	• 디버그 모드로 프로그램 다시 시작하는 방법


*/
public class Lab {

	public static void main(String[] args) {
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			total += i; // total = total + i;
			System.out.println("1부터 " + i + " 까지의 합은 " + total + " 입니다");
		}
	}

}
