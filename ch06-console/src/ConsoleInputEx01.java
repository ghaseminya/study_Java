/*
//문자열을 입력대상으로 Scanner의 인스턴스를 생성

//--------------------

Scanner 클래스
	• Scanner 클래스는 단순히 키보드의 입력만을 목적으로 디자인된 클래스가 아니라
	• 다양한 리소스를 대상으로 입력을 받을 수 있도록 정의된 클래스입니다.
	java.util 패키지 안에 있는 클래스

*/


//import java.util.Scanner;

public class ConsoleInputEx01 {

	public static void main(String[] args) {

		String source="1 3 5 7 9";
		
		//문자열을 입력대상으로 Scanner의 인스턴스를 생성
//		Scanner scanner = new Scanner(source);
		java.util.Scanner scanner = new java.util.Scanner(source);
		
		//nextInt(): 입력값을 int형으로 가져온다
		int num1=scanner.nextInt();	
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		int num4=scanner.nextInt();
		int num5=scanner.nextInt();
		
		int sum=num1+num2+num3+num4+num5;
		
		System.out.printf(
			"문자열에 저장된 %d, %d, %d, %d, %d의 합은 %d 입니다\n", 
			num1, num2,num3, num4, num5, sum);
		
		//자원 해제, 자원 닫기
		scanner.close();
	}

}
