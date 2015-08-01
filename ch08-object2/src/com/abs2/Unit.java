/* 부모 클래스 정의
 * 
 * 자식클래스(Protoss, Terran, Zerg)에서 
상속받을 부모 클래스를 정의합니다.*/

package com.abs2;

//추상 클래스: 부모 역할만
public abstract class Unit {
	protected String name;
	protected int energy;
	
	//추상 메소드: 재정의 필수
	abstract public void decEnergy();
	
	//일반 메소드: 재정의 선택적
	public int getEnergy(){
		return energy;
	}
}
