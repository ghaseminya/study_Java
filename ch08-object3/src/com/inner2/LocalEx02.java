package com.inner2;
/*
//로컬 내부 클래스 
//로컬 내부 클래스는 로컬내부 클래스가 위치한 메소드의 지역변수 호출 불가능
//그러나, 상수화하면 호출가능하다.


로컬 내부 클래스의 특징
	• 지역변수 처럼 사용
	• 로컬 내부 클래스의 메모리 생성 시점은  메소드가 호출될 때
	• 로컬 내부 클래스의 메모리 소멸 시점은  메소드가 종료될 때
	• Outer클래스의 멤버변수와 상수값만 접근 가능
	• 로컬 내부 클래스가 정의된 메소드내의 로컬변수에는 접근 할 수 없습니다.
	• 로컬 내부클래스의 객체생성은 해당 클래스가 포함된 메소드에서만 가능합니다.



Local 클래스의 지역변수, 매개변수 접근
	• 메소드가 반환되는 순간 매개변수와 지역변수는 소멸됩니다. 그러므로 매개변수와 지역변수에 접근할수 없습니다. 
	• 단, final로 선언된 변수의 접근은 허용합니다. 
	접근의 허용을 위해서 final 변수를 로컬 내부 클래스의 인스턴스가 접근 가능한 영역에 복사하게 됩니다.


//-----------------------------
//int b = 200; 상태에서 b호출 결과 확인
//final int b = 200; 선언후 출력결과 확인

*/

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
				//ERROR:Cannot refer to a non-final variable b inside an inner class defined in a different method
//				System.out.println("b = " + b);
				//메소드의 변수 선언시 final int b = 200; 선언하면 접근 가능하게 됩니다.
				
				System.out.println("c = " + c);
				System.out.println("NUM = " + NUM);
			}
		}
		
		//객체 생성
		new Inner().getData();
	}
	
	
	public static void main(String[] args) {
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
