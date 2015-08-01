
//public, default 제한자

//File Info
//com.korea		Student.class
//com.america	Student.class


package com.america;

public class Student {
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
