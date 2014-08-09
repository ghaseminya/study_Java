/* ���׸��� ����(class)
extends ������
���׸����� �� �� �ִ� ������ Ÿ���� Ư�� Ŭ������ �ڽ����� ����
*/

package kr.studyjava.generic08;

//�θ� Ŭ���� (�� �߻�Ŭ������ �ʿ�� ����)
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
//Person�� T�� Info Ŭ������ �� �ڽ� �ܿ��� �� �� �����ϴ�.
//extends�� ���(extends)�� �ƴ϶� ����(implements)�� ���迡���� ����� �� �ֽ��ϴ�.
//InfoŬ������ �ڽĵ� ���� T�� �ü� �ֽ��ϴ�.
class Person<T extends Info>{
	public T info;
	Person(T info){ this.info = info; }
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

