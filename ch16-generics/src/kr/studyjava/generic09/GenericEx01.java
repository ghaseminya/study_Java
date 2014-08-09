/* ���׸��� ����(interface)
���׸��� extends�� ���(extends)�� �ƴ϶� ����(implements)�� ���迡���� ����� �� �ֽ��ϴ�.
*/

package kr.studyjava.generic09;

//�������̽� ����
interface Info{
	int getInfo();
}

//�������̽� ���� Ŭ����
class EmployeeInfo implements Info{
	public int position;
	EmployeeInfo(int position){ this.position = position; }


	public int getInfo(){
		return this.position;
	}
}

//���׸����� extends�� ����Ѵٴ� �ǹ̰� �ƴ϶� �θ� �������� ����ϴ� �뵵�� ���˴ϴ�.
class Person<T extends Info>{
	public T info;
	Person(T info){ 
		this.info = info; 
		info.getInfo();
	}
}

public class GenericEx01 {

	public static void main(String[] args) {
		//Info�� �ڽ��� Ÿ���� ����
		//Person p1 = new Person(new EmployeeInfo(1));  //���� �ڵ带 �Ʒ����� ��������� ����
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(p1.info.getInfo());

		//Info�� �ڽ��� �ƴ� Ÿ���� ����
//		Person<String> p2 = new Person<String>("����");	//������ ����
	}
}
