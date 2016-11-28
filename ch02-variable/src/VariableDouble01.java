/*
double형 변수의 선언과 활용
//--------------------

실수
	• 정수 표현방식보다 더 중요
	• 실수는 오차를 동반



실수 자료형 선택 기준 (float vs double)
	• float와 double 모두 매우 충분한 표현 범위를 가지고 있지만 이 둘의 가장 큰 차이점은 정밀도가 다릅니다.
	• 따라서 필요한 정밀도를 바탕으로 자료형을 결정해야 하며
	• 일반적으로 double 자료형 선택을 권장합니다.

*/

public class VariableDouble01 {

	public static void main(String[] args)
	{
		//동일한 자료형으로 두개이상의 변수 선언
		double num1, num2, result;
		//변수 초기화
		num1=11.0000001;
		num2=22.0000002;
		//연산 수행후 결과 저장
		result=num1+num2;
		
		System.out.println(result); //33.000000299999996
		//결과값이 33.0000003이 아니라 33.000000299999996 와 같이 정확한 결과값이 나오지 않습니다.
		//이는 자료형의 표현방식의 차이때문입니다.
		//실수는 정밀도를 포기하고, 대신에 표현할 수 있는 값의 범위를 넓히는 대신 근사값을 사용

	}
}
