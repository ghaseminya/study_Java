/*
시프트 연산자 확인
*/
public class OperatorEx11 {
	public static void main(String[] args){
		System.out.println("=========시프트 연산자=========");
		System.out.println("");
		
		byte a = 12;
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		// 0   0  0  0  0 0 1 1  ( >> 2 )
		// 0   0  1  1  0 0 0 0  ( << 2 )
		
		System.out.println("a : " + a);
		byte c = (byte)(a >> 2);
		System.out.println("a >> 2: " + c);
		
		System.out.println("");
		System.out.println("a : " + a);
		byte d = (byte)(a << 2);
		System.out.println("a << 2: " + d);
		
		System.out.println("");
		System.out.println("a : " + a);
		byte e = (byte)(a >>> 2);
		System.out.println("a >>> 2: " + e);
		
		System.out.println("");
		System.out.println("a : " + a);
		byte f = (byte)(a >> 2);
		System.out.println("a >> 2: " + f);
		

		
	}
}
