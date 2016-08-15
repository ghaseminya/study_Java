//break문 - 특정 조건일 때 반복문 빠져나가기
/*
break문
가장 가까운 반복문을 탈출할 때 쓰이는 제어문입니다

*/

public class BreakEx01 {

	public static void main(String[] args) {
		
		for( int i=0 ; i<= 100; i++){			
			System.out.println(i);
			
			//특정 조건일 때 반복문 빠져나가기
			if( i == 8 ){
				break; //가장 가까운 반복문을 탈출
			}
		}
		System.out.println("프로그램 종료!!");

	}
}


//출력결과
//0
//1
//2
//3
//4
//5
//6
//7
//8
//프로그램 종료!!