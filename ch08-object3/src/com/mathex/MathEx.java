/* Math클래스 - 수학관련 메소드
 * 
 * 절대값 구하기
 * 올림
 * 절삭(버림)
 * 반올림
 * 최대값
 * 최소값 
 */

package com.mathex;

public class MathEx {

	public static void main(String[] args) {
		// 절대값 구하기
		int i = Math.abs(-10);
		System.out.println(i);
		
		// 올림
		double d = Math.ceil(3.3);
		System.out.println(d);
		
		// 절삭(버림)
		d = Math.floor(3.7);
		System.out.println(d);

		// 반올림
		i = Math.round(4.7F);
		System.out.println(i);
		
		// 최대값
		i = Math.max(5, 9);
		System.out.println(i);
				
		// 최소값
		i = Math.min(6, 8);
		System.out.println(i);
	}
}
