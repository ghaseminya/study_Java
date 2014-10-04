/*
BigInteger 클래스

큰 정수를 문자열로 표현한 이유는 숫자로 표현이 불가능하기 때문입니다.
기본 자료형의 범위를 넘어서는 크기의 정수는 숫자로 표현 불가능합니다.

*/
package com.mathex;

import java.math.*;

class BigIntegerEx01
{
	public static void main(String[] args)
	{
		System.out.println("최대 정수: " + Long.MAX_VALUE);
		System.out.println("최소 정수: " + Long.MIN_VALUE);
		
		//100000000000000000000는 표현할수 없는 것이기 때문에 문자열로 표현하였습니다.
		BigInteger bigValue1=new BigInteger("10000000000000000000000");
		BigInteger bigValue2=new BigInteger("-9999999999999999999999");
		
		//BigInteger bigValue1=new BigInteger(100000000000000000000);
		//매소드를 통해 값을 전달하면 매개변수가 메모리상에 표현되어야 되는데 시스템상으로 표현이 되지 못했으므로 전달할 수가 없습니다.
		//자바가 기본자료형으로 100000000000000000000를 표현해서 BigInter의 매개변수로 전달해야 되지만 전달되지 않습니다.
		
		BigInteger addResult=bigValue1.add(bigValue2);
		BigInteger mulResult=bigValue1.multiply(bigValue2);
		
		System.out.println("큰 수의 덧셈결과: "+addResult);
		System.out.println("큰 수의 곱셈결과: "+mulResult);
	}
}