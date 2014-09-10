
public class OperatorEx16 {
	public static void main(String[] args)
	{
		int num1=5;		/* 00000000 00000000 00000000 00000101 */
		int num2=3;		/* 00000000 00000000 00000000 00000011 */
		int num3=-1;	/* 11111111 11111111 11111111 11111111 */
		
		System.out.println(num1 & num2);
		// 00000000 00000000 00000000 00000101
		// 00000000 00000000 00000000 00000011
		// 00000000 00000000 00000000 00000001
		
		System.out.println(num1 | num2);
		// 00000000 00000000 00000000 00000101
		// 00000000 00000000 00000000 00000011
		// 00000000 00000000 00000000 00000111
		
		System.out.println(num1 ^ num2);
		// 00000000 00000000 00000000 00000101
		// 00000000 00000000 00000000 00000011
		// 00000000 00000000 00000000 00000110
		
		System.out.println(~num3);	
		// 11111111 11111111 11111111 11111111
		// 00000000 00000000 00000000 00000000
	}
}