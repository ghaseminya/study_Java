/*
자동형 변환-프로모션/디모션
*/

public class CastEx03 {
	public static void main(String[] args){
		
		System.out.println("");
		System.out.println("=========프로모션=========");
		//프로모션:
		//•더 큰 자료형으로 승격이 일어나는 형태
		//•정보의 손실이 전혀 없으며 자동적으로 발생
		byte b1 = 127;
		byte b2 = 127;
//		byte b3 = b1 + b2;	//Error: cannot convert from int to byte
		//32bit(4byte)미만 byte형 데이터 연산시 32bit int형으로 승격됩니다. 
		//데이터 타입이 다르므로 즉, int형은 byte형으로 저장되지 않습니다.
		//byte(1byte), int(4byte)
		int i1 = b1 + b2;
		System.out.println("i1= " + i1 );	//i1= 254
		System.out.println("b1 + b2 = " + (b1+b2) );	// 자동적으로 int로 형변환 됩니다.
														// b1 + b2 = 254
		
		System.out.println("");
		short s1 = 12345;
		short s2 = 12345;
		int i2 = s1 + s2;
		//32bit(4바이트)미만 short형 데이터 연산시 32bit int형으로 승격
		//short(2byte), int(4byte)
		System.out.println("i2= " + i2 );				// i2= 24690
		System.out.println("s1 + s2 = " + (s1+s2) );	// 자동적으로 int로 형변환 됩니다.
														// s1 + s2 = 24690
		
		System.out.println("");
		int int1 = 12345;
		long lg1 = 1234567L;
//		long		 = int	+	long
		long resultL = int1 + 	lg1;	// int -> long 자동적으로 형변환
		//int(4byte), long(8byte)
		System.out.println("resultL = " + resultL);	//resultL = 1246912
		
		System.out.println("");
		int int2 = 12345;
		double d1 = 100.3D;
		double resultD= int2 + d1;	// int -> double 자동적으로 형변환
		//int(4byte), double(8byte)
		System.out.println("resultD = " + resultD);	//resultD = 12445.3
		
		
		//------------------------------
		System.out.println("");System.out.println("");
		System.out.println("=========디모션=========");
		//디모션:
		//•더 작은 자료형으로 강등
		//•자료의 손실이 있을 수 있음
		//•명시적으로 형변환해야 함
		byte b4 = 125;
		byte b5 = 125;
		byte result_byte = (byte)(b4 + b5); 	
		//연산결과로 int로 자동으로 형변환 되므로 byte로 자료형을 유지하기 위해 int -> byte로 강제 형변환
		//(byte): 캐스트 연산자를 사용하여 강제 형변환
		//int(4byte) -> byte(1byte)
		System.out.println("result_byte = " + result_byte);	//result_byte = -6
		System.out.println("b4 + b5 = " + (b4 +b5) );		//b4 + b5 = 250
		
		
		System.out.println("");
		short s4 = 1234;
		short s5 = 1234;
		short result_short = (short)(s4 + s5);
		System.out.println("s4 + s5 = " + (s4 +s5) ); //s4 + s5 = 2468
		System.out.println("result_short = " + result_short); //result_short = 2468
		
		
		System.out.println("");
		int int3 = 1234;
		float f1 = 100.5F;
//		int result_int1 = int3 + f1;
		int result_int2 = int3 + (int)f1;	//float ->int로 강제 형변환 (절삭됨)
		//int(4byte), float(4byte)
		System.out.println("int3 + f1 = " + (int3 + f1) );	//int3 + f1 = 1334.5
		System.out.println("result_int2 = " + result_int2);	//result_int2 = 1334
		
		
		System.out.println("");
		int int4 = 1234;
		long lg2 = 1234L;
		int result_int3 = int4 + (int)lg2;	//long -> int로 강제 형변환
		//long(8byte), int(4byte)
		System.out.println("int4 + lg2 = " + (int4 +lg2) );	//int4 + lg2 = 2468
		System.out.println("result_int3 = " + result_int3);	//result_int3 = 2468
		//자료형 표현범위에 있어서 데이터 손실 없이 값이 출력됨
	}
	
}
