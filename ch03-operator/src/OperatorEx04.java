//논리 연산자

//선조건	&&	후조건	Result
//true	&&	true	true
//true	&&	false	false
//false	&&	true	false
//false	&&	false	false

//선조건	||	후조건	Result
//true	||	true	true
//true	||	false	true
//false	||	true	true
//false	||	false	false


public class OperatorEx04 {
	public static void main(String[] args){
		
		System.out.println("=========논리 연산자 =========");
		boolean t, f, result;
		t = true;
		f = false;
		
		result = t && f;	//논리곱
		System.out.println("t && f : " + result);
		
		System.out.println("");
		result = t || f;	//논리합
		System.out.println("t || f : " + result);
		
		System.out.println("");
		result = ! t;	//논리부정
		System.out.println("!t : " + result);
		
	}
}
