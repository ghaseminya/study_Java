/* 기본 데이터 타입과 제네릭

kr.studyjava.generic04\GenericsEx01.java 에서 기본자료형을 제네릭사용시 발생한 컴파일 에러 해결하기

제네릭에서는 참조 데이터 타입만 올수 있습니다.
기본 자료형(int, char, double등)를 사용할 수 없습니다.

자바에서는 기본데이터타입을 객체로 사용하기 위해 wrapper클래스를 제공해 주고 있습니다. 
기본데이터타입을 마치 객체인것 처럼 만들 수 있는 클래스를 wrapper클래스(래퍼클래스)라고 합니다.

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
      //new Integer는 기본 데이터 타입인 int를 참조 데이터 타입으로 변환해주는 역할을 하는 래퍼 클래스
      //기본 데이터 타입을 사용할 수 없는 제네릭에서 int를 사용할 수 있음
      Integer id = new Integer(20);
      Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, id);
      //레퍼클래스가 담고 있는 원래의 숫자를 기본테이터 타입으로 돌려줍니다.
      System.out.println(p1.id.intValue());
      
      System.out.println(p1.info.position);
  }
}

