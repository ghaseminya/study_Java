//인터페이스의 다중 상속

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

//인터페이스의 구현(상속)은 extends가 아닌 implements를 사용합니다.
public class InterfaceEx06 implements Interf3{
	
	int a = 100;
	
	@Override
	public int getA(){
		return a;
	}
	@Override
	public int getData(){
		return a+10;
	}
	
	public static void main(String[] args){
		InterfaceEx06 ife = new InterfaceEx06();
		Interf1 it1 = ife;
		Interf2 it2 = ife;
		Interf3 it3 = ife;
		System.out.println(it1.getA()); //100
		System.out.println(it2.getA()); //100
		System.out.println(it3.getData()); //110
	}
}

