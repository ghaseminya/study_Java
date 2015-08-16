//Wrapper클래스 인스턴스 생성

//강의내용
//	• 개발자가 정의한 Wrapper클래스 사용
//	• 자바에서 제공하는 Wrapper클래스 사용
//	• 문자열 기반으로 정의된 Wrapper클래스도 존재하며 인스턴스 생성
//	• 문자열 기반 Wrapper클래스 사용에 대한 API문서의 생성자 부분 참조하기
//-------------------------------------------------
//개발자가 직접 정의한 integer형 기본자료형에 대한 Wrapper클래스 정의
//이 Wrapper 클래스에서 기본 자료형 데이터를 저장 및 참조할 수 있는 구조로 정의


package com.wrapper;

// Wrapper클래스 정의
class IntWrapper {
	private int num;
	
	public IntWrapper(int data)	{
		num=data;
	}
	
	@Override
	public String toString() {
		return ""+num;
	}
}

class WrapperEx03 {
	public static void showData(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		IntWrapper intInstance=new IntWrapper(3);	//개발자가 정의한  Wrapper클래스 사용
		Integer basicIntInstance = new Integer(10);	//자바에서 제공하는 Wrapper클래스 사용
		
		showData(intInstance); //3
		showData(new IntWrapper(7)); //7
		showData(basicIntInstance); //10
		
		
		//문자열 기반 Wrapper클래스
		//문자열 기반으로 정의된 Wrapper클래스도 존재하며 인스턴스 생성도 가능합니다.
		//해당 내용은 API문서에서 생성자 부분을 참고하시기 바랍니다.
		Integer num1 = new Integer("300");
		Integer num2 = new Integer("200");
		System.out.println("num1: " + num1); //num1: 300
		System.out.println("num1+num2: " + (num1+num2) ); //num1+num2: 500
		
	}
}