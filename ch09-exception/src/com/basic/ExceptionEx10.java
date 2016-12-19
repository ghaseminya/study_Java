package com.basic;
/*
ExceptionEx09 예외 처리하지 않은 코드를 try~catch~finally로 처리
인자를 넣지 않은 경우와 잘못된 인자를 넣은 경우에도 프로그램이 비정상 종료되지 않고 정상 처리됩니다.


File Info
ExceptionEx09	매개변수없이,  정수가 아닌 문자 입력 시 예외 발생
->ExceptionEx10	try~catch~finally로 예외처리


*/
public class ExceptionEx10 {

	public static void main(String[] args){
		
		try{
			//예외가 발생될 가능성이 있는 문장
			//main() 메소드의 첫번째 인자를 받아서 정수형으로 변환
			int num = Integer.parseInt(args[0]);
			//변환된 수 출력
			System.out.println("인자값은 : " + num);
			
		}catch(Exception e){
			System.out.println("매개변수가 잘못 입력되었습니다.");
		}finally{
			System.out.println("프로그램을 종료합니다.");
		}
	}
}

/*
//인자를 넣지 않거나 'a'문자를 입력한 경우 모두 예외처리되며 모두 .finally가 수행됩니다.
매개변수가 잘못 입력되었습니다.
프로그램을 종료합니다.

//인자로 정수 10을 입력한 경우 정상 출력됩니다.
인자값은 : 10
프로그램을 종료합니다.

*/
