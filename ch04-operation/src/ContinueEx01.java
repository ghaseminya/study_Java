/*
//1~10출력할 때 3의 배수는 출력하지 않기
//LAB

continue문
	• 반복문을 탈출하기위해 사용되는 것이 아니라 
	• continue문 이하의 수행문들을 포기하고 다음 회차의 반복을 수행하기 위한 제어문입니다

*/
public class ContinueEx01 {

	public static void main(String[] args) {
		// 특정조건일때 continue문으로 다음 회차로 건너뛰기
		// 1~10출력할 때 3의 배수는 출력하지 않기
		
		for(int i =0; i<=10; i++){
		
			//특정 조건일때 코드 수행을 건너뛰고 다음 회차로 건너뛴다.
			if( i%3 == 0)
				continue;
			System.out.println(i);
		}
	}
}
