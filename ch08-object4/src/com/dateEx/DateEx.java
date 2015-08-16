//Date 확인

//Date()
//deprecated된 toLocaleString() 메소드 호출

//SimpleDateFormat클래스 사용을 위한 import
//SimpleDateFormat 객체를 통해 today출력



package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		//Date클래스는 년월일 시분초를 한꺼번에 출력할 때 사용
		//년월일 시분초를 따로 구할 경우에는 Calendar클래스를 사용
		Date now = new Date();
		System.out.println(now); //Sun Aug 16 10:39:41 KST 2015
		
		//deprecated된 toLocaleString()호출: Locale 변환을 사용하여 string으로 Date object를 변환하는 함수
		//deprecated된 것임을 컴파일러가 알려줌
		//써도 에러가 나지 않지만  어쩔수 없는 경우를 제외하고는 deprecated된 메소드는 가급적 사용하지 말것
		//Date클래스되신 기능이 업데이트된 Calendar클래스를 사용하시기 바랍니다.
		System.out.println(now.toLocaleString()); //2015. 8. 16 오전 10:39:41
//		System.out.println(now.toGMTString()); // 영미권 (deprecated)

		//MM은 무조건 대문자(월)
		//mm은 무조건 소문자(분)
		//출력 포멧 설정후 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh:mm:ss");
		String today = sdf.format(now);
		System.out.println(today); //2015년 08월 16일 일요일 오전 10:39:41
	}
}
