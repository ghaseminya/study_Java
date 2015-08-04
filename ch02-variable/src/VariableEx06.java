//소수점의 자릿수 지정방법-String의 포멧 지정 방법

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
	
