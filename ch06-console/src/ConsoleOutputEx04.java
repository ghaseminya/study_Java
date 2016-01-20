/*
//%서식문자 확인
//
//%g	출력의 대상에 따라서 %e또는 %f형태의 출력


[서식 문자]
http://codedragon.tistory.com/2536

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
