/* boxing/unboxing
 * 
 * boolean boxing/unboxing하기
 * int boxing/unboxing하기
 *  
 */
package com.wrapper;


public class WrapperEx01 {

	public static void main(String[] args) {
		// 객체 생성
		
		//기본자료형
		boolean b = true;
		
		//참조자료형: 
		//기본자료형 데이터를 생성자를 통해 객체 생성(참조자료형) 즉, 기본자료형 -> 참조자료형:박싱(boxing)
		Boolean wrap_b = new Boolean(b);
		//출력할때 원래의 자료형으로 출력하기
		//참조자료형 -> 기본자료형 (unboxing)
		System.out.println("wrap_b = " + wrap_b.booleanValue());
		
		System.out.println();
		//기본자료형 -> 참조자료형 (boxing)
		Integer wrap_i = new Integer(100);
		//참조자료형 -> 기본자료형 (unboxing)
		int i = wrap_i.intValue();
		System.out.println("i = " + i);
		System.out.println("wrap_i = " + wrap_i.intValue());
	}
}
