/* 은닉화, 캡슐화 - 클래스 분리
 * 
 * MyClass.java
 * MyClassMain.java
 * */

public class MyClassMain {

	public static void main(String[] args) {
		
		//참조변수의 선언 = 인스턴스 생성
		MyClass mc1 = new MyClass();		
		
		//접근지정자가 private이기 때문에 호출 불가능 (은닉화되어 있음)
		//mc1.name = "홍길동";
		//mc1.age = 18;
		
		//메소드(method)를 통해서만 접근가능
		mc1.setName("홍길동");
		mc1.setAge(18);
		System.out.println(mc1.getName() + " / " + mc1.getAge());		
		
		MyClass mc2 = new MyClass("일지매");
		System.out.println(mc2.getName() + " / " + mc2.getAge());
		
		MyClass mc3 = new MyClass("태권브이",  30);
		System.out.println(mc3.getName() + " / " + mc3.getAge());

	}
}
