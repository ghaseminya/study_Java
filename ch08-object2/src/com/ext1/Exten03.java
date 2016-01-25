/*
//상속관계 속에서의 클래스 관계

상속에서 인스턴스 생성
	• 하위 클래스의 생성자는 상위 클래스의 인스턴스 변수를 초기화할 데이터까지 모두 인자로 전달받아야 합니다.
	• 상위클래스의 생성자 호출(super())은 하위클래스의 멤버변수 초기화 보다 먼저 수행해야 합니다.
	• 하위 클래스의 생성자는 상위 클래스의 생성자 호출을 통해서 상위 클래스의 인스턴스 변수를 초기화 합니다.
	• 키워드 super는 상위 클래스의 생성자 호출에 사용되며 
	  super와 함께 전달되는 인자의 수와 자료형을 참조하여 호출할 생성자가 결정되고 실행됩니다.

//외부에서 호출하는 것은 Employee 클래스의 생성자이므로 
//이 생성자가 부모 클래스의 인스턴스 변수를 초기화할 의무를 지닙니다.
//----------------------------------------
//Employee 인스턴스 생성시 초기화해야 할 인스턴스 변수
//- name	 			(Man 클래스)
//- company, position 	(Employee 클래스)

*/

package com.ext1;

public class Exten03 {

	public static void main(String[] args) {
		//외부에서 호출하는 것은 Employee 클래스의 생성자이므로 부모 클래스의 인스턴스 변수를 초기화할 의무
		Employee man1 = new Employee("김코딩", "Google", "고급 개발자");
		Employee man2 = new Employee("장보리", "Facebook", "수석 엔지니어");

		System.out.println("First info..........");
		man1.showName();
		man1.showInfo();

		System.out.println("");
		System.out.println("Second info..........");
		man2.showInfo();
	}
}

//부모 클래스, 상위 클래스, 기초 클래스
class Person
{
	String name;
	public Person(String name){
		this.name=name;
	}
	
	public void showName() { 
		System.out.println("My name is " + name);
	}
}

//자식 클래스, 하위 클래스, 유도 클래스
class Employee extends Person
{
	String company; 	// 회사명
	String position;	// 직급
	public Employee(String name, String company, String position){
		//name을 인자로 전달받는 상위 클래스의 생성자를 호출
		//상위클래스의 생성자 호출(super())은 하위클래스의 멤버변수 초기화 보다 먼저 수행해야 합니다.
		//super(): super클래스의 생성자를 의미, 인자가 있다면 인자의 형태와 일치하는 생성자를 의미
		super(name);	//상위 클래스의 생성자 호출
		
		// this: 참조 변수, 객체 내에서 나의 객체 참조
		this.company=company;
		this.position=position;
	}
	
	public void showInfo(){
		showName();   	// Person 클래스를 상속했기 때문에 호출 가능
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}