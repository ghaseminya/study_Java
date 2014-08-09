/* �ڵ��� �ߺ� ����
kr.studyjava.generic01\GenericsEx01.java�� �ڵ� �ߺ� ����

�ڵ� �ߺ� ������ ������ Ÿ���� �������� ���� ������ �ذ�
-> kr.studyjava.generic03\GenericsEx01.java

*/

package kr.studyjava.generic02;


class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int position;
    EmployeeInfo(int position){ this.position = position; }
}


//�ڵ� �ߺ� ����
class Person{
    //��� Ŭ���� ���� ������ Object Ÿ������ ����
    public Object info;
    Person(Object info){ this.info = info; }
}
public class GenericsEx01 {
    public static void main(String[] args) {

        Person p1 = new Person("����");
        //p1.info�� ObjectŸ���ε� ����ȯ�Ͽ� EmployeeInfo�� ����
        //��Ÿ�ӽ� java.lang.ClassCastException �߻�
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.position);
    }
}

/*
�����Ͻ� ���ܰ� �������� �ʰ� ��Ÿ�ӽ� java.lang.ClassCastException �߻�

Object�� �����Ͽ� � ������Ÿ�Ե� �ü� �ְԵʿ� ���� Ÿ���� �������� �ʰ� �Ǿ����ϴ�.
Ÿ���� �������� ����(Type Safety): 
JAVA�� ������ ���� / 
Javascript, Ruby, PHP�� Ÿ�Կ� �������. ������ ��� ���� ����ǵ� ������� �ʰ� �����ڿ��� å���� ����.

�ڹٿ� ���� ����
�ڵ��ϴ� �ܰ迡�� ��������� ����Ǵ� Ÿ���� �����ϴ� ���� �����ȿ��� �ش� ������ Ÿ�Ը� ���;߸� �ϴ� ����Դϴ�.
�� �ڵ忡�� �߻��ϴ� �� �κ��� �ذ��ϱ� ���� ���׸��� ���Ե� (�����Ͻ� ���ܰ� �������� �ʰ� ��Ÿ�ӽ�)

�����Ͼ� ����ϴ� �߿��� ������ ���α׷��� �Ǳ����� �������� ������ �Ǽ��� �̸� ����ְ� �˴ϴ�.(�������� �߿��� ����)

������ ������Ÿ���� �����ϴ� ������ �ش� ������ ������ ������Ÿ�Ը� ������ ���� �����ϰ� �ٸ� ���������� ������ ���� ������Ű�� ȿ���� ��.

Ÿ�� ����, �ڵ� �ߺ� ���Ÿ� ���� ���׸� ����� �ڹٿ� ���ԵǾ����ϴ�.

*/
