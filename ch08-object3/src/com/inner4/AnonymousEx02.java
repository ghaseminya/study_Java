/*
//Annonymous 내부 클래스 - 익명내부클래스 구현

//부모클래스의 display() 출력
//부모클래스의 display() 재 정의후 출력
//----------------------------------------------
File Info
inner4.AnnoymousEx01.java	• Annonymous 내부 클래스로 변경 전
							• 부모 클래스를 상속받아서 내부클래스를 정의부와 구현부로 구현
							• 정의부 + 구현부
							
->inner4.AnonymousEx02.java	• 익명내부클래스 구현
							• 구현부
							
inner4.AnonymousEx03.java	• 축약형태
							• 정의부 + 구현부 (축약)
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
		
		//익명 내부 클래스 (구현부) - 정의부를 따로 정의하지 않고 구현부만 존재하며 구현부안의 정의부에 있던 내용이 포함되어 집니다.
		//이름이 없는 내부 클래스 생성하는데 부모이름을 쓰거나 인터페이스명을 씁니다. 
		//반드시 객체생성을 바로 해주어야 합니다.
		//class Inner해서 클래스이름을 지정했던 것을 이름 없이 InnerParent2를 상속받은 클래스의 객체 생성
		InnerParent2 i = new InnerParent2(){ //객체 생성
			//TODO : 부모클래스의 메소드 재정의
			//먼저 재정의하지 않고 구현후 결과확인 후 재정의하여 다시 결과확인
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
