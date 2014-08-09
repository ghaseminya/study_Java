/* 제네릭의 제한(class)
extends 예약어로
제네릭으로 올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한
*/

package kr.studyjava.generic08;

//부모 클래스 (꼭 추상클래스일 필요는 없음)
abstract class Info{
	//추상 메소드
	public abstract int getInfo();
}

class EmployeeInfo extends Info{
	public int position;
	EmployeeInfo(int position){ this.position = position; }

	//추상 메소드 구현
	@Override
	public int getInfo(){
		return this.position;
	}
}
//Person의 T는 Info 클래스나 그 자식 외에는 올 수 없습니다.
//extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있습니다.
//Info클래스의 자식들 만이 T로 올수 있습니다.
class Person<T extends Info>{
	public T info;
	Person(T info){ this.info = info; }
}
public class GenericEx01 {
	public static void main(String[] args) {
		//Info의 자식인 타입을 지정
		//Person p1 = new Person(new EmployeeInfo(1));  //동일 코드를 아래에서 명시적으로 정의
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(p1.info.getInfo());

		//Info의 자식이 아닌 타입을 지정
//		Person<String> p2 = new Person<String>("사장");	//컴파일 에러
	}
}

