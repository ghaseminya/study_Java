
//public, default 제한자

//File Info
//com.korea.Student class
//com.america.Student class		main부

//---------------------------------------------
//com.korea.Student클래스의 getMessage를 default로 정의 후 접근 시도시 ERROR확인
//com.korea.Student클래스의 getMessage를 public으로 정의 후 접근 시도시 정상접근 확인
//----------------------------------------------
//private	< default	< protected < public
//클래스 내부	< 동일 패키지	< 상속 클래스	< 이외의 영역 
//(일반 클래스)			  (서브 클래스)  (아무 관계 없음)


package com.america;

public class Student {
	//멤버 메소드
	public void  interact( ){
		
		//korea.Student는 public 클래스이므로 어디서 든 인스턴스 생성 가능
		com.korea.Student instance = new com.korea.Student();
		
		//com.korea의 getMessage가 default로 되어 있어 다른 패키지에서는 접근할 수 없습니다.
//		instance.
		
		//com.korea의 getMessage가 public로 되어 있어 다른 패키지에서는 접근할 수 있습니다.
		instance.getMessage();
	}
	
	void getMessage(){
		System.out.println("American Student");
	}
	
	public static void main(String[] args){
		
		Student student = new Student();
		student.interact();
	}
}
