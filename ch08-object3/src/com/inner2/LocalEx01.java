/*
//로컬 내부 클래스
//메소드안에 클래스 생성하는 형태 
//Outer클래스의 메소드 안에 정의한 클래스


로컬 내부 클래스(Local Inner Class)
	• Outer클래스의 메소드 안에 정의한 클래스
	• Inner클래스의 특징을 모두 가지고 있습니다.
	• Local 내부 클래스는 특정 메서드 안에서 정의되는 클래스(특정 메서드 안에서 선언되는 지역변수와 같습니다)입니다
	• Local 클래스는 메소드 내에 정의가 되어서, 메소드 내에서만 인스턴스의 생성 및 참조 변수의 선언이 가능합니다.(메서드가 호출될 때 생성할 수 있으며 메서드의 수행력이 끝나면 지역변수와 같이 자동 소멸됩니다.)



Local 내부 클래스의 구성 형식
class OuterClass {
    …
  public void methodA() { // 멤버 메서드
    class InnerClass {
  
     }
  } 
  …
} 

*/
package com.inner2;

public class LocalEx01 {
	
	//멤버메소드
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

//출력결과
//Local 내부 클래스
