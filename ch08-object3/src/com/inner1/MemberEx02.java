/* 내부 클래스 - Inner클래스에서 Outer 멤버변수 호출
 *  
 * 멤버 내부 클래스에서 아웃터 클래스의 멤버 변수 호출
 * 참조변수 생성후  (참조변수 생성방법1 / 생성방법2)
 * 인너클래스의 메소드 호출 
 * 
 * -----------------------------------------------------------
 * 참조변수 생성방법 1
 * 1) 아웃터 객체 생성
 * 2) 아웃터 객체를 통해 인너 객체 생성
 * 
 * 참조변수 생성방법 2
 * 1) 아웃터 객체 생성과 동시에 인너 객체 생성  
 * 
 */

package com.inner1;

class Outer2{
	//멤버 내부 변수
	int x = 100;
	//멤버 내부 클래스
	class Inner2{
		int y = 200;
		
		public void getData(){
			System.out.println("x =" + x);	//Outer2의 멤버변수
			System.out.println("y =" + y);	//Inner2의 멤버변수
		}		
	}	
}

public class MemberEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 ot2 = new Outer2();
		Outer2.Inner2 oi2 = ot2.new Inner2();
		
		//위의 두줄을 한줄로 선언
		Outer2.Inner2 oi3 = new Outer2().new Inner2();
		
		oi2.getData();
		oi3.getData();
	}
}
