
//protected 제한자

package com.korea;

class Human {
	protected String name;
	protected int age;
	
}

class Teacher extends Human{
	
	//클래스를 상속받게 되면 Human클래스에 있는 name과 age변수가 Student클래스에 존재하게 됩니다.
//	protected String name;
//	protected int age;
	
	public void  setAge(int num ){
		age = num;
	}
	
	public void  getAge(){
		System.out.println(age);
	}
}


public class School {

	public static void main(String[] args){
		
		Teacher teacher = new Teacher();
		teacher.setAge(27);
		teacher.getAge();
		
	}
}
