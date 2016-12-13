/*
//super

super와 super()
super	• this와 함께 객체를 참조할 수 있는 reference변수
		• this는 특정 객체 내에서 자기 자신의 객체를 참조할 수 있는 유일한 reference변수
		• super는 현재 객체의 바로 상위인 super클래스(부모클래스)를 참조할 수 있는 reference변수
		
super()	• super클래스의 생성자를 의미
		• 인자가 있다면 인자의 형태와 일치하는 생성자를 의미

//--------------------------------------
//학습내용
//생성자를 이용한 부모클래스의 메소드 호출 (1)
//별도의 메소드를 통한 부모클래스의 메소드 호출 (2)
//메소드 재정의 (3)

*/

package com.ext4;

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
//	int a = super.a; //동일한 코드
	
	//상위클래스의 a값 변경
//	int a = 200;	
	
	//이영역은 선언하는 영역임
	//super.a 호출해서 부모클래스 값을 확인하는 것이여서
	//super.a와 500이 따로따로 존재하게 된다.
//	super.a = 500; // ERROR-super.a에 500 값이 저장되는 것이 아니라 따로 존재합니다.
				   // Syntax error, insert "}" to complete Block
	
	//TODO 1: 생성자를 이용한 부모클래스의 메소드 호출 (1)
	public B(){
		//부모 클래스의 play()메서드 호출
		super.play();
		System.out.println("super.a: " + super.a);	
	}
	
	//TODO 2: 별도의 메소드를 통한 부모클래스의 메소드 호출 (2)
	public void getParentPlay(){
		super.play();
		System.out.println("super.a: " + super.a);
	}
	
	//TODO 3: 메소드 재정의 (3)
	@Override
	public void play(){
		System.out.println("자식 클래스의 play");
	}
}

public class SuperEx01 {
	
	public static void main(String[]  args){
		
		System.out.println("생성자를 통한 부모 메소드 호출:");
		B bb = new B(); //부모 클래스의 play
						//super.a: 100
		//재정의전 호출
		bb.play();
		
		//재정의후 호출
		bb.play(); //자식 클래스의 play
		System.out.println();
		
		
		System.out.println("자식클래스에서 별도 메소드를 생성하여 부모 메소드 호출:");
		bb.getParentPlay(); //부모 클래스의 play 
							//super.a: 100
		System.out.println();
		
		System.out.println(bb.a); //100
	}
}
