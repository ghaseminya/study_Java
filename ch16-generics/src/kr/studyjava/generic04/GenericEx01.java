/* 복수의 제네릭

복수의 제네릭
클래스 내에서 여러개의 제네릭을 필요로 하는 경우

복수의 제네릭 사용시 명명 규칙
,로 구분
제네릭 명칭은 고정된 것은 없으나 중복되지 않게 지정
관습적으로 T이후의 대분자로 지정하고 있습니다


기본자료형을 제네릭사용시 발생한 컴파일 에러 해결하기
-> kr.studyjava.generic05\GenericsEx01.java

*/
package kr.studyjava.generic04;

class EmployeeInfo{
    public int position;
    EmployeeInfo(int position){ this.position = position; }
}

class Person<T, S>{
    //두개의 제네릭 사용 T, S
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
}

public class GenericEx01 {
    public static void main(String[] args) {
        //제네릭에는 참조 데이터 타입만 올수 있음 
    	//기본 자료형(int, char, double등)를 사용할 수 없어 컴파일 타임에서 에러 발생
 //       Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(10), 10);
    }
}
