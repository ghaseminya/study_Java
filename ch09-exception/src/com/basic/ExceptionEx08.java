package com.basic;
/*
//다중 예외 처리
//실행시 main에서 데이터 담아 처리하기



다중 catch문
다중 catch문은 하나의 try문 내에 여러 개의 예외가 발생 가능할 경우 사용합니다.

try{
        // 예외 발생 가능한 문장들;
} catch(예상되는_예외객체1 변수명){
        // 해당 예외가 발생했을 때 수행할 문장들;
} catch(예상되는_예외객체2 변수명){
        // 해당 예외가 발생했을 때 수행할 문장들;
} catch(예상되는_예외객체3 변수명){
        // 해당 예외가 발생했을 때 수행할 문장들;
} 


다중 catch문의 주의 사항
	• 예외(Exception)에서 가장 상위(parent)에 있는 클래스는 Exception클래스입니다. 
	그러므로 가장 아래쪽에 정의 해야 합니다.
	• 왜냐하면 예외는 상위(parent)클래스가 모든 예외를 가지고 있으므로 
	가장 위에 정의를 하게 되면 모든 예외를 처리하게 되므로 두 번째 catch문부터는 절대로 비교 수행할 수 없게 됩니다. 


http://codedragon.tistory.com/4559
http://cfile25.uf.tistory.com/image/2552B9365838DB58071652


다중 catch문을 사용시 이점
다중 catch문을 사용하면 하나의 try 블록에 둘 이상의 catch 블록을 구성할 수 있기 때문에 
예외처리와 관련된 부분을 완전히 별도로 떼어 놓을 수 있는 장점이 있습니다.

//-----------------------------------
//DOS에서 인자값 받아 프로그램 실행되는 것을 이클립스로 수행
//(C:\>java ExceptionEx03 일 이 삼 사 오)

//-----------------------------------
//2를 입력값으로 받은 경우 출력결과 확인 (정상)
//입력한 데이터가 없는 경우 출력결과 확인 (예외발생)
//0을 입력값으로 받은 경우 출력결과 확인 (예외발생)
//a를 입력값으로 받은 경우 출력결과 확인 (예외발생)

*/

public class ExceptionEx08 {

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
		}catch(Exception e){ //3개의 예외이외 예외를 하나로 처리하기
			System.out.println("나머지 예외 발생!!");
		}
		System.out.println("프로그램 종료!!");
		
		//이클립스에서 프로그램 실행시 인자전달받아서 처리하기
		for (int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
	}
}
