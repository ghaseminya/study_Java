/*
//멤버변수와 지역변수 구분하기 (this)


this
	• 객체 내부에서 객체 자신을 칭하고 싶을 때 사용
	• 지역변수와 멤버변수를 구별해야 할 때 사용
	• 객체 자신을 가리킬 수 있는 유일한 reference가 바로 this


*/
public class ThisEx02 {	
	String name;
	int age;
	
	//멤버변수명과 지역변수명이 동일할 경우 지역변수가 우선
	//멤버변수와 지역변수를 구분하기 위해   this를 사용
//	public ThisTest2(String name, int age){
//		name = name;
//		age = age;		
//	}
	
	public ThisEx02(String name, int age){
		//멤버변수	= 지역변수
		this.name 	= name;
		this.age 	= age;	
		//this.name이라고 하게 되면 ThisTest2()함수안에 있는 name이 아니라 클래스의 멤버인 name을 지칭합니다.
	}

	public static void main(String[] args) {
		ThisEx02 tt1 = new ThisEx02("마징가",  25);
		System.out.println( tt1.name + " / " + tt1.age );
	}
}