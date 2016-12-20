package com.wrapper;
/*
//boxing/unboxing
//boolean boxing/unboxing하기
//int boxing/unboxing하기


Wrapper클래스(래퍼클래스)
	• 기본 자료형 데이터를 인스턴스화 해야 하는 상황에서 사용할 수 있는 클래스를 가리켜 Wrapper 클래스라고 합니다
	• 기본 자료형을 참조자료형으로 변환할 때(객체로 사용할 때) 사용하는 클래스입니다.
	• 즉, 기본데이터타입을 마치 객체인 것 처럼 만들 수 있는 클래스를 wrapper클래스라고 합니다.



[자바에서 제공되는 Wrapper클래스]
Wrapper 클래스는 기본 자료형 데이터를 저장 및 참조할 수 있는 구조로 정의됩니다.
기본자료형		Wrapper클래스		Wrapper클래스 생성자
boolean		Boolean			Boolean(boolean value)
char		Character		Character(char value)
byte		Byte			Byte(byte value)
short		Short			Short(short value)
int			Integer			Integer(int value)
long		Long			Long(long value)
float		Float			Float(float value)
							Float(double value) 
double		Double			Double(double value)



[Wrapper클래스의 Boxing & UnBoxing]
Boxing		• 기본자료형 -> 참조자료형
			• 기본 자료형 데이터를 Wrapper 인스턴스로 감싸는 것
			
UnBoxing	• 참조자료형 -> 기본자료형
			• Wrapper 인스턴스에 저장된 데이터를 꺼내는 것


★ Wrapper클래스의 Boxing & UnBoxing
http://codedragon.tistory.com/4465
http://cfile3.uf.tistory.com/image/22159D48582E9868084B23



Wrapper 클래스의 기본 메소드
Wrapper class 객체에서 해당 메소드를 사용은 형변환이 가능한 메소드만 사용 가능합니다.

객체명.기본메소드명()

메소드					설명 
boolean booleanValue()	객체의 값(기본형 데이터)를 문자열로 바꾼 뒤에 반환 
byte byteValue()		객체의 값을 byte 값으로 변환하여 반환 
double doubleValue() 	객체의 값을 double 값으로 변환하여 반환 
float floatValue() 		객체의 값을 float 값으로 변환하여 반환 
int intValue() 			객체의 값을 int 값으로 변환하여 반환 
long longValue() 		객체의 값을 long 값으로 변환하여 반환 
short shortValue()		객체의 값을 short 값으로 변환하여 반환 



Wrapper클래스 활용
• 기본 자료형을 참조자료형으로 변환할 때(객체로 사용할 때) 사용하는 클래스입니다.
• 대표적으로 제네릭 클래스의 객체 생성시 활용됩니다.

*/

public class WrapperEx01 {

	public static void main(String[] args) {
		
		//기본자료형
		boolean b = true;
		
		//객체 생성
		//참조자료형(객체 자료형): 자바 내부에서 제공되는 클래스 또는 프로그래머에 의해 만들어진 사용자 정의 클래스 등을 자료형으로 하는 것
		//기본자료형 데이터를 생성자를 통해 객체 생성(참조자료형) 즉, 기본자료형 -> 참조자료형 (boxing, 박싱)
		Boolean wrap_boolean = new Boolean(b);
		
		//기본자료형 출력
		System.out.println("b: " + b); //b: true
		//출력할때 원래의 자료형으로 출력하기
		//참조자료형 -> 기본자료형 (unboxing, 언박싱)
		//booleanValue() : 객체의 값(기본형 데이터)를 문자열로 바꾼 뒤에 반환 
		System.out.println("wrap_boolean: " + wrap_boolean.booleanValue()); //wrap_boolean: true
		System.out.println();
		
		
		//기본자료형 -> 참조자료형 (boxing)
		Integer wrap_integer = new Integer(100);
		
		//참조자료형 -> 기본자료형 (unboxing)
		//intValue() : 객체의 값을 int 값으로 변환하여 반환 
		int i = wrap_integer.intValue();
		System.out.println("i: " + i); //i: 100
		
		System.out.println("wrap_integer: " + wrap_integer.intValue()); //wrap_integer: 100
	}
}
