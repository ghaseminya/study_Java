
/*
//protected 제한자


FileInfo
package com.korea;	School.java


//----------------------------------------------
//private	< default	< protected < public
//클래스 내부	< 동일 패키지	< 상속 클래스	< 이외의 영역 
//(일반 클래스)			  (서브 클래스)  (아무 관계 없음)


protected의 제한
	• protected - 상속관계에 있으면 접근 허용
	• default 선언으로 접근 가능한 영역 접근 가능
	• 그리고 상속관계에서도 접근 가능
	• default + 상속

//-------------------------
TODO : 상속 받지 않고 멤버변수에 접근
TODO : 상속 처리후 멤버변수에 접근

*/
package com.korea;

//부모 클래스
class Human {
	//protected로 선언된 멤버변수
	protected String name;
	protected int age;
}

//상속 관계 맺기
//상속은 특정 클래스가 가지고 있는 일부 속성과 기능을 다른 새로운 클래스에 제공하기 위해 맺는 클래스들간의 관계
//extends라는 예약어를 사용하여 서로 관계를 맺은 상태
//class [sub클래스명] extends [super클래스명] { }
class Teacher extends Human{ //자식 클래스
	
	//클래스를 상속받게 되면 Human클래스에 있는 name과 age변수가 Teacher클래스에 존재하게 됩니다.
//	protected String name;
//	protected int age;
	
	//멤버 변수가 protected로 정의되어 있어 상속받은 클래스에서 접근 가능
	public void  setAge(int num ){
		age = num;
	}
	
	public void  getAge(){
		System.out.println(age);
	}
}

//주 클래스
public class School {

	public static void main(String[] args){
		
		Teacher teacher = new Teacher();
		teacher.setAge(27);
		teacher.getAge();
		
	}
}

