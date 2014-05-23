/* 로컬 내부 클래스
 * 
 * 
 * ------------------------------
 * 메소드안에 클래스 생성하는 형태 
 * 
 */


package com.inner2;

public class LocalEx01 {
	
	
	public void innerTest(){
		
		//로컬 내부 클래스
		class Inner{
			
			public void getData(){
				System.out.println("Local 내부 클래스");
			}			
		}
		//객체 생성을 위해 명시적으로 객체 생성
		Inner i = new Inner();
		i.getData();		
	}
	
/*	public void innerTest2(){
		class Inner3{
			
		}
		class Inner4{
			
		}
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		LocalEx01 le = new LocalEx01();
		le.innerTest();
	}
}
