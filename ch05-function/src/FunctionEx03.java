//값을 반환하는 메소드
/*
학습내용
	• 값을 반환하는 메소드
	• 값을 반화하지 않는 메소드
  	• public void byExit(){} vs public static void byExit(){}


함수의 반환값
	• 함수값을 돌려줄 때는 return 문과 함께 사용합니다.
	• 함수가 돌려줄 값에 따라 함수 이름 앞에 데이터형을 붙입니다.
	• 둘려줄 값이 없으면 void 형으로 함수를 선언합니다.


return
	• 점프문의 한 종류
	• 현재 실행하고 있는 함수를 종료하고, 함수를 호출한 곳으로 돌아가는 제어문
	• 함수값을 돌려줄 때는 return 문 사용 (값의 반환)
	• 함수의 종료를 의미 (메소드 종료)
	• return 문은 필요시 메소드 중간에서 호출하여 해당 메소드를 종료시키고 프로그램의 흐름을 호출한 곳으로 돌려줄 수 있습니다.
	• 함수가 반환할 것이 아무것도 없는 경우(즉, 반환 형식이 void인 경우)에도 
	return 문만 사용 가능(return;)하며  이 경우 값 반환없이 메소드만 종료시킵니다.



void
	• void 란 '아무 형(타입)이 없는', '공허한', '텅빈'의 의미
	• 입력받는 혹은 반환할 아무런 값이 없다는 의미


*/

public class FunctionEx03 {
	
	public static void main(String[] args) {
		
		int result=plus(3, 7);
		System.out.println("3와 7의 합: " + result);
		System.out.println("3.5의 제곱: " + square(3.5));
	
//		byExit();	// ERROR - Cannot make a static reference to the non-static method byExit() from the type FunctionEx03
		
//		byExit();	//함수를 static으로 지정후 다시 호출하면 정상 출력
	}
	
	//함수의 형태 1 - 출력형태O 입력형태O
	//int형 데이터 반환 함수
	public static int plus(int num1, int num2){
		int plusResult=num1+num2;
		
		return plusResult;
	}
	
	//double형 데이터 반환 함수
	public static double square(double num)	{
		return num*num;
	}
	
	//값을 반환하지 않는 함수
	public void byExit(){
//	public static void byExit(){	//static으로 함수정의시 공유 개념이 생겨 객체 생성없이도 접근가능	
		System.out.println("프로그램 종료!");
	}
	
}
