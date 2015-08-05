//조건(삼항) 연산자  - 최대값, 최소값 확인하기


public class OperatorEx07 {
	public static void main(String[] args){
		
		System.out.println("=========조건(삼항) 연산자 2=========");
		//최대값, 최소값 확인하기
		
		int a =5, b = 10;
		int max;	//최대값을 저장할 변수 선언
		int min;	//최소값을 저장할 변수 선언
		
		System.out.println("a : " + a);	//a : 5
		System.out.println("b : " + b);	//b : 10
		
		System.out.println("");
		max = a> b ? a : b;
		System.out.println("max : " + max);	//max : 10
		
		min = a < b ? a : b;
		System.out.println("min : " + min);	//min : 5
	}
}
