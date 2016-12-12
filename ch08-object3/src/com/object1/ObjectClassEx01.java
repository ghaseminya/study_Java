package com.object1;
/*
//인스턴스 소멸 시 호출되는 finalize 메소드

Object Class(오브젝트 클래스) 정의
	• 모든 클래스의 최상위 클래스
	• 명시적으로 extends하지 않아도 자동으로 상속합니다.
	• 즉, 프로그래머가 명시적으로 extends 하는 클래스가 없으면 자동으로 자바 컴파일러가   Object 클래스를 상속받도록 처리합니다.



finalize() 메소드
	• 인스턴스가 완전히 소멸되기 직전 호출되는 메소드,
	• Object 클래스의 멤버이므로 모든 인스턴스에는 이 메소드가 존재합니다



//------------------------------------
가비지 컬렉션 명시적(finalize메소드) 호출하는 2가지 메소드
System.gc();	
	• Garbage Collection 수행을 명령하는 메소드
	• GC가 발생하면, 소멸의 대상이 되는 인스턴스는 결정되지만 이것이 실제 소멸로 바로 이어 지지는 않습니다. 
	왜냐하면 인스턴스의 실제 소멸로 이어지지 않은 상태에서 프로그램이 종료될 수도 있습니다. 종료가 되면 어차피 인스턴스는 소멸 되기 때문입니다.

System.runFinalization();	
	• GC에 의해서 소멸이 결정된 인스턴스를 즉시 소멸시키는 메소드

//------------------------------------
실행과정에서 finalize 메소드는 호출되지 않을 수 있습니다.
왜냐하면, Garbage Collection이 실행되는 시기와 인스턴스의 완전한 소멸의 시기는 차이가 날 수 있기 때문이다.
finalize 메소드: Garbage Collection에 의해 완전 소멸될 때 호출됩니다.

*/
class MyName{
	String objName;
	public MyName(String name){
		objName=name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize메소드 호출");
		System.out.println(objName+"이 소멸되었습니다.");
	}
}


public class ObjectClassEx01 {

	public static void main(String[] args){
		MyName obj1=new MyName("인스턴스 1");	
		MyName obj2=new MyName("인스턴스 2");
		MyName obj3=new MyName("인스턴스 3");
		
		obj1=null; //가비지컬렉션 대상
		obj2=null; //가비지컬렉션 대상
		obj3=null; //가비지컬렉션 대상
		
		System.out.println("프로그램을 종료합니다.");
		
		//TODO : finalize()명시적 호출한 것과 명시적으로 finalize메소드를 호출하지 않은 결과 확인하기
		//finalize()명시적 호출
//		System.gc();	
//		System.runFinalization();	
		
		//System.gc();으로 Garbage Collection을 동작시키는 메소드입니다. 
		//하지만 heap영역의 가비지컬렉션 대상을 바로 소멸시키지 않고 JVM이 상황에 따라 나중에 소멸시킬 수도 있기 때문에
		//바로 finalize()되지 않을 수 있습니다.
		//System.runFinalization(); 호출로 추가적으로 인스턴스의 완전 소멸을 명령해 주어야 합니다.
	}
}

/*//출력결과
//finalize메소드를 호출하지 않은 결과 
프로그램을 종료합니다.

//finalize()명시적 호출
프로그램을 종료합니다.
finalize메소드 호출
인스턴스 2이 소멸되었습니다.
finalize메소드 호출
인스턴스 3이 소멸되었습니다.
finalize메소드 호출
인스턴스 1이 소멸되었습니다.
*/