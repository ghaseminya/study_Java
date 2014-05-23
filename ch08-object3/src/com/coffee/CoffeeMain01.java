/* 커피 자판기 만들기
 * 
 * 커피 구매시 차감되는 양에 대해 상수 선언
 * import 
 * 
 * 
 * 객체 생성시 try~catch{}처리
 *  
 * -------------------------------------------
 * 과제: 자판기 프로그램

메뉴: 1) 커피주문	2) 관리자 모드	3) 종료
메뉴1) Process
1-1동전넣기
1-2갯수
1-3블랙커피 / 설탕커피 / 프림커피
1-4잔돈

자판기 내부 설정: 
커피양 -10 / 프림양 -5 / 설탕양 -3
잔돈 = 10000 / 투입된 돈 =

제약조건:
커피양/프림양/설탕양/잔돈이 0이 될경우 영업종료
자판기 내부설정 -> 멤버 변수 처리
메뉴 동작 -> 메소드 처리
 
 */

package com.coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CoffeeMain01 {
	
	//상수 선언 - 커피 구매시 차감되는 양
	public static final int PRICE = 300;
	public static final int CONTENT_COFFEE = 5;
	public static final int CONTENT_CREAM = 3;
	public static final int CONTENT_SUGAR = 1;	
	
	//변수 선언
	int amount = 0;				//커피를 판매한 수익금
	int change = 5000;			//보유 거스름돈
	int quantityCoffee = 20;	//현재 보유 커피양
	int quantityCream = 20;		//현재 보유 크림양
	int quantitySugar = 20;		//현재 보유 설탕양
	
	
	BufferedReader br;		//메뉴 받기
	java.util.Scanner input;//수량, 돈 받기 
	
	//
	int order = 0;	//주문수량
	int money = 0;	//지불한 금액
	int changeYou =0; //줄 잔돈
	boolean b_money=true;		//잔돈 처리가능 여부
	boolean b_quantity=true;	//커피 재조가능 여부
	
	//생성자
	public CoffeeMain01(){
		 
		br = new BufferedReader(new InputStreamReader(System.in));
		input = new java.util.Scanner(System.in);		
		
	}
	
	//입력 메소드
	public void input() throws IOException{		
		
		while(true){
			System.out.print("1:커피 주문, 2:관리자 모드, 3:종료");
			
			String str = br.readLine();
			
			if(str.equals("1")){
				//커피 주문
				System.out.println("커피 주문을 시작합니다.");
				
				//동전을 넣으세요
				System.out.print("선불입니다. 돈을 주세요?");
				money = input.nextInt();
				//구매 잔수를 입력하세요
				System.out.print("몇 잔을 줄까요?");
				order = input.nextInt();
				
				//자판기 유효성 검사
				verifyCoffee();
				
				//커피 주문 처리
				processCoffee();
				

			}else if(str.equals("2")){
				//관리자 모드
				System.out.print("관리자 모드입니다");
				//break;
				
			}else if(str.equals("3")){
				//종료
				System.out.print("커피 주문을 마칩니다.");
				System.exit(0);
				
			}else{
				System.out.print("잘못 입력하였습니다.");
			}			
		}
	}
	
	
	//커피 주문가히 메소드(커피 주문시 연산/주문갯수 파악->커피,프림,설탕 차감/입금금액에서 주문금액 차악후 거스름돈 계산)
	public void processCoffee(){
		//커피 주문시 연산
		//지불금액 - 구입금액 = 잔돈
		changeYou = money - (PRICE * order);
		amount += (PRICE * order);
		
		//주문갯수 파악->커피,프림,설탕 차감
		quantityCoffee -= (order * CONTENT_COFFEE);
		quantityCream -= (order * CONTENT_CREAM);
		quantitySugar -= (order * CONTENT_SUGAR);
		
		//입금금액에서 주문금액 차악후 거스름돈 계산
		change -= changeYou;
		
		print();
	}

	//현재의 자판기 상태 정보 출력(커피양/프림양/설탕양/거스름돈 보유금액/현재누적금액)
	public void print(){
		//커피양
		//프림양
		//설탕양
		//거스름돈 보유금액
		//현재누적금액
		System.out.println("-------------------------------------");
		System.out.println("현재 보유 커피양: " + quantityCoffee);
		System.out.println("현재 보유 크림양: " + quantityCream);
		System.out.println("현재 보유 설탕양: " + quantitySugar);
		System.out.println("보유 거스름돈: " + change);
		System.out.println("커피를 판매한 수익금: " + amount);

	}
	
	//유효성 검사 - 현재 주문량에 따른 커피판매 가능여부 검사
	public void verifyCoffee() throws IOException{
		
		if( (change - (money - (PRICE * order))) >= 0 ){
			b_money = true;			
		}else{			
			b_money = false;
			System.out.println("보유한 거스름돈이 모자라 주문을 완료할 수 없습니다.");
			print();
			System.exit(0);			
		}
		
		if( (quantityCoffee - (order * CONTENT_COFFEE) >=0) && 
				(quantityCream - (order * CONTENT_CREAM))>=0 && (quantitySugar - (order * CONTENT_SUGAR))>=0 ){
			b_quantity = true;
		}else{
			b_quantity = false;
			System.out.println("현재 재료가 부족하여 커피를 만들지 못합니다.");
			print();
			System.exit(0);
		}		
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMain01 ilc = new CoffeeMain01();
		try{
			ilc.input();			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}		
	}
}