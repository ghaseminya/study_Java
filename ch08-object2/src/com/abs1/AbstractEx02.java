/*
//추상 클래스의 상속 관계


추상 클래스의 상속 관계
	• 추상 클래스들간에도 상속이 가능합니다.
	• 일반 클래스들간의 상속과 유사하지만 추상 클래스들간의 상속에서는 상속 받은 추상 메서드들을 꼭 재정의할 필요는 없습니다.
	• 왜냐하면 그냥 상속만 받아두고 있다가 언제가 일반 클래스와 상속관계가 이루어 질 때, 
	이때 재정의 하지 못했던 상속 받은 추상 메서드들을 모두 일반 클래스 내에서 재정의하면 되기 때문입니다.

*/
package com.abs1;

abstract class AbsEx1{
	int a = 2016; //변수
	final String str = "abstract test"; //상수
	
	public String getStr(){ //일반 메서드
		return str;
	}
	
	// 추상 메서드는 몸체(body)가 없다.
	abstract public int getA();
}

//TODO 1-1: CASE 1
abstract class AbsEx2 extends AbsEx1{
	// 부모클래스의 추상 메서드 재 정의
	@Override
	public int getA(){
		return a;
	}
	
	//상속받은 그 클래스를 추상메소드로 정의하면
	//부모클래스에서 정의한 일반 메소드가 다시 가려지고  또 다시 추상메소드를 구현해야 사용할 수 있습니다.
	public abstract String getStr();
} 

//TODO 2-1: CASE 2 (확인 후 주석처리)
//abstract class AbsEx2 extends AbsEx1{
//
//	public void getStrTwo(){
//	}
//} 
//• AbsEx2 클래스도 abstract 로 선언되어야 에러 발생 않습니다.
//• 위의 경우AbsEx2 클래스는 AbsEx1 클래스의 abstract 메소드를 상속하고 있습니다.
//• 그런데 getA()메소드를 오버라이딩 하지 않았으므로, abstract 상태 그대로 포함하고 있는 것이 되기 때문에 
//결국 AbsEx2 클래스는 하나 이상의 abstract 메소드를 포함하게되는 것이 되어, 
//abstract로 선언되어야 하며, 인스턴스의 생성도 불가능하게 됩니다.


public class AbstractEx02 extends AbsEx2{
	//TODO 1-2: 
	//AbsEx2의 추상 메서드 재 정의
	@Override
	public String getStr(){
		return str; //str은 AbsEx1의 멤버
	}
	
	//TODO 2-2: 
//	@Override
//	public int getA(){
//		return a;
//	}
	
	public static void main(String[] args){
		AbstractEx02 ae = new AbstractEx02();
		System.out.println("ae.getA():"+ae.getA());
		System.out.println("ae.getStr():"+ae.getStr());
	}
}


//출력결과 - TODO 1, TODO 2 결과는 동일
//ae.getA():2016
//ae.getStr():abstract test