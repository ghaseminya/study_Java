/*
//인터페이스 - 인터페이스의 상수 호출

인터페이스의 상수
인터페이스 내에 선언된 변수는 무조건 public static final로 선언(상수)이 되므로 인터페이스명으로 접근이 가능합니다. 

*/
package com.inter1;

interface A1{
	//상수
	public static final int W = 10;	//형식 원형
	int X =20; //원형은 public static final int X=20;인데 public static final생략된 것임
	static int Y = 30; //public final 생략된 것임
	final int Z = 40; //public static 생략된 것임
}


public class InterfaceEx01 {

	public static void main(String[] args) {
		//TODO : 인터페이스 객체생성 불가
//		A1 a1 = new A1();	//ERROR: Cannot instantiate the type A1
		
		//TODO : public하고 static한 상수이므로 인터페이스명에 dot연산자를 통해 직접호출가능
		System.out.println("W = " + A1.W); //W = 10
		System.out.println("X = " + A1.X); //X = 20
		System.out.println("Y = " + A1.Y); //Y = 30
		System.out.println("Z = " + A1.Z); //Z = 40
		
		//TODO : 상수 값 변경시 ERROR
//		A1.W = 100;	//ERROR - The final field A1.W cannot be assigned
//		System.out.println("W = " + A1.W);
	}
}
