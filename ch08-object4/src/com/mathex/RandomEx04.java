/*
가짜 난수(Pseudo-random number)

씨드(Seed)가 동일하면 생성되는 난수의 패턴은 100% 동일한 난수가 발생합니다.
이렇듯 컴퓨터의 난수는 씨앗을 기반으로 생성되기 때문에 가짜 난수(Pseudo-random number)라 불린다


*/
package com.mathex;

import java.util.Random;

public class RandomEx04 {
	public static void main(String[] args)
	{
		Random rand=new Random(7);
		//7라는 씨드가 전달되었으니, 7를 심어서 만들어지는 난수가 총 10개 생성됩니다.

		
		for(int i=0; i<10; i++)
			System.out.println(rand.nextInt(100));
	}
}
