/*
//재귀 함수 호출
//함수 코드의 복사본이 하나 더 생성해서 실행되는 것이 재귀입니다.
//재귀 호출을 이용하여 팩토리얼 구하기


[메소드의 재귀호출]
	• 자료구조 알고리즘을 이해하기 위해서 꼭 필요한 부분입니다.
	• 자바에서는 재귀적 메소드 호출을 허용합니다.
	• 함수의 복사본을 하나 더 생성해서 실행되는 것이 재귀입니다.
	• 종료조건이 만족되지 않으면 무한 루프에 빠질 수 있으며 종료조건은 메소드의 실행과 재귀 메소드가 실행되는 사이에 존재해야 됩니다.


[재귀 함수(Recursive Function)]
특정 조건을 만족할 때 까지 함수호출이 반복되는 것



[팩토리얼(Factorial)]
	• 1부터 어떤 양의 정수 n까지의 정수를 모두 곱한 것
	• 이것을 n! 이라고 표현

n!
n! = n * (n-1) * (n-2) * (n-3) * . . . * 1


수학적 측면
5! = 5 x 4 x 3 x 2 x 1
4! = 4 x 3 x 2 x 1
3! = 3 x 2 x 1
2! = 2 x 1
1! = 1 

일반화
5! = 5 x 4!
4! = 4 x 3!
3! = 3 x 2!
2! = 2 x 1!
1! = 1 


팩토리얼 (참고)
http://codedragon.tistory.com/3320

*/

public class RecursiveEx01 {

	public static void main(String[] args) {
		System.out.println("3 factorial: " + factorial(3));
		System.out.println("7 factorial: " + factorial(7));		
		System.out.println("12 factorial: " + factorial(12));
	}
	
	public static int factorial(int n) //재귀함수
	{
		if(n==1)
			return 1;
		else
			return n*factorial(n-1); //재귀 호출
	}
	
	//3 * f(2)	-> 3 * 2 	-> 6반환 
	//f(2) 		-> 2 * f(1)	-> 2 * 1	-> 2반환
	//f(1)		-> 1반환

}

