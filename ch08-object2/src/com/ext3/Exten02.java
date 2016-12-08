//참조 자료형: 호출 범위 강제 - 업 캐스팅/다운 캐스팅 
// 
//업 캐스팅과 다운 캐스팅한 참조변수를 통해
//부모클래스 인스턴스 메소드 호출/자식클래스의 인스턴스 메소드 호출

package com.ext3;

//부모클래스
class A{
	public void playA(){
		System.out.println("A클래스");
	}
}

//자식클래스
class B extends A{
	public void playB(){
		System.out.println("B클래스");
	}
}

public class Exten02 {

	public static void main(String[] args) {

		System.out.println("자식 객체 생성: ");
		B objB = new B();
		objB.playA(); //A클래스
		objB.playB(); //B클래스
		
		System.out.println("\n업 캐스팅: ");
		//자식 클래스 타입 (B)-> 부모 클래스 타입(A) 형변환
		//업 캐스팅, 자동적으로 형변환
		//부모 클래스 타입지정시 호출영역: 부모클래스
		A objA = objB;
		objA.playA(); //A클래스
		//호출 범위를 벗어나 호출 불가
		//objA.playB();	//ERROR: The method play() is undefined for the type A
		//자식클래스(B)영역에 있는 메소드(playB) 호출 불가
		
		System.out.println("\n다운 캐스팅: ");
		//부모 클래스 타입(A) -> 자식 클래스 타입(B) 형변환
		//다운 캐스팅, 명시적으로 형변환
		//자식 클래스 타입지정시 호출영역: 부모클래스 + 자식클래스
		B objB2 = (B)objA;
		objB2.playA(); //A클래스
		objB2.playB(); //B클래스
	}
}


/*//출력결과
자식 객체 생성: 
A클래스
B클래스

업 캐스팅: 
A클래스

다운 캐스팅: 
A클래스
B클래스
*/