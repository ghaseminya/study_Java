/*
//은닉화, 캡슐화 - 클래스 분리

File Info
MyClassMain.java	main부
MyClass.java		은닉화 구현 클래스, 멤버필드 은닉화

//-----------------------------------
TODO 1: 인자값이 있는 생성자 생성시 디폴트 생성자를 정의하지 않고 호출할 경우 ERROR발생 확인
TODO 2: ERROR발생 확인 후 정의 (MyClass.java)
TODO 3: 접근지정자가 private이기 때문에 호출 불가능 (은닉화되어 있음)
TODO 4: 은닉화된 변수에 메소드를 통해 간접 접근하여 데이터에 접근

*/

public class MyClassMain {

	public static void main(String[] args) {
		
		//TODO 1: 인자값이 있는 생성자 생성시 디폴트 생성자를 정의하지 않고 호출할 경우 ERROR발생 확인
		//default생성자가 정의되어 있지 않은 경우 Error
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The constructor MyClass() is undefined
//		MyClass mc1 = new MyClass();
		
		//class MyClass에서 디폴트 생성자 정의후  객체 생성
		//참조변수의 선언 = 인스턴스 생성
		MyClass mc1 = new MyClass();
		
		
		//TODO 3: 접근지정자가 private이기 때문에 호출 불가능 (은닉화되어 있음)
//		mc1.name = "홍길동";	// ERROR-The field MyClass.name is not visible
//		mc1.age = 18;		// ERROR-The field MyClass.name is not visible
		
		//TODO 4: 은닉화된 변수에 메소드를 통해 간접 접근하여 데이터에 접근
		//은닉화된 변수는 메소드(method)를 통해서만 접근가능, 은닉화된 인스턴스변수는 메소드를 통해서만 간접 접근만 가능
		mc1.setName("홍길동");
		mc1.setAge(18);
		System.out.println(mc1.getName() + " / " + mc1.getAge());		
		
		MyClass mc2 = new MyClass("일지매");
		System.out.println(mc2.getName() + " / " + mc2.getAge());
		
		MyClass mc3 = new MyClass("태권브이",  30);
		System.out.println(mc3.getName() + " / " + mc3.getAge());

	}
}
