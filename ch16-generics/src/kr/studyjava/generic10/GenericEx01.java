/* 제네릭 생략
제네릭을 특정하지 않으면  extends Object과 동일한 의미가 됩니다. Object의 자식이면 모두 올 수 있습니다. 
Object가 가지고 있는(모든 클래스가 가지고 있는) 메소드(toString, Clone등)를 제외한 메소드는 제네릭으로 선언한  객체에서는 호출할 수 없습니다. 
단순히 Object인 상태이기 때문에 Object가 가지고 있는 것만 사용할 수 있습니다.

 */
package kr.studyjava.generic10;

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
//
class Person<T>{
	public T info;
	Person(T info){ 
		this.info = info; 

		//제네릭을 특정하지 않으면  extends Object과 동일한 의미가 됩니다. Object의 자식이면 모두 올수 있습니다. 
		//Object가 가지고 있는(모든 클래스가 가지고 있는) 메소드(toString, Clone등)를 제외한 메소드는 제네릭으로 선언한  객체에서는 호출할 수 없습니다. 
		//단순히 Object인 상태이기 때문에 Object가 가지고 있는 것만 사용할 수 있습니다.
		//EmployeeInfo클래스의 getInfo()호출할 수 없습니다.
//        info.getInfo();	//컴파일 에러 발생
	}
}


public class GenericEx01 {
	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(10));
		Person<String> p2 = new Person<String>("사장");
	}
}


