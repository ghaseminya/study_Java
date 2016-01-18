/*
//대입연산자와 산술연산자

산술 연산자
4칙 연산(+, -, *, /)과 나머지 값을 구하는 연산자(%)를 지칭합니다.


*/
public class OperatorEx12 {

	public static void main(String[] args) {
		//대입연산자 
		//오른쪽의 값을 왼쪽의 변수에 저장하게 됩니다.
		int n1 = 7;	//변수 선언 및 초기화	
		int n2 = 3;
		
		//변수 선언 및 연산결과를 통해 변수 초기화
		int result = n1 + n2;
		System.out.println("덧셈 결과: "+result);

		//result변수의 데이터 변경
		result = n1 - n2;
		System.out.println("뺄셈 결과: " + result);
		
		System.out.println("곱셈 결과: " + n1*n2);
		System.out.println("나눗셈 결과: " + n1/n2);
		System.out.println("나머지 결과: " + n1%n2);
	}

}
