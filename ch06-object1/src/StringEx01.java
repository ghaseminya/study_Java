/*
String클래스의 인스턴스 생성

*/

public class StringEx01 {

	public static void main(String[] args)
	{
		java.lang.String str="String instance";
		
		int strLength1=str.length();
		System.out.println("str 인스턴스 길이: "+strLength1);
		
		int strLength2="한글의 길이는 어떻게?".length();
		System.out.println("문자열의 길이: "+strLength2);
	}
}
