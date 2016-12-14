/*
//Calendar클래스 - Date관련 메소드

학습내용
	• import java.util.Calendar;
	• Calendar객체 출력
	• 년, 월, 일 출력
	• 요일 출력하기
	• 오전/오후 표시, 시분초 표시

//---------------------------
Calendar클래스
달력이나 시계 작성시 주로 사용


*/
package com.dateEx;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today); //객체 출력
		
		//TODO : 년, 월, 일 저장
		int year = today.get(Calendar.YEAR);
		
		
		int month = today.get(Calendar.MONTH);
//		int month = today.get(Calendar.MONTH)+1;
		
		int date = today.get(Calendar.DATE);
		
		
		
		//TODO : 년, 월, 일 출력
		System.out.println(year +"년" + month + "월"+ date + "일"); //2015년7월16일
		
		//Calendar MONTH는 0~11을 리턴합니다. 그래서 정상적인 월을 출력할려면 +1해줘야 합니다.
		month = month +1;
		System.out.println(year +"년" + month + "월"+ date + "일"); //2015년8월16일
		
		
		
		//TODO : 요일 출력하기
		//Calendar.DAY_OF_WEEK: 요일을 1(일) ~ 7(토)까지 숫자로 반환
		int day = today.get(Calendar.DAY_OF_WEEK);
		String nday = "";	//빈문자열 초기화		
		
		System.out.println(day); //1
		switch(day){
		case 1: nday = "일"; break;
		case 2: nday = "월"; break;
		case 3: nday = "화"; break;
		case 4: nday = "수"; break;
		case 5: nday = "목"; break;
		case 6: nday = "금"; break;
		case 7: nday = "토"; break;		
		}
		System.out.println(nday + "요일"); //일요일
		
		
		
		//TODO : 오전/오후 표시, 시분초 표시
							//오전:0, 오후:1
		int amPm = today.get(Calendar.AM_PM);
		String msg_amPm = (amPm == Calendar.AM) ? "오전" : "오후";
		int hour = today.get(Calendar.HOUR);	//시
		int min = today.get(Calendar.MINUTE);	//분
		int sec = today.get(Calendar.SECOND);	//초
		System.out.println(msg_amPm + " " + hour + "시" + min + "분" + sec + "초"); //오전 11시0분31초

	}
}


/*//출력결과
java.util.GregorianCalendar[time=1439690101003,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2015,MONTH=7,WEEK_OF_YEAR=34,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=228,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=55,SECOND=1,MILLISECOND=3,ZONE_OFFSET=32400000,DST_OFFSET=0]
2015년7월16일
2015년8월16일
1
일요일
오전 10시55분1초
*/