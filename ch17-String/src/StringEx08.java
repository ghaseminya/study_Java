/* String 클래스 - 중요 메소드 확인
 *  
 * 앞뒤에 각각 두개의 공백있는 문자열 생성
 * 지역변수 초기화
 * 문자열 대체
 * 영문자를 대문자로
 * 영문자를 소문자로
 * 공백 제거
 * 특정 문자열 포함 여부 검색
 */



public class StringEx08 {

	public static void main(String[] args) {
		// 
		String str = "  aaaaabbAAABB  ";
		
		//null은 객체가 생성이 아직 안되어있음
		//에러가 안나게 할 목적으로 null 
		String msg1 = null;
		
		//빈문자열
		//char[]이 가공되어서 String이 만들어지는 빈문자열이면 데이터가 없으며 초기화 할 때 사용합니다.
		//데이터가 없는 객체가 생성
		String msg2 = "";
		
		//문자열 대체
		msg2 = str.replace("aa", "b");
		System.out.println("msg2: " + msg2);
		
		//영문자를 대문자로
		msg1 = str.toUpperCase();
		System.out.println("msg1: " + msg1);
		//영문자를 소문자로
		msg1 = msg1.toLowerCase();
		System.out.println("msg1: " + msg1);
		
		//공백 제거
		msg2 = str.trim();
		System.out.println("msg2: " + msg2);
		
		//특정 문자열 포함 여부 검색
		boolean f = str.contains("aa");
		System.out.println("f: " + f);		
	}
}
