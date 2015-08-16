//커피 자판기 만들기
/*
제한 사항
메뉴:
1) 커피주문 2) 관리자 모드 3) 종료

자판기 내부 설정: 
커피양 -10 / 프림양 -5 / 설탕양 -3
잔돈 = 10000 / 투입된 돈 =


메뉴1) Process
1-1동전넣기
1-2주문 커피 수
1-3블랙커피 / 설탕커피 / 프림커피
1-4잔돈


메뉴 2) 처리 절차
관리자 모드라고 출력후 계속 커피 판매


메뉴 3) 처리 절차
프로그램 종료


제약조건:
커피 구매시 차감되는 양에 대해 상수 선언
커피양/프림양/설탕양/잔돈이 0이 될경우 영업종료
자판기 내부설정 -> 멤버 변수 처리
메뉴 동작 -> 메소드 처리
객체 생성시 try~catch{}처리
*/

package com.coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CoffeeMain02 {

	//상수 (커피 구매시 차감되는 양)
	public static final int PRICE = 300;
	public static final int CONTENT_COFFEE = 5;
	public static final int CONTENT_CREAM = 3;
	public static final int CONTENT_SUGAR = 1;

	int amount = 0; //커피를 판매한 수익금
	int change = 1000; //보유 거스름돈
	int quantityCoffee = 10;//현재 커피 양
	int quantityCream = 10; //현재 프림 양
	int quantitySugar = 10; //현재 설탕 양

	BufferedReader br;

	public CoffeeMain02(){
		br = new BufferedReader(
				new InputStreamReader(System.in));
	}

	//입력 메서드
	public void input()throws IOException{
		while(true){
			System.out.print("1:커피마시기, 2:관리자, 3:종료");
			String str = br.readLine();
			if(str.equals("1")){
				System.out.print("동전을 주세요(커피값"+PRICE+"원) > ");
				String money = br.readLine();

				System.out.print("구매잔 수 입력>");
				String order = br.readLine();

				try{
					isSale(Integer.parseInt(money),Integer.parseInt(order));
				}catch(NumberFormatException e){
					System.out.println("숫자만 입력가능!");
				}catch(Exception e){
					System.out.println(e.getMessage());
				}

			}else if(str.equals("2")){
				//관리자 모드
				System.out.print("관리자 모드입니다");
			}else if(str.equals("3")){
				System.out.println("안녕히 가세요!");
				break;
			}else{
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}

	//커피 주문 연산 메서드
	public void processCoffee(int money, int order){
		//거스름돈 계산
		int real_change = money-PRICE*order;

		//보유 거스름돈 변경
		change -= real_change;
		System.out.println("거스름돈 : " + real_change);

		//커피,프림,설탕 양 차감
		quantityCoffee-=CONTENT_COFFEE*order;
		quantityCream-=CONTENT_CREAM*order;
		quantitySugar-=CONTENT_SUGAR*order;
		//판매금액 누적
		amount+=money;

		System.out.println("디따 맛 좋은 커피가 " + order + "잔 준비되었습니다.");
		print();
	}

	public void isSale(int money,int order)throws Exception{
		if(money<PRICE*order){
			throw new Exception("영업종료-동전이 부족합니다.");
		}
		if((money-PRICE)/order>change){
			throw new Exception("영업종료-거스름돈이 부족합니다.");
		}
		if(quantityCoffee<CONTENT_COFFEE*order){
			throw new Exception("영업종료-커피가 부족합니다.");
		}
		if(quantityCream<CONTENT_CREAM*order){
			throw new Exception("영업종료-프림이 부족합니다.");
		}
		if(quantitySugar<CONTENT_SUGAR*order){
			throw new Exception("영업종료-설탕이 부족합니다.");
		}
		processCoffee(money, order);
	}

	//현재 자판기 정보 출력
	public void print(){
		System.out.println("====== 자판기 정보 ======");
		System.out.println("보유 커피양: " + quantityCoffee);
		System.out.println("보유 프림양: " + quantityCream);
		System.out.println("보유 설탕양: " + quantitySugar);
		System.out.println("보유 거스름돈: " + change);
		System.out.println("커피를 판매한 수익금 : " + amount);
		System.out.println("---------------------");
	}
	public static void main(String[] args){
		CoffeeMain02 cm = new CoffeeMain02();
		try {
			cm.input();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
