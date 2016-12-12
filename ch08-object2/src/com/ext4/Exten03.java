//상속후 오버라이딩 / 업 케스팅
//(문법 규칙) 상속시 메소드 오버라이딩 되어 있으면 확장되어 있는 것이 호출됩니다.

package com.ext4;

//부모클래스
class Parent3{
	int a = 100;
	
	public void play(){
		System.out.println("부모 클래스");
	}
}

//자식클래스
class Child3 extends Parent3{
	int a = 200;

	//부모클래스의 play() 메소드 오버라이딩
	@Override
	public void play(){
		System.out.println("자식 클래스");
	}
}

public class Exten03 {

	public static void main(String[] args) {
		
		Child3 ch3 = new Child3();		
		System.out.println(ch3.a); //200
		ch3.play(); //자식 클래스
		
		System.out.println("\n업케스팅: ");
		//부모 클래스 타입으로, 자식 클래스 타입 -> 부모 클래스 타입 형변환, 자동형변환
		Parent3 pa3 = ch3; 
		System.out.println(pa3.a); //100 
		
		//상속시 메소드 오버라이딩 되어 있으면 확장되어 있는 것(오버라이딩된 것)이 호출됩니다.
		pa3.play(); //자식 클래스
		
	}
}


/*//출력결과
200
자식 클래스

업케스팅: 
100
자식 클래스
*/
