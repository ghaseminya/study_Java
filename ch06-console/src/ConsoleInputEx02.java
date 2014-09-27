/*
키보드를 대상으로 Scanner의 인스턴스를 생성

Scaneer 클래스를 이용하면, 
데이터를 읽어 들일 입력의 대상에 상관없이 동일한 방식으로 데이터를 읽어 들일 수 있습니다

*/
import java.util.Scanner;


public class ConsoleInputEx02 {
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		//System.in	:키보드 리소스를 의미
		
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
