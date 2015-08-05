//시프트 연산자 확인
//>> 연산시  양수인 경우만 확인

public class OperatorEx11 {
	public static void main(String[] args){
		System.out.println("=========시프트 연산자=========");
		System.out.println("");
		
		byte a = 12;
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		// 0   0  0  0  0 0 1 1  ( >> 2 )
		// 0   0  1  1  0 0 0 0  ( << 2 )
		
		System.out.println("a : " + a);	//a : 12
		byte c = (byte)(a >> 2);
		System.out.println("a >> 2: " + c);	//a >> 2: 3
		
		System.out.println("");
		System.out.println("a : " + a);	//a : 12
		byte d = (byte)(a << 2);
		System.out.println("a << 2: " + d);	//a << 2: 48
		
		System.out.println("");
		System.out.println("a : " + a);	//a : 12
		byte e = (byte)(a >>> 2);
		System.out.println("a >>> 2: " + e);	//a >>> 2: 3
		
		System.out.println("");
		System.out.println("a : " + a);	//a : 12
		byte f = (byte)(a >> 2);
		System.out.println("a >> 2: " + f);	//a >> 2: 3
		
	}
}
