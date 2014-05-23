/* Static 내부 클래스
 * 
 * 
 * 일반멤버 클래스는 static한 변수를 쓰지 못하며 //ERROR:The field cv cannot be declared static in a non-static inner type, unless initialized with a constant expression
 * static변수를 포함한 내부 클래스는 static 클래스여야 합니다.
 * 
 */


package com.inner3;

public class StaticEx01 {
	
	//static 내부 클래스
	public static class StaticInner{
		int iv = 200;
		static int cv = 300;	
	}
	
	
	
	public static void main(String[] args){
		
		//static 내부 클래스를 객체 생성, Outer에 있는 StaticEx01을 객체생성하지 않음
		StaticEx01.StaticInner i = new StaticEx01.StaticInner();
		
		//인스턴스 변수 호출
		System.out.println(i.iv);		
		
		//static변수 호출
		System.out.println(StaticEx01.StaticInner.cv);
	}
	

}
