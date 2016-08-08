/*
//boolean자료형 출력

[논리 표현]
true	‘참‘을 의미하는 키워드
false	‘거짓’을 의미하는 키워드


[true와 false 이해]
	• 숫자의 관점에서 이해하지 말것!
	• 자바에서의 true와 false는 그 자체로 저장이 가능한 데이터타입입니다.
	• true와 false는 독립된 키워드이고
	• true와 false의 저장을 위한 자료형이 boolean 입니다.
	• 논리형은 반드시 소문자 true, false값 중 하나의 값을 가집니다.


[C vs Java에서의 참/거짓 차이]
언어구분	참		거짓
C/C++	1		0
		TRUE	FALSE
		true	false

JAVA	true	false

C#		true	false

*/

public class VariableBoolean01 {

	public static void main(String[] args) {
		
		//boolean자료형은 true/false만 저장가능
		boolean b1=true;
		boolean b2=false;
//		boolean b3=FALSE; //ERROR
//		boolean b4=0; //ERROR
		
		System.out.println(b1); //true
		System.out.println(b2); //false
		
		//연산의 결과에 의한 true/false출력
		System.out.println(7<10); //true
		System.out.println(7>10); //false

	}
	
}
