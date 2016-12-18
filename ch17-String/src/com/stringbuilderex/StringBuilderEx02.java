package com.stringbuilderex;
/*
//참조값을 반환하는 메소드

*/
public class StringBuilderEx02 {

	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.add(1).add(3).add(7).showResult();
		//호출된 add()메소드는 adder의 참조값을 반환합니다.
	}
}


class Adder{
	private int num;
	
	public Adder(){
		num=0;
	}
	
	public Adder add(int num){
		this.num += num;
		return this;
		//this의 반환은 인스턴스 자신의 참조 값 반환을 의미.
		//이렇게 반환되는 참조 값을 대상으로 연이은 함수호출이 가능합니다.
	}
	
	public void showResult(){
		System.out.println("Result: " + num);
	}
}

/*
출력결과
Result: 11
*/