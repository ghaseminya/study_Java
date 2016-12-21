package com.gen04;
/* 
코드의 중복 제거
com.gen03.GenericsEx01.java의 코드 중복 제거하여 중복 코드를 제거한 코드

//------------------------------------
File Info
com.gen03.GenericsEx01.java		코드 중복

->com.gen04.GenericsEx01.java	중복 코드를 제거한 코드
								코드 중복 제거후 발행한 타입이 안전하지 않은 문제점 발생
								
com.gen05.GenericsEx01.java		중복제거 후 타입이 안전하지 않은 문제점을 제네릭화하여 해결

//------------------------------------
코드 중복은 제거되었지만 타입이 안전하지 않은(Type Safety)문제 발생
코드 중복 제거후 발행한 타입이 안전하지 않은 문제점 해결
-> com.gen05.GenericsEx01.java

*/

class StudentInfo {
	public int grade;

	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int position;

	EmployeeInfo(int position) {
		this.position = position;
	}
}


//StudentPerson, EmployeePerson을 대표할 수 있는 클래스 생성
//코드 중복 제거
class Person {
	// 모든 클래의 공통 조상인 Object 타입으로 정의
	public Object info;

	Person(Object info) {
		this.info = info;
	}
}

public class GenericsEx01 {
    public static void main(String[] args) {
		
    	//TODO : 정확안 타입 지정하여 사용
		Person ep = new Person(new EmployeeInfo(20));
		EmployeeInfo ei = (EmployeeInfo)ep.info;
		System.out.println(ei.position);  // 성공
    	
		
		
    	//TODO : 타입이 안전하지 않은(Type Safety)문제 발생 확인하기

        Person p1 = new Person("사장");
        //p1.info는 Object타입인데 형변환하여 EmployeeInfo로 변경
        //런타임시 java.lang.ClassCastException 발생
//        EmployeeInfo ei = (EmployeeInfo)p1.info;
//        System.out.println(ei.position);
    
        
		//컴파일 에러
//		String ei2 =(String)p1.info;
//		System.out.println(ei2.position);
        
        
        //컴파일 에러
//        Object ei1 =(Object)p1.info;
//		System.out.println(ei1.position);
		

    }
}

/* 출력결과 - ㄴ런타임 에러 발생
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to com.gen04.EmployeeInfo
	at com.gen04.GenericsEx01.main(GenericsEx01.java:38)


컴파일시 예외가 발행하지 않고 런타임시 java.lang.ClassCastException 발생

Object로 지정하여 어떤 데이터타입도 올수 있게됨에 따라 타입이 안전하지 않게 되었습니다.

타입이 안전하지 않음(Type Safety): 
JAVA는 안전하지 않은 타입 사용 허용되지 않습니다.
Javascript, Ruby, PHP는 타입에 상관 안합니다. 변수에 어떤한 값이 저장되든 상관하지 않고 개발자에게 책임을 위임하는 형태입니다.

자바와 같은 언어는
코딩하는 단계에서 변수저장시 저장되는 타입을 지정하고 변수안에는 해당 데이터 타입만 들어와야만 하는 언어입니다.
그래서, 현재 코드에서 발생하는 이 부분을 해결하기 위해 제네릭이 도입되었습니다.(컴파일시 예외가 발행하지 않고 런타임시 에러발생하는 문제 해결)
제네릭으로 수행하게 되면 컴파일단계에서 타입 체크를 할 수 있게 되어 타입이 맞지 않은 경우 컴파일 단계에서 확인할 수 있습니다.


컴파일언어를 사용하는 중요한 장점은 
프로그램이 되기전에 개발자의 오류나 실수를 미리 잡아주게 됩니다.(컴파일의 중요한 이점)

변수의 데이터타입을 정의하는 장점은 
해당 변수에 지정한 데이터타입만 들어오는 것을 보장하고 다른 데이터형이 들어오는 것을 금지시키는 효과를 줍니다.

타입 안전, 코드 중복 제거를 위해 JDK5.0 버전부터 제네릭 기능이 자바에 도입되었습니다.

*/
