/*
관계 연산자(비교 연산자)
	• 변수나 상수의 값을 비교할 때 쓰이는 연산자로서(두 피연산자 사이의 관계를 확인) 
	• 결과가 항상 true 또는 false인 논리값(boolean)이 반환됩니다.


[비교 연산자 종류]
연산자	의미	
>	크다			왼쪽 피연산자가 오른쪽 피연산자보다 크면 참, 아니면 거짓
	n1 > n2     //n1이 n2보다 큰가?
	
<	작다			왼쪽 피연산자가 오른쪽 피연산자보다 
	n1 < n2     //n1이 n2보다 작은가?
	
>=	크거나 같다		왼쪽 피연산자가 오른쪽 피연산자보다 크거나 같으면 참, 아니면 거짓
	n1 >= n2    //n1이 n2보다 같거나 큰가?
	
<=	작거나 같다			왼쪽 피연산자가 오른쪽 피연산자보다 작거나 같으면 참, 아니면 거짓
	n1 <= n2    	//n1이 n2보다 같거나 작은가?
	
==	피연산자들의 값이 같다	왼쪽 피연산자가 오른쪽 피연산자와 같으면 참, 아니면 거짓
	n1 == n2    	//n1과 n2가 같은가?
	
!=	피연산자들의 값이 같지 않다	왼쪽 피연산자가 오른쪽 피연산자와 다르면 참, 아니면 거짓
	n1 != n2     		 //n1과 n2가 다른가?


*/
public class OperatorEx02 {
	
	public static void main(String[] args){
		
		System.out.println("=========비교(관계) 연산자=========");
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a < b;
		System.out.println("a < b: " +result ); //a < b: true
		
		result = a > b;
		System.out.println("a > b: " +result ); //a > b: false
		
		result = a <= b;
		System.out.println("a =< b: " + result); //a =< b: true
		
		result = a >= b;
		System.out.println("a >= b: " + result); //a >= b: false
		
		result = a == b;
		System.out.println("a == b: " + result); //a == b: false
		
		result = a != b;
		System.out.println("a != b: " + result); //a != b: true
		
	}
}
