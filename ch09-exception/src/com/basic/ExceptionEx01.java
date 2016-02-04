
package com.basic;
/*
//예외발생
//배열의 인덱스 범위를 넘어가서 예외발생
//-----------------------
ExceptionEx02


*/
public class ExceptionEx01 {

	public static void main(String[] args) {

		//			 0   1   2
		int[] var = {10, 20, 30};
		
		for(int i=0; i<=3; i++){
			System.out.println("var["+ i + "]: " + var[i]);
			//배열의 인덱스 범위를 넘어가서 예외발생 - ERROR
			/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
			at com.basic.ExceptionEx01.main(ExceptionEx01.java:11)*/
		}
		System.out.println("프로그램 끝!!");		
	}
}


/*//출력결과
var[0]: 10
var[1]: 20
var[2]: 30
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at com.basic.ExceptionEx01.main(ExceptionEx01.java:16)
*/
