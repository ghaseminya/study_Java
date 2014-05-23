/* 오버라이딩, 
 * 다형성을 이용한 메소드의 인자 지정*/

package com.ext4;

class Product{
	int price;		//제품 가격
	int bonusPoint;	//보너스 점수
	
	public Product(int price){
		this.price = price;
		bonusPoint = price/10;	//제품가격의 10%				
	}
	
	public String getName(){
		return "상품";		
	}	
}

class Tv extends Product{
	public Tv(){
		super(100);	//100만원		
	}
	
	@Override
	public String getName(){
		return "TV";
	}
}

class Computer extends Product{
	public Computer(){
		super(200);
	}
	
	@Override
	public String getName(){
		return "COMPUTE";
	}
}

class Audio extends Product{
	public Audio(){
		super(300);
	}
	
	@Override
	public String getName(){
		return "Audio";
	}
}

class Buyer{
	int money = 1000;	//보유 금액
	int bonusPoint = 0;	//보유 보너스 포인트
	
	//특정 제품타입을 명시한 경우
	//public void buy(Tv p){
	
	//부모클래스 타입으로 명시
	public void buy(Product p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			//void 형일때만 return;하면 반복문이 종료된다.
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.getName() + "을(를) 구입하셨습니다.");		
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		//구매자 생성
		Buyer b1 = new Buyer();
		//제품 생산
		Tv t1 = new Tv();
		Computer c1 = new Computer();
		Audio a1 = new Audio();
		
		System.out.println("보유 금액은" + b1.money + "만원입니다");
		
		System.out.println("\n 티브이 구매:" + t1.price + "만원");
		//TV 구매
		b1.buy(t1);		// Tv -> Product 타입으로 자동적으로 형변환
		System.out.println("현재 남은 돈은" + b1.money + "만원입니다");
		System.out.println("현재 보너스 포인트는" + b1.bonusPoint + "점입니다");
		//buy(Tv v) -> buy(Product p)로 바꿔야 모든 제품을 구입할 수 있습니다.
		//b1.buy(c1);	//ERROR: The method buy(Tv) in the type Buyer is not applicable for the arguments (Computer)
				
		//COMPUTER구매
		System.out.println("\n 컴퓨터 구매:" + c1.price + "만원");
		b1.buy(c1);		// Computer -> Product 타입으로 자동적으로 형변환
		System.out.println("현재 남은 돈은" + b1.money + "만원입니다");
		System.out.println("현재 보너스 포인트는" + b1.bonusPoint + "점입니다");
		
		//AUDIO구매
		System.out.println("\n 오디오 구매:" + a1.price + "만원");
		b1.buy(a1);		// Audio  -> Product 타입으로 자동적으로 형변환
		System.out.println("현재 남은 돈은" + b1.money + "만원입니다");
		System.out.println("현재 보너스 포인트는" + b1.bonusPoint + "점입니다");
	}
}
