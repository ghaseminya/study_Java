/*
상속관계 속에서의 클래스 관계

외부에서 호출하는 것은 Employee 클래스의 생성자이므로 
이 생성자가 부모 클래스의 인스턴스 변수를 초기화할 의무를 지닙니다.

Employee 인스턴스 생성시 초 기화해야 할 인스턴스 변수
- name	 			(클래스 Man)
- company, position (클래스 Employee)


*/
package com.ext1;

public class Exten03 {

	public static void main(String[] args) {
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

class Person
{
	String name;
	public Person(String name){this.name=name;}
	public void showName() { System.out.println("My name is "+name); }
}

class Employee extends Person
{
	String company; 	// 회사명
	String position;	// 직급
	public Employee(String name, String company, String position)
	{
		//name을 인자로 전달받는 상위 클래스의 생성자를 호출
		//상위클래스의 생성자 호출(super())은 하위클래스의 멤버변수 초기화 보다 먼저 수행해야 합니다.
		super(name);	//상위 클래스의 생성자 호출
		
		this.company=company;
		this.position=position;
	}
	public void showInfo()
	{
		showName();   	// Man 클래스를 상속했기 때문에 호출 가능
		System.out.println("My company is "+company);
		System.out.println("My position is "+position);
		
	}
}