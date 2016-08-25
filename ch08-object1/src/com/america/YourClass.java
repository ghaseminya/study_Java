/*
//private 제한자

//FileInfo
//package com.america;	YourClass.class	main부
//package com.america;	MyClass.class	private 멤버 변수 정의

//----------------------------------------------
private	< default	< protected < public
클래스 내부	< 동일 패키지	< 상속 클래스	< 이외의 영역 
(일반 클래스)			 (서브 클래스)  (아무 관계 없음)


private의 제한
	• private	-  클래스 내부(메소드)에서만 접근 가능합니다

*/

package com.america;

public class YourClass {
	
	public void accessClass(MyClass myClass){
		
		//MyClass의 number멤버변수는 private으로 선언되어 있어 클래스 내부(메소드)에서만 접근 가능합니다
//		myClass.number=10;		//ERROR - The field MyClass.number is not visible
		
		//클래스 내부(메소드)를 통해 private으로 선언된 멤버 변수에 접근
		myClass.setNumber(12);
		System.out.println(myClass.getNumber());
	}
	
	public static void main(String[] args){
		
		//accessClass()메소드를 호출시켜서 12가 출력되게해 주세요
		//객체 2개 생성후 accessClass()메소드 
		//LAB
		MyClass mc = new MyClass();
		YourClass yc = new YourClass();
		yc.accessClass(mc);
		
	}
}
