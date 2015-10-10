//try ~ catch문에서의 주의 사항
//ExceptionEx02.java 변경하여 작성
//예외가 발생한 라인을 만나면서 예외처리를 위해 catch문으로 이동하게 되어 
//그 이후의 라인은 실행이 되지 않을 수 있습니다(주의사항)

package com.basic;

public class ExceptionEx08 {

	public static void main(String[] args) {

		int[] var = { 10, 20, 30 };

		try { // 예외가 발생할 가능성이 있는 코드 작성 영역
			System.out.println("var[" + 4 + "]: " + var[4]); // 예외발생

			System.out.println("Important Message !!!"); // 예외 발생시 수행되지 않는 문장
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외 발생시 대체할 수 있는 코드 명시하는 영역

			// 사용자가 정의한 에러문구 출력하기
			System.out.println("ERROR-없는 인덱스를 호출했습니다.");
		}
		System.out.println("프로그램 종료!!");
	}
}


/*
ERROR-없는 인덱스를 호출했습니다.
프로그램 종료!!
*/