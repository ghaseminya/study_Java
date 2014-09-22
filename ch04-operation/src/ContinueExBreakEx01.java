/*
continue vs break

*/
public class ContinueExBreakEx01 {

	/*
	//continue문 예시
	public static void main(String[] args) {
		// 특정조건일때 continue문으로 다음 회차로 건너뛰기
		// continue문 이하의 문장 수행하지 않고 다시 조건 검사를 수행함
		
		for(int i =0; i<=10; i++){
		
			//특정 조건일때 코드 수행을 건너뛰고 다음 회차로 건너뛴다(조건 검사로 이동).
			if( i == 7)
				continue;
			System.out.println(i);
		}
		
		System.out.println("반복문 수행 완료!");
	}
	*/

	
	
	//break문 예시
	public static void main(String[] args) {
		// 특정조건일때 break문으로 반복문을 빠져나감
		// 반복문 다음 문장 수행

		for(int i =0; i<=10; i++){

			//특정 조건일때 반복문을 빠져나감(for문 탈출).
			if( i == 7)
				break;
			System.out.println(i);
		}

		System.out.println("반복문 수행 완료!");
	}
	
	
}
