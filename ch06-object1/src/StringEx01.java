/*
String클래스의 인스턴스 생성

*/

public class StringEx01 {

	public static void main(String[] args)
	{
//JAVA는 큰 따옴표(")로 묶여서 표현되는 문자열을 모두 인스턴스화 합니다.
//문자열은 String 이라는 이름의 클래스로 표현됩니다

		java.lang.String str="String instance";
		
		int strLength1=str.length();
		System.out.println("str 인스턴스 길이: "+strLength1);
		
		//문자열의 선언은 인스턴스의 생성임을 보여주는 문장
		//"한글의 길이는 어떻게?".length();
		//인스턴스생성.length(); -> 참조변수.length();
		int strLength2="한글의 길이는 어떻게?".length();
		System.out.println("문자열의 길이: "+strLength2);
		
		
	}
}
