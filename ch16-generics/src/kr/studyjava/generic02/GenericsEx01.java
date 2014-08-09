/* 코드의 중복 제거
kr.studyjava.generic01\GenericsEx01.java의 코드 중복 제거

코드 중복 제거후 발행한 타입이 안전하지 않은 문제점 해결
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


//코드 중복 제거
class Person{
    //모든 클래의 공통 조상인 Object 타입으로 정의
    public Object info;
    Person(Object info){ this.info = info; }
}
public class GenericsEx01 {
    public static void main(String[] args) {

        Person p1 = new Person("사장");
        //p1.info는 Object타입인데 형변환하여 EmployeeInfo로 변경
        //런타임시 java.lang.ClassCastException 발생
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.position);
    }
}

/*
컴파일시 예외가 발행하지 않고 런타임시 java.lang.ClassCastException 발생

Object로 지정하여 어떤 데이터타입도 올수 있게됨에 따라 타입인 안전하지 않게 되었습니다.
타입이 안전하지 않음(Type Safety): 
JAVA는 허용되지 않음 / 
Javascript, Ruby, PHP는 타입에 상관안함. 변수에 어떤한 값이 저장되든 상관하지 않고 개발자에게 책임을 위임.

자바와 같은 언어는
코딩하는 단계에서 변수저장시 저장되는 타입을 지정하는 것은 변수안에는 해당 데이터 타입만 들어와야만 하는 언어입니다.
현 코드에서 발생하는 이 부분을 해결하기 위해 제네릭이 도입됨 (컴파일시 예외가 발행하지 않고 런타임시)

컴파일언어를 사용하는 중요한 장점은 프로그램이 되기전에 개발자의 오류나 실수를 미리 잡아주게 됩니다.(컴파일의 중요한 이점)

변수의 데이터타입을 정의하는 장점은 해당 변수에 지정한 데이터타입만 들어오는 것을 보장하고 다른 데이터형이 들어오는 것을 금지시키는 효과를 줌.

타입 안전, 코드 중복 제거를 위해 제네릭 기능이 자바에 도입되었습니다.

*/
