/*
변수 선언 / 변수 초기화 / 변수 사용
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
