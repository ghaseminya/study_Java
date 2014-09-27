/*
문자열을 대상으로 Scanner의 인스턴스를 생성

*/
import java.util.Scanner;


public class ConsoleInputEx01 {

	public static void main(String[] args) {

		String source="1 3 5 7 9";
		Scanner scanner=new Scanner(source);
		
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		int num4=scanner.nextInt();
		int num5=scanner.nextInt();
		int sum=num1+num2+num3+num4+num5;
		
		System.out.printf(
			"문자열에 저장된 %d, %d, %d, %d, %d의 합은 %d 입니다\n", 
			num1, num2,num3, num4, num5, sum);
		
		scanner.close();
	}

}
