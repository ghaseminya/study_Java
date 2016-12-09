/*
//Unit 추상클래스/추상 메소드 생성

//Protoss, Terran, Zerg 클래스에서 Unit클래스를 상속받기
//Unit 추상클래스의 추상 메소드를 상속 받은 각각의 일반클래스에서 구체화 하기
//main에서 종족별 클래스에 대해 객체를 생성하고 추상 메소드를 오버라이딩한 메소드를 호출 


[클래스 설계]
Unit.java		• 부모클래스 정의 (추상 클래스, 부모역할만)

StarCraft.java	• main부
				• 추상 클래스/추상 메소드구현한 클래스의 객체 생성
				
Protoss.java	• 자식 클래스 정의
				• Unit 추상 클래스를 상속받고 추상 메소드 구현하기
				• 에너지 -1 감소/에너지 +1증가 

Terran.java		• 자식 클래스 정의
				• Unit 추상 클래스를 상속받고 추상 메소드 구현하기
				• 에너지 -2 감소/에너지 +2증가

Zerg.java		• 자식 클래스 정의
				• Unit 추상 클래스를 상속받고 추상 메소드 구현하기
				• 에너지 -4 감소/에너지 +4증가

*/
package com.abs2;

public class StarCraft {
	
	public static void main(String[] args){
		Protoss protoss = new Protoss("프로토스", 100, true);
		Terran terran = new Terran("테란", 100, false);
		Zerg zerg = new Zerg("저그", 100, true);
		
		System.out.println("Protoss 에너지 보유량 : " + protoss.getEnergy());
		System.out.println("Terran 에너지 보유량 : " + terran.getEnergy());
		System.out.println("Zerg 에너지 보유량 : " + zerg.getEnergy());
		
		//에너지 감소 후
		protoss.decEnergy();
		System.out.println("Protoss 에너지 보유량 : " + protoss.getEnergy());		
		
		terran.decEnergy();
		System.out.println("Terran 에너지 보유량 : " + terran.getEnergy());
		
		zerg.decEnergy();
		System.out.println("Zerg 에너지 보유량 : " + zerg.getEnergy());
		
	}
}


/*//출력결과
Protoss 에너지 보유량 : 100
Terran 에너지 보유량 : 100
Zerg 에너지 보유량 : 100
Protoss 에너지 보유량 : 99
Terran 에너지 보유량 : 98
Zerg 에너지 보유량 : 96
*/
