/*
//Annonymous 내부 클래스 - 익명내부클래스 구현

//부모클래스의 display() 출력
//부모클래스의 display() 재 정의후 출력
//----------------------------------------------
File Info
inner4.AnnoymousEx01.java	Annonymous 내부 클래스로 변경 전
*inner4.AnonymousEx02.java	익명내부클래스 구현
inner4.AnonymousEx03.java	축약형태


//-----------------------------------------------
정의부 + 구현부: Anonymous 내부 클래스 구현 형태
new InnerParent2() //객체 생성
{};	//재정의하는 공간 
i.display(); // 인스턴스를 통해 메소드 호출


*/
package com.inner4;

//부모클래스
class InnerParent2{
	//멤버 메소드
	public void display(){
		System.out.println("부모클래스의 display");
	}
}

public class AnonymousEx02 {
	
	public void innerTest(){
		
		//익명 내부 클래스
		InnerParent2 i = new InnerParent2(){ //객체 생성
			//부모클래스의 메소드 재정의
			@Override
			public void display(){
				System.out.println("익명 내부클래스의 display");				
			}
		};
		i.display(); // 인스턴스를 통해 메소드 호출	
	}
	
	public static void main(String[] args) {
		// 객체 생성후 멤버 메소드 호출
		AnonymousEx02 anony = new AnonymousEx02();
		anony.innerTest();
	}
}


/*//출력결과
//부모클래스의 display() 출력결과
부모클래스의 display

//부모클래스의 display() 재 정의후 출력
익명 내부클래스의 display
*/
