/* 인터페이스 - 인터페이스의 상수 호출
 * */

package com.inter1;

interface A1{
	//상수
	public static final int W = 10;	// 형식 원형
	int X =20;						//원형은 public static final int X=20;인데 public static final생략된 것임
	static int Y = 30;				//public static final생략된 것임
	final int Z = 40;				//public static final생략된 것임
}


public class InterEx01 {

	public static void main(String[] args) {
		// 인터페이스 객체생성 불가
		//A1 aa1 = new A1();	//ERROR: Cannot instantiate the type A1
		
		//public하고 static한 상수이므로
		//인터페이스명에 dot연산자를 통해 호출
		System.out.println("W = " + A1.W);
		System.out.println("W = " + A1.X);
		System.out.println("W = " + A1.Y);
		System.out.println("W = " + A1.Z);
		
	}
}
