//확장 특수 출력 문자 사용하기

/*
'\n'	줄 바꿈, 
		개행(new line)

'\t'	수평 탭으로 일정한 간격 띄우기
		탭(tab)

'\\'	\(역슬래시)문자 출력

'\''	' (작은 따옴표)문자 출력
		single quote
		
'\"'	" (큰 따옴표)문자 출력
		double quote
*/

public class EscapeSequenceEx01 {

	public static void main(String[] args) {
//		System.out.println("나의 이름은 "홍길동"이라고 합니다.");
		//()안의 끝 따음표를 문자열 시작과 끝으로만 인식하여 Syntax error
		
		
		System.out.println("나의 이름은 \"홍길동\"이라고 합니다.");
		// \"	:문자열 내에서 큰 따음표로 인식(")
		
		
		//\n, \t
		System.out.println("I am a boy, You are a girl");
		System.out.println("I am a boy, \n You are a girl");
		System.out.println("I am a boy, \t You are a girl");
		
	}

}


//출력결과
//나의 이름은 "홍길동"이라고 합니다.
//나의 이름은 "홍길동"이라고 합니다.
//I am a boy, You are a girl
//I am a boy, 
// You are a girl
//I am a boy, 	 You are a girl