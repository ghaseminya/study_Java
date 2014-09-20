/*
재귀 함수 호출
- 함수 코드의 복사본이 하나 더 생성해어 실행되는 것이 재귀입니다.
*/
public class RecursiveEx01 {

	public static void main(String[] args) {
		System.out.println("3 factorial: " + factorial(3));
		System.out.println("7 factorial: " + factorial(7));		
		System.out.println("12 factorial: " + factorial(12));
	}
	
	public static int factorial(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	
	//3 * f(2)	-> 3 * 2 	-> 6반환 
	//f(2) 		-> 2 * f(1)	-> 2 * 1	-> 2반환
	//f(1)		-> 1반환

}

