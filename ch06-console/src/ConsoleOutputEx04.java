/*
%서식문자 확인

서식문자	출력 형태
%d	10진수 정수 형태의 출력
%o	8진수 정수 형태의 출력
%x	16진수 정수 형태의 출력
%f	실수의 출력
%e	e표기법 기반의 실수 출력
%g	출력의 대상에 따라서 %e또는 %f형태의 출력
%s	문자열 출력
%c	문자 출력

*/
public class ConsoleOutputEx04 {

	public static void main(String[] args) {

		
		System.out.printf("%d",23);	System.out.println("");
		
		System.out.printf("%x %x", 23, 32); System.out.println("");

		System.out.printf("%o",23); System.out.println("");

		System.out.printf("%.2f",123.4567); System.out.println("");

		System.out.printf("%e", 987.1997); System.out.println("");

		System.out.printf("%c",'x'); System.out.println("");

		System.out.printf("%s","Hello"); System.out.println("");

		
	}

}
