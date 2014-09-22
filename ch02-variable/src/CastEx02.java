/*
자료형 변환
자료형의 변환은 표현방법의 변환을 의미합니다.
*/
public class CastEx02 {

	public static void main(String[] args)
	{
		short num1=10;
		short num2=20;
		short result=(short)(num1 + num2);
		//short to int -> 연산 -> int to short (내부적으로 자동으로 일어남)
		
		System.out.println(result);
	}
}
