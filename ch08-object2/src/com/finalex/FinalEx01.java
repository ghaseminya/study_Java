/*
//상수에 final 적용

final
	• final은 예약어이며 이것은 더 이상의 확장이 불가능함을 알리는 종단(상수)과 같은 것을 의미합니다.
	• 변수를 상수화 시키겠다는 예약어이며 변경시 컴파일 에러가 발생합니다.


final 적용
	• 변수에 final을 적용 시 상수를 의미
	• 메서드에 final을 적용 시 오버라이딩으로의 확장이 불가능
	• 클래스에 final을 적용 시 더 이상의 상속 확장이 불가능


o 변수에 final을 적용 시 상수를 의미
문법 구성	: final [자료형] [변수명];
사용 예	: final int VAR=100;


o 메서드에 final을 적용 시 오버라이딩으로의 확장이 불가능
문법 구성	: [접근제한] final [반환형] [메소드명]( ){ }	
사용 예	: public final void method( ){ }


o 클래스에 final을 적용 시 더 이상의 상속 확장이 불가능
문법 구성	: [접근제한] final class [클래스명]{ }	
사용 예	: public final class FlyEx{ }

*/
package com.finalex;

public class FinalEx01 {
	
	//변수
	int var1 = 100;
	
	//상수(객체 멤버 상수화)
	final int var2 = 300;
	
	//상수 (스태틱 상수화)
	public static final int VAR3 = 400;
	
	public static void main(String[] args) {
		
		FinalEx01 f1 = new FinalEx01();
		System.out.println("f1.var1 변경 전 값: ");
		System.out.println(f1.var1); //100
		
		
		f1.var1 = 200;
		System.out.println("f1.var1 변경 후 값: ");
		System.out.println(f1.var1); //200	
		
		
		//상수는 변경불가
		//ERROR:The final field FinalEx01.var2 cannot be assigned
//		f1.var2 = 300;	
		System.out.println("final 상수(f1.var2) 호출: ");
		System.out.println(f1.var2); //300
		
		
		//STATIC상수 호출
		System.out.println("STATIC상수(VAR3) 호출: ");
		//같은 클래스안에 있으므로 바로 접근가능
		System.out.println(VAR3); //400
		//클래스명을 통해 접근
		System.out.println(FinalEx01.VAR3); //400
		
		
		
		//상수 (지역변수 상수화)
//		int NUM = 100; //지역변수
		final int NUM = 100;
		System.out.println("지역변수를 상수화: ");
		System.out.println(NUM); //100
		
		//상수 변경 불가
		//ERROR-The final local variable NUM cannot be assigned. It must be blank and not using a compound assignment
//		NUM = 300;	
	}
}


/*//출력결과
f1.var1 변경 전 값: 
100
f1.var1 변경 후 값: 
200
final 상수(f1.var2) 호출: 
300
STATIC상수(VAR3) 호출: 
400
지역변수를 상수화: 
100
*/