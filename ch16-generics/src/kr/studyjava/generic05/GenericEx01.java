/* �⺻ ������ Ÿ�԰� ���׸�

kr.studyjava.generic04\GenericsEx01.java ���� �⺻�ڷ����� ���׸����� �߻��� ������ ���� �ذ��ϱ�

���׸������� ���� ������ Ÿ�Ը� �ü� �ֽ��ϴ�.
�⺻ �ڷ���(int, char, double��)�� ����� �� �����ϴ�.

�ڹٿ����� �⺻������Ÿ���� ��ü�� ����ϱ� ���� wrapperŬ������ ������ �ְ� �ֽ��ϴ�. 
�⺻������Ÿ���� ��ġ ��ü�ΰ� ó�� ���� �� �ִ� Ŭ������ wrapperŬ����(����Ŭ����)��� �մϴ�.

*/
package kr.studyjava.generic05;

class EmployeeInfo{
  public int position;
  EmployeeInfo(int position){ this.position = position; }
}
class Person<T, S>{
  public T info;
  public S id;
  Person(T info, S id){ 
      this.info = info;
      this.id = id;
  }
}
public class GenericEx01 {
  public static void main(String[] args) {
      EmployeeInfo e = new EmployeeInfo(10);
      //new Integer�� �⺻ ������ Ÿ���� int�� ���� ������ Ÿ������ ��ȯ���ִ� ������ �ϴ� ���� Ŭ����
      //�⺻ ������ Ÿ���� ����� �� ���� ���׸����� int�� ����� �� ����
      Integer id = new Integer(20);
      Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, id);
      //����Ŭ������ ��� �ִ� ������ ���ڸ� �⺻������ Ÿ������ �����ݴϴ�.
      System.out.println(p1.id.intValue());
      
      System.out.println(p1.info.position);
  }
}

