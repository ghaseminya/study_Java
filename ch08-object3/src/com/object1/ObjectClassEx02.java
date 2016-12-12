package com.object1;
/*
인스턴스간 내용비교를 위한 내용비교 메소드 정의
	• == 연산자는 참조 값(주소값) 비교를 합니다. 
	• 따라서 인스턴스간 내용비교를 위해서는 내용비교 기능의 메소드가 필요
	• (개선)ObjectClassEx03에서 equals()메소드를 재정의하여 수행될 수 있도록 변경


File Info
->object1.ObjectClassEx02	인스턴스간 내용비교를 위한 내용비교 메소드 정의 (==연산자 사용)
object1.ObjectClassEx03		Object클래스의 equals()메소드를 재정의하여 내용비교

//-----------------------------------------

Object Class(오브젝트 클래스) 정의
	• 모든 클래스의 최상위 클래스
	• 명시적으로 extends하지 않아도 자동으로 상속합니다.
	• 즉, 프로그래머가 명시적으로 extends 하는 클래스가 없으면 자동으로 자바 컴파일러가   Object 클래스를 상속받도록 처리합니다.



*/
class IntNumber {
	int num;
	
	public IntNumber(int num) {
		this.num=num;
	}
	
	//TODO 3: 인스턴스간 내용비교를 위한 내용 비교 메소드 정의
	public boolean isEquals(IntNumber numObj) {
		if(this.num==numObj.num)
			return true;
		else
			return false;
	}
}

public class ObjectClassEx02 {
	public static void main(String[] args) {
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(15);
		IntNumber num3=new IntNumber(10);
		
		//TODO 1: == 연산자는 참조 값(주소값)비교
		if(num1 == num2){
			System.out.println("num1 == num2");
		}else if(num1 == num3){
			System.out.println("num1 == num3");
		}else{
			System.out.println("no match");
		}
		//no match
		
		
		//TODO 2: 객체의 참조값 확인
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		//TODO 4: 비교 메소드 호출 
		if(num1.isEquals(num2))
			System.out.println("num1과 num2는 같은 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		//num1과 num2는 다른 정수
		
		if(num1.isEquals(num3))
			System.out.println("num1과 num3는 같은 정수");
		else
			System.out.println("num1과 num3는 다른 정수");
		//num1과 num3는 같은 정수
	}

}

/*//출력결과
no match
com.object1.IntNumber@2a139a55
com.object1.IntNumber@15db9742
com.object1.IntNumber@6d06d69c
num1과 num2는 다른 정수
num1과 num3는 같은 정수
*/