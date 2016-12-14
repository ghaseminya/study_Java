/*
//Date 확인
	• deprecated된 toLocaleString() 메소드 호출 후 SimpleDateFormat통한 대체 코드 작성
	• SimpleDateFormat클래스 사용을 위한 import
	• SimpleDateFormat 객체를 통해 today출력


//--------------------
java.util.Date 클래스
	• 년월일 시분초를 한꺼번에 출력할 때 사용
	• 년월일 시분초를 따로 구할 경우에는 Calendar클래스를 사용
	• Deprecated된 것은 대체된 것을 사용합니다. 대체할 수 있는 것이 명시되지 않은 경우 찾아서 사용해야 합니다.



//--------------------
deprecated  메소드 사용
	• IDE사용하는 경우 deprecated 된 메소드 사용시 deprecated된 것임을 컴파일러가 알려줍니다.
	• deprecated 된 메소드는 현재 사용해도 상관없지만 앞으로 버전업되면서 사라질 수 있으니 사용하지 않는게 좋습니다.
	• 써도 에러가 나지 않지만  어쩔수 없는 경우를 제외하고는 deprecated된 메소드는 가급적 사용하지 않는 것이 좋습니다.
	• API 문서에서 Deprecated 로 표시된 부분은 호환성 위해 존재하게 됩니다.
	• 향후 제외될 수 도 있으로 사용하지 마시기 바랍니다. 
	• 버전업 중 여러가지 이유로 인해 다른 함수로 대체가 되었으므로 해당 함수를 찾아 사용하시기 바랍니다.

*/
package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		
		//Date클래스는 년월일 시분초를 한꺼번에 출력할 때 사용
		//년월일 시분초를 따로 구할 경우에는 Calendar클래스를 사용
		Date now = new Date();
		System.out.println(now); //Sun Aug 16 10:39:41 KST 2015
		
		//TODO : deprecated 된 메소드
		//deprecated된 toLocaleString()호출: Locale 변환을 사용하여 string으로 Date object를 변환하는 함수
		//Date클래스대신 기능이 업데이트된 Calendar클래스를 사용하시기 바랍니다.
		//아래 두 메소드는 DateFormat.format(Date date)사용하는 것으로 변경이 되어 졌습니다.
		System.out.println(now.toLocaleString()); //(deprecated) 2015. 8. 16 오전 10:39:41
		System.out.println(now.toGMTString()); // (deprecated) 영미권 

		
		//TODO : toLocaleString(), toGMTString() 위의 deprecated된 메소드 대체 코드
		//MM은 무조건 대문자(월)
		//mm은 무조건 소문자(분)
		//출력 포멧 설정후 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh:mm:ss");
		String today = sdf.format(now);
		System.out.println(today); //2015년 08월 16일 일요일 오전 10:39:41
	}
}
