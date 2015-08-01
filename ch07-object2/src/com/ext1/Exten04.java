//동일 패키지로 묶인 두 클래스간 상속시 멤버변수 호출

//private < default < protected < public
//클래스내부 < 동일패키지 < 상속 클래스 < 이외의 영역(아무 관계 없음)

package com.ext1;


//부모 클래스
class Bird{
	int num1;			//default멤버변수
	protected int num2;	//protected멤버변수
	//위 두개의 멤버변수는 상속관계에 앞서 동일 패키지로 묶여있는 Eagle 클래스에 의해 접근 가능합니다.
	
	public void smile(){
		System.out.println("부모 클래스");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}

//자식 클래스 -> 상속
class Eagle extends Bird{
	
	Eagle(){
		num1=10;	//클래스 Bird의 default멤버변수에 접근
		num2=20;	//클래스 Bird의 protected멤버변수에 접근
	}
	
	public void fun(){
		System.out.println("자식 클래스");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}

public class Exten04 {

	public static void main(String[] args) {

		Eagle eagle = new Eagle();
		eagle.fun();
		eagle.smile();
	}

}


