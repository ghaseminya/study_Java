//Annonymous 내부 클래스로 변경 전 - 정의부, 구현부를 통해 내부 클래스 구현

//부모클래스의 display() 출력
//부모클래스의 display() 재 정의후 출력
//----------------------------------------
//Inner클래스는 부모 클래스를 상속받아서
//내부클래스를 정의부와 구현부로 구현한 것을 다음 단계에서 Anonymous클래스로 변경해 보겠습니다.(AnonymousEx02/AnonymousEx03) 
//- 정의부	class Inner extends InnerParent2{}
//- 구현부	new Inner();


package com.inner4;

//부모클래스
class InnerParent1{
	//멤버 메소드
	public void display(){
		System.out.println("부모클래스의 display");
	}
}

public class AnnoymousEx01 {

	// 이름이 없는 내부 클래스 생성하는데 부모이름을 쓰거나 인터페이스명을 쓴다.
	// 반드시 객체생성을 바로 해주어야 한다.
	public void innerTest(){

		//정의부	class Inner extends Inner1{}
		class Inner extends InnerParent1{
			//display 재정의
//			@Override
//			public void display(){
//				System.out.println("재정의된 display");
//			}
		}
		
		//구현부	new Inner();
		Inner i = new Inner();
		i.display();
	}
	
	public static void main(String[] args) {
		// 객체 생성후 멤버 메소드 호출
		AnnoymousEx01 anony = new AnnoymousEx01();
		anony.innerTest();
	}

}


/*//출력결과
//부모클래스의 display() 출력결과
부모클래스의 display

//부모클래스의 display() 재 정의후 출력결과
재정의된 display
*/
