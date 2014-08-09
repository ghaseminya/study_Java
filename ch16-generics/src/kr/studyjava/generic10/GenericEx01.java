/* ���׸� ����
���׸��� Ư������ ������  extends Object�� ������ �ǹ̰� �˴ϴ�. Object�� �ڽ��̸� ��� �� �� �ֽ��ϴ�. 
Object�� ������ �ִ�(��� Ŭ������ ������ �ִ�) �޼ҵ�(toString, Clone��)�� ������ �޼ҵ�� ���׸����� ������  ��ü������ ȣ���� �� �����ϴ�. 
�ܼ��� Object�� �����̱� ������ Object�� ������ �ִ� �͸� ����� �� �ֽ��ϴ�.

 */
package kr.studyjava.generic10;

abstract class Info{
	//�߻� �޼ҵ�
	public abstract int getInfo();
}

class EmployeeInfo extends Info{
	public int position;
	EmployeeInfo(int position){ this.position = position; }

	//�߻� �޼ҵ� ����
	@Override
	public int getInfo(){
		return this.position;
	}
}
//
class Person<T>{
	public T info;
	Person(T info){ 
		this.info = info; 

		//���׸��� Ư������ ������  extends Object�� ������ �ǹ̰� �˴ϴ�. Object�� �ڽ��̸� ��� �ü� �ֽ��ϴ�. 
		//Object�� ������ �ִ�(��� Ŭ������ ������ �ִ�) �޼ҵ�(toString, Clone��)�� ������ �޼ҵ�� ���׸����� ������  ��ü������ ȣ���� �� �����ϴ�. 
		//�ܼ��� Object�� �����̱� ������ Object�� ������ �ִ� �͸� ����� �� �ֽ��ϴ�.
		//EmployeeInfoŬ������ getInfo()ȣ���� �� �����ϴ�.
//        info.getInfo();	//������ ���� �߻�
	}
}


public class GenericEx01 {
	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(10));
		Person<String> p2 = new Person<String>("����");
	}
}


