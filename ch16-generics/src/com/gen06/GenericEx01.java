package com.gen06;
/* 복수의 제네릭
//복수의 제네릭 및
//기본자료형을 제네릭에서 사용시 발생한 컴파일 에러 발생 확인

//--------------------------------
File Info
->com.gen06.GenericsEx01.java	기본자료형을 제네릭에서 사용시 컴파일 에러 발생
com.gen07.GenericsEx01.java		기본자료형을 제네릭에서 사용시 발생한 컴파일 에러 해결
//--------------------------------


복수의 제네릭
클래스 내에서 여러개의 제네릭을 필요로 하는 경우


복수의 제네릭 사용시 명명 규칙
	• ,로 구분
	• 제네릭 명칭은 고정된 것은 없으나 중복되지 않게 지정
	• 관습적으로 T이후의 대문자로 지정하고 있습니다



<1글자로 된 영문대문자>
	• API에서는 전달되는 객체가 현 객체 내에서 자료형(Type)으로 쓰일 때 <T>로 유도를 하고 있으며 
	• 만약 전달되는 객체가 현 객체 내에서 하나의 요소(Element)로 자리를 잡을 때는 <E>로
	• 전달되는 객체가 현 객체 내에서 Key값으로 사용될 때는 <K>로, 
	• 만약 전달되는 객체가 현 객체 내에서 Value값으로 사용될 때는 <V>로 표현하고 있습니다. 

구분		설명
<T>		자료형(Type)
<E>		요소(Element)
<K>		Key값
<V>		Value값

*/

class EmployeeInfo {
	public int position;

	EmployeeInfo(int position) {
		this.position = position;
	}
}

class Person<T, S>{
    //두개의 제네릭 사용 T, S
    public T info;
    public S id;
    
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
    
    
}

public class GenericEx01 {
    public static void main(String[] args) {
    	//제네릭에는 참조 데이터 타입만 올수 있습니다.
    	//기본 자료형(int, char, double등)를 사용할 수 없어 컴파일 타임에서 에러 발생
    	//ERROR-Syntax error, insert "Dimensions" to complete ReferenceType
//        Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(10), 10);
        
    	//참고코드
    	//제네릭에는 참조 데이터 타입만 올수 있습니다.
//        Person<EmployeeInfo, Integer> p1 = 
//        		new Person<EmployeeInfo, Integer>(new EmployeeInfo(10), 20);
//        
//        System.out.println("position: " + p1.info.position + ", id: " + p1.id);
    	//position: 10, id: 20
    }
}

