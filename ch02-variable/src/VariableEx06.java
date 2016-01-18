/*
//소수점의 자릿수 지정방법-String의 포멧 지정 방법

Float 타입형을 String 타입형으로 전환할 때 소수점 자릿수 지정방법
	• DecimalFormat Class로 소수점 지정방법
->	• String의 포멧 지정 방법
	• Math.round 함수 사용
	• BigDecimal과 DecimalFormat 클래스 사용

*/
public class VariableEx06 {

	public static void main(String[] args)
	{
		float f = 123.77777f;
		double d = 234.88888;
		//%f: 부호 있는 10진수 실수
		//float, double 형의 데이터를 실수(근사, 지수)로 출력하는 서식
		String str1 = String.format("%.2f", f);
		String str2 = String.format("%.4f", d);
		System.out.println("str = " + str1);
		System.out.println("str = " + str2);

	}
}
	
