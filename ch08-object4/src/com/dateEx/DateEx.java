/* Date 확인
 * 
 * Date()
 * deprecated된 toLocaleString() 메소드 호출
 * 
 * SimpleDateFormat클래스 사용을 위한 import
 * SimpleDateFormat 객체를 통해 today출력
 */


package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		//Date클래스는 년월일 시분초를 한꺼번에 출력할 때 사용
		//년월일 시분초를 따로 구할 경우에는 Calendar클래스를 사용
		Date now = new Date();
		System.out.println(now);
		
		
		//deprecated된 toLocaleString()호출
		//deprecated된 것임을 컴파일러가 알려줌
		//써도 에러가 나지 않지만  어쩔수 없는 경우를 제외하고는 deprecated된 메소드는 가급적 사용하지 말것
		System.out.println(now.toLocaleString());

		//MM은 무조건 대문자(월)
		//mm은 무조건 소문자(분)
		//출력 포멧 설정후 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh:mm:ss");
		String today = sdf.format(now);
		System.out.println(today);	
	}
}
