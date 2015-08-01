
//public, default 제한자

//File Info
//com.korea		Student.class
//com.america	Student.class


package com.korea;

public class Student {	//public 클래스 선언

	//getMessage()를 default으로 지정한 경우
//	void getMessage(){
//		System.out.println("Korean Student");
//
//	}
	
	
	//getMessage()를 public으로 지정한 경우
	public void getMessage(){
		System.out.println("Korean Student");

	}
}
