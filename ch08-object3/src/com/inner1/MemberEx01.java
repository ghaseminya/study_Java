/*
//내부 클래스 - 내부 클래스 객체 생성

//강의 내용 
//	• 아웃터 객체 생성
//	• 아웃터 객체를 통해 인너클래스 객체 생성
//	• 아웃터 변수값 출력
//	• 아웃터의 인너클래스의 변수값 출력
//---------------------------------------------

내부 클래스(Inner Class)
	• 내부 클래스는 특정 클래스 내에 또 다른 클래스가 정의되어 있는 클래스를 의미합니다. 
	• 내부 클래스가 필요한 이유는 지금까지 작업해 왔던 클래스들과는 다르게 독립적이지는 않지만 
	하나의 멤버처럼 사용할 수 있는 특징이 있기 때문입니다.


내부 클래스를 정의 시 주의사항이자 장점
	• 내부 클래스는 외부 클래스의 모든 멤버들을 마치 자신의 멤버처럼 사용할 수 있습니다. 
	• static 내부 클래스를 제외하고 다른 내부 클래스는 항상 외부 클래스를 통해야 생성이 가능합니다.  


[내부 클래스의 종류와 사용 방법]
내부 클래스 종류	설명
Member		멤버 변수나 멤버 메소드들과 같이 클래스가 정의된 경우에 사용합니다.
Local		특정한 메소드 내에 클래스가 정의된 경우에 사용합니다.
Static		static 변수(클래스 변수)와 같이 클래스가 static으로 선언된 경우에 사용합니다.
Anonymous	참조할 수 있는 이름이 없는 경우에 사용합니다


Inner 클래스의 특징
	• Outer클래스의 인스턴스 생성 후에 Inner클래스의 인스턴스 생성이 가능합니다.
	• Inner클래스내에서는 Outer클래스의 멤버에 직접 접근이 가능합니다.
	• Inner클래스의 인스턴스는 자신이 속한 Outer클래스의 인스턴스를 기반으로 생성됩니다.

	
Member 내부 클래스
	• 말 그대로 객체를 생성해야만 사용할 수 있는 멤버들과 같은 위치에 정의되는 클래스를 지칭합니다.
	• 즉 내부 클래스를 생성하려면 외부 클래스의 객체를 생성한 후에 생성할 수 있습니다.


Member 내부 클래스의 구성 형식
class OuterClass {
    …
    class InnerClass {
             
    }
    …
}
 
*/
package com.inner1;

//외부 클래스(Outer Class, 아웃터 클래스)
class Outer{
	int x = 100;
	
	//멤버 내부클래스
	class Inner{
		int y = 200;
	}
}

public class MemberEx01 {
	public static void main(String[] args){
		//아웃터 클래스 객체 생성
		Outer ot = new Outer();
		
		//멤버 내부 클래스 객체 생성
		Outer.Inner oi = ot.new Inner();
		
		//아웃터 변수값 출력
		System.out.println("x=" + ot.x); //x=100
		
		//아웃터의 인너클래스의 변수값 출력
		System.out.println("y=" + oi.y); //y=200
	}
}
