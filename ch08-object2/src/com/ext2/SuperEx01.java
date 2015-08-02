//super
  
//생성자를 이용한 부모클래스의 메소드 호출
//별도의 메소드를 통한 부모클래스의 메소드 호출
//메소드 재정의

package com.ext2;

//부모 클래스
class A{
	
	int a = 100;
	
	public void play(){
		System.out.println("부모 클래스의 play");
	}
}

//자식 클래스
class B extends A{
	
//	int a = 100; 
	//super.a로 부모클래스의 a를 호출한다.
//	int a = super.a;
	
//	int a = 200;	
	
	//이영역은 선언하는 영역임
	//super.a 호출해서 부모클래스 값을 확인하는 것이여서
	//super.a와 500이 따로따로 존재하게 된다.
//	super.a = 500; // ERROR-super.a에 500 값이 저장되는 것이 아니라 따로 존재하는 것임
	
	//생성자를 이용한 부모클래스의 메소드 호출
	public B(){
		//부모 클래스의 play()메서드 호출
		super.play();
		System.out.println("super.a: " + super.a);	
	}
	
	//별도의 메소드를 통한 부모클래스의 메소드 호출
	public void getParentPlay(){
		super.play();
		System.out.println("super.a: " + super.a);
	}
	
	//메소드 재정의
	@Override
	public void play(){
		System.out.println("자식 클래스의 play");
	}
}

public class SuperEx01 {
	
	public static void main(String[]  args){
		
		System.out.println("생성자를 통한 부모 메소드 호출:");
		B bb = new B();
		bb.play();
		
		System.out.println();
		System.out.println("자식클래스에서 별도 메소드를 생성하여 부모 메소드 호출:");
		bb.getParentPlay();
		
		System.out.println();
		System.out.println(bb.a);
	}
}
