/* 무작위 숫자 추출 - java.lang.Math.random()
 *    
 * Math.random()의 랜덤한 수확인 *  
 * double한 무작위 랜덤 수를 int형으로 연산처리하기
 * 
 * */

package com.mathex;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		//					0		   1			2 			3			4
		String[] gift = {"스마트폰", "노트북", "디지털카메라", "테블릿", "대박(꽝)"};
		
		double ran= Math.random();
		//0.0 ~1.0미만의 난수(0.0~0.9999999999999)
		System.out.println(ran);
		
		//double을 int형식으로 연산처리하기
		int idx1 = (int)(ran*5);	//캐스팅하면 무조건 절삭 -> 0~4까지 난수
		System.out.println("발생한 난수: " + idx1);
		System.out.println("발생한 난수: " + gift[idx1]);
		
		
		

	}

}
