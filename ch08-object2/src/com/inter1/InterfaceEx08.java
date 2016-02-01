/*
//인터페이스의 Marker 기능
//이름을 출력하는 기능중 특별히 대문자로 모두 출력할 필요가 있을 경우 
//마커역할을 하는 인터페이스로 구현된 클래스의 인스턴스를 구분하여 대문자를 출력하도록 구현


인터페이스의 Marker 기능
	• 무엇인가를 표시하는(클래스의 특성을 표시하는) 용도로 인터페이스 사용(마커, 표시하는 역할)
	• 이러한 경우, 인터페이스의 이름은 ~able로 끝나는 것이 일반적입니다.
	• 이러한 경우, 인터페이스는 비어 있는 형태를 가질 수 있습니다.
	• 이런 경우, instanceof 연산자를 통해서 클래스의 특성을 파악하여 특성에 맞게 수행할 수도 있습니다.

*/

package com.inter1;

//Marker역할을 하는 인터페이스 정의
//무엇인가를 표시하는(클래스의 특성을 표시하는) 용도로도 인터페이스는 사용(마커, 표시하는 역할)
//인터페이스의 이름은 ~able로 끝나는 것이 일반적입니다.
//인터페이스는 비어 있는 형태를 가질 수 있습니다.
interface UpperCasePrintable{
	// 비어 있는 형태
}

class NamePrinter{
	public static void print(Object obj){
		String str=obj.toString();
		if(obj instanceof UpperCasePrintable){
			//instanceof 연산자를 통해서 클래스의 특성을 파악하여 특성에 맞게 수행
			//UpperCasePrintable인스턴스이거나 UpperCasePrintable상속 하는 클래스의 인스턴스인 경우
			str=str.toUpperCase();
		}
		System.out.println(str);
	}
}

class NameOne implements UpperCasePrintable{
	private String name;
	
	NameOne(String name){
		this.name=name;
	}
	
	//Object 객체에 있는 toString()를 오버라이딩 하고 있습니다.
	public String toString(){
		String strName="Your name is " + name;
		return strName;
	}
}

class NameTwo{
	private String name;
	
	NameTwo(String name){
		this.name=name;
	}
	
	@Override
	public String toString(){
		String strName="Your name is " + name;
		return strName;
	}
}

public class InterfaceEx08 {
	public static void main(String[] args){
		NameOne name1=new NameOne("steve");
		NameTwo name2=new NameTwo("jessica");
		NameOne name3=new NameOne("alice");
		NameTwo name4=new NameTwo("bob");
		
		NamePrinter.print(name1); //YOUR NAME IS STEVE
		NamePrinter.print(name2); //Your name is jessica
		NamePrinter.print(name3); //YOUR NAME IS ALICE
		NamePrinter.print(name4); //Your name is bob
	}
}
