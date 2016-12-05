/*
//private 제한자

FileInfo
package com.america;	YourClass.class		main부
package com.america;	MyClass.class		데이터 클래스 정의
											private 멤버 변수 정의
											

[데이터 객체(데이터 클래스)]
 • 데이터를 담고 있는 클래스
 • 웹 프로그래밍에서는 자비빈(JavaBeans)이라고 합니다.
 • 저장된 데이터는 private으로 정보은닉화를 하여 직접적으로 접근할 수 없으며 
   setter와 getter메소드를 통해서만 접근할 수 있습니다.

*/
package com.america;

public class MyClass {

	//private 멤버 변수 정의
	private int number;
	
	//데이터를 저장하는 메소드
	public void setNumber(int num){
		number = num;
	}
	//데이터를 출력(반환)하는 메소드
	public int getNumber(){
		return number;
	}
}
