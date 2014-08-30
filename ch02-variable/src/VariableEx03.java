/*
정수 실수 표현 방식

*/
public class VariableEx03 {

	public static void main(String[] args)
	{
		int num1=0xA0E;		//A0E(16진수)
		int num2=0752;		//752(8진수)
		int num3=752;		//752(10진수)
		
		//지수형식 표시하기 위해 e표기법 사용
		//자바에서는 e표기법 지원함
		double e1=1.7e+3;	//1.7+3
		double e2=1.7e-3;	//1.7-3
		
		System.out.println(num1);	
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
