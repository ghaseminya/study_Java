/* Unit 추상클래스/추상 메소드 생성
 * 
 * Protoss, Terran, Zerg 클래스에서 Unit클래스를 상속받기
 * Unit 추상클래스의 추상 메소드를 상속 받은 각각의 일반클래스에서 구체화 하기
 * main에서 종족별 클래스에 대해 객체를 생성하고 
 * 추상 메소드를 오버라이딩한 메소드를 호출 
 * 
 * */


package com.abs2;

public class UnitTest {
	
	public static void main(String[] args){
		Protoss pt = new Protoss("프로토스", 100, true);
		pt.decEnergy();
		System.out.println("Protoss 에너지 보유량 :\t" + pt.getEnergy());		
		
		Terran tr = new Terran("테란", 100, false);
		tr.decEnergy();
		System.out.println("Terran 에너지 보유량 :\t" + tr.getEnergy());
		
		Zerg zg = new Zerg("저그", 100, true);
		zg.decEnergy();
		System.out.println("Terran 에너지 보유량 :\t" + zg.getEnergy());
		
	}
}
