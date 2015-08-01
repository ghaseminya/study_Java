//인스턴스 변수와 Static변수
// 
//인스턴스 이름을 이용한 접근방법
//클래스 이름을 이용한 접근방법(권장)


public class StaticEx02 {
	
	String s1 = "인스턴스 변수";
	static String s2 ="STATIC";
	
	public static String getString(){
		return s2;
	}	

	public static void main(String[] args) {		
		
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem:	Cannot make a static reference to the non-static field s1
		//인스턴스 변수는 객체 생성후  호출 가능
//		System.out.println(s1);
		
//		객체 생성후  호출
//		StaticEx02 sc = new StaticEx02();
//		System.out.println(sc.s1);	//인스턴스 이름을 이용한 접근방법

		
		//Static 변수 호출
		System.out.println(StaticEx02.s2);	//클래스 이름을 이용한 접근방법(권장)
		System.out.println(s2);
		
		//Static 메소드 호출
		System.out.println(StaticEx02.getString());	//클래스 이름을 이용한 접근방법(권장)
		StaticEx02 st = new StaticEx02();
		System.out.println(st.s1);
		
	}
}
