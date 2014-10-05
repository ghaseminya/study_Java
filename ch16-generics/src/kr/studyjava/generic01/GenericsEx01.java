/* 코드 중복
StudentPerson, EmployeePerson에 동일형태존재하는 코드
StudentPerson, EmployeePerson을 대표할 수 있는 클래스 생성 가능 
-> 중복 제거, 코드 간소화, 유지보수 쉽워짐

중복 코드 제거한 코드
-> kr.studyjava.generic02\GenericsEx01.java

*/

package kr.studyjava.generic01; 

class StudentInfo{
	public int grade;
	//생성자
	StudentInfo(int grade){ 
		this.grade = grade; 
	}
}
class StudentPerson{
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
class EmployeePerson{
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
