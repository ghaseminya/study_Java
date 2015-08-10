//두개의 String 인스턴스 생성하고 참조변수 str1과 str2 비교


public class StringEx02 {

	public static void main(String[] args)
	{
		//문자열 생성
		String str1="My String";
		String str2="Your String";
		//두개의 String 인스턴스 생성 그리고 참조변수 str1과 str2로 참조하게 됩니다.
		
		
		if(str1==str2)	//String은 참조값을 비교하게 됩니다. 데이터값 비교가 아닙니다.
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else{
			System.out.println("str1과 str2는 다른  인스턴스 참조");
//			System.out.println(str1);
//			System.out.println(str2);
		}
	}
}
