//참조 자료형: 호출 범위 강제 - 업 캐스팅/다운 캐스팅 
// 
//업 캐스팅과 다운 캐스팅한 참조변수를 통해
//부모클래스 인스턴스 메소드 호출/자식클래스의 인스턴스 메소드 호출


package com.ext3;

class A{
	public void make(){
		System.out.println("A클래스");
	}
}

class B extends A{
	public void play(){
		System.out.println("B클래스");
	}
}

public class Exten02 {

	public static void main(String[] args) {

		System.out.println("\n자식 객체 생성: ");
		B nB = new B();
		nB.make();
		nB.play();
		
		System.out.println("\n업 캐스팅: ");
		//자식 클래스 타입 -> 부모 클래스 타입 형변환
		//업 캐스팅, 자동적으로 형변환
		A nA = nB;
		nA.make();
		//호출 범위를 벗어나 호출 불가
		//nA.play();	//ERROR: The method play() is undefined for the type A
		
		System.out.println("\n다운 캐스팅: ");
		//부모 클래스 타입 -> 자식 클래스 타입 형변환
		//다운 캐스팅, 명시적으로 형변환
		B nB2 = (B)nA;
		nB2.make();
		nB2.play();
	}
}
