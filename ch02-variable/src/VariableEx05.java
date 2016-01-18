/*
Float 타입형을 String 타입형으로 전환할 때 소수점 자릿수 지정방법
->	• DecimalFormat Class로 소수점 지정방법
	• String의 포멧 지정 방법
	• Math.round 함수 사용
	• BigDecimal과 DecimalFormat 클래스 사용

*/
import java.text.DecimalFormat;

public class VariableEx05 {


	public static void main(String[] args)
	{
		//CASE 01 --------------------------------------------
		float f1 = 0.77777f;	//자동 반돌림되어 0.78  출력
		
		//float f 의 소수점 두번째 자리까지의 값을 String str 로 변환
		//소수점 3째 자리 이하는 반올림으로 처리
		DecimalFormat format1 = new DecimalFormat("#.##");
		String str1 = format1.format(f1);
		
		System.out.println("str = " + str1);
		
		
		//CASE 02 --------------------------------------------
		float f2 = 123456.77777f;
		
		DecimalFormat format2 = new DecimalFormat("####.##");
		String str2 = format2.format(f2);
		
		System.out.println("str = " + str2);	//str = 123456.78
		//####.##'으로 정수 부분에 해당하는 ####은 4개로 지정했지만
		//결과는 정수 부분 6자리가 모두 출력됩니다. 정수 부분 자릿수에는 영향을 미치지 않습니다.

		
//		CASE 03 --------------------------------------------
		float f3 = 123456.7777f;
		
		DecimalFormat format3 = new DecimalFormat("##");
		String str3 = format3.format(f3);
		System.out.println("str = " + str3);	//str = 123456
		
//		double f33 = 123456.77777;
		float f33 = 123456.7777f;
		DecimalFormat format33 = new DecimalFormat(".##");
		
		String str33 = format33.format(f33);
		System.out.println("str = " + str33);	//str = 123456.78
		
//		CASE 04 --------------------------------------------
		float f4 = 123456.7777f;
		
		DecimalFormat format4 = new DecimalFormat("00");
		String str4 = format4.format(f4);
		System.out.println("str = " + str4);	//str = 123456
		
//		double f44 = 123456.77777;
		float f44 = 123456.7777f;
//		float f44 = 123456.44444f;
		DecimalFormat format44 = new DecimalFormat(".00");
//		DecimalFormat의 pattern을 변경하고 싶을 때는 void applyPattern(String pattern)을 사용한다.
//		format44.applyPattern(".0000");
		
		String str44 = format44.format(f44);
		System.out.println("str = " + str44);	//str = 123456.78
		
	}
}
