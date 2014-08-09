/* �ڵ� �ߺ�
StudentPerson, EmployeePerson�� �������������ϴ� �ڵ�
StudentPerson, EmployeePerson�� ��ǥ�� �� �ִ� Ŭ���� ���� ���� 
-> �ߺ� ����, �ڵ� ����ȭ, �������� ������

�ߺ� �ڵ� ������ �ڵ�
-> kr.studyjava.generic02\GenericsEx01.java

*/

package kr.studyjava.generic01; 

class StudentInfo{
	public int grade;
	//������
	StudentInfo(int grade){ 
		this.grade = grade; 
	}
}
class StudentPerson{
	public StudentInfo info;
	//������
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
	//������
	EmployeePerson(EmployeeInfo info){ 
		this.info = info; 
	}
}


public class GenericsEx01 {
	public static void main(String[] args) {
		//��ü ����
		StudentInfo si = new StudentInfo(10);
		//si�� ���ڷ� �ϴ� ��ü ����
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);

		EmployeeInfo ei = new EmployeeInfo(20);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.position);
	}
}
