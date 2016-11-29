/*
접미사를 사용한 상수 표현방식 변경

*/
public class ConstEx03 {

	public static void main(String[] args) {

		double e1=3.14159;
		//3.14기본이 double형 자료형을 가집니다.
		float e2=3.14159F;
		//e2가 float형 자료형이기 때문에 F를 붙여 명시적으로 float형으로 표현해야 줘야 합니다.
		
		long n1=10000000000L;
		//10000000000은 int형으로 표현 불가능한 long형 자료형이지만
		//L을 붙이지 않으면 int형으로 인식하므로 long자료형으로 명시적으로 저장해 줘야 합니다. 
		//명시적으로 접미사L을 붙여 long형 상수 표현을 의미하도록 해줍니다.
		long n2=150;
		
		System.out.println(e1); //3.14159
		System.out.println(e2); //3.14159
		System.out.println(n1); //10000000000
		System.out.println(n2);	//150

	}
}
