/* 인터페이스 - 다중 상속
 * 
 * 인터페이스 생성
 * 인터페이스 끼리 상속
 * 클래스에서 인터페이스 구현
 * 클래스의 객체 생성후 인터페이스 호출
 * 인터페이스 추가 생성
 * 클래스에 다중 구현
 * */


package com.inter1;


interface Inter1{	
	//추상 메소드
	public int getA();
}

interface Inter2{
	//추상 메소드
	public abstract int getB();
}

//인터페이스 다중 상속
interface Inter3 extends Inter1, Inter2{
	public int getData();
}


interface Inter4{
	public abstract int getC();
	
}

// 클래스에서 다중 구현
public class InterEx03 implements Inter3, Inter4{
	
	@Override
	public int getA(){
		return 100;
	}
	
	@Override
	public int getB(){
		return 200;
	}
	
	@Override
	public int getData(){
		return 300;
	}
	@Override
	public int getC(){
		return 400;
	}

	public static void main(String[] args) {
		
		//클래스 객체 생성
		InterEx03 in3 = new InterEx03();
		System.out.println(in3.getA());
		System.out.println(in3.getB());
		System.out.println(in3.getC());
		System.out.println(in3.getData());

	}

}
