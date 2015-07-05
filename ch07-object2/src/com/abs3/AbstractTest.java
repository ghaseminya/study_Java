/* 추상클래스, 추상메서드, 일반클래스에서 추상메서드 구체화
 * 
 * 부모 클래스 (추상 클래스 + 추상 메소드)
 * 자식 클래스 (추상 클래스 + 추상 메소드)*/ 

package com.abs3;


//추상 클래스(부모)
abstract class AbsEx1{
	int a = 100;
	public int getA(){
		return a;
	}
	
	//추상 메소드
	abstract public int getB();
	abstract public int getC();
}

//추상 클래스(자식)
abstract class AbsEx2 extends AbsEx1{
	String msg = "신세계";
	
	//추상 클래스이므로 부모 클래스의 추상메소드를 반드시 구체화해야 할 필요는 없습니다.
	//추상 메소드 구체화
	@Override
	public int getB(){
		return 200;
	}
	
	//추상 메소드
	public abstract String getMsg();
}


public class AbstractTest extends AbsEx2{

	@Override
	public String getMsg(){
		return msg;
	}
	
	@Override
	public int getC(){
		return 300;
	}
	
	
	public static void main(String[] args) {
		
		AbstractTest ab = new AbstractTest();
		System.out.println(ab.getA());
		System.out.println(ab.getB());
		System.out.println(ab.getC());
		System.out.println(ab.getMsg());
		
		

	}

}
