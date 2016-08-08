/*
변수 자료형 확인
	• 논리형 리터럴
	• 문자형 리터럴
	• 정수형 리터럴
	• 실수형 리터럴
	
//--------------------
리터럴(literal)
	• 값
	• 자바언어가 처리하는 실제 데이터
	• 프로그램에서 사용되는 데이터

*/

public class VariableTypes01 {

	
	public static void main(String[] args){
		
		System.out.println("=========논리형 리터럴=========");
		boolean bool = true;	//true, false
		System.out.println("bool = " + bool);
		
		//boolean 타입외 데이터 저장시 Error가 발생합니다.
		//bool = 20;
		
		
		System.out.println("");
		System.out.println("=========문자형 리터럴=========");
		
//		문자형 크기: 2byte(2byte 표현범위: 0~65,535), 다국어 처리를 위한 유니코드(Unicode)방식
		char char_a1 = 'A';		//내부적으로 아스키코드 65로 인식
		System.out.println("char_a1 = " + char_a1); //A
		
		char char_a2 = 65;		// A에 해당되는 아스키코드 65를 직접 입력
		System.out.println("char_a2 = " + char_a2); //A
		
		char char_a3 = '\u0041';	//A를 유니코드로 표현
		System.out.println("char_a3 = " + char_a3); //A
				
		char char_c1 = '자';
		System.out.println("char_c1 = " + char_c1);
		
		char char_c2 = '\uc790';	//'자'를 유니코드로 표현
		System.out.println("char_c2 = " + char_c2);
		
		
		System.out.println("");
		System.out.println("=========정수형 리터럴=========");
//		byte크기: 1byte(표현범위: -128~127)
//		byte b1=128;	//범위 넘어가면 error
		byte b2=127;
		System.out.println("b2 = " + b2);
		
//		short 크기: 2byte(표현범위: -32,768 ~ 32,767)
//		short s1 = 32768;	//범위 넘어가면 error
		short s2 = 32767;
		System.out.println("s2 = " + s2);
		
//		int 크기: 4byte(표현범위: -214,7483,648 ~ 214,7483,647)
//		int i1 = 2147483648;	//범위 넘어가면 error
		int i2 = 123456789;		//정수 표현의 기본
		System.out.println("i2 = " + i2);
		
//		long 크기: 8byte;
		long lg1 = 123456;
		long lg2 = 123456l;
		long lg3 = 123456L;
		System.out.println("lg1 = " + lg1);
		System.out.println("lg2 = " + lg2);
		System.out.println("lg3 = " + lg3);
		
		
		System.out.println("");
		System.out.println("=========실수형 리터럴=========");
//		float 크기: 4byte
		float f1 = 9.1F;
		System.out.println("f1 = " + f1);
		
//		double 크기: 8byte (기본)
		double d1 = 9.8;
		double d2 = 9.8D;
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
	}
}
