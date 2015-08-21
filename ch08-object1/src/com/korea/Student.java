
//public, default 제한자

//File Info
//com.korea.Student
//com.america.Student	main부


package com.korea;

public class Student {	//public 클래스 선언

	//getMessage()를 default으로 지정한 경우
	//default로 되어 있어 동일 패키지에서만 접근가능, 다른 패키지에서는 접근할 수 없습니다.
//	void getMessage(){
//		System.out.println("Korean Student");
//
//	}
	
	
	//getMessage()를 public으로 지정한 경우
	public void getMessage(){
		System.out.println("Korean Student");

	}
}
