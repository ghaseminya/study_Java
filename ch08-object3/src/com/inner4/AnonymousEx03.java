package com.inner4;
/*
//Annonymous 내부 클래스 - 축약형태
//AnonymousEx02의 익명내부클래스 정의를 축약형태로 변형하기

//부모클래스의 display() 출력
//부모클래스의 display() 재 정의후 출력
//-------------------------------------------
File Info
inner4.AnnoymousEx01.java	• Annonymous 내부 클래스로 변경 전
							• 부모 클래스를 상속받아서 내부클래스를 정의부와 구현부로 구현
							• 정의부 + 구현부
							
inner4.AnonymousEx02.java	• 익명내부클래스 구현
							• 구현부
							
->inner4.AnonymousEx03.java	• 축약형태
							• 정의부 + 구현부 (축약)

//-------------------------------------------
정의부 + 구현부 (축약향테)
new InnerParent3() //객체 생성
{}			//재정의하는 공간 
.display();	//바로 메소드 호출

*/


//부모클래스
class InnerParent3{
	//멤버메소드
	public void display(){
		System.out.println("부모클래스의 display");
	}
}

public class AnonymousEx03 {
		
	public void innerTest(){
		
		//정의부와 구현부를 합쳐 축약한 형태로 정의
		new InnerParent3(){
			//부모클래스의 메소드 재정의
			@Override
			public void display(){
				System.out.println("익명 내부클래스 축약의 display");				
			}
		}.display(); //익명 내부 클래스의 메소드 바로 호출	
	}
	
	public static void main(String[] args) {
		// 객체 생성후 멤버 메소드 호출
		AnonymousEx03 anony = new AnonymousEx03();
		anony.innerTest();
	}
}

/*
//부모클래스의 display() 출력
부모클래스의 display

//부모클래스의 display() 재 정의후 출력
익명 내부클래스 축약의 display
*/