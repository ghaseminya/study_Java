/* 인터페이스 - 추상 메소드 구체화
 * 
 * 인터페이스 정의
 * class에 implements하고 인터페이스 추상 메소드 구체화
 * class의 객체 생성
 * 객체를 통해 메소드 호출
 * */

package com.inter1;

interface A2{
	//추상 메소드
	public abstract void getB();	//추상 메소드 선언 원형
	void getC();					//public abstract생략된 것임
}

//A2인터페이스를 B2에 적용
class B2 implements A2{
	@Override
	public void getB(){
		System.out.println("getB 메소드");		
	}
	
	@Override
	public void getC(){
		System.out.println("getC 메소드");		
	}
}

public class InterEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b2b2 = new B2();
		b2b2.getB();
		b2b2.getC();

	}

}
