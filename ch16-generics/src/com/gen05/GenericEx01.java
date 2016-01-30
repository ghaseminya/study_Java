/* 
//제네릭화 변경
com.gen04.GenericsEx01.java의 중복제거 후 타입이 안전하지 않은 문제점을 제네릭화하여 해결 


제네릭화의 이점
-컴파일 단계에서 오류가 검출됩니다. 
(인스턴스 생성시 결정된 T의 자료형에 일치하지 않으면 컴파일 에러가 발생 하므로 자료형에 안전)
-중복의 제거와 타입 안전성을 동시에 추구할 수 있게 됩니다.

 */
package com.gen05;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){ 
		this.grade = grade; 
	}
}

class EmployeeInfo{
	public int position;
	EmployeeInfo(int position){ 
		this.position = position; 
	}
}

class Person<T>{
	public T info;
	Person(T info){ 
		this.info = info; 
	}
}

public class GenericEx01 {
	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		//T를 EmployeeInfo로 결정해서 EmployeeInfo의 인스턴스를 생성하고 
		//이를 참조할 수 있는 참조변수를 선언해서 참조 값을 저장합니다.

		EmployeeInfo ei1 = p1.info;
		System.out.println(ei1.position); // 성공

		Person<String> p2 = new Person<String>("사장");
		String ei2 = p2.info;
		//p2.info가 String이고 
		//String은 position 필드가 없는데 이것을 호출하고 있기 때문에 컴파일 에러가 발생합니다. 
//		System.out.println(ei2.position); // 컴파일 에러
	}
}

