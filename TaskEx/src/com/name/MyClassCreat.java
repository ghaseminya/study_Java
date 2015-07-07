package com.name;

public class MyClassCreat {

	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass("강아지");
		MyClass mc3 = new MyClass(24,"코알라");
		MyClass mc4 = new MyClass("고양이", 35);
		System.out.println(mc1.getName() + ","+	mc1.getAge()); 
		System.out.println(mc2.getName() + ","+	mc2.getAge());
		System.out.println(mc3.getName() + ","+	mc3.getAge());
		System.out.println(mc4.getName() + ","+	mc4.getAge());
	}
}
