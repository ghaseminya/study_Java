/*
두개의 String 인스턴스 생성 및 참조값 비교 
	• 같은 참조값 참조하는 참조변수 str1과 str2
	• 다른 참조값 참조 str3

*/



public class StringEx03 {

	public static void main(String[] args)
	{
		
		String str1="My String";
		String str2="My String";
		String str3="Your String";
		//String 인스턴스의 문자열 변경이 불가능하기 때문에 둘 이상의 참조변수가 동시에 참조를  해도 문제가 발생하지 않는다!
		
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
