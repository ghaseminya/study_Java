/*
인터페이스의 기본 구성과 구현

*/
package com.inter1;



interface InterTest {
	static final int A = 100;
	abstract int getA(); 	//abstract예약어는 생략 가능!
}

//implements라는 예약어로 인터페이스 구현
public class InterEx05 implements InterTest{

	public int getA(){
		return A;
	}

	public static void main(String[] args) 
	{
		InterEx05 it1 = new InterEx05();
		System.out.println("getA(): "+it1.getA());
	}

}
