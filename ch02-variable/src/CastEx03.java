/*
�ڵ��� ��ȯ-���θ��/����
*/

public class CastEx03 {
	public static void main(String[] args){
		
		
		System.out.println("");
		System.out.println("=========���θ��=========");
		/*���θ��:
		�� ū �ڷ������� �°��� �Ͼ�� ����
		������ �ս��� ���� ������ �ڵ������� �߻�*/
		byte b1 = 127;
		byte b2 = 127;
//		byte b3 = b1 + b2;
		int i1 = b1 + b2;	
		/*32bit(4byte)�̸� byte�� ������ ����� 32bit int������ �°ݵ˴ϴ�. ������ Ÿ���� �ٸ��Ƿ� ��, int���� byte������ ������� �ʽ��ϴ�.
		Error: cannot convert from int to byte*/
		System.out.println("i1= " + i1 );
		System.out.println("b1 + b2 = " + (b1+b2) );	// �ڵ������� int�� ����ȯ �˴ϴ�.
		
		System.out.println("");
		short s1 = 12345;
		short s2 = 12345;
		int i2 = s1 + s2;
//		32bit(4����Ʈ)�̸� shore�� ������ ����� 32bit int������ �°�
		System.out.println("i2= " + i2 );
		System.out.println("s1 + s2 = " + (s1+s2) );	// �ڵ������� int�� ����ȯ �˴ϴ�.
		
		System.out.println("");
		int int1 = 12345;
		long lg1 = 1234567L;
//		long		= int		long
		long resultL = int1 + 	lg1;	// int -> long �ڵ������� ����ȯ
		System.out.println("resultL = " + resultL);
		
		System.out.println("");
		int int2 = 12345;
		double d1 = 100.3D;
		double resultD= int2 + d1;	// int -> double �ڵ������� ����ȯ
		System.out.println("resultD = " + resultD);
		
		
		System.out.println("");System.out.println("");
		System.out.println("=========����=========");
		/*����:
		�� ���� �ڷ������� ����
		�ڷ��� �ս��� ���� �� ����
		��������� ����ȯ�ؾ� ��*/
		byte b4 = 125;
		byte b5 = 125;
		byte result_byte = (byte)(b4 + b5); 	
		//�������� int�� �ڵ����� ����ȯ �ǹǷ� byte�� �ڷ����� �����ϱ� ���� int -> byte�� ���� ����ȯ
//		(byte): ĳ��Ʈ �����ڸ� ����Ͽ� ���� ����ȯ
		System.out.println("result_byte = " + result_byte);
		System.out.println("b4 + b5 = " + (b4 +b5) );
		
		System.out.println("");
		short s4 = 1234;
		short s5 = 1234;
		short result_short = (short)(s4 + s5);
		System.out.println("s4 + s5 = " + (s4 +s5) );
		System.out.println("result_short = " + result_short);
		
		System.out.println("");
		int int3 = 1234;
		float f1 = 100.5F;
//		int result_int1 = int3 + f1;
		int result_int2 = int3 + (int)f1;	//float ->int�� ���� ����ȯ (�����)
		System.out.println("int3 + f1 = " + (int2 + f1) );
		System.out.println("result_int2 = " + result_int2);
		
		System.out.println("");
		int int4 = 1234;
		long lg2 = 1234L;
		int result_int3 = int4 + (int)lg2;	//long -> int�� ���� ����ȯ
		System.out.println("int4 + lg2 = " + (int2 +lg2) );
		System.out.println("result_int3 = " + result_int3);
		
		
		
	}

}
