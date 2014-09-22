/* 객체 생성
 * 
 */


public class Student1 {	
	
	//멤버 변수
	String name;
	int age;
	
	//디볼트 생성자(생략가능): 컴파일러가 자동으로 처리함
	//public Student(){}	

	public static void main(String[] args) {
		
		//객체 선언 및 생성
		Student1 student1 = new Student1();		
		System.out.println(student1);
		
		//객체가 생성안된 경우 null/0인 기본값이 츨력됩니다. 
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		System.out.println();
		//객체의 멤버변수에 원하는 값을 설정한 후 출력합니다.
		student1.name ="홍길동";
		student1.age = 400;
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		//동일한 클래스로 또다른 객체 추가 생성
		System.out.println();
		Student1 newstudent = new Student1();
		System.out.println(newstudent);
		
		//객체의 멤버변수에 원하는 값으로 설정
		newstudent.name = "김연아";
		newstudent.age = 18;
		System.out.println(newstudent.name);
		System.out.println(newstudent.age);
	}

}
