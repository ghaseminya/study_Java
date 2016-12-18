package com.stringbuilderex;
/*
//StringBuilder의 문자열 조합
	• Case 1: 숫자 + 문자열 + 숫자
	• Case 2 : String 클래스 사용
	• Case 3 : StringBuilder클래스 사용

//--------------------
StringBuilder클래스의 인스턴스 갯수
	• 문자열의 복잡한 조합의 과정에서는 StringBuilder의 인스턴스가 활용되며 이 때문에 추가로 생성되는 인스턴스의 수는 최대 두 개입니다
	• StringBuilder인스턴스생성시 하나 생성되며 이 인스턴스의 참조값을 가지고 append()메소드가 호출되며 
	최종적으로 문자열로 전환하는 toString( )가 호출될 때 두번째 인스턴스가 생성되어지게 됩니다.

//숫자 + 문자열 + 숫자
String str1=3+"Java"+7;

String str2=new StringBuilder().append(3).append("Java").append(7).toString();

*/
public class StringBuilderEx03 {

	public static void main(String[] args) {
		//Case 1: 숫자 + 문자열 + 숫자
		String str1=3+"Java"+7;
		System.out.println(str1);
		
		
		//Case 2 : String 클래스 사용
//		String str2 = String.valueOf('3').concat("Java").concat(String.valueOf('7'))
		//이럴경우 문자열 인스턴스가 많이 생성되는 것(5개)을 방지하기 위해서 StringBuilder클래스를 사용
		//총 5개의 인스턴스가 발생
		//1	str1, 
		//2		String.valueOf('3'), 
		//3						.concat("Java"), 
		//4									String.valueOf('7'), 
		//5	String.valueOf('3').concat("Java").concat(String.valueOf('7'))
		System.out.println(str1);
		
		
		//Case 3 : StringBuilder클래스 사용
		//StringBuilder클래스를 사용하여 두개의 인스턴스만 생성됩니다.
		String str3 = new StringBuilder().append(3).append("Java").append(7).toString();
		//1	new StringBuilder().	StringBuilder() 인스턴스 생성시 한개  
		//2	toString()	인스턴스 생성시 한개
		System.out.println(str3);
	}
}


/*//출력결고ㅘ
3Java7
3Java7
3Java7

*/
