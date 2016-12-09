/*
//자식 클래스 정의
//Unit 추상 클래스를 상속받고 추상 메소드 구현하기

Protoss.java
 	• 자식 클래스 정의
	• Unit 추상 클래스를 상속받고 추상 메소드 구현하기
	• 에너지 -1 감소/에너지 +1증가 
*/
package com.abs2;

public class Protoss extends Unit{
	
	boolean fly;
	
	public Protoss(String name, int energy, boolean fly){
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	//추상 메소드 구현
	@Override
	public void decEnergy(){
		energy--;
	}

	@Override
	public void incEnergy() {
		energy++;
	}
}
