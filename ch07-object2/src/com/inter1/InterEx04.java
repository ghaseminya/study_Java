/* 인터페이스 - 자료형으로 사용
 * 
 * 인터페이스 생성
 * 클래스타입 -> 인터페이스타입으로 자동적으로 형변환
 * 인터페이스타입 -> 클래스 타입 명시적 형변환
 * 
 * */

package com.inter1;

interface Inter5{
	public abstract void play();
}

//인터페이스 구현
public class InterEx04 implements Inter5{
	
	@Override
	public void play(){
		System.out.println("play 메소드");
	}
	
	public void make(){
		System.out.println("Make 메소드");
	}

	public static void main(String[] args) {
		// 
		InterEx04 it04 = new  InterEx04();
		it04.play();
		it04.make();
		
		System.out.println();
		//클래스타입 -> 인터페이스타입으로 자동적으로 형변환
		Inter5 it5 = it04;	 
		it5.play();
		
		//호출 범위를 벗어나 호출 불가능
		//it5.make();	//ERROR: The method make() is undefined for the type Inter5
		
		System.out.println();
		//인터페이스 -> 클래스타입으로 명시적으로 형변환
		InterEx04 it02 = (InterEx04)it5;		
		it02.play();
		it02.make();
	}
}
