/*
//클래스에 final 적용

[JAVA API에서 final적용 예]
	• JAVA의 기본클래스는 상속 안 되도록 final로 정의 되어 있습니다. 
	• 왜냐하면. 원형 그대로 사용하게 하기 위해서 입니다.(기본적인 처리를 위해)
	• API문서에셔 확인하기
	• public final class String{}
	• public final class System{}
  
*/
package com.finalex;

//TODO 1: final클래스 정의 - 클래스에 final을 명시하면 상속되지 않습니다.
//TODO 3-1: 주석처리
//final class Parent{
//	int a = 100;
//}

//TODO 3-2: final키워드 삭제
class Parent{
	int a = 100;
}


//TODO 2: final 클래스 상속시 ERROR확인 
//ERROR: The type FinalEx03 cannot subclass the final class Parent
public class FinalEx03 extends Parent{

	public static void main(String[] args) {
		
		FinalEx03 finalEx03 = new FinalEx03();
		System.out.println(finalEx03.a);
	}
}
