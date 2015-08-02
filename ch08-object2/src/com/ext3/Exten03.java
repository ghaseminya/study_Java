//상속후 오버라이딩 / 업 케스팅
//문법 규칙) 상속시 메소드 오버라이딩 되어 있으면 확장되어 있는 것이 호출됩니다.

package com.ext3;

class Parent3{
	int a = 100;
	public void play(){
		System.out.println("부모 클래스");
	}
}

class Child3 extends Parent3{
	int a = 200;

	@Override
	public void play(){
		System.out.println("자식 클래스");
	}
}

public class Exten03 {

	public static void main(String[] args) {
		
		Child3 ch3 = new Child3();		
		System.out.println(ch3.a);
		ch3.play();
		
		System.out.println("\n업케스팅: ");
		//부모 클래스 타입으로
		Parent3 np3 = ch3;
		System.out.println(np3.a);
		np3.play();
		
		
		

	}

}
