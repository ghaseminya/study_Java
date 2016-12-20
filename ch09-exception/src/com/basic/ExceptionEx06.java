package com.basic;
/*
//예외처리 - finally 

//학습목표
//	• 예외 발생하지 않은 경우 결과확인
//	• 예외 발생한 경우 결과확인
//------------------------------

finally의 필요성:
	• 무조건, 항상 실행되는 것이 아니라, 
	finally와 연결되어 있는 try 블록으로 일단 진입을 하면, 무조건 실행되는 영역이 바로 finally 블록입니다.
	• try문의 중간에 return 문을 실행하더라도 finally 블록이 실행된 다음에 메소드를 빠져 나가게 됩니다.
	• 정리하면 예외가 발생하든 발행하지 않든 무조건 수행하는 부분이 바로 finally영역입니다.
	• finally는 Database처리나 File처리를 할때 꼭 필요한 부분입니다. 
	이유는 Database를 열거나 또는 File을 열었다면 꼭 닫아주고 난 후 프로그램이 종료되어야 하는 데 이 부분을 finally에서 수행해 주기 때문입니다.



finally 구성 형식:
finally절은 try~catch문과 함께 선언해야 해야 하며 try~catch문의 제일 마지막에 위치합니다.

try{
    // 예외 발생 가능한 문장들;
} catch(예상되는_예외객체1 변수명){
    // 해당 예외가 발생했을 때 수행할 문장들;
} catch(예상되는_예외객체2 변수명){
    // 해당 예외가 발생했을 때 수행할 문장들;
}
finally{
    // 예외발생 여부와 상관없이 수행할 문장들;
} 
 


finally안에서의 예외:
	• finally블럭안에서 예외가 발생하면 이를 예외처리해주는 코드가 없으므로 처리되지 않은 예외가 발생하게 됩니다. 
	그러므로 예외가 발생하지 않도록 코드를 작성하거나 
	• 예외가 일어날 가능성이 여전히 존재할 경우 finally블럭안에 다시 한번 더 try~catch구문을 사용할 수 있습니다.



finally블럭:
	• finally블럭은 예외가 발생하건 발생하지 않건간에 항상 수행되어져야 할 코드를 명시
	• 객체의 소멸은 프로그래머가 컨트롤 할 수 없지만
	• finally블럭에서 IO와 DB등을 사용한 후 관계를 끊는 용도로 사용합니다.(자원 닫기, 자원해제)

*/

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