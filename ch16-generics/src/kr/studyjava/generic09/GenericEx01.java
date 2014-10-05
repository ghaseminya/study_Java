/* 제네릭의 제한(interface)
제네릭의 extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있습니다.
*/

package kr.studyjava.generic09;

//인터페이스 정의
interface Info{
	int getInfo();
}

//인터페이스 구현 클래스
class EmployeeInfo implements Info{
	public int position;
	EmployeeInfo(int position){ this.position = position; }


	public int getInfo(){
		return this.position;
	}
}

//제네릭에서 extends는 상속한다는 의미가 아니라 부모가 누구인지 명시하는 용도로 사용됩니다.
class Person<T extends Info>{
	public T info;
	Person(T info){ 
		this.info = info; 
		info.getInfo();
	}
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
