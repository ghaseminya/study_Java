//String 클래스 - 중요 메소드 확인
 
//학습내용
//• 앞뒤에 각각 두개의 공백있는 문자열 생성
//• 지역변수 초기화
//• 문자열 대체
//• 영문자를 대문자로
//• 영문자를 소문자로
//• 공백 제거
//• 특정 문자열 포함 여부 검색


public class StringEx08 {

	public static void main(String[] args) {
		// 앞뒤에 각각 두개의 공백있는 문자열 생성
		String str = "  aaaaabbAAABB  ";
		
		//null: null은 객체가 생성이 아직 안되어있음을 의미
		//에러가 안나게 할 목적으로 null 사용 
		String msg1 = null;
		
		//빈문자열
		//char[]이 가공되어서 String이 만들어집니다. 이때 빈문자열은 데이터가 없으며 초기화 할 때 사용합니다.
		//데이터가 없는 객체가 생성
		String msg2 = "";

		
/*		
String replace(CharSequence old, CharSequence nw)
• 문자열 대치
• 문자열 중의 바꿀 문자열(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환합니다.

*/
		
		//TODO : 문자열 대체
		msg2 = str.replace("aa", "b");

		System.out.println("msg2: " + msg2); //msg2:   bbabbAAABB  
		
		
/*
String toLoweCase()
• 문자열을 소문자로
• String 인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환합니다.


String toUpperCase()
• 문자열을 대문자로
• String 인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환합니다.
*/		
		//TODO : 영문자를 대문자로
		msg1 = str.toUpperCase();
		System.out.println("msg1: " + msg1); //msg1:   AAAAABBAAABB  
		
		
		//TODO : 영문자를 소문자로
		msg1 = msg1.toLowerCase();
		System.out.println("msg1: " + msg1); //msg1:   aaaaabbaaabb 

		
		
/*
String trim()
• 공백문자 제거
• 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 제거한 문자열을 반환합니다.
• 이 때 문자열 중간에 있는 공백은 제거되지 않습니다.
*/
		//TODO : 공백 제거
		msg2 = str.trim();
		System.out.println("msg2: " + msg2); //msg2: aaaaabbAAABB
		
	
		
/*		
boolean contains(charSequence s)
• 지정된 문자열(s)이 포함되었는지 검사 한다.
		
*/
		//TODO : 특정 문자열 포함 여부 검색
		boolean check = str.contains("aa");
		System.out.println("check: " + check); //check: true
		

		
/*		
String concat(String str)
• 문자열 연결
		
*/
		//TODO : 문자열 연결
		//빛을 퍼뜨릴 수 있는 두가지 방법이 있다.
		//촛불이 되거나 또는 그것을 비추는 거울이 되는 것이다.
		//Edith Wharton-에디스 워튼(미국 작가)
		String before = "There are two ways of spreading light;";
		String after =" to be candle or the mirror that reflects it.";
		String result = before.concat(after);
		System.out.println("result: " + result); 
		//result: There are two ways of spreading light; to be candle or the mirror that reflects it.
		

	}
}
