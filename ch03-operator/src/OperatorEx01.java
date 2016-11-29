/*
증감 연산자
	• 1씩 증가 또는 감소시키는 연산자입니다. 
	• 모든 수치 데이터 형식과 열거형식에서 사용
	• ++ 또는 -- 연산자가 변수 앞에 위치하느냐? 아니면 변수 뒤에 위치하느냐? 가 중요한 연산자입니다.


[증감 연산자 종류]
연산자		의미
++		1씩 증가
--		1씩 감소




*/
public class OperatorEx01 {
	public static void main(String[] args){
		
		System.out.println("=========증가 연산자=========");
		int i1=5;
		int i2=5;
		System.out.println("증가연산자 선행 : " + (++i1) );	//증가연산자 선행 : 6
		System.out.println("i1 : " + i1);	//i1 : 6
				
		System.out.println("증가연산자 후행 : "+ (i2++) );	//증가연산자 후행 : 5
		System.out.println("i2 : " + i2);	//i2 : 6
		
		System.out.println("\n=========감소 연산자=========");
		System.out.println("");
		int j1 = 10;
		int j2 = 10;
		System.out.println("감소연산자 선행 : "+ (--j1) );	//감소연산자 선행 : 9
		System.out.println("j1 : " + j1);	//j1 : 9
		
		System.out.println("감소연산자 후행 : "+ (j2--) );	//감소연산자 후행 : 10
		System.out.println("j2 : " + j2);	//j2 : 9
		
	}
}
