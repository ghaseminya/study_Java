//인터페이스 - 표준화

//인터페이스를 통해 표준화해서 자료형으로 사용
//일반적으로 인터페이스통해 표준화를 많이 합니다.

//인터페이스를 통한 표준화 단계
//1)인터페이스 생성
//2)클래스1, 2 생성						interface I
//3)클래스1, 2 에서 인터페이스 구현				class B implements I
//										class C implements I
//4)클래스3에서 인터페이스 자료형으로 메소드 처리	public void autoPlay(I i){}
//5)클래스3 객체 생성 후 메소드 호출				Z zp = new Z(); zp.autoPlay(new B());


package com.inter1;

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
	//인터페이스를 자료형으로 전달받는 함수
	public void autoPlay(I i){
		i.play();		
	}
}

public class InterfaceEx10 {

	public static void main(String[] args) {
		
		Z zp = new Z();
		zp.autoPlay(new B());	// B -> I 자동 형변환
		zp.autoPlay(new C());	// C -> I 자동 형변환
	}
}


/*//출력결과
B클래스의 play
C클래스의 play
*/
