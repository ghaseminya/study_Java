//super(인자값)

//상속
//인자 있는 생성자만 있는 경우

package com.ext2;

//부모 클래스
class A3{	
	int a = 100;
	
	public A3(String msg){ //인자가 있는 생성자
		System.out.println(msg);		
	}
}

//자식 클래스
class B3 extends A3{
	
	public B3(){
		//default생성자 없이 인자가 있는 생성자만 선언할 경우 부모의 default생성자 호출시 ERROR발생
		//ERROR:The constructor A3() is undefined
//		super();
		
		//인자값이 있는 부모의 생성자 호출
		super("인자가 있는 생성자");	//A3의 String데이터가 전달되는 생성자 호출
						//default생성자 없이 인자 있는 생성자만 선언할 경우
						//자식 클래스에서 super()에 명시적으로 인자값과 함께 호출해 주어야 합니다.	
	}
}

public class SuperEx03 {
	public static void main(String[] args){
		B3 bb3 = new B3();
	}
}