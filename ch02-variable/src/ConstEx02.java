/*
자료형으로 표현되는 상수 (리터럴 상수)

*/
public class ConstEx02 {

	public static void main(String[] args)
	{
//		int num1=10000000000;
		//num1에 저장불가 (컴파일 에러:The literal 10000000000 of type int is out of range )
		//10000000000을 int형에 저장하려고 할 때 int형 저장공간보다 크므로 에러가 발생
		//0 10개
		
		
//		long num2=10000000000;
		//컴파일 에러(The literal 10000000000 of type int is out of range)
		//충분히 담을 수 있는 long형 자료형 변수를 선언한 후 저장 시도
		//10000000000 자체가 int형으로 표현 불가능 하기 때문에 에러 발생
		
		
//		float num3=3.14;
		//컴파일 에러(cannot convert from double to float)
		//3.14는 double형 이므로 float에 저장 불가
	}
}
