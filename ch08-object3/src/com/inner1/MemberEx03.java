/*
//Inner 클래스의 특징과 이해
//인스턴스안에 인스턴스가 종속적인 모델


Inner 클래스의 특징
	• Outer클래스의 인스턴스 생성 후에 Inner클래스의 인스턴스 생성이 가능합니다.
	• Inner클래스내에서는 Outer클래스의 멤버에 직접 접근이 가능합니다.
	• Inner클래스의 인스턴스는 자신이 속한 Outer클래스의 인스턴스를 기반으로 생성됩니다.

*/
package com.inner1;

class OuterClass{
	private String name;
	private int num;
	
	//생성자
	OuterClass(String name)	{
		this.name=name;
		num=0;
	}
	
	//멤버 메소드
	public void whatYourName()	{
		num++;
		System.out.println("My Name is " + name + " : OuterClass : " + num);
	}
	
	//멤버 내부 클래스
	class InnerClass{
		//생성자
		//Inner 클래스의 인스턴스는 Outer 클래스의 인스턴스에 종속적입니다
		InnerClass(){
			//Inner클래스내에서는 Outer클래스의 멤버에 직접 접근이 가능합니다.
			whatYourName();
		}
	}
}

class MemberEx03{	
	public static void main(String[] args){
		OuterClass out1=new OuterClass("Alice");
		OuterClass out2=new OuterClass("Steve");
		out1.whatYourName();
		out2.whatYourName();
		
		
		System.out.println("");
		//out1(Outer클래스, OuterClass)의 인스턴스에 종속적인 Inner클래스의 인스턴스를 생성하겠다는 의미
		OuterClass.InnerClass inner1=out1.new InnerClass();
		OuterClass.InnerClass inner2=out2.new InnerClass();	
		OuterClass.InnerClass inner3=out1.new InnerClass();
		OuterClass.InnerClass inner4=out1.new InnerClass();
		OuterClass.InnerClass inner5=out2.new InnerClass();
		OuterClass.InnerClass inner6=out2.new InnerClass();
	}
}

/*
//출력결과
My Name is Alice : OuterClass : 1 //out1
My Name is Steve : OuterClass : 1 //out2

My Name is Alice : OuterClass : 2 //out1
My Name is Steve : OuterClass : 2 //out2
My Name is Alice : OuterClass : 3 //out1
My Name is Alice : OuterClass : 4 //out1
My Name is Steve : OuterClass : 3 //out2
My Name is Steve : OuterClass : 4 //out2

*/