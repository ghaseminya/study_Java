//비트 연산 특징
//- 왼쪽으로의 비트 열 이동은 2의 배수의 곱
//- 오른쪽으로의 비트 열 이동은 2의 배수의 나눗셈


public class OperatorEx18 {

	public static void main(String[] args) {
		
		System.out.println("왼쪽으로 비트열 이동");
		byte n1 = 2;
		byte r1 = (byte)(n1 << 1);
		System.out.println("n1 << 1: " + r1); //n1 << 1: 4
		byte r2 = (byte)(n1 << 2);
		System.out.println("n1 << 2: " + r2); //n1 << 2: 8
		byte r3 = (byte)(n1 << 3);
		System.out.println("n1 << 3: " + r3); //n1 << 3: 16
		byte r4 = (byte)(n1 << 4);
		System.out.println("n1 << 4: " + r4); //n1 << 4: 32
		//왼쪽으로의 비트 열 이동은 2의 배수의 곱
		
		
		System.out.println("\n오른쪽으로 비트열 이동");
		byte n2 = 10;
		byte r5 = (byte)(n2 >> 1);
		System.out.println("n2 >> 1: " + r5); //n2 >> 1: 5
		byte r6 = (byte)(n2 >> 2);
		System.out.println("n2 >> 2: " + r6); //n2 >> 2: 2
		byte r7 = (byte)(n2 >> 3);
		System.out.println("n2 >> 3: " + r7); //n2 >> 3: 1
		byte r8 = (byte)(n2 >> 4);
		System.out.println("n2 >> 4: " + r8); //n2 >> 4: 0
		//오른쪽으로의 비트 열 이동은 2의 배수의 나눗셈
	}
}
