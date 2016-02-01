//추상클래스, 추상메서드, 일반클래스에서 추상메서드 구체화
//부모 클래스 (추상 클래스 + 추상 메소드)
//자식 클래스 (추상 클래스 + 추상 메소드)

package com.abs3;

//추상 클래스(부모)
abstract class AbsEx1{
	int a = 100;
	
	//일반 메소드
	public int getA(){
		return a;
	}
	
	//추상 메소드
	abstract public int getB();
	abstract public int getC();
}

//추상 클래스(자식)
//getC() 메소드를 오버라이딩 하지 않았으므로, abstract 상태 그대로 포함되는 것이 되기 때문에 
//결국 AbsEx2 클래스는 하나 이상의 abstract 메소드를 포함하게되는 것이므로
//abstract로 선언되어야 하며, 인스턴스의 생성도 불가능하게 됩니다
//class AbsEx2 extends AbsEx1{	
//ERROR - The type AbsEx2 must implement the inherited abstract method AbsEx1.getC()
abstract class AbsEx2 extends AbsEx1{
	String msg = "추상화";
	
	//추상 클래스이므로 부모 클래스의 추상메소드들을 반드시 구체화해야 할 필요는 없습니다.
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
	public int getC(){
		return 300;
	}
	
	@Override
	public String getMsg(){
		return msg;
	}
	
	public static void main(String[] args) {
		
		AbstractTest ab = new AbstractTest();
		System.out.println(ab.getA()); //100
		System.out.println(ab.getB()); //200
		System.out.println(ab.getC()); //300
		System.out.println(ab.getMsg()); //추상화
	}
}
