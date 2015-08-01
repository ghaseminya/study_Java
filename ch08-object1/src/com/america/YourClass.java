
//private 제한자
//
//FileInfo
//com.america	MyClass.class
//com.america	YourClass.class

package com.america;

public class YourClass {
	
	public void accessClass(MyClass myClass){
//		myClass.number=10;		//ERROR - The field MyClass.number is not visible
								//MyClass의 number멤버변수는 private으로 선언되어 있어 클래스 내부(메소드)에서만 접근 가능합니다
		
		myClass.setNumber(20);
		System.out.println(myClass.getNumber());
	}

}
