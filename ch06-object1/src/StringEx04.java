/*
String 클래스 생성 방법
	• 암시적 객체 생성
	• 명시적 객체 생성
*/

public class StringEx04 {

	public static void main(String[] args)
	{


		//암시적 객체 생성
//		• 리터럴 이용
//		• 동일 문자열이 존재하면 새로 생성되지 않고 재사용

		String str1="String Class";
		String str2="String Class";
		//String 인스턴스의 문자열 변경이 불가능하기 때문에 둘 이상의 참조변수가 동시에 참조를 해도 문제가 발생하지 않습니다.
		//하나의 인스턴스 생성, 이 인스턴싀의 참조값을 str1과 str2가 저장하고 있음
		
		//명시적 객체 생성
//		• new 연산자 이용
//		• 동일 문자열이 존재해도 매번 새롭게 생성
		String str3=new String(str2);
		
		if(str1==str2)	//String은 참조값을 비교하게 됩니다. 데이터값 비교가 아닙니다.
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른  인스턴스 참조");			
		
		if(str2==str3)
			System.out.println("str2와 str3는 동일 인스턴스 참조");
		else
			System.out.println("str2와 str3는 다른  인스턴스 참조");	
	}
	
}
