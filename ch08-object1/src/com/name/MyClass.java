// 클래스 생성후 생성자 오버로딩

package com.name;

public class MyClass {

	private String name;
	private int age;
	
	public MyClass(){
	        name = "codedragon";
	}
	public MyClass(String n){
	  name = n;
	}
	public MyClass(int a, String n){
	  age = a;
	  name = n;
	}
	public MyClass(String n, int a){
	  age = a;
	  name = n;
	}
	public String getName(){
	  return name;
	}
	public int getAge(){
	  return age;
	}
}
