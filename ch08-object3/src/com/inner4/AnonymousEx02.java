/* Annonymous 내부 클래스 - 익명내부클래스 구현
 * 
 * 
 * 부모클래스의 disp() 출력
 * 
 * 부모클래의 disp() 재 정의후 출력
 * 
 * -----------------------------------------------
 * 정의부	class Inner extends Inner2{}
 * 구현부	new Inner();
 * 
 * 정의부 + 구현부: Anonymous 내부 클래스 구현 형태
 * new Inner2()
 * {};	//재정의하는 공간 
 * 
 */


package com.inner4;

class Inner2{
	
	public void disp(){
		System.out.println("부모클래스의 disp");
	}
}

public class AnonymousEx02 {
	
	public void innerTest(){
		
		//익명 내부 클래스
		Inner2 i = new Inner2(){
			//부모클래스의 메소드 재정의
			@Override
			public void disp(){
				System.out.println("익명 내부클래스의 disp");				
			}
		};
		i.disp();		
	}
	
	public static void main(String[] args) {
		// 객체 생성후 멤버 메소드 호출
		AnonymousEx02 an = new AnonymousEx02();
		an.innerTest();
	}
}
