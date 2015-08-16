//로컬 내부 클래스

//메소드안에 클래스 생성하는 형태 
//Outer클래스의 메소드 안에 정의한 클래스

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
	
	//필요한 만큼 작성 가능
//	public void innerTest2(){
//		class Inner3{
//			
//		}
//		class Inner4{
//			
//		}
//		Inner3 i3 = new Inner3();
//		Inner4 i4 = new Inner4();
//	}
	

	public static void main(String[] args) {
		LocalEx01 le = new LocalEx01();
		le.innerTest();
	}
}
