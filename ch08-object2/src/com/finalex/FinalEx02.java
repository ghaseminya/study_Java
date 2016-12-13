//메소드에 final 지정

package com.finalex;

class Me{
	
	//메서드에  final을 기재하면 상속은 되지만 메소드 재정의는 불가능
	public final void play(){
		System.out.println("플레이 메소드");
	}
}

public class FinalEx02 extends Me{

	//TODO2:
	//상속받은 메소드 재정의 시 ERROR - Cannot override the final method from Me
//	@Override
//	public void play(){
//		System.out.println("자식 클래스의 플레이 메소드");
//	}
	
	public static void main(String[] args) {
		FinalEx02 f = new FinalEx02();
		//TODO 1:
		f.play();
	}
}


//출력결과
//플레이 메소드

