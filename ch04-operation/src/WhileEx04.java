//while문 형식
//	• while문 구문 형식 확인
//	• 반복문을 종료하기 위한 구문 주석 처리 후 결과 재확인

//----------------------
//while반복 정상 처리 결과 확인
//while무한루프 확인


	
public class WhileEx04 {

	public static void main(String[] args) {

		//초기식
		int num=0;

		while(num<5)	//반복 조건, 조건식
		{	//반복영역
			System.out.println("I Love JAVA - " + num);
			
			//반복문을 종료하기 위한 구문, 증감식
//			num++;	//반복문을 종료하기 위한 구문을 빠트리게 되면 무한루프에 빠지게 됩니다.
			
		}
	}

}
