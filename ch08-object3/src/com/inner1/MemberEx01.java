//내부 클래스 - 내부 클래스 객체 생성

//강의 내용 
//	• 아웃터 객체 생성
//	• 아웃터 객체를 통해 인너클래스 객체 생성
//	• 아웃터 변수값 출력
//	• 아웃터의 인너클래스의 변수값 출력
//---------------------------------------------
//Inner 클래스의 특징
//	• Outer클래스의 인스턴스 생성 후에 Inner클래스의 인스턴스 생성이 가능합니다.
//	• Inner클래스내에서는 Outer클래스의 멤버에 직접 접근이 가능합니다.
//	• Inner클래스의 인스턴스는 자신이 속한 Outer클래스의 인스턴스를 기반으로 생성됩니다.


package com.inner1;

//외부 클래스(Outer Class, 아웃터 클래스)
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
		
		//아웃터 변수값 출력
		System.out.println("x=" + ot.x); //x=100
		
		//아웃터의 인너클래스의 변수값 출력
		System.out.println("y=" + oi.y); //y=200
	}
}
