/*

Inner 클래스의 특징과 이해

인스턴스안에 인스턴스가 종속적인 모델

*/
package com.inner1;

class OuterClass{
	private String name;
	private int num;
	
	OuterClass(String name)	{
		this.name=name;
		num=0;
	}
	
	public void whatYourName()	{
		num++;
		System.out.println("My Name is " + name + ": OuterClass : "+num);
	}
	
	class InnerClass{
		InnerClass(){
			//Inner 클래스의 인스턴스는 Outer 클래스의 인스턴스에 종속적입니다
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
		//out1(Outer클래스)의 인스턴스에 종속적인 Inner클래스의 인스턴스를 생성하겠다는 의미
		OuterClass.InnerClass inner1=out1.new InnerClass();
		OuterClass.InnerClass inner2=out2.new InnerClass();	
		OuterClass.InnerClass inner3=out1.new InnerClass();
		OuterClass.InnerClass inner4=out1.new InnerClass();
		OuterClass.InnerClass inner5=out2.new InnerClass();
		OuterClass.InnerClass inner6=out2.new InnerClass();
	}
}