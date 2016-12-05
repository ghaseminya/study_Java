//main 클래스

//MyClass			클래스 생성후 생성자 오버로딩
//MyClassCreate		main부 
//					다양한 인자를 가지는 생성자 호출하여 객체 생성


//참조 도식도
//http://cfile4.uf.tistory.com/image/246ECD4455C5A550033B0D

package com.name;

public class MyClassCreate {

	public static void main(String[] args){
		//인스턴스 생성
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass("강아지");
		MyClass mc3 = new MyClass(24,"코알라");
		MyClass mc4 = new MyClass("고양이", 35);
		
		System.out.println(mc1.getName() + ","+	mc1.getAge()); //codedragon,0
		System.out.println(mc2.getName() + ","+	mc2.getAge()); //강아지,0
		System.out.println(mc3.getName() + ","+	mc3.getAge()); //코알라,24
		System.out.println(mc4.getName() + ","+	mc4.getAge()); //고양이,35
	}
}

/*//출력결과
codedragon,0
강아지,0
코알라,24
고양이,35
*/


