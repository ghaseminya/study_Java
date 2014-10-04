/* Auto boxing/unboxing
 * 
 * 1)기존 boxing/unboxing
 * int 객체 생성 하기 (boxing)
 * int 객체 생성 하기 (boxing)
 * unboxing 하기
 * 
 * 
 * 2) JDK5.0이상부터 Auto boxing/unboxing:  boxing과 unboxing을 자동적으로 수행
 * Auto unboxing 하기
 * Auto boxing 하기
 * Auto boxing/unboxing 하기
 * -------------------------------------
Auto Boxing과 Unboxing은 다양한 형태로 진행됩니다.
특히 산술연산의 과정에서 자동으로 발생 한다점을 주목할 필요가 있습니다.
 */

package com.wrapper;

public class WrapperEx02 {

	public static void main(String[] args) {
		
		System.out.println("\n기존 boxing/unboxing =========");
		// int 객체 생성, 명시적으로 new예약어를 통해 생성자 호출하여 Wrapper 클래스의 객체 생성
		Integer obj1 = new Integer(10);
		Integer obj2 = new Integer(20);
		
//		기본자료형에 넣기 위해 참조자료형 -> 기본자료형 (unboxing)
		int sum = obj1.intValue() + obj2.intValue();
		System.out.println("sum = " + sum);
		
		
		System.out.println("\nAuto boxing/unboxing =========");
		//Auto unboxing
		int result1 = obj1 * obj2;
		System.out.println("result1 = " + result1);
		
		//Auto boxing
		Integer obj3 = 15;
		Integer obj4 = 20;
		//Auto boxing/unboxing
		Integer result2 = obj3 + obj4;
		System.out.println("result2 = " + result2);
	}
}
