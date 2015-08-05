//비트 연산자


public class OperatorEx10 {
	
	public static void main(String[] args){
		System.out.println("=========비트 연산자=========");
		System.out.println("");
		
		byte a = 12;
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		
		byte b = 20;
		// 128 64 32 16 8 4 2 1
		// 0   0  0  1  0 1 0 0
	
		
		System.out.println("비트단위의  AND(&): ");
//		값1	값2	결과
//		0	0	0
//		1	0	0
//		0	1	0
//		1	1	1
		
		byte c = (byte) (a & b);
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		// 0   0  0  1  0 1 0 0
		//----------------------
		// 0   0  0  0  0 1 0 0
		
		System.out.println("a : " + a);		//a : 12
		System.out.println("b : " + b);		//b : 20
		System.out.println("a & b : " + c);	//a & b : 4
		

//-----------------------------------------------------		
		System.out.println("");
		System.out.println("비트단위의  OR(|): ");
//		값1	값2	결과
//		0	0	0
//		1	0	1
//		0	1	1
//		1	1	1
		
		byte d = (byte) (a | b);
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		// 0   0  0  1  0 1 0 0
		//----------------------
		// 0   0  0  1  1 1 0 0
		
		System.out.println("a : " + a);		//a : 12
		System.out.println("b : " + b);		//b : 20
		System.out.println("a | b : " + d);	//a | b : 28
		
		
//-----------------------------------------------------
		System.out.println("");
		System.out.println("비트단위의  XOR(^): ");
//		값1	값2	결과
//		0	0	0
//		1	0	1
//		0	1	1
//		1	1	0
		
		byte e = (byte) (a ^ b);
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		// 0   0  0  1  0 1 0 0
		//----------------------
		// 0   0  0  1  1 0 0 0
		
		System.out.println("a : " + a);		//a : 12
		System.out.println("b : " + b);		//b : 20
		System.out.println("a ^ b : " + e);	//a ^ b : 24
	}
}
