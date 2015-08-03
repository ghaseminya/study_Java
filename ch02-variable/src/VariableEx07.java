//소수점의 자릿수 지정방법-Math.round 함수 사용


public class VariableEx07 {

	public static void main(String[] args)
	{
		//Math.round()함수는 소수점 첫번째 자리를 참조하여 반올림
		System.out.println(Math.round(12345.777));	//12346
		
		
		//소수점 1째자리까지 표현하기
//		System.out.println(Math.round(12345.777*10));
		System.out.println(Math.round(12345.777*10)/10.0);
//		System.out.println(Math.round(12345.777*10)/10);	//정수정수로 계산되므로 반드시  /100.로 실수형으로 나눠질수있도록 소수점 표현해야 합니다.
		
		//소수점 2째자리까지 표현하기
//		System.out.println(Math.round(12345.777*100));
		System.out.println(Math.round(12345.777*100)/100.0);
		
		//소수점 3째자리까지 표현하기
//		System.out.println(Math.round(12345.777*1000));
		System.out.println(Math.round(12345.777*1000)/1000.0);
		
	}
}
