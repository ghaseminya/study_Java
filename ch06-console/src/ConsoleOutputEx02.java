/*
//printf( )메소드를 통한 문자열 조합

System.out.printf
	• System.out.printf 메소드는 문자열의 중간에 삽입될 데이터를 가지고 하나의 문자열을조합해서 출력합니다.
	• %는 어떤 데이터를 표시하겠다는 서식문자입니다.
	• JDK 1.5 이상부터 사용가능합니다


[서식 문자]
http://codedragon.tistory.com/2536
*/
public class ConsoleOutputEx02 {

	public static void main(String[] args)
	{

		//JDK 1.5이상부터 사용가능합니다.
		System.out.printf("정수는 %d,  실수는 %f, 문자는 %c, 문자열는 %s", 7, 3.14F, 'J', "Love");
		//정수는 7,  실수는 3.140000, 문자는 J, 문자열는 Love

	}
}
