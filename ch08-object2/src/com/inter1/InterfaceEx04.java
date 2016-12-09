//인터페이스 - 자료형으로 사용
 
//강의내용
//	• 인터페이스 생성
//	• 클래스타입 -> 인터페이스타입으로 자동적으로 형변환
//	• 인터페이스타입 -> 클래스 타입 명시적 형변환


package com.inter1;

interface Inter5{
	public abstract void play();
}

//인터페이스 구현
public class InterfaceEx04 implements Inter5{
	
	@Override
	public void play(){
		System.out.println("play 메소드");
	}
	
	public void study(){
		System.out.println("study 메소드");
	}

	public static void main(String[] args) {

		InterfaceEx04 ife04 = new  InterfaceEx04();
		ife04.play(); //play 메소드
		ife04.study(); //study 메소드
		
		
		System.out.println();
		//클래스타입 -> 인터페이스타입으로 자동적으로 형변환
		Inter5 if5 = ife04;	 
		if5.play(); //play 메소드
		
		//호출 범위를 벗어나 호출 불가능 (interface Inter5에 포함된 메소드 아님)
		//ERROR: The method study() is undefined for the type Inter5
//		it5.study();
		
		
		System.out.println();
		//인터페이스 -> 클래스타입으로 명시적으로 형변환
		InterfaceEx04 ife05 = (InterfaceEx04)if5;
		ife05.play(); //play 메소드
		ife05.study(); //study 메소드
	}
}


/*//출력결과
play 메소드
study 메소드

play 메소드

play 메소드
study 메소드
*/

