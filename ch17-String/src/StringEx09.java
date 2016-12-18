//String 클래스(중요 메소드 확인)

//학습내용
//	• 지정된 문자열(suffix)로 끝나는지 검사하기
//	• 문자열 일치 유무 검사
//	• 저장되어 있는 문자열을 반환받기
//	• 지정된 값을 문자열로 변환


public class StringEx09 {

	public static void main(String[] args) {
		
		
/*
boolean endsWith(String suffix)
• 지정된 문자열(suffix)로 끝나는지 검사 합니다. 지정된 문자열로 끝나면 true, 아니면 false를 반환합니다.

*/
		//TODO : 지정된 문자열(suffix)로 끝나는지 검사하기
		String file1 = "HelloWorld.txt";
		boolean b1 = file1.endsWith("txt");
		System.out.println("result: " + b1); //result: true
		
		String file2 = "HelloWorld.db";
		boolean b2 = file2.endsWith("txt");
		System.out.println("result: " + b2); //result: false
		
	
/*
boolean equals(Object obj)
• 문자열 일치 유무 검사
• 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다. 
obj가 String이 아니거나 문자열이 다르면 false를 반환한다. 
String 클래스는 equals 메소드를 오버라이드 해서 사용한다.
*/
		
		//TODO : 문자열 일치 유무 검사
		String s1 = "Hello";
		boolean b3 = s1.equals("Hello");
		boolean b4 = s1.equals("hello");
		System.out.println("result: " + b3); //result: false
		System.out.println("result: " + b4); //result: false
		
		String s2 = "HelloWorld";
		boolean b5 = s2.equals("Hello");
		System.out.println("result: " + b5); //result: false

		String s3 = "Hello World";
		boolean b6 = s3.equals("Hello");
		System.out.println("result: " + b6); //result: false
		
		
		
/*
String toString()
• String 인스턴스에 저장되어 있는 문자열을 반환합니다.

*/
		//TODO : 저장되어 있는 문자열을 반환받기
		String s4 = "Everythings gonna be alright."; //괜찮아 질 거야, 모든 것이 잘 될 것이다.
		//String 인스턴스에 저장되어 있는 문자열을 반환합니다.
		String s5 = s4.toString();
		System.out.println("result: " + s5); //result: false

		
	
/*		
static String valueOf(boolean b)
static String valueOf(char c)
static String valueOf(int i)
static String valueOf(long l)
static String valueOf(float  f)
static String valueOf(double d)
static String valueOf(Object o
• 지정된 값을 문자열로 변환하여 반환 합니다.
• 참조변수의 경우, toString()을 호출한 결과를 반환 합니다.
*/
		
		//TODO : 지정된 값을 문자열로 변환
		String s6 = String.valueOf(true);
		System.out.println("result: " + s6); //result: true
		
		String s7 = String.valueOf('j');
		System.out.println("result: " + s7); //result: j
		
		String s8 = String.valueOf(100);
		System.out.println("result: " + s8); //result: 100
		
		String s9 = String.valueOf(100L);
		System.out.println("result: " + s9); //result: 100
		
		String s10 = String.valueOf(100f);
		System.out.println("result: " + s10); //result: 100.0
		
		String s11 = String.valueOf(10.0);
		System.out.println("result: " + s11); //result: 10.0
		
		java.util.Date d1 = new java.util.Date();
		String date = String.valueOf(d1);
		System.out.println("result: " + date); //result: Sun Dec 18 13:04:45 KST 2016

	}

}
