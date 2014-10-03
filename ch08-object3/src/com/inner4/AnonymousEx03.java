/* Annonymous 내부 클래스 - 축약형태
 * 
 * AnonymousEx02의 익명내부클래스 정의 축약형태
 * 
 * 
 * -------------------------------------------
 * 정의부	class Inner extends Inner2{}
 * 구현부	new Inner();
 * 
 * 정의부 + 구현부
 * new Inner2()
 * {};	//재정의하는 공간 
 * 
 */


package com.inner4;

//
class Inner3{
	//
	public void disp(){
		System.out.println("부모클래스의 disp");
	}
}

public class AnonymousEx03 {
		
	public void innerTest(){
		
		//정의부와 구현부를 합쳐 축약한 형태로 정의
		//익명 내부 클래스의 메소드 바로 호출
		new Inner3(){
			@Override
			public void disp(){
				System.out.println("익명 내부클래스 축약의 disp");				
			}
		}.disp();		
	}
	
	public static void main(String[] args) {
		// 객체 생성후 멤버 메소드 호출
		AnonymousEx03 an = new AnonymousEx03();
		an.innerTest();
	}
}
