// % 연산자 연산(나머지 연산)

public class OperatorEx14 {
	
	public static void main(String[] args)
	{
		//실수형 연산
		System.out.println("정수형 나머지: " + 7%3);	//정수형 나머지: 1
		
		//실수형 연산의 결과가 나오지만 의미없는 값이 되므로
		//피연산자에 실수형 연산자가 나오는 %연산자 수식은 잘못된 것입니다(무시).
		System.out.println("실수형 나머지: " + 7.2 % 3.0);	//실수형 나머지: 1.2000000000000002
	}
}
