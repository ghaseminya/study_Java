/*
시프트 연산자
>> 연산시  음수인 경우와 양수인 경우 확인
*/
public class OperatorEx17 {

	public static void main(String[] args)
	{
		byte a1 = 12;
		System.out.println("");
		System.out.println("a1 : " + a1);
		byte g = (byte)(a1 >> 2);
		System.out.println("a1 >> 2: " + g);
		
		byte a2 = -12;
		System.out.println("");
		System.out.println("a2 : " + a2);
		byte h = (byte)(a2 >> 2);
		System.out.println("a2 >> 2: " + h);
		
		System.out.println("");
		System.out.println("a2 : " + a2);
		byte r = (byte)(a2 >>> 2);
		System.out.println("a2 >>> 2: " + r);
	}
}
