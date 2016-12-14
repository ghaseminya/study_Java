/*
//무작위 숫자 추출 - java.util.Random 클래스

nextInt(int n)
• 0부터 인자로 전달된 값의 전까지를 범위로 난수발생
• 0이상 n미만의 범위 내에 있는 int형 난수 반환
• 0~n-1 까지의 범위에서 랜덤값을 추출

*/
package com.mathex;

import java.util.Random;

public class RandomEx02 {

	public static void main(String[] args) {
		
		//					0         1             2             3          4       5
		String[] luck = {"로또 당첨", "오늘하루 휴일", "여유로운 하루", "즐거운 만남", "그냥그냥", "헐~"};
		
		Random r1 = new Random();
		//0부터 인자로 전달된 값의 전까지를 범위로 난수발생 (0~5)
		int idx = r1.nextInt(6); System.out.println("발생한 난수: " + idx);
		idx = r1.nextInt(6); System.out.println("발생한 난수: " + idx);
		idx = r1.nextInt(6); System.out.println("발생한 난수: " + idx);
		idx = r1.nextInt(6); System.out.println("발생한 난수: " + idx);
		idx = r1.nextInt(6); System.out.println("발생한 난수: " + idx);
		
		idx = r1.nextInt(6); System.out.println("발생한 난수: " + idx);
		System.out.println("오늘의 운수: " + luck[idx]);
	}
}


/*//출력결과
발생한 난수: 0
발생한 난수: 1
발생한 난수: 3
발생한 난수: 3
발생한 난수: 2
발생한 난수: 0
오늘의 운수: 로또 당첨
*/