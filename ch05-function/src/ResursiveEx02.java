//잘못된 재귀 메소드 정의
//	• 종료조건이 만족되지 않으면 무한 루프에 빠질 수 있습니다.
//	• 종료조건 및 종료조건의 검사위치를 로직 상에서 점검 해야 합니다. 
//	• 종료조건은 메소드의 실행과 재귀 메소드 실행되는 사이에 존재해야 됩니다.

public class ResursiveEx02 {

	public static void main(String[] args) {

		showJava(3);
	}
	
	//TODO 1: 잘못된 재귀 메소드 정의
//	public static void showJava(int cnt){
//
//		System.out.println("JAVA ");
//		
//		//재귀메소드 호출
//		showJava(cnt--); //Exception in thread "main" java.lang.StackOverflowError
//		
//		//종료조건
//		if(cnt==1)
//			return;
//	}

	
	//---------------------------------------
	//TODO 2: 해결방법
	//1) 증감연산자를  post증가에서 pre증가로 변경
	//2) 종료 조건 위치 변경: 종료조건은 메소드의 실행과 재귀 메소드 실행되는 사이에 존재해야 합니다.
	
	//수정환 재귀 메소드 정의
	public static void showJava(int cnt){
		System.out.println("JAVA ");
		
		//TODO 2.2: 종료조건
		if(cnt==1)
			return;
		
		//TODO 2.1: post증가로 변경 및 위치변경 (주의)
		showJava(--cnt);
	}
}
