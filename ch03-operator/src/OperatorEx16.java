/*
//비트연산자

비트 연산자
피연산자 즉 연산의 대상이 되는 값들을 내부적으로 bit단위로 변경한 후 연산을 수행하는 연산자입니다.


[비트 연산자 종류]
연산자		의미
&		비트 단위의 AND
		n1 & n2;
1 & 1 	1
1 & 0	0
0 & 1	0
0 & 0	0
		
|		비트 단위의 OR
		n1 | n2
		
^		배타적 OR(XOR)
		n1 ^ n2;
1 ^ 1	0
1 ^ 0	1
0 ^ 1	1
0 ^ 0	0
		
~		피연산자의 모든 비트를 반전 시킨 결과를 반환
		~n1; 
~1	0
~0	1
*/

public class OperatorEx16 {
	public static void main(String[] args)
	{
		int num1=5;		/* 00000000 00000000 00000000 00000101 */
		int num2=3;		/* 00000000 00000000 00000000 00000011 */
		int num3=-1;	/* 11111111 11111111 11111111 11111111 */
		
		System.out.println(num1 & num2);	//1
		// 00000000 00000000 00000000 00000101
		// 00000000 00000000 00000000 00000011
		// 00000000 00000000 00000000 00000001
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  0 0 0 1
		
		System.out.println(num1 | num2);	//7
		// 00000000 00000000 00000000 00000101
		// 00000000 00000000 00000000 00000011
		// 00000000 00000000 00000000 00000111
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  0 1 1 1
		
		System.out.println(num1 ^ num2);	//6
		// 00000000 00000000 00000000 00000101
		// 00000000 00000000 00000000 00000011
		// 00000000 00000000 00000000 00000110
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  0 1 1 0
		
		System.out.println(~num3);		//0
		// 11111111 11111111 11111111 11111111
		// 00000000 00000000 00000000 00000000
	}
}
