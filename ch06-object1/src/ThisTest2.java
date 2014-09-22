/* 멤버변수와 지역변수 구분하기
 * 
 */

public class ThisTest2 {	
	String name;
	int age;
	
	/*public ThisTest2(String n, int a){
		name = n;
		age = a;		
	}*/	
	
	/*멤버변수명과 지역변수명이 동일할 경우 지역변수가 우선
	멤버변수와 지역변수를 구분하기 위해   this를 사용*/
/*	public ThisTest2(String name, int age){
		name = name;
		age = age;		
	}*/
	
	public ThisTest2(String name, int age){
		//멤버변수	= 지역변수
		this.name 	= name;
		this.age 	= age;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest2 tt1 = new ThisTest2("마징가",  25);
		System.out.println( tt1.name + " / " + tt1.age );
	}
}