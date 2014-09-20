/*
값을 반환하는 메소드

학습내용
	• 값을 반환하는 메소드
	• 값을 반화하지 않는 메소드
*/
public class FunctionEx03 {

	
	public static void main(String[] args) {
		int result=plus(3, 7);
		System.out.println("3와 7의 합: " + result);
		System.out.println("3.5의 제곱: " + square(3.5));
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
		System.out.println("프로그램 종료!");
	}

}
