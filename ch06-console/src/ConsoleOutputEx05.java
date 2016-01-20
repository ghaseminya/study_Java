/*
//%서식문자 확인

//%c, 10진수/8진수/16진수, %g, e표기법
//System.out.printf vs System.out.println 차이 확인
//-System.out.println	: 출력후 다음행으로 이동
//-System.out.printf	: 출력후 다음행으로 이동 안함, 서식문자 사용


[서식 문자]
http://codedragon.tistory.com/2536

*/
public class ConsoleOutputEx05 {

	public static void main(String[] args){

		//문자
	    System.out.printf("%c", 'A'); System.out.println("");	//A
	    System.out.printf("%7c", 'A'); System.out.println("");	//[      A]
	    System.out.printf("%-7c", 'A'); System.out.println("");	//[A      ]
	    
	    //10진수
	    System.out.printf("%d", 1234567); System.out.println("");	//1234567
	    //8진수
	    System.out.printf("%o", 1234567); System.out.println("");	//4553207
	    //16진수
	    System.out.printf("%x", 1234567); System.out.println("");	//12d687
	    System.out.printf("%10d", 1234567); System.out.println("");	//[   1234567]
	    System.out.printf("%f", 123.456789f); System.out.println("");	//123.456787
	    
		 //추가확인 후 코드 추가
//	    System.out.printf("%g", 123.456789f); System.out.println("");	//123.457
//	    System.out.printf("%g", 123.456789123456789); System.out.println("");	//123.457
	    
	    //e 표기법 에 의한 실수
	    System.out.printf("%e", 123.456789f); System.out.println("");	//1.234568e+02
	    System.out.printf("%-10.2f", 123.456789f); System.out.println("");	//[123.46    ]이 전체가 10자리, 소수점 포함
	    System.out.printf("%010.2f", 123.456789f); System.out.println("");	//[0000123.46]
	    System.out.println();
	    }
}
