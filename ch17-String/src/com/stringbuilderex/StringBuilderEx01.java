package com.stringbuilderex;
/*
//StringBuffer클래스를 이용하여 문자열 조합


StringBuilder 클래스
	• StringBuilder는 문자열의 저장 및 변경을 위한 메모리 공간을 가지고 있는 클래스(문자열을 조합하는 클래스)
	• StringBuilder는 담겨진 데이터를 이용해서 문자열을 만들어주는 클래스
	• 문자열 데이터의 추가를 위한 append( )메소드와 삽입을 위한 insert( )메소드 제공



String클래스와 StringBuilder클래스 차이
class String
상수형태의 인스턴스를 생성합니다.

class StringBuilder	
문자열을 저장하고 있는 데이터공간이 변경가능한 변수의 성격을 가진 메모리 공간을 가지고 있습니다



*/
public class StringBuilderEx01 {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder=new StringBuilder("Orange");
		System.out.println(stringBuilder);
		//buffer: Orange
		//-> Orange가 버퍼에 저장(Orange가 단순히 데이터로 버퍼에 저장되고 표현될 때 문자열로 바꿔서 표현)		
		
		
		
		stringBuilder.append(27);
		System.out.println(stringBuilder);
		//buffer: Orange27
		//25숫자가 ""뒤에  덧붙여짐

		
		stringBuilder.append('J').append(true);
		System.out.println(stringBuilder);
		//buffer: Orange27Jtrue
		//stringBuilder의 참조값이 반환되고 여기에 계속 append됩니다.
		//연속해서 함수호출이 가능한 이유는 append 메소드가 stringBuilder의 참조 값을 반환하기 때문입니다.
		
		
		//Orange27J (9) 1부터
		stringBuilder.insert(9, "ava");
		System.out.println(stringBuilder);
		//buffer: Orange27Javatrue
		//9번째에 "ava"문자열을 삽입		
		
		
		stringBuilder.insert(stringBuilder.length(), 'Z');
		System.out.println(stringBuilder);
		//buffer: Orange27JavatrueZ
		//stringBuilder 문자열 끝에 'Z' 문자 삽입
	}
}


/* 출력결과
Orange
Orange27
Orange27Jtrue
Orange27Javatrue
Orange27JavatrueZ

*/
