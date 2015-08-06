//break문 - 특정 조건일 때 반복문 빠져나가기


public class BreakEx01 {

	public static void main(String[] args) {
		
		for( int i=0 ; i<= 10; i++){			
			System.out.println(i);
			
			//특정 조건일 때 반복문 빠져나가기
			if( i == 8 ){
				break;
			}
		}
		System.out.println("프로그램 종료!!");

	}
}
