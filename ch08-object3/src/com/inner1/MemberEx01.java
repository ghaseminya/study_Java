/* 내부 클래스 - 내부 클래스 객체 생성
 * 
 * 
 * 아웃터 객체 생성
 * 아웃터 객체를 통해 인너클래스 객체 생성
 * 아웃터 변수값 출력
 * 아웃터의 인너클래스의 변수값 출력
 * 
 */


package com.inner1;

class Outer{
	int x = 100;
	
	//멤버 내부클래스
	class Inner{
		int y = 200;
	}
}


public class MemberEx01 {
	public static void main(String[] args){
		//아웃터 클래스 객체 생성
		Outer ot = new Outer();
		
		//멤버 내부 클래스 객체 생성
		Outer.Inner oi = ot.new Inner();
		
		System.out.println("x=" + ot.x);
		System.out.println("y=" + oi.y);		
	}
}
