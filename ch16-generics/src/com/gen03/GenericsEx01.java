package com.gen03; 
/* 코드 중복
StudentPerson, EmployeePerson에 동일형태 존재하는 코드 존재
-> 중복 코드 존재

StudentPerson, EmployeePerson을 대표할 수 있는 클래스 생성 하여 
-> 중복 제거, 코드 간소화, 유지보수 간편화 구현

//-------------------------

File Info : 제네릭 만들어지는 과정 학습
->com.gen03.GenericsEx01.java	코드 중복

com.gen04.GenericsEx01.java		중복 코드를 제거한 코드
								코드 중복 제거후 발행한 타입이 안전하지 않은 문제점 발생
								
com.gen05.GenericsEx01.java		중복제거 후 타입이 안전하지 않은 문제점을 제네릭화하여 해결

*/

class StudentInfo{
	public int grade;
	//생성자
	StudentInfo(int grade){ 
		this.grade = grade; 
	}
}
class StudentPerson{ //자료형만 다르고 동일한 형태과 구조를 가지는 중복 코드
	public StudentInfo info;
	//생성자
	StudentPerson(StudentInfo info){ 
		this.info = info; 
	}
}

class EmployeeInfo{
	public int position;
	EmployeeInfo(int position){ 
		this.position = position; 
	}
}
class EmployeePerson{ //자료형만 다르고 동일한 형태과 구조를 가지는 중복 코드
	public EmployeeInfo info;
	//생성자
	EmployeePerson(EmployeeInfo info){ 
		this.info = info; 
	}
}


public class GenericsEx01 {
	public static void main(String[] args) {
		//객체 생성
		StudentInfo si = new StudentInfo(10);
		
		//si를 인자로 하는 객체 생성
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);

		EmployeeInfo ei = new EmployeeInfo(20);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.position);
	}
}


/*//출력결과
10
20
*/

