/* ������ ���׸�

������ ���׸�
Ŭ���� ������ �������� ���׸��� �ʿ�� �ϴ� ���

������ ���׸� ���� ��� ��Ģ
,�� ����
���׸� ��Ī�� ������ ���� ������ �ߺ����� �ʰ� ����
���������� T������ ����ڷ� �����ϰ� �ֽ��ϴ�


�⺻�ڷ����� ���׸����� �߻��� ������ ���� �ذ��ϱ�
-> kr.studyjava.generic05\GenericsEx01.java

*/
package kr.studyjava.generic04;

class EmployeeInfo{
    public int position;
    EmployeeInfo(int position){ this.position = position; }
}

class Person<T, S>{
    //�ΰ��� ���׸� ��� T, S
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
}

public class GenericEx01 {
    public static void main(String[] args) {
        //���׸����� ���� ������ Ÿ�Ը� �ü� ���� 
    	//�⺻ �ڷ���(int, char, double��)�� ����� �� ���� ������ Ÿ�ӿ��� ���� �߻�
 //       Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(10), 10);
    }
}
