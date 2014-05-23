/* 예외처리 - 예외 강제 발생
 * 
 * 프로그램 실행시 문자열 배열을 받아서 
 * 전달하고 
 * 출력하는 프로그램 작성
 * 
 * 
 * 예외를 강제로 발생시켜 사용자에게 왜 예외가 발생했는지 안내하는 역할
 * 사용자가 잘못된 데이터를 입력하는 경우 주로 사용
 */


package com.basic;

public class ExceptionEx05 {
	// 예외를 강제로 발생시킴
	
	public void methodA(String[] n) throws Exception{
		if(n.length > 0){
			for(int i=0; i<n.length; i++){
				System.out.println("n[" + i + "]: " + n[i]);
			}			
		}else{
			//예외를 강제로 발생시킴, 사용자에게 왜 예외가 발생했는지 안내하는 역할
			throw new Exception("입력한 데이터가 없습니다");
			//이것을 에러시 출력하도록 함
			//System.out.println("입력한 데이터가 없습니다");
		}
	}
	
	public static void main(String[] args) {
		
		ExceptionEx05 ex = new ExceptionEx05();
		try{
			ex.methodA(args);
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
	}
}
