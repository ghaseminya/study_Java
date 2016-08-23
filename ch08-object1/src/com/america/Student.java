/*
//public, default 제한자

//File Info
//com.america.Student class		main부
//com.korea.Student class



접근 지정자(Access modifier)
	• 접근 제한자, 접근 한정자라고도 합니다.
	• 멤버들은 객체 자신만의 속성이자 특징이므로 대외적으로 공개하지 않을 수 있습니다. 
	• 비공개로 하기 위해 객체의 멤버들에게 접근 제한을 걸 수가 있는데 자바에서는 이를 접근 제한자라고 부릅니다.
	• 감추고 싶은 것은 감추고 보여주고 싶은 것만 보여 줄 수 있도록 코드를 수식해주는 키워드
	• 보통, 상수를 제외한 필드는 무조건 감추는 것이 좋습니다.


[접근가능 영역 수식]
private	< default	< protected < public
클래스 내부	< 동일 패키지	< 상속 클래스	< 이외의 영역 
(일반 클래스)			  (서브 클래스)  (아무 관계 없음)

//---------------------------------------------
//TODO 2: com.korea.Student클래스의 getMessage를 default로 정의 후 접근 시도시 ERROR확인
//TODO 4: com.korea.Student클래스의 getMessage를 public으로 정의 후 접근 시도시 정상접근 확인
//TODO 5: 클래스 충돌 확인
//----------------------------------------------

*/

package com.america;

//TODO 5: 클래스 충돌 확인
//Error-The import com.korea.Student conflicts with a type defined in the same file
//import com.korea.Student;

public class Student {
	//멤버 메소드
	public void  interact( ){
		
		//korea.Student는 public 클래스이므로 어디서 든 인스턴스 생성 가능
		com.korea.Student instance = new com.korea.Student();
		
		//TODO 2: com.korea의 getMessage가 default로 되어 있어 다른 패키지에서는 접근할 수 없습니다.
//		instance.
		
		//TODO 4: com.korea의 getMessage가 public로 되어 있어 다른 패키지에서는 접근할 수 있습니다.
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
