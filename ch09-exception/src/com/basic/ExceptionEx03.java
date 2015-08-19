//다중 예외 처리
//실행시 main에서 데이터 담아 처리하기
//-----------------------------------
//DOS에서 인자값 받아 프로그램 실행되는 것을 이클립스로 수행
//(C:\>java ExceptionEx03 일 이 삼 사 오)

//문자열(십)을 숫자형으로 넘기기
//정상 출력확인하기
//인자없이 프로그램 넘기기
//3개의 예외이외 예외를 하나로 처리하기
//-----------------------------------
//2를 입력값으로 받은 경우 출력결과 확인
//입력한 데이터가 없는 경우 출력결과 확인
//0을 입력값으로 받은 경우 출력결과 확인
//a를 입력값으로 받은 경우 출력결과 확인


package com.basic;

public class ExceptionEx03 {

	public static void main(String[] args) {
		
		int var = 10;
		//int var = 50;
		
		try{
			//예외가 발생할 가능성이 있는 코드								
			int data = Integer.parseInt(args[0]);	//String -> int
			System.out.println(var/data);
		}catch(NumberFormatException e){			
			System.out.println("숫자가 아닙니다.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("입력한 데이터가 없습니다.");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다");
		}catch(Exception e){
			System.out.println("나머지 예외 발생!!");
		}
		System.out.println("프로그램 종료!!");
		
		//이클립스에서 프로그램 실행시 인자전달받아서 처리하기
		for (int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
	}
}
