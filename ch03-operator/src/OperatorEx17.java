//시프트 연산자
//>> 연산시  음수인 경우와 양수인 경우 확인
//시프트된 결과만 확인

public class OperatorEx17 {

	public static void main(String[] args)
	{
		byte a1 = 12;
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		
		System.out.println("");
		System.out.println("a1 : " + a1); //a1 : 12
		byte g = (byte)(a1 >> 2);
		System.out.println("a1 >> 2: " + g); //a1 >> 2: 3
		
		byte a2 = -12;
		System.out.println("");
		System.out.println("a2 : " + a2); //a2 : -12
		byte h = (byte)(a2 >> 2);
		System.out.println("a2 >> 2: " + h); //a2 >> 2: -3
		
		System.out.println("");
		System.out.println("a2 : " + a2); //a2 : -12
		byte r = (byte)(a2 >>> 2);
		System.out.println("a2 >>> 2: " + r); //a2 >>> 2: -3
	}
}
