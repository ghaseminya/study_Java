/* Calendar클래스 - Date관련 메소드
 * 
 * 달력이나 시계 작성시 주로 사용
 * 
 * import
 * Calendar 객체 생성
 * 객체 출력
 *  
 *  
 */



package com.dateEx;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		
		int year = today.get(Calendar.YEAR);		
		//int month = today.get(Calendar.MONTH)+1;
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		
		System.out.println(year +"년" + month + "월"+ date + "일");
		
		//Calendar MONTH는 0~11을 리턴함 그래서 정상적인 월을 출력할려면 +1해줘야 합니다.ㄴ	
		month = month +1;
		System.out.println(year +"년" + month + "월"+ date + "일");
		
		
		//요일 출력하기
		//Calendar.DAY_OF_WEEK: 요일 1(일) ~ 7(토)
		int day = today.get(Calendar.DAY_OF_WEEK);
		String nday = "";	//빈문자열 초기화		
		
		System.out.println(day);
		switch(day){
		case 1: nday = "일"; break;
		case 2: nday = "월"; break;
		case 3: nday = "화"; break;
		case 4: nday = "수"; break;
		case 5: nday = "목"; break;
		case 6: nday = "금"; break;
		case 7: nday = "토"; break;		
		}
		System.out.println(nday + "요일");
		
		//오전/오후 표시
								//오전:0, 오후:1
		int amPm = today.get(Calendar.AM_PM);
		String msg_amPm = (amPm == Calendar.AM) ? 
								"오전" : "오후";
		int hour = today.get(Calendar.HOUR);	//시
		int min = today.get(Calendar.MINUTE);	//분
		int sec = today.get(Calendar.SECOND);	//초
		System.out.println(msg_amPm + " " + hour + "시" + min + "분" + sec + "초");

	}
}
