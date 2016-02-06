package com.gen07;
/* 기본 데이터 타입과 제네릭

com.gen06.GenericsEx01.java 에서 기본자료형을 제네릭에서 사용시 발생한 컴파일 에러 해결하기


불가능한 문장(컴파일 에러)
	• 제네릭에서는 참조 데이터 타입만 올수 있습니다.
	• 기본 자료형(int, char, double등)를 사용할 수 없습니다.

Person<int> fb1=Person<int>();
Person<double> fb1=new Person<double>();



Wrapper클래스(래퍼클래스)
	• 기본 자료형 데이터를 인스턴스화 해야 하는 상황에서 사용할 수 있는 클래스
	• 기본 자료형을 참조자료형으로 변환할 때(객체로 사용할 때) 사용하는 클래스
	• 즉, 기본데이터타입을 마치 객체인 것 처럼 만들 수 있는 클래스


기본자료형		Wrapper클래스
boolean		Boolean
char		Character
byte		Byte
short		Short
int			Integer
long		Long
float		Float
double		Double


*/
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
      EmployeeInfo e = new EmployeeInfo(100);
      
      //new Integer는 기본 데이터 타입인 int를 참조 데이터 타입으로 변환해주는 역할을 하는 래퍼 클래스
      //기본 데이터 타입을 사용할 수 없는 제네릭에서 int를 사용할 수 있습니다.
      Integer id = new Integer(20);
      Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, id);
      
      //레퍼클래스가 담고 있는 원래의 숫자를 기본테이터 타입으로 돌려줍니다.
      System.out.println(p1.id.intValue());
      
      System.out.println(p1.info.position);
  }
}

