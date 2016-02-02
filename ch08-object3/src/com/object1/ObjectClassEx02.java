package com.object1;
/*
인스턴스간 내용비교를 위한 내용비교 메소드 정의

== 연산자는 참조 값(주소값)비교를 합니다. 
따라서 인스턴스간 내용비교를 위해서는 내용비교 기능의 메소드가 필요

(개선)
ObjectClassEx03에서 equals()메소드를 재정의하여 수행될 수 있도록 함



*/
class IntNumber {
	int num;
	
	public IntNumber(int num) {
		this.num=num;
	}
	
	//인스턴스간 내용비교를 위한 내용비교 메소드 정의
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
		
		if(num1 == num2){
			System.out.println("num1 == num2");
		}else if(num1 == num3){
			System.out.println("num1 == num3");
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
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
