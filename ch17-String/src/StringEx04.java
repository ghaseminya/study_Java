//String 클래스 생성 방법
//	• 암시적 객체 생성
//	• 명시적 객체 생성


public class StringEx04 {

	public static void main(String[] args) {
		//암시적 객체 생성
		//• 리터럴 이용
		//• 동일 문자열이 존재하면 새로 생성되지 않고 재사용

		String str1="String Class";
		String str2="String Class";
		//String 인스턴스의 문자열 변경이 불가능하기 때문에 둘 이상의 참조변수가 동시에 참조를 해도 문제가 발생하지 않습니다.
		//하나의 인스턴스 생성, 이 인스턴스의 참조값을 str1과 str2가 저장하고 있습니다.
		
		
		//명시적 객체 생성
		//• new 연산자 이용
		//• 동일 문자열이 존재해도 매번 새롭게 생성
		
		String str3=new String("String Class");
		//인스턴스를 새로 생성해서 문자열의 내용을 그대로 복사하는 것이라면 다음과 같이 코드를 구성할 수 있습니다.
//		String str3=new String(str2); //동일코드
		
		//str1과 str2와 str3가 담고 있는 값은 같지만 가지고 있는 참조값은 다릅니다.
		if(str1==str2)	//String은 참조값을 비교하게 됩니다. 데이터값 비교가 아닙니다.
			System.out.println("str1과 str2는 동일 인스턴스 참조"); //출력
		else
			System.out.println("str1과 str2는 다른  인스턴스 참조");			
		
		if(str2==str3)
			System.out.println("str2와 str3는 동일 인스턴스 참조");
		else
			System.out.println("str2와 str3는 다른  인스턴스 참조"); //출력
	}
}


/* 출력결과
str1과 str2는 동일 인스턴스 참조
str2와 str3는 다른  인스턴스 참조

*/