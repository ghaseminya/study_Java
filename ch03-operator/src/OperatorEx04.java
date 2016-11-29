/*
논리 연산자
	• 부울 연산(Boolean Operation)이라고도 합니다.
	• 참과 거짓으로 이루어지는 진리값이 피연산자인 연산자
	• true나 false인 논리 값을 가지고 다시 한번 조건 연산하는 연산자
	• 하나 이상의 처리 조건이 있어야 하며 먼저 처리되는 조건에 따라 다음의 처리 조건을 처리할지 안 할지를 결정하는 논리적인 연산자입니다.


[논리 연산자 종류]
연산자	의미	설명
&&	and		• 주어진 조건들이 모두 true일 경우에만 true
	논리곱		• a &&  b     //a와 b 모두 true이면 연산결과는 true
	
||	or		• 주어진 조건들 중 하나라도 true이면 true
	논리합		• a ||  b     //a와 b 둘중 하나라도 true이면 연산결과는 true
	
!	no		• true이면 false로 false이면 true로
	부정		• !a     //연산결과는 a가 true이면 false, a가 false이면 true


선조건		&&	후조건		Result
true	&&	true	true
true	&&	false	false
false	&&	true	false
false	&&	false	false

선조건		||	후조건		Result
true	||	true	true
true	||	false	true
false	||	true	true
false	||	false	false

*/
public class OperatorEx04 {
	public static void main(String[] args){
		
		System.out.println("=========논리 연산자 =========");
		boolean t, f, result;
		t = true;
		f = false;
		
		result = t && f;	//논리곱
		System.out.println("t && f : " + result); //t && f : false
		
		System.out.println("");
		result = t || f;	//논리합
		System.out.println("t || f : " + result); //t || f : true
		
		System.out.println("");
		result = ! t;	//논리부정
		System.out.println("!t : " + result); //!t : false
		
	}
}
