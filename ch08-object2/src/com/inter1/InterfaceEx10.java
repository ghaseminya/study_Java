/*
//인터페이스 - 표준화
	• 인터페이스를 통해 표준화해서 자료형으로 사용
	• 일반적으로 인터페이스 통해 표준화를 많이 합니다.


//인터페이스를 통한 표준화 단계
//TODO 1: 인터페이스 생성					interface I
//TODO 2: 클래스1, 2 생성				class B, class C	
//TODO 3: 클래스1, 2 에서 인터페이스 구현		class B implements I, class C implements I
//TODO 4: 클래스3 생성							class Z
//TODO 5: 클래스3에서 인터페이스 자료형으로 메소드 처리		public void autoPlay(I i){}
//TODO 6: 클래스3 객체 생성 후 메소드 호출				Z zp = new Z(); zp.autoPlay(new B());

*/

package com.inter1;

//TODO 1: 인터페이스 생성
interface I{
	public abstract void play();
}

//TODO 2: 클래스1, 2 생성			
//TODO 3: 클래스1, 2 에서 인터페이스 구현	
class B implements I{
	@Override
	public void play(){
		System.out.println("B클래스의 play");
	}	
}

class C implements I{
	@Override
	public void play(){
		System.out.println("C클래스의 play");
	}	
}

//TODO 4: 클래스3 생성
class Z{
	//TODO 5: 클래스3에서 인터페이스 자료형으로 메소드 처리
	//인터페이스를 자료형으로 전달받는 함수
	public void autoPlay(I i){
		i.play();		
	}
}

public class InterfaceEx10 {

	public static void main(String[] args) {
		//TODO 6: 클래스3 객체 생성 후 메소드 호출
		Z zp = new Z();
		zp.autoPlay(new B());	// B -> I 자동 형변환
		zp.autoPlay(new C());	// C -> I 자동 형변환
								//상속시 메소드 오버라이딩 되어 있으면 확장되어 있는 것(오버라이딩된 것)이 호출됩니다.
	}
}


/*//출력결과
B클래스의 play
C클래스의 play
*/
