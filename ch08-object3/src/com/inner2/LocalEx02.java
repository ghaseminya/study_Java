//로컬 내부 클래스 

//로컬 내부 클래스는 로컬내부 클래스가 위치한 메소드의 지역변수 호출 불가능
//그러나, 상수화하면 호출가능하다.
//-----------------------------
//int b = 200; 상태에서 b호출 결과 확인
//final int b = 200; 선언후 출력결과 확인


package com.inner2;

public class LocalEx02 {
	//멤버 변수
	int a = 100;
	
	//멤버 메소드
	public void innerTest(){
		//지역 변수
		int b = 200;
//		final int b = 200;
		
		//로컬 내부 클래스
		class Inner{
			int c = 300;
			final int NUM = 400;
			
			public void getData(){
				
				System.out.println("a = " + a);
				
				//로컬 내부 클래스는 로컬내부 클래스가 위치한 메소드에서 지역변수 호출 불가능
//				System.out.println("b = " + b);	//ERROR:Cannot refer to a non-final variable b inside an inner class defined in a different method
												//final int b = 200; 선언하면 접근 가능하게됩니다.
				System.out.println("c = " + c);
				System.out.println("NUM = " + NUM);
			}
		}
		
		//객체 생성
		new Inner().getData();
	}
	
	
	public static void main(String[] args) {
		// 		
		LocalEx02 le2 = new LocalEx02();
		le2.innerTest();
	}
}


/*//출력결과
a = 100
b = 200
c = 300
NUM = 400
*/
