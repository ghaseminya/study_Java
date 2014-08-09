/* �޼ҵ忡 ���׸� ����
�޼ҵ忡 ���׸� ����
���׸��� �޼ҵ忡 ������ �� �ֽ��ϴ�. 

*/
package kr.studyjava.generic07;

class EmployeeInfo{
    public int position;
    EmployeeInfo(int position){ this.position = position; }
}

//Ŭ���� �ȿ��� ����ϴ� ���׸�
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
    
    //�Լ����� ����ϴ� ���׸�
    public <U> void printData(U info){
        System.out.println(info);
    }
}
public class GenericEx01 {
    public static void main(String[] args) {
        EmployeeInfo ei = new EmployeeInfo(10);
        Integer id = new Integer(20);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(ei, id);

        //�Լ��� ���׸� ���
        p1.<EmployeeInfo>printData(ei);
        //���ظ� ������ e ������ ������ Ÿ������ ���׸� Ÿ���� �ڵ����� ���� �˴ϴ�.
        p1.printData(ei);
    }
}


