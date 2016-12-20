package com.gen09;
/* 메소드에 제네릭 적용
메소드에 제네릭 적용
제네릭은 메소드에 적용할 수 있습니다. 

*/
class EmployeeInfo {
	public int position;

	EmployeeInfo(int position) {
		this.position = position;
	}
}

//클래스 안에서 사용하는 제네릭
class Person<T, S>{
	public T info;
	public S id;
	Person(T info, S id){ 
		this.info = info;
		this.id = id;
	}

	//함수에서 사용하는 제네릭
	public <U> void printData(U info){
		System.out.println(info);
	}
}

public class GenericEx01 {
	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo(10);
		Integer id = new Integer(20);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(ei, id);

		
		//함수의 제네릭 사용
		//TODO : 제네릭의 데이터 타입 지정 (명시적 지정)
		p1.<EmployeeInfo>printData(ei); //com.gen09.EmployeeInfo@2a139a55
		
		//TODO : 제네릭의 데이터 타입 지정 (자동 지정)
		//제넥릭 생략시 ei에 들어오는 데이터 타입으로 제네릭 타입이 자동으로 결정 됩니다.
		p1.printData(ei); //com.gen09.EmployeeInfo@2a139a55
	}
}


