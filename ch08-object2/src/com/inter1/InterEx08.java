
//인터페이스의 Marker 기능

//이름을 출력하는 기능중 특별히 대문자로 모두 출력할 필요가 있을 경우 
//마커역할을 하는 인터페이스로 구현된 클래스의 인스턴스를 구분하여 대문자를 출력하도록 구현


package com.inter1;

//무엇인가를 표시하는(클래스의 특성을 표시하는) 용도로도 인터페이스는 사용(마커, 표시하는 역할)
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
	
	public String toString(){
		String strName="Your name is " + name;
		return strName;
	}
}

public class InterEx08 {
	public static void main(String[] args){
		NameOne name1=new NameOne("steve");
		NameTwo name2=new NameTwo("jessica");
		NameOne name3=new NameOne("alice");
		NameTwo name4=new NameTwo("bob");
		
		NamePrinter.print(name1);
		NamePrinter.print(name2);
		NamePrinter.print(name3);
		NamePrinter.print(name4);
	}
}
