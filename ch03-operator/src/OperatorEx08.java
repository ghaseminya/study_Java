//조건(삼항) 연산자 - 대문자 / 소문자 구분하기


public class OperatorEx08 {
	public static void main(String[] args){
		
		System.out.println("=========조건(삼항) 연산자 3=========");
		//대문자 / 소문자 구분하기
				
		char ch = 'b';
		String msg;		//문자열을 저장할 수 있는 변수 선언
		
		msg = (ch >= 'A' && ch <= 'Z') ? "대문자입니다" : "소문자입니다";
		// A ~ Z (65 ~ 90) / a ~ z(97 ~ 122)
		System.out.println("msg : " + msg);	//msg : 소문자입니다
		System.out.println("ch : " + ch);	//ch : b
		
	}
}
