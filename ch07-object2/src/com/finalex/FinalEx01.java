/*상수에 final 적용*/

package com.finalex;

public class FinalEx01 {
	
	//변수
	int var1 = 100;
	
	//상수(객체 멤버 상수화)
	final int var2 = 300;
	
	//상수 (스태틱 상수화)
	public static final int VAR3 = 400;

	public static void main(String[] args) {
		
		FinalEx01 f1 = new FinalEx01();
		System.out.println("f1.var1 변경 전 값: ");
		System.out.println(f1.var1);
		
		
		f1.var1 = 200;
		System.out.println("f1.var1 변경 후 값: ");
		System.out.println(f1.var1);		
		
		//상수는 변경불가
		//f1.var2 = 300;	//ERROR:The final field FinalEx01.var2 cannot be assigned
		System.out.println("final 상수(f1.var2) 호출: ");
		System.out.println(f1.var2);
		
		//STATIC상수 호출
		System.out.println("STATIC상수(VAR3) 호출: ");
		System.out.println(VAR3);
		
		//상수 (지역변수 상수화)
		final int NUM = 100;
		System.out.println("지역변수를 상수화: ");
		System.out.println(NUM);
	}

}
