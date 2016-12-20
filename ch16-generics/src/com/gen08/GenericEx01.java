package com.gen08;
/* 제네릭의 생략
제네릭은 생략 가능합니다. 

*/
class EmployeeInfo{
	public int position;
	
	EmployeeInfo(int position){ 
		this.position = position; 
	}
}
class Person<T, S>{
	public T info;
	public S id;
	
	Person(T info, S id){ 
		this.info = info;
		this.id = id;
	}
}

public class GenericEx01 {
	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo(10);
		Integer id = new Integer(20);
		
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(ei, id);
		
		System.out.println(p1.info.position); //10
		System.out.println(p1.id.intValue()); //20
		System.out.println();

		//TODO : 제네릭은 생략 가능
		//ei, id로 들어오는 값을 통해 명시적으로 지정하지 않아도 컴파일시 자동으로 해석하게 됩니다.
		//그렇지만 경고메시지는 발생합니다.
		//Warning-Person is a raw type. References to generic type Person<T,S> should be parameterized
		Person<EmployeeInfo, Integer> p2 = new Person(ei, id);
		System.out.println(p2.info.position); //10
		System.out.println(p2.id.intValue()); //20
	}
}

