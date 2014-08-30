/*
문자 자료형 char 
*/
public class VariableEx04 {

	public static void main(String[] args)
	{
		//컴퓨터는 문자를 표현할 수 없으므로
		//2byte공간에 대응되는 문자의 유니코드 값으로 자동 변환됩니다.
		char ch1='A';			//'A'은 16진수로 0x41
		char ch2='한';			//'한'은 16진수로 0xD55C
		char ch3=54620;			//54620은 16진수로 0xD55C
		char ch4=0x3081;
		char ch5=0x3082;
		char ch6='1';
		char ch7=1;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
	}
}
