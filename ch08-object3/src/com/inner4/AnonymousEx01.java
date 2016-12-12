/*
//Annonymous 내부 클래스로 변경 전 - 정의부, 구현부를 통해 내부 클래스 구현
//부모클래스의 display() 출력
//부모클래스의 display() 재 정의 후 출력
//---------------------------------------
File Info
->inner4.AnnoymousEx01.java	• Annonymous 내부 클래스로 변경 전
							• 부모 클래스를 상속받아서 내부클래스를 정의부와 구현부로 구현
							• 정의부 + 구현부
							
inner4.AnonymousEx02.java	• 익명내부클래스 구현
							• 구현부
							
inner4.AnonymousEx03.java	• 축약형태
							• 정의부 + 구현부 (축약)

//---------------------------------------

Anonymous 내부 클래스(익명 내부 클래스)
	• 익명이란 이름이 없는 것을 의미합니다. 이것을 자바 프로그램적으로 해석하면 정의된 클래스의 이름이 없다는 것을 의미하게 됩니다. 
	• 클래스의 이름이 정의되어 있지 않다는 사실에서만 Local 클래스와 차이가 있습니다.
	• 맨 마지막에 ;(세미콜론) 사용


[Anonymous 내부 클래스의 구성]
class Inner(){
        …;
}

class Outer {
        …
        Inner inner = new Inner(){
                …;
        };
        
        public void methodA() { //멤버 메서드
                new Inner() {
                        …;
                };
        }
        …
} 
 

//----------------------------------------
Inner클래스는 부모 클래스를 상속받아서 내부클래스를 정의부와 구현부로 구현한 것을 
다음 단계에서 Anonymous클래스로 변경해 보겠습니다.(AnonymousEx02/AnonymousEx03) 

정의부		class Inner extends InnerParent2{} //클래스 생성(클래스상속 및 메소드 재정의)
구현부		new Inner(); //객체 생성
		i.display(); //인스턴스를 통해 메소드 호출

*/
package com.inner4;

//부모클래스
class InnerParent1{
	//멤버 메소드
	public void display(){
		System.out.println("부모클래스의 display");
	}
}

public class AnonymousEx01 {
	
	public void innerTest(){
		//Inner클래스는 부모 클래스를 상속받아서 내부클래스를 정의부와 구현부로 구현
		
		//정의부	class Inner extends InnerParent1{}
		class Inner extends InnerParent1{ //클래스 생성(클래스상속 및 메소드 재정의)
			
			//TODO : display 재정의, 
			//먼저 재정의하지 않고 구현후 결과확인 후 재정의하여 다시 결과확인
			@Override
			public void display(){
				System.out.println("재정의된 display");
			}
		}
		
		//구현부	new Inner();
		Inner i = new Inner(); //객체 생성
		i.display(); //인스턴스를 통해 메소드 호출
	}
	
	public static void main(String[] args) {
		// 객체 생성후 멤버 메소드 호출
		AnonymousEx01 anony = new AnonymousEx01();
		anony.innerTest();
	}
}


/*//출력결과
//부모클래스의 display() 출력결과
부모클래스의 display

//부모클래스의 display() 재 정의후 출력결과
재정의된 display
*/
