//예외처리 - finally 

//학습목표
//	• 예외 발생하지 않은 경우 결과확인
//	• 예외 발생한 경우 결과확인
//------------------------------
//finally블럭:
//	• finally블럭은 예외가 발생하건 발생하지 않건간에 항상 수행되어져야 할 코드를 명시
//	• 객체의 소멸은 프로그래머가 컨트롤 할 수 없지만
//	•  finally블럭에서 IO와 DB등을 사용한 후 관계를 끊는 용도로 사용합니다.(자원 닫기, 자원해제)


package com.basic;

public class ExceptionEx06 {
	
	public static void main(String[] args) {
		// 예외가 발생하지 않은 경우
		System.out.println("예외가 발생하지 않은 경우: =======");
		System.out.println("프로그램 실행!");
		try{
			System.out.println("1");
			
		}catch(Exception e){
			System.out.println("예외처리");
		}finally{
			System.out.println("중요메시지");
		}
		System.out.println("프로그램 종료!");

		
		// 예외가 발생가 발생한 경우
		System.out.println("\n예외가 발생가 발생한 경우: =======");
		System.out.println("프로그램 실행!");
		try{
			System.out.println("1");
			System.out.println(50/0); //예외발생
			System.out.println("2");
			
		}catch(Exception e){
			System.out.println("예외처리"); //예외처리
		}finally{	//무조건 실행
			System.out.println("중요메시지");
		}
		System.out.println("프로그램 종료!");		
	}
}


/*//출력결과
예외가 발생하지 않은 경우: =======
프로그램 실행!
1
중요메시지
프로그램 종료!

예외가 발생가 발생한 경우: =======
프로그램 실행!
1
예외처리
중요메시지
프로그램 종료!
*/