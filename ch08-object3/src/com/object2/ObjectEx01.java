/* Object Class
 * 
 * getClass(): 클래스 정보 확인
 * hashCode(): 객체를 식별할 수 있는 unique한 값
 * toString(): 참조값 확인
*/

package com.object2;

public class ObjectEx01 {

	public static void main(String[] args) {		
		
		ObjectEx01 ob = new ObjectEx01();
		
		//ob호출 시 자동으로 toString 호출해서 참조값 출력
		System.out.println("ob: \t\t" + ob);
		
		//클래스 정보 확인
		System.out.println("getClass(): \t" + ob.getClass());
		
		//해쉬코드 확인: 객체를 식별할 수 있는 unique한 값
		System.out.println("hashCode(): \t" + ob.hashCode());
		
		//참조값 확인: 클래스명@16진수해쉬값
		System.out.println("toString(): \t" + ob.toString());
	}
}