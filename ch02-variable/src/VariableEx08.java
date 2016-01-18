
/*
//BigDecimal과 DecimalFormat 클래스 사용

Float 타입형을 String 타입형으로 전환할 때 소수점 자릿수 지정방법
	• DecimalFormat Class로 소수점 지정방법
	• String의 포멧 지정 방법
	• Math.round 함수 사용
->	• BigDecimal과 DecimalFormat 클래스 사용

*/
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class VariableEx08 {

	public static void main(String[] args)
	{
		double d = (double)97/6;

		System.out.println("double : " + d);
		
		BigDecimal bigDecimal = new BigDecimal(d);

		System.out.println("BigDecimal : " + bigDecimal);
		
		//소수점 2자리, 반올림
		bigDecimal.setScale(2, java.math.BigDecimal.ROUND_HALF_UP); 

		System.out.println("setScale : " + bigDecimal.setScale(2, java.math.BigDecimal.ROUND_HALF_UP)); 
		DecimalFormat fourDigits = new DecimalFormat("0.00"); //소수점 밑 2자리까지
		String str = fourDigits.format(d);

		System.out.println("DecimalFormat: "+ str);
		
	}
}
