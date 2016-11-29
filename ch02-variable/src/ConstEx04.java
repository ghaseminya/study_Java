/*
//상수 선언


상수 선언
변수에 final을 적용 시 상수를 의미


문법 구성
final [자료형] [변수명];

*/
public class ConstEx04 {

	public static void main(String[] args) {

		//TODO : 변수
		int num1 = 100;
		
		System.out.println(num1); //100
		
		//--------------------
		//TODO : 상수 선언
		//변수에 final을 적용 시 상수가 됩니다.
//		final int num2 = 200;
		final int NUM2 = 200; //상수명은 관례로 모두 대문자 사용
		
		System.out.println(NUM2); //200

		
		//TODO : 상수 값 변경
		//상수의 저장된 값을 변경할 경우 컴파일 에러 발생
//		NUM2 = 300;
		//ERROR-The final local variable NUM2 cannot be assigned. It must be blank and not using a compound assignment
		
	}
}
