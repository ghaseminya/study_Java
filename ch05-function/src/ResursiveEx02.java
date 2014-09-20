/*
잘못된 재귀 메소드 정의
*/

public class ResursiveEx02 {

	public static void main(String[] args) {

		showJava(3);
	}

/*잘못된 재귀 메소드 정의*/
/*	public static void showJava(int cnt)
	{
		System.out.println("JAVA ");
		
		//재귀메소드 호출
		showJava(cnt--);	//Exception in thread "main" java.lang.StackOverflowError
		
		//종료조건
		if(cnt==1)
			return;
	}*/

	
/*
해결방법
1) 증감을 post증가에서 pre증가로 변경
2) 종료 조건 위치 변경	: 종료조건은 메소드의 실행과 재귀 메소드 실행되는 사이에 존재해야 합니다.
*/
	
	
	
/*수정환 재귀 메소드 정의*/
	public static void showJava(int cnt)
	{
		System.out.println("JAVA ");
		
		//종료조건
		if(cnt==1)
			return;
		
		//post증가로 면경 및 위치변경
		showJava(--cnt);
	}

}
