/*
//인스턴스 변수와 static변수, static 메소드
//클래스 이름을 이용한 접근방법(권장)


static 메소드(클래스 메소드)
	• static 메소드의 기본적인 특성과 접근방법은 static 변수와 동일
	• 인스턴스를 생성하지 않아도 static 메소드는 호출 가능


*/
public class StaticEx02 {
	//인스턴스 변수(멤버 변수)
	String s1 = "인스턴스 변수";	
	//static 변수
	static String s2 ="STATIC 변수";
	
	public static String getString(){
		
		//TODO 4: static 메소드의 인스턴스 접근은 불가능
		//ERROR-Cannot make a static reference to the non-static field s1
//		return s1;
		return s2;
	}	

	public static void main(String[] args) {		
		
		
		
		//TODO 1:인스턴스 변수는 객체 생성후  호출 가능
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem:	Cannot make a static reference to the non-static field s1
//		System.out.println(s1);
		
		//TODO 2: 객체 생성후  호출
//		StaticEx02 sc = new StaticEx02();
//		System.out.println(sc.s1);	//인스턴스 이름을 이용한 접근방법

		
		//Static 변수 호출
		System.out.println(StaticEx02.s2);	//클래스 이름을 이용한 접근방법(권장)
		System.out.println(s2);
		
		//Static 메소드 호출
		System.out.println(StaticEx02.getString());	//클래스 이름을 이용한 접근방법(권장)
		
		StaticEx02 st = new StaticEx02();
		System.out.println(st.s1);	//인스턴스 이름을 이용한 접근방법
		
		//TODO 3: 인스턴스 이름을 이용한 접근방법
		//Static변수를 클래스이름을 이용한 접근방법이 아닌 객체생성 후 인스턴스이름을 통해 접근할 경우 경고발생
		//Warning-The static field StaticEx02.s2 should be accessed in a static way
//		System.out.println(st.s2);	
									
									
	}
}
  

