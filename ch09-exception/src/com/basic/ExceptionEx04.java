//예외처리 - throws


//학습내용
//	• 관련 클래스 import
//	• throws문 삽입 -> main에서 try~catch문 삽입
//	• 객체 생성 
//	• try~catch문에서 객체를 통해 예외처리 
//	• dan 정상 출력
//	• 문자입력으로 예외처리 발생 출력결과 확인
//-----------------------------
//throws 예외처리시 이점:
//메소드마다 try~catch할 필요없어 유용  


package com.basic;

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