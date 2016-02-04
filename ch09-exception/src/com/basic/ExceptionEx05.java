package com.basic;
/*
//예외처리 - 예외 강제 발생
//학습내용
//	• 프로그램 실행시 문자열 배열을 받아서 전달하고 
//	• 출력하는 프로그램 작성
//	• 이때 강제 예외를 발생시켜 왜 예외가 발생되었는지 알림
//-------------------------------------------

[throw 예외의 인위적인 발생]
개발자가 의도적으로 예외를 발생시킬 수 있으며 이 때 throw문을 사용해 인위적으로 예외를 발생시키게 됩니다.

throw new 예외클래스(전달인자); 


예외를 강제로 발생 활용:
	• 예외를 강제로 발생시켜 사용자에게 왜 예외가 발생했는지 안내하는 역할로 사용
	• 사용자가 잘못된 데이터를 입력하는 경우 주로 사용

*/

public class ExceptionEx05 {
	
	// 예외를 강제로 발생시킬 함수
	public void methodA(String[] n) throws Exception{
		if(n.length > 0){
			for(int i=0; i<n.length; i++){
				System.out.println("n[" + i + "]: " + n[i]);
			}			
		}else{
			//예외를 강제로 발생시킴, 예외 강제 발생시 사용자에게 왜 예외가 발생했는지 안내하는 역할
			throw new Exception("입력한 데이터가 없습니다");
			//이것을 에러시 출력하도록 함
			//System.out.println("입력한 데이터가 없습니다");
		}
	}
	
	public static void main(String[] args) {
		
		ExceptionEx05 ex = new ExceptionEx05();
		try{
			ex.methodA(args); //args 문자열 배열에는 프로그램 실행시 함께 입력한 매개변수(옵션)가 배열로 저장됩니다.
							  //현재 실행시 함께 입력한 매개변수가 없으므로 배열에 입력된 데이터가 없습니다.
							  //출력할 데이터가 없으므로 예외가 강제로 발생됩니다.
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
	}
}


/*//출력결과
입력한 데이터가 없습니다
*/
