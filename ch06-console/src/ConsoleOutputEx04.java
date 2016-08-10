/*
//%서식문자 확인
//
//%g	출력의 대상에 따라서 %e또는 %f형태의 출력


[서식 문자]
http://codedragon.tistory.com/2536

서식문자  	출력 형태 
%d  	부호 있는 10진수 정수
  		byte, short, int, long형의 데이터를 10진수로 출력하는 서식
  		Decimal
%o 		부호 없는 8진수 정수 
  		8진수 출력 서식
%x 	 	부호 없는 16진수 정수
  		16진수 출력 서식
  		heXadecimal
%f 	 	부호 있는 10진수 실수
  		float, double 형의 데이터를 실수(근사, 지수)로 출력하는 서식
  		Float
%e  	e 표기법 에 의한 실수
%g  	소수점 이하 자리 수에 따라 %f, %e 둘 중 하나를 선택
%s  	문자열(String) 데이터를 출력하는 서식
%c  	한 개의 문자

*/
public class ConsoleOutputEx04 {

	public static void main(String[] args) {

		//%d: 10진수 정수 형태
		System.out.printf("%d",23);	System.out.println("");	//23
		
		//%x: 16진수 정수 형태의 출력
		System.out.printf("%x %x", 23, 32); System.out.println("");	//17 20

		//%o: 8진수 정수 형태의 출력
		System.out.printf("%o",23); System.out.println("");	//27
		
		//%f: 실수 형태
		//%.2f: 소수점 2째자리까지 표시
		System.out.printf("%.2f",123.4567); System.out.println("");	//123.46

		//%e: e표기법 실수 형태
		System.out.printf("%e", 987.1997); System.out.println("");	//9.871997e+02

		//%c: 하나의 문자
		System.out.printf("%c",'x'); System.out.println("");	//x

		//%s: 문자열
		System.out.printf("%s","Hello"); System.out.println("");	//Hello

		
	}

}
