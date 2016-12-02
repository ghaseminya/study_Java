/*
while문 형식
	• while문 구문 형식 확인
	• 반복문을 종료하기 위한 구문 주석 처리 후 결과 재확인

TODO 1: while무한루프 확인
TODO 2: while반복 정상 처리 결과 확인
 
//-------------------------------------

[while문]
	• while문은 for문과 같이 조건식을 만족할 경우에만 반복하는 제어문입니다.
	• while문은 한번도 실행되지 않을 수 있습니다.
	• 모든 반복문은 무한루프에 빠지지 않도록 주의


[while문  형식]
while( 조건식 ){
	//반복 수행구문;
}

*/	
public class WhileEx04 {

	public static void main(String[] args) {

		//초기식
		int num=0;

		while(num<5) //조건식(반복 조건)
		{ 	//반복영역
			System.out.println("I Love JAVA - " + num);
			
			//TODO 1: 종료하기 위한 구문을 주석처리하여 while 무한루프 확인하기 
			//TODO 2: 반복문을 종료하기 위한 구문, 증감식 구문 삽입, while반복 정상 처리 결과 확인하기
			//증감식
//			num++;	//반복문을 종료하기 위한 구문을 빠트리게 되면 무한루프에 빠지게 됩니다.

		}
	}
}
