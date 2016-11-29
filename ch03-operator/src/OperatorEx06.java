/*
//조건(삼항) 연산자  - 절대값 만들기

조건 연산자(삼항 연산자)
하나의 조건을 정의하여 만족할 경우에는 '참값'을 반환하고 
만족하지 못할 경우에는 '거짓값'을 반환하여 단순 비교에 의해 처리를 유도하는 연산자입니다.


[조건 연산자의 의미]
연산자		의미					구성
?  :	제어문의 단일 비교문과 유사	조건식 ? 참일때의 값 : 거짓일때의 값


[삼항 연산자 형식]
[true or false] ? [참일때 값] : [거짓일때 값]

*/
public class OperatorEx06 {
	public static void main(String[] args){
		System.out.println("=========조건(삼항) 연산자 =========");
		
		System.out.println("절대값 만들기: ");
		int x = 10;
		int y = -20;
		
		//조건식(true or false) ? 참값 : 거짓값
		int absX = (x >=0) ? x : -x;
		int absY = (y >=0) ? y : -y;
		System.out.println("x=10일 때, x의 절대값: " + absX);	//x=10일 때, x의 절대값: 10
		System.out.println("y=-20일 때, y의 절대값: " + absY); //y=-20일 때, y의 절대값: 20
			
		System.out.println("");
	}
}
