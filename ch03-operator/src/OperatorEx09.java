/*
//대입연산자, 복합대입 연산자

[대입 연산자]
특정한 상수 값이나 변수 값 또는 객체를 변수에 전달하여 저장시킬 때 사용하는 연산자입니다.
= 연산자의 결합순서는 오른쪽에서 왼쪽
대입문 왼쪽에 반드시 변수가 와야 합니다.


연산자			의미
=			연산자를 중심으로 오른쪽 변수값을 왼쪽 변수에 대입
			int num=10;

//--------------------
[복합대입 연산자]
연산자	의미
+=	왼쪽 변수값과 더하기 연산 수행하면서 대입
-=	왼쪽 변수값에서 빼기 연산을 수행하면서 대입
*=	왼쪽 변수값과 곱하기 연산을 수행하면서 대입
/=	왼쪽 변수값에 나누기 연산 수행하면서 대입
%=	왼쪽 변수값에 나머지 값을 구하면서 대입


[복합대입 연산자 의미]
산술 연산자		복합대입 연산자
a = a + b	a += b
a = a - b	a -= b
a = a * b	a *= b
a = a / b	a /= b
a = a % b	a %= b


*/

public class OperatorEx09 {
	
	public static void main(String[] args){
		
		System.out.println("=======대입 연산자=========");
		int a = 100;
		int b = 3;		
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		
		
		System.out.println("\n=======복합대입 연산자======");
		a += b;
		System.out.println("a +=b : " + a);
		System.out.println("a : " + a);	
		System.out.println("b : " + b);	
		
		a -= b;
		System.out.println("a -=b : " + a);
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		
		a *= b;
		System.out.println("a *=b : " + a);
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		
		a /= b;
		System.out.println("a /=b : " + a);
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		
		a %= b;
		System.out.println("a %=b : " + a);
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		System.out.println("");
	}
}

/*
a: 100
b: 3
a+=b: 103
a: 103
b: 3
a-=b: 100
a: 100
b: 3
a*=b: 300
a: 300
b: 3
a/=b: 100
a: 100
b: 3
a%=b: 1
a: 1
b: 3

*/
