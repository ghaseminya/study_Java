//매 실행 시마다 다른 유형의 난수를 발생시키는 방법


package com.mathex;

import java.util.Random;

public class RandomEx05 {

	public static void main(String[] args)
	{
		Random random=new Random(12);

		//seed로 사용할 시간값 확인하기
		//System.currentTimeMillis(): 현재 시간을 밀리 초 단위로 반환
		System.out.println(System.currentTimeMillis()); //1439688805647
		
		
		//Random 클래스의 객체의 setSeed()로 현재 시간을 밀리초 단위로 반환한 씨드값을 설정합니다.
		//매번 실행시 마다 다른 시드값으로 실행이 되게 되어 매번 다른 난수 패턴을 가지게 됩니다.
		random.setSeed(System.currentTimeMillis());

		
		for(int i=0; i<10; i++)
			System.out.println(random.nextInt(100));
	}
}
