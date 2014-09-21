/* 인스턴스 변수와 Static변수
 * 
 * */

public class StaticEx02 {
	
	String s1 = "인스턴스 변수";
	static String s2 ="STATIC";
	
	public static String getString(){
		return s2;
	}	

	public static void main(String[] args) {		
		
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem:	Cannot make a static reference to the non-static field s1
		인스턴스 변수는 객체 생성  호출 가능*/
		//System.out.println(s1);
		
		//Static 변수 호출
		System.out.println(StaticEx02.s2);
		System.out.println(s2);
		
		//Static 메소드 호출
		System.out.println(StaticEx02.getString());
		
		StaticEx02 st = new StaticEx02();
		System.out.println(st.s1);
		

	}

}
