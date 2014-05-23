/* 예외처리 - throws
 * 
 * 관련 클래스 import
 * ERROR: Unhandled exception type IOException	//반드시 예외처리해야 됨을 컴파일러가 알려줌(붉은 밑줄)
 * throws문 삽입 -> main에서 try~catch문 삽입
 * 객체 생성 
 * try~catch문에서 객체를 통해 예외처리 
 * dan 정상 출력
 * 문자입력으로 예외처리 발생
 * 
 * throws 예외처리시 이점:
 * 메소드마다 try~catch할 필요없어 유용  
 */

package com.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionEx04 {
	
	//같은 클래스 내에서만 호출가능 메소든
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
		
		ExceptionEx04 ex = new ExceptionEx04();
		
		// throws정의한 메소드에서 예외발생가능문에 예외처리 
		try{
			ex.printData();
			
		}catch(Exception e){
			System.out.println("오류가 발생했습니다.");
		}	
	}
}