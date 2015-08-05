//Scanner클래스의 메소드 사용하여 입력시 next() 와 nextLine() 함수의 차이

import java.util.Scanner;

public class ConsoleInputEx04 {

	public static void main(String[] args)
	{
	
		Scanner scanner = new Scanner(System.in);
		String s;
		
		//nextLine(): 문자 또는 문자열 한라인 전체를 입력 받습니다.
		//버퍼에 입력된 문자열을 개행문자 \n 까지 오기
//		s = scanner.nextLine();
		
		//next(): 문자 또는 문자열을 공백을 기준으로 한단어 또는 한문자를 입력 받습니다.
		s = scanner.next();
		
		System.out.println(s);
		
		scanner.close();
		
	}
	
}
