package com.basic;
/*
//예외처리 - throws

//학습내용
//	• 관련 클래스 import
//	• throws문 삽입 -> main에서 try~catch문 삽입
//	• 객체 생성 
//	• try~catch문에서 객체를 통해 예외처리 
//	• dan 정상 출력
//	• 문자입력으로 예외처리 발생 출력결과 확인
//-----------------------------
throws예약어
	• try~catch 문으로 예외를 받는다는 것은 어디선가는 예외를 던진다는 것입니다.
	• 현재 메서드에서 예외처리를 하기가 조금 어려운 상태일 때 현재 영역을 호출해준 곳으로 발생한 예외 객체를 대신 처리해 달라며 양도 하는 것입니다. 


throws 사용법
	• Throws 예약어를 사용하여 발생한 예외객체의 양도는 어디까지나 양도이지 예외에 대한 처리가 아닙니다.
	• 양도를 받은 곳에서도 다시 양도가 가능하지만 언젠가는 try~catch문으로 예외처리를 해야 프로그램의 진행을 계속 유지 할 수 있습니다.
	• throws예약어 사용시 예외상황이 메소드 내에서 처리되지 않으면, 
	메소드를 호출한 영역으로 예외의 처리가 넘어가게 되고 결국  try~catch문으로 예외처리되는 문장을 수행하게됩니다.


throws 예약어를 통한 메서드 선언
[접근제한] [반환형] [메서드명](인자1, …인자n) throws 예외클래스1,…예외클래스n{}



[throws 예외처리시 이점]
	• 메소드마다 try~catch할 필요없어 편리합니다.
	• 예외를 강제로 발생시켜 사용자에게 왜 예외가 발생했는지 메시지를 전달 할 수 있습니다.

*/

//관련 클래스 import
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionEx04 {
	
	//같은 클래스 내에서만 호출가능 메소든
	//throws문 삽입 -> main()에서 try~catch문에 삽입
	private void printData() throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.print("단 입력> ");
		//String -> int 
		int dan = Integer.parseInt(br.readLine());
		
		System.out.println(dan + "단");
		System.out.println("=============================");
		for(int i=1; i<=9; i++){
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}

	public static void main(String[] args) {
		//객체 생성
		ExceptionEx04 ex = new ExceptionEx04();
		
		//ERROR -Unhandled exception type IOException
//		ex.printData(); //반드시 예외처리해야 됨을 컴파일러가 알려줍니다.(붉은 밑줄)
		
		// throws정의한 메소드에서 예외발생시 예외처리 
		try{
			ex.printData();
			
		}catch(Exception e){
			System.out.println("오류가 발생했습니다.");
		}	
	}
}


/*//예외가 발생한 경우 출력결과
단 입력> a
오류가 발생했습니다.
*/

/*//정상 출력결과
단 입력> 3
3단
=============================
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
*/