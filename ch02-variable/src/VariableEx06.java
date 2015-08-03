//소수점의 자릿수 지정방법-String의 포멧 지정 방법

public class VariableEx06 {

	public static void main(String[] args)
	{
		float f = 123.77777f;
		String str1 = String.format("%.2f", f);
		String str2 = String.format("%.4f", f);
		System.out.println("str = " + str1);
		System.out.println("str = " + str2);

	}
}
	
