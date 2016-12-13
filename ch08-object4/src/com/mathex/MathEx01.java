/* //Math클래스 - 수학관련 메소드
Math  클래스
	• Math 클래스에는 수학관련 메소드가 static으로 정의되어 있어 바로 호출하여 사용하도록 해놓았습니다. (수학 관련해서는 호출후 처리만 하면 되기 때문)
	• 필요한 메소드는 API 문서를 통해 참조하시기 바랍니다.
	• 대부분의 메소드가 라디안 단위로 정의되어 있음은 기억하시기 바랍니다.

//-------------------------------
강의내용
	• 절대값 구하기
	• 올림
	• 절삭(버림)
	• 반올림
	• 최대값
	• 최소값

*/
package com.mathex;

public class MathEx01 {

	public static void main(String[] args) {
		// 절대값 구하기
		int i = Math.abs(-10);
		System.out.println(i); //10
		
		// 올림
		double d = Math.ceil(3.3);
		System.out.println(d); //4.0
		
		// 절삭(버림)
		d = Math.floor(3.7);
		System.out.println(d); //3.0

		// 반올림
		i = Math.round(4.7F);
		System.out.println(i); //5
		
		// 최대값
		i = Math.max(5, 9);
		System.out.println(i); //9
				
		// 최소값
		i = Math.min(6, 8);
		System.out.println(i); //6
	}
	
}
