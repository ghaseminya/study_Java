/* 달력 만들기
 * 
 * 탭으로 정렬하여 달력만들기
 */

package com.dateEx;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		// 숫자 입력받기 위해
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//Calender객체 생성
		Calendar cal = Calendar.getInstance();
		
		//희망 년, 월 입력받기
		System.out.println("희망 연도와 월을 입력하세요(ex 연도: 2020, 월: 2)");
		System.out.println("연도: ");
		int year = input.nextInt();
		System.out.println("월: ");
		int month = input.nextInt();
		
		//년, 월, 요일 표시		
		System.out.println("\n[" + year + "년" + month + "월]");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
				 
		//희망연, 월, 일 설정
		//Calendar MONTH는 0~11을 리턴함
		cal.set(year, month-1, 1);
		
		//월의 마지막 날짜 구하기
		int lastofDate = cal.getActualMaximum(Calendar.DATE);
		
		//Calendar.DAY_OF_WEEK: 요일 1(일) ~ 7(토)
		//첫날의 요일
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println("week: " + week);
				
		//1일의 요일을 측정해서 해당 요일전까지 공백처리
		for(int i=1; i<week; i++){
			System.out.print("\t");				
		}
		
		//매주 줄바꿈하기 위해
		for(int i=1; i <= lastofDate; i++){
			System.out.print(i+"\t");			
			if( week%7 ==0)
				System.out.println();
			week ++;
		}
		
		System.out.println("\n======================");
	}
}
