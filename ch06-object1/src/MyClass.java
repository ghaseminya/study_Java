/* 
 * 은닉화, 캡슐화 - 클래스 분리
 * 
 * File Info
 * MyClass.java
 * MyClassMain.java
 * */

public class MyClass {
	
	//은닉화 (접근지정자를 private으로 지정)
	private String name;
	private int age;
	
	/* 디폴트 생성자: 생성자를 명시하지 않으면 컴파일러가 default 생성자를 자동 삽입
	 * 그러므로 인자가 있는 생성자를 만들 경우 디폴트 생성자가 필요한 경우 default 생성자를 명시해야 됩니다.
	 * */
	public MyClass(){}
	/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The constructor MyClass() is undefined*/
	
	
	//인자가 전달되는 생성자
	public MyClass(String n){
		name =n;
	}
	
//	생성자 오버로딩: 메서드 오버로딩과 동일한 규칙을 적용하여 생성자 오버로딩 수행
//	public MyClass(String a){}
	
	public MyClass(String n, int a){
		name = n;
		age = a;
		System.out.println("객체가 생성되었습니다.");
	}	
	
	//캡슐화
	public void setName(String n){
		name =n;		
	}

	public void setAge(int a){
		age = a;
	}
	
	public String getName(){
		return name;
	}	
	
	public int getAge(){
		return age;
	}
}
