//달력 만들기
//탭으로 정렬하여 달력만들기
//File Info
//->package com.dateEx;	CalendarEx02.java	탭으로 정렬하여 달력만들기
//package com.dateEx;	CalendarEx03.java	스페이스로 문자열 정렬하여 달력 만들기


package com.dateEx;

import java.util.Calendar;

public class CalendarEx02 {

	public static void main(String[] args) {
		//숫자 입력받기 위해 Scanner의 인스턴스 생성
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//Calender객체 생성
		Calendar calendar = Calendar.getInstance();
		
		//희망 년, 월 입력받기
		System.out.println("희망 연도와 월을 입력하세요(ex 연도: 2020, 월: 2)");
		System.out.println("연도 > ");
		int year = input.nextInt();
		System.out.println("월 > ");
		int month = input.nextInt();
		
		//년, 월, 요일 표시		
		System.out.println("\n[" + year + "년" + month + "월]");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
				 
		//희망연, 월, 일 설정
		//Calendar MONTH는 0~11로 설정(1월이 0 12월이 11로 설정해야 합니다. 그래서 month-1로 처리)
		calendar.set(year, month-1, 1);
		
		//월의 마지막 날짜 구하기
		int lastofDate = calendar.getActualMaximum(Calendar.DATE);
		
		//Calendar.DAY_OF_WEEK: 요일- 1(일) ~ 7(토)
		//첫날의 요일
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println("week: " + week);
				
		//1일의 요일을 측정해서 해당 요일전까지 공백처리
		for(int i=1; i<week; i++){
			System.out.print("\t");				
		}
		
		//날짜 출력
		for(int i=1; i <= lastofDate; i++){
			System.out.print(i+"\t");
			//매주 줄바꿈하기
			if( week%7 ==0)
				System.out.println();
			week ++;
		}
		
		System.out.println("\n===================================================");
		
		input.close();
	}
}


/*//출력결과
희망 연도와 월을 입력하세요(ex 연도: 2020, 월: 2)
연도 > 
2020
월 > 
2

[2020년2월]
일	월	화	수	목	금	토
						1	
2	3	4	5	6	7	8	
9	10	11	12	13	14	15	
16	17	18	19	20	21	22	
23	24	25	26	27	28	29	

===================================================*/

