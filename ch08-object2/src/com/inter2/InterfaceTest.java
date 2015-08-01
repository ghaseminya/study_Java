/* 인터페이스 - 표준화
 * 
 * 인터페이스를 통해 표준화해서 자료형으로 사용
 * 일반적으로 인터페이스통해 표준화를 많이 합니다.
 * 
 * 인터페이스 생성
 * 클래스1, 2 생성
 * 클래스1, 2 에서 인터페이스 구현
 * 클래스3에서 인터페이스 자료형으로 메소드 처리
 * 클래스3 객체 생성 후 호출
 * */


package com.inter2;

interface I{
	public abstract void play();
}

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

class Z{
	//인터페이스를 자료형으로 전달
	public void autoPlay(I i){
		i.play();		
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		Z zp = new Z();
		zp.autoPlay(new B());	// B -> I 자동 형변환
		zp.autoPlay(new C());	// C -> I 자동 형변환
	}

}
