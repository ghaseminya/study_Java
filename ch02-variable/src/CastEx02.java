//자료형 변환
//자료형의 변환은 표현방법의 변환을 의미합니다.

public class CastEx02 {

	public static void main(String[] args){
//		short num1=10;
//		short num2=20;
//		short result=(short)(num1 + num2);
		//short to int -> 연산 -> int to short (내부적으로 자동으로 일어남)
				
		//내부적으로 자동으로 일어나는 것 확인하는 코드
//		short result=(num1 + num2); 
		//short to int -> 연산 -> 연산결과 int를 short로 저장하려고 해서 에러 발생
		//ERROR-Type mismatch: cannot convert from int to short
		
//		System.out.println(result); //30
		
		
		//--------------------
		int num1=10;
		int num2=20;
		short result=(short)(num1 + num2);
		
		System.out.println(result); //30
	}
	
}
