//객체 생성 - 객체에 데이터 저장 후 출력하기

public class Student1 {	
	
	//멤버 변수
	String name;
	int age;
	
	//디볼트 생성자(생략가능): 컴파일러가 자동으로 처리함
	//public Student(){}	

	public static void main(String[] args) {
		
		//객체 선언 및 생성
		Student1 student1 = new Student1();		
		System.out.println(student1);	//Student1@659e0bfd
		
		//객체가 생성 안된 경우 null/0인 기본값이 츨력됩니다.
		System.out.println(student1.name);	//null
		System.out.println(student1.age);	//0
		
		System.out.println();
		//객체의 멤버변수에 원하는 값을 설정한 후 출력합니다.
		student1.name ="홍길동";
		student1.age = 400;
		System.out.println(student1.name);	//홍길동
		System.out.println(student1.age);	//400
		
		//동일한 클래스로 또다른 객체 추가 생성
		System.out.println();
		Student1 newstudent = new Student1();
		System.out.println(newstudent);	//Student1@2a139a55
		
		//객체의 멤버변수에 원하는 값으로 설정
		newstudent.name = "김연아";
		newstudent.age = 24;
		System.out.println(newstudent.name);	//김연아
		System.out.println(newstudent.age);		//24
	}
}
