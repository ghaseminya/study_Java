/* 달력 만들기
 * 
 * 스페이스로 문자열 정렬하여 달력 만들기
 */


package com.dateEx;

import java.util.Calendar;

public class CalendarEx3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		System.out.println("희망 연도와 월을 입력하세요(ex 연도: 2020, 월: 2)");
		System.out.println("연도: ");
		int year = input.nextInt();
		
		System.out.println("월: ");
		int month = input.nextInt();
		
		System.out.println("\n[" + year + "년" + month + "월]");
		System.out.println("  일  월  화  수  목  금  토");
		
		//Calendar MONTH는 0~11을 리턴함 
		//희망연, 월, 일 선택
		cal.set(year, month-1, 1);
		
		//월의 마지막 날짜
		int lastofDate = cal.getActualMaximum(Calendar.DATE);
		
		//Calendar.DAY_OF_WEEK: 요일 1(일) ~ 7(토)
		//첫날의 요일
		int week = cal.get(Calendar.DAY_OF_WEEK);
				
		//1일의 요일을 측정해서 해당 요일전까지 공백처리
		for(int i=1; i<week; i++){
			System.out.print("    ");				
		}
		
		for(int i=1; i <= lastofDate; i++){
			System.out.print( (i<10) ? "   "+i : "  "+i );			
			if( week%7 ==0)
				System.out.println();
			week ++;
		}		
		System.out.println("\n======================");

	}

}
