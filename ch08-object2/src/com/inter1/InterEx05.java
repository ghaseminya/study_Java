//인터페이스의 기본 구성과 구현

package com.inter1;


//인터페이스 선언
interface InterfaceTest {
	//상수 또는 추상메서드만 정의 가능
	static final int A = 100;
	abstract int getA(); 	//abstract예약어는 생략 가능!
}

//implements라는 예약어로 인터페이스 구현
public class InterEx05 implements InterfaceTest{

	//추상메서드 재정의
	@Override
	public int getA(){
		return A;
	}

	public static void main(String[] args) 
	{
		InterEx05 itex1 = new InterEx05();
		System.out.println("getA(): "+itex1.getA());
	}

}
