/*
예외 처리하지 않은 경우
	• main() 메소드의 인자를 받아서 콘솔에 출력
	• 인자를 넣지 않은 경우와 잘못된 인자를 넣은 경우에도 프로그램이 비정상으로 종료됩니다.



프로그램 코드는 정상이기 때문에 컴파일 정상적으로 수행됩니다. 
하지만, 실행 중에 인자를 입력하지 않거나  정수값으로 변환될 수 없는 인자를 입력
하였다면 오류가 발생되게 됩니다. 

ERROR발생
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0


ArrayIndexOutOfBoundsException
배열에 이상이 있을 때 발생되는 예외
배열이 제대로 처리되지 않을 경우 발생되는 예외로써인자가 넘어오지 않았기 때문에 배열을 생성시킬 수 없으며
이로 인해 예외가 발생되었습니다.

Exception in thread "main" java.lang.NumberFormatException: For input string: "code" at
 
NumberFormatException
데이터의 형 변환에 문제가 있을 경우 발생되며, 넘어온 인자가 정수형으로 변환 될수 없는 값이므로 예외가 발생이 됩니다.

해결코드
ExceptionEx10.java에서 예외처리 수행

*/
package com.basic;

public class ExceptionEx09 {
	public static void main(String[] args){
		//main() 메소드의 첫번째 인자를 받아서 정수형으로 변환
		int num = Integer.parseInt(args[0]);
		//변환된 수 출력
		System.out.println("인자값은 : " + num);
	}
}
