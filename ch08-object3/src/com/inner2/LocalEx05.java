package com.inner2;

public class LocalEx05 {
	
	// 멤버 변수
	int a = 100;

	public void innerTest(int k) {
		
		// 지역변수
		int b = 200;
//		final int b = 200; // TODO: 상수화로 b에 호출할 수 있도록 변경
		
		final int c = k; // 상수
		
		//Local 내부 클래스
		class Inner {
			
			// Local 내부 클래스는 외부클래스의 멤버 변수와  상수들만 접근이 가능합니다.
			public void getData() {
				
				//외부클래스의 멤버 변수 호출
				System.out.println("int a : " + a);
				
				//Local 내부클래스를 포함하고 있는 메소드의 지역변수 호출
				//Local 내부클래스는  지역변수를 사용할 수 없다.
				//ERROR-Cannot refer to the non-final local variable b defined in an enclosing scope
//				System.out.println("int b : "+b);
				
				// 상수 호출
				System.out.println("final int c : " + c);
			}
		} // 내부 클래스의 끝
		
		// 메서드 내에서 Local 내부 클래스 생성
		Inner i = new Inner(); 
		// 생성된 reference를 통해 메서드 호출
		i.getData();
		
	} // innerTest() 끝

	public static void main(String[] args) {
		
		LocalEx05 outer = new LocalEx05();
		outer.innerTest(300);

	}
}


/*
//출력결과
int a : 100
int b : 200
final int c : 300
*/
