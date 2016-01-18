/*
//시프트 연산자 확인
//>> 연산시  양수인 경우만 확인

시프트 연산자(Shift Operator)
bit단위의 연산처리를 수행하며 자료의 가공을 위해 오른쪽 또는 왼쪽으로 이동하여 값에 대한 변화를 일으키는 연산자입니다.


시프트 연산자 종류
연산자	의미
>>	bit값을 오른쪽으로 이동.
	이동으로 인한 빈자리는 부호값으로 채움(음수인 경우 1, 양수인 경우 0)
	n >> 2;
<<	bit값을 왼쪽으로 이동.
	이동으로 인한 빈자리는 0으로 채움.
	n << 2;
>>>	bit값을 오른쪽으로 이동
	이동으로 인한 빈자리는 0으로 채움.
	n >>> 2;


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
