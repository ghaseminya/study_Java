//Annonymous 내부 클래스 - 익명내부클래스 구현 (구현부)
//익명내부클래스 구현 (구현부) 연습

package com.inner4;

//부모클래스
abstract class TestAbst{
	int data = 1234567;
	
	//추상메서드
	public abstract void printData(); 
}

public class AnonymousEx04 {

	//구현부
	TestAbst inn = new TestAbst (){
		@Override
		public void printData(){ //미완성된 것을 완성

			System.out.println("data: " + data);
		}
	};

	public static void main(String[] args) {
		AnonymousEx04 anony = new AnonymousEx04();
		anony.inn.printData();
	}
}
