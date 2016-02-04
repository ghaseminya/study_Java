/* Object Class의 내부 메소드

toString(): 참조값 확인
	• 객체(인스턴스의 실제 값)를 문자열로 변경시키는 메소드
	
getClass(): 클래스 정보 확인

hashCode(): 객체를 식별할 수 있는 unique한 값

*/

package com.object1;

public class ObjectClassEx04 {

	public static void main(String[] args) {		
		
		ObjectClassEx04 ob = new ObjectClassEx04();
		
		//ob호출 시 자동으로 toString 호출해서 참조값 출력
		System.out.println("ob: " + ob); //ob: com.object2.ObjectEx01@2a139a55
		
		//클래스 정보 확인
		System.out.println("getClass(): " + ob.getClass()); //getClass(): class com.object2.ObjectEx01
		
		//해쉬코드 확인: 객체를 식별할 수 있는 unique한 값
		System.out.println("hashCode(): " + ob.hashCode()); //hashCode(): 705927765
		
		//참조값 확인: 클래스명@16진수해쉬값
		System.out.println("toString(): " + ob.toString()); //toString(): com.object2.ObjectEx01@2a139a55
	}
}