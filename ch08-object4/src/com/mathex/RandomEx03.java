/*
0이상 2000미만의 난수가 총 100개 생성되도록 출력

*/
package com.mathex;

import java.util.Random;

public class RandomEx03 {

	public static void main(String[] args)
	{
		Random rand=new Random();
		
		for(int i=0; i<100; i++)
			System.out.println(rand.nextInt(2000));
	}
}
