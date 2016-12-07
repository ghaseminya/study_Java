//super()

//상속
//디폴트 생성자만 있는 경우
//-----------------------------
//학습내용
//디폴트 생성자가 암묵적으로 삽입되는 것 코드로 확인


package com.ext2;

//부모 클래스
class Parent2{
//class Parent2 extends Object{ //내부적으로 최상위 클래스인 Object클래스를 상속받고 있습니다.
	
	public Parent2(){
		super(); //Object 클래스의 디폴트 생성자 (암묵적으로 삽입됨)
	}
	
	int a;
}

//자식 클래스
class Child2 extends Parent2{
	
	public Child2() {
		super(); //부모 클래스(Parent2)의 디폴트 생성자 (암묵적으로 삽입됨)
	}
	
	int b;
}

public class SuperEx02 {

	public static void main(String[] args){
		
		Child2 ch = new Child2();

		System.out.println(ch.a); //0
		System.out.println(ch.b); //0
		
		ch.a=10;
		ch.b=20;
		System.out.println(ch.a); //10
		System.out.println(ch.b); //20
	}
}


//출력결과
//0
//0
//10
//20

