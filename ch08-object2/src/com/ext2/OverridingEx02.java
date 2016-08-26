/*
//오버라이딩(Overriding) vs 오버로딩(Overroading) 차이
//오버라이딩 관계에서의 메소드 호출
	• 참조변수의 자료형에 상관없이 오버라이딩 된 메소드는 외부로부터 가려지므로,
	• 마지막으로 오버라이딩 한 메소드가 호출됩니다.


[오버라이딩(Overriding) vs 오버로딩(Overroading)]
구분		오버라이딩(재정의)													오버로딩(다중정의)
적용		상속관계															특정 클래스

접근제한	• super클래스의 메소드보다 sub클래스의 메소드 접근제한이 동일하거나 더 넓어야 합니다.		상관없음
		• 예)protected라면 proteced/public이여야 합니다.

리턴형		기본적으로 같아야 함												상관없음

메소드명	super클래스의 메소드명과 sub클래스의 메소드명이 같아야 함						반드시 같아야 함

인자(타입,개수)	반드시 같아야 함													반드시 달라야 함

 */
package com.ext2;

class AClass{
	public void rideMethod(){
		System.out.println("AClass's Method");
	}
	public void loadMethod(){
		System.out.println("void Method");
	}
}

class BClass extends AClass{
	@Override
	public void rideMethod(){
		System.out.println("BClass's Method");
	}

	//오버로딩 (중복정의)
	public void loadMethod(int num){
		System.out.println("int Method");
	}
}

class CClass extends BClass{
	@Override
	public void rideMethod(){
		System.out.println("CClass's Method");
	}

	//오버로딩 (중복정의)
	public void loadMethod(double num){
		System.out.println("double Method");
	}
}

public class OverridingEx02 {

	public static void main(String[] args) {
		AClass ref1=new CClass();		
		BClass ref2=new CClass();
		CClass ref3=new CClass();
		//컴파일 완료된 후(문장이 끝난후) 참조변수에 대한 자료형 정보를 가지고 있지만 
		//실제로 뭘 참조하는 지는(new CClass()) 지워지게 됩니다.

		ref1.rideMethod(); //CClass's Method
		ref2.rideMethod(); //CClass's Method
		ref3.rideMethod(); //CClass's Method
		//참조변수의 자료형에 상관없이 오버라이딩 된 메소드는 외부로부터 가려지므로,
		//마지막으로 오버라이딩 한 메소드가 호출됩니다

		ref3.loadMethod(); //void Method
		ref3.loadMethod(1); //int Method
		ref3.loadMethod(1.2); //double Method
	}
}
