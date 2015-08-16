//매 실행 시마다 다른 유형의 난수를 발생시키는 방법


package com.mathex;

import java.util.Random;

public class RandomEx05 {

	public static void main(String[] args)
	{
		Random random=new Random(12);
		random.setSeed(System.currentTimeMillis());
		//System.currentTimeMillis(): 현재 시간을 밀리 초 단위로 반환
		//Random 클래스의 디폴트 생성자 내에서 현재 시간을 밀리초 단위로 반환한 씨드값을 설정합니다.
//		System.out.println(System.currentTimeMillis()); //1439688805647
		
		for(int i=0; i<10; i++)
			System.out.println(random.nextInt(100));
	}
}
