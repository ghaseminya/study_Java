/* Annonymous 내부 클래스로 변경 전 - 정의부, 구현부를 통해 내부 클래스 구현
 * 
 * 
 * 부모클래스의 disp() 출력
 * 부모클래의 disp() 재 정의후 출력
 * 
 * 정의부, 구현부 통해 내부 클래스 구현
 * 
 * ----------------------------------------
 * Inner클래스 부모 클래스를 상속받아 사용
 * 
 * 이것을 다음 단계에서 Anonymous클래스로 변경해 보겠습니다.(AnonymousEx02/AnonymousEx03) 
 * 
 * 정의부	class Inner{}
 * 구현부	new Inner();
 */


package com.inner4;

//
class Inner4{
	//
	public void disp(){
		System.out.println("부모클래스의 disp");
	}
}

public class AnnoymousEx01 {

	// 이름이 없는 내부 클래스 생성하는데 부모이름을 쓰거나 인터페이스명을 쓴다.
	// 반드시 객체생성을 바로 해주어야 한다.
	public void innerTest(){

		//정의부	class Inner{}
		//구현부	new Inner4();
		class Inner extends Inner4{
			//disp 재정의
			@Override
			public void disp(){
				System.out.println("재정의된 disp");
			}		
		}
		Inner i = new Inner();
		i.disp();
	}
	
	public static void main(String[] args) {
		AnnoymousEx01 an = new AnnoymousEx01();
		an.innerTest();
	}

}
