/*
변수 선언 / 변수 초기화 / 변수 사용


변수(Variable)
	• 데이터를 저장하는 임시 저장 공간
	• 메모리 공간
	• 데이터 저장을 위한 메모리 공간을 할당(확보)하는 방법을 제공하고 할당된 메모리 공간의 접근(저장/참조)하기 위한 방법을 제공해 줍니다.


[데이터 (Data)]
변수에 저장되는 값


[식별자 명명 규칙]
	• 영문자(A~Z,a~z)와 숫자(0~9)와 ‘_’,’$’의 조합 (‘_’,’$’ 이외의 특수문자 사용 불가)
	• 첫 글자는 반드시 영문자나 ‘_’로 시작, 숫자로  시작 불허
	• 식별자는 대소문자를 철저히 구분합니다.
	• 자바에서 사용되는 예약어는 식별자로 사용할 수 없습니다.
	• 식별자는 가급적이면 자기 역할에 맞는 의미 있는 이름을 부여하여야 합니다.


*/

public class VariableEx01 {
	
	public static void main(String[] args){
		
		
		int num;	//변수 선언
		num = 20;	//변수 초기화(최초 데이터 입력)
		System.out.println(num);	//출력
		
		
		
		int number = 30;	//변수 선언과 초기화
		System.out.println(number);	//출력

		
		
		//변수 선언만 하고 초기화 하지 않은 경우(Error)
		int no;		//선언
//		System.out.println(no);		
		//선언만 한 후 출력하면 컴파일 에러남(Error: The local variable no may not have been initialized)
		//변수 선언 후 초기화하지 않으면 출력 또는 연산 할 수 없음
	}
}
