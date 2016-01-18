/*
문자 자료형 char
	• 문자표현을 위한 문자셋으로 자바에서는 유니코드 기반으로 표현하게 됩니다.(문자 하나를 2바이트로 표현하는 유니코드 기반으로 표현)
	• 유니코드는 전 세계의 문자를 표현할 수 있는 코드 집합입니다.
	• 문자는 작은 따옴표(')로 표현합니다.
	• 문자는 char형 변수에 저장되고 저장 시 실제로는 유니코드 값 저장됩니다.

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
