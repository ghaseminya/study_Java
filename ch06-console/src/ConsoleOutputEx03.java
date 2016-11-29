//printf()를 통한 실수 표현 출력
//서식문자	출력 형태

public class ConsoleOutputEx03 {
	
	public static void main(String[] args)
	{
		int num1=20;
		double num2=3.74;
		String str="홍길동";
		
		//%s	문자열 출력
		System.out.printf("문자열은 %s입니다. \n", str);	//문자열은 홍길동입니다.
	
		
		//%d	: 10진수 정수 형태의 출력
		//%e	: 실수를 e표기법으로 표현하라는 것	
		System.out.printf("숫자1는 %d이고, 숫자2는 %e입니다. \n", num1, num2); 
		//숫자1는 20이고, 숫자2는 3.740000e+00입니다. 

		//10진수, 8진수, 16진수
		System.out.printf("%d %o %x \n", 77, 77, 77);	//77 115 4d
		
		//%g	: 출력의 대상에 따라서 %e또는 %f형태의 출력
		System.out.printf("%g %g \n", 0.00014, 0.000014);	
		//0.000140000 1.40000e-05 
	}
}
