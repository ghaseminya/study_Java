/*
//String클래스의 인스턴스 생성
//String클래스의 인스턴스 생성
//인스턴스의 길이 확인 (영문/한글)


//--------------------
String 클래스
	• 문자열 객체
	• String 인스턴스에 저장된 문자열의 내용은 변경이 불가능합니다. 이는 동일한 문자열의 인스턴스를 하나만 생성하고 이를 공유해서 사용하기 위해서입니다.
	• + 연산자를 이용하여 연결된 새로운 문자열 객체를 생성합니다.
	• JAVA는 큰 따옴표(")로 묶여서 표현되는 문자열을 모두 인스턴스화 합니다.
	• 문자열은 String 이라는 이름의 클래스로 표현됩니다



문자열 수정 불가능(불변적 특징)
	• 문자열 가공시(변경시) 기존 문자열의 변경없이 새로운 문자열을 생성합니다.
	• 문자열을 가공해야 되는 경우 문자열로 처리하는 것은 비효율적입니다. 아래와 같이 쓰레기 객체를 양산하게 되어 메모리 효율을 떨어트리게 됩니다.
	• String의 불변적 특성으로 문자 가공시 String을 쓰지 않고 StringBuffer클래스를 사용하여 문자열을 수정/변경 작업을 하게 됩니다.
	• StringBuffer로 수정/변경을 완료한 후 최종적인 문자열을 String으로 저장합니다.


String str = "봄";	//"봄" 생성
str += str + "여름";	//"봄여름"이 새로 생기고 "봄"은 쓰레기 객체가 됩니다
str += str + "가을";	//"봄여름가을"이 새로 생기고 "봄여름"은 쓰레기 객체가 됩니다.
str += str + "겨울";	//"봄여름가을겨울"이 새로 생기고 "봄여름가을"은 쓰레기 객체가 됩니다. 


*/
public class StringEx01 {

	public static void main(String[] args)	{
		
		//String클래스의 인스턴스 생성
		//JAVA는 큰 따옴표(")로 묶여서 표현되는 문자열을 모두 인스턴스화 합니다.
		//문자열은 String 이라는 이름의 클래스로 표현됩니다
		java.lang.String str="String instance";
		
		
		//문자열을 배열요소로 접근하기 (ERROR 발생 확인)
		//내부적으로 배열로 처리되고 있지만 배열처럼 접근할 수는 없습니다. 배열(Array)이아닌 객체(Object)이므로
		//ERROR-The type of the expression must be an array type but it resolved to String
//		System.out.println("배열요소로 접근: "+ str[3]);
		
		
		//length() :문자열 길이 반환
		int strLength1=str.length();
		System.out.println("str 인스턴스 길이: "+strLength1); //str 인스턴스 길이: 15
		
		
		//문자열의 선언은 인스턴스의 생성임을 보여주는 문장
		//"한글의 길이는 어떻게?".length(); 분석
		//인스턴스생성.length(); -> 참조변수.length();
		int strLength2="한글의 길이는 어떻게?".length();
		System.out.println("문자열의 길이: "+strLength2); //문자열의 길이: 12
		
	}
}

/*
출력결과
str 인스턴스 길이: 15
문자열의 길이: 12


*/