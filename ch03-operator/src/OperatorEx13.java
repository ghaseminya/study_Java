/*
//연산자 연산(나눗셈 연산)


*/
public class OperatorEx13 {

	public static void main(String[] args) {

		//정수형 연산
		System.out.println("정수형 나눗셈: " + 7/3);	//정수형 나눗셈: 2

		//실수형 연산
		System.out.println("실수형 나눗셈: " + 7.0f/3.0f);	//실수형 나눗셈: 2.3333333

		//실수형 연산이 이뤄지면 연산자 우선순위를 통해 아래와 같이 연산이 수행됩니다.
		//(float)7 -> 7.0f
		//7.0f/3 -> 7.0f/3.0f
		System.out.println("형변환 나눗셈: " + (float)7/3);	//형변환 나눗셈: 2.3333333
	}
}
