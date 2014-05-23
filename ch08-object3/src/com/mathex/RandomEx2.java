/* 무작위 숫자 추출 - java.util.Random 클래스
 * 
 * .nextInt()
 * 
 * */



package com.mathex;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n===============================");
		//					0			1				2					3			4			5
		String[] luck = {"로또 당첨", "오늘하루 휴일", "여유로운 하루", "즐거운 만남", "그냥그냥", "헐~"};
		Random r1 = new Random();
		//0부터 인자로 전달된 값의 전까지를 범위로 난수발생
		int idx2 = r1.nextInt(5); System.out.println("발생한 난수: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("발생한 난수: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("발생한 난수: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("발생한 난수: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("발생한 난수: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("발생한 난수: " + idx2);
		System.out.println("오늘의 운수: " + luck[idx2]);
	}
}