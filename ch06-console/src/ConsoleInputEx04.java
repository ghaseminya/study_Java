//Scanner클래스의 메소드 사용하여 입력시
//next() 와 nextLine() 함수의 차이

import java.util.Scanner;

public class ConsoleInputEx04 {

	public static void main(String[] args)
	{
	
		Scanner scanner = new Scanner(System.in);
		
		String s1;
		//nextLine(): 문자 또는 문자열 한라인 전체를 입력 받습니다.
		//버퍼에 입력된 문자열을 개행문자 \n까지 가져오기
		s1 = scanner.nextLine();	//Hello World!
		System.out.println(s1);	//Hello World!
		
		
		String s2;
		//next(): 문자 또는 문자열을 공백을 기준으로 한단어 또는 한문자를 입력 받습니다.
		s2 = scanner.next();		//Hello World!
		System.out.println(s2);	//Hello
		
		scanner.close();
	}
}
