/*
//인터페이스의 기본 구성과 구현

인터페이스(Interface)
	• 인터페이스는 TV의 리모콘이나 음식점의 메뉴판에 비유할 수 있습니다.
	//• 리모콘으로 채널을 조작하게 되는데 리모콘 자체가 무언가 보여주지는 않습니다. 
	     또 메뉴판을 보고 원하는 음식을 주문하게 되는데 메뉴판 자체가 음식을 만들어주지는 않습니다. 
	//• 사용자가 선택한 실제 TV프로그램은 전파를 타고 TV수신기를 통해 TV모니터상에 보여주게 됩니다. 
	     사용자가 선택한 실제 음식은 주방에서 만들어져 나오게 됩니다.
	• 리모콘과 메뉴판은 사용자가 주문할 수 있는 서비스의 목록(기능 목록)제공하고 있습니다. 


인터페이스 선언
	• 인터페이스 내에는 상수 또는 추상 메서드들만 정의가 가능
	• 인터페이스를 사용하기 위해서는 일반 클래스에서 구현(implements)을 해야 합니다. 
	• 일반 클래스에서 “implements”라는 예약어로 특정 인터페이스를 구현하겠다고 명시해야 합니다
	• 이렇게 한 후 명시한 인터페이스가 가지는 추상 메서드들은 구현 받은 클래스에서 하나도 빠짐없이 Overriding(재정의)해야 합니다. 


인터페이스 선언 형식
[접근제한] interface [인터페이스명] {
   상수;
   추상메서드;
} 

*/

package com.inter1;

//인터페이스 선언
interface InterfaceTest {
	//상수 또는 추상메서드만 정의 가능
	static final int A = 100;
	abstract int getA(); //abstract예약어는 생략 가능!
}

//implements라는 예약어로 인터페이스 구현
public class InterfaceEx05 implements InterfaceTest{

	//추상메서드 재정의
	@Override
	public int getA(){
		return A;
	}

	public static void main(String[] args){
		InterfaceEx05 ife = new InterfaceEx05();
		System.out.println("getA(): " + ife.getA()); //getA(): 100
	}
}
