/*
//인터페이스 - 다중 상속
//인터페이스 생성
//인터페이스 끼리 상속
//클래스에서 인터페이스 구현 (클래스에서 다중 구현)


인터페이스간의 상속
	• 인터페이스 내에는 상수 또는 동작부분을 구현하지 않은 추상 메서드들이 정의됩니다.
	• 그러므로 인터페이스를 구현(implements)하겠다고 명시한 일반 클래스에서 원하는 형태로 꼭 구현해주어야 됩니다. 
	• 실제 구현하는 부분이 없는 인터페이스들 간의 상속에서는 다중 상속을 할수 있습니다 


인터페이스 간 상속 선언
[접근제한] interface [인터페이스명] extends 부모인터페이스명1, 부모인터페이스명2, …, 부모인터페이스명n {
   상수;
   추상메서드;
} 


인터페이스 상속에서의 추상 메소드 구현
	• 추상메소드는 해당 인터페이스가 다른 인터페이스로부터 상속을 받았지만 Overriding을 할 수는 없습니다.
	• 왜냐하면 인터페이스는 body({ })를 가지는 일반 메서드를 포함할 수 없습니다.
	• 그러므로 상속을 받은 자식 인터페이스를 구현(implements)하는 일반 클래스에서 
	부모 인터페이스와 자식 인터페이스의 추상 메서드들을 모두 Overriding(재정의)해야 합니다. 

*/

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
//인터페이스 간 상속 가능 단 이 때는 implements가 아닌 extends를 사용한다.
interface Inter3 extends Inter1, Inter2{
	public int getData();
}


interface Inter4{
	public abstract int getC();
	
}

// 클래스에서 다중 구현
// 인터페이스는 둘 이상을 동시에 구현 가능, 인터페이스의 구현(상속)은 extends가 아닌 implements를 사용합니다.
public class InterfaceEx03 implements Inter3, Inter4{

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
		InterfaceEx03 ife3 = new InterfaceEx03();
		System.out.println(ife3.getA()); //100
		System.out.println(ife3.getB()); //200
		System.out.println(ife3.getC()); //400
		System.out.println(ife3.getData()); //300

	}
}
