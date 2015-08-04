
//값을 반환하는 메소드

//학습내용
//	• 값을 반환하는 메소드
//	• 값을 반화하지 않는 메소드

public class FunctionEx03 {

	
	public static void main(String[] args) {
		int result=plus(3, 7);
		System.out.println("3와 7의 합: " + result);
		System.out.println("3.5의 제곱: " + square(3.5));
	
//		byExit();	// ERROR - Cannot make a static reference to the non-static method byExit() from the type FunctionEx03
		
//		byExit();	//함수를 static으로 지정후 다시 호출하면 정상 출력
	}
	
	//int형 데이터 반환
	public static int plus(int num1, int num2)
	{
		int plusResult=num1+num2;
		
		return plusResult;
	}
	
	//double형 데이터 반환
	public static double square(double num)
	{
		return num*num;
	}
	
	//값을 반환하지 않음
	public void byExit(){
//	public static void byExit(){	//static으로 함수정의시 공유 개념이 생겨 객체 생성없이도 접근가능	
		System.out.println("프로그램 종료!");
	}
}
