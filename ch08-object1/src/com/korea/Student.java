/*
//public, default 제한자

//File Info
//com.korea.Student
//com.america.Student	main부


//-------------------------------------------
default의 제한
	• 접근제어 지시자 선언하지 않는 경우는 기본적으로 default 선언이 됩니다.
	• default 선언은 동일 패키지 내에서의 접근만 허용합니다.
	• 동일한 패키지 내에 정의된 클래스에 의해서만 인스턴스 생성이 가능


public의 제한
	• public - 어디서든 접근 가능(접근을 제한하지 않습니다).
	• 파일을 대표할 정도로 외부에 의미가 있는 클래스 파일을 public으로 선언합니다.
	• 하나의 소스파일에 하나의 클래스만 public으로 선언 가능
	• public 클래스 이름과 소스파일 이름은 일치해야 합니다.


*/
package com.korea;

public class Student {	//public 클래스 선언

	//TODO 1: getMessage()를 default으로 지정한 경우
	//default로 되어 있어 동일 패키지에서만 접근가능, 다른 패키지에서는 접근할 수 없습니다.
//	void getMessage(){
//		System.out.println("Korean Student");
//
//	}
	
	
	//TODO 3: getMessage()를 public으로 지정한 경우
	public void getMessage(){
		System.out.println("Korean Student");

	}
}
