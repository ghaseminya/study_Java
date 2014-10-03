/*
인터페이스 다중 상속


*/
package com.inter1;



interface Interf1{
	public int getA();
}

interface Interf2{
	public int getA();
}

//인터페이스 간 상속 가능 단 이 때는 implements가 아닌 extends를 사용한다.
interface Interf3 extends Interf1, Interf2{
	public int getData();
}

public class InterEx06 implements Interf3{
	
	int a = 100;
	public int getA(){
		return a;
	}
	
	public int getData(){
		return a+10;
	}
	
	public static void main(String[] args){
		InterEx06 it = new InterEx06();
		Interf1 it1 = it;
		Interf2 it2 = it;
		Interf3 it3 = it;
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
	}
}

