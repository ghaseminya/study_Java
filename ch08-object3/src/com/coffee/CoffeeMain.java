package com.coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CoffeeMain {

	//상수 (커피 구매시 차감되는 양)
	public static final int PRICE = 300;
	public static final int CONTENT_COFFEE = 5;
	public static final int CONTENT_CREAM = 3;
	public static final int CONTENT_SUGAR = 1;

	int amount = 0; //입금한 돈이 누적
	int change = 1000; //거스름돈
	int coffeeQuantity = 10;//커피 양
	int creamQuantity = 10; //프림 양
	int sugarQuantity = 10; //설탕 양

	BufferedReader br;



	public CoffeeMain(){
		br = new BufferedReader(
				new InputStreamReader(System.in));
	}

	//입력 메서드
	public void input()throws IOException{
		while(true){
			System.out.print(
					"1:커피마시기,2:관리자,3:종료");
			String str = br.readLine();
			if(str.equals("1")){
				System.out.print("동전을 넣으세요(커피값"+PRICE+"원)>");
				String coin = br.readLine();

				System.out.print("구매잔 수 입력>");
				String count = br.readLine();

				try{
					isSale(Integer.parseInt(coin),Integer.parseInt(count));
				}catch(NumberFormatException e){
					System.out.println("숫자만 입력가능!");
				}catch(Exception e){
					System.out.println(e.getMessage());
				}

			}else if(str.equals("2")){
				//관리자
			}else if(str.equals("3")){
				System.out.println("안뇽~~~");
				break;
			}else{
				System.out.println(
						"잘못 입력했습니다.");
			}
		}
	}

	//커피 주문 연산 메서드
	public void processCoffee(int coin,int count){
		//거스름돈 처리
		int real_change = coin-PRICE*count;

		change -= real_change;
		System.out.println("거스름돈 : " + real_change);

		//커피,프림,설탕 양 차감, amount 누적
		coffeeQuantity-=CONTENT_COFFEE*count;
		creamQuantity-=CONTENT_CREAM*count;
		sugarQuantity-=CONTENT_SUGAR*count;
		amount+=coin;

		System.out.println("맛 좋은 커피가 " + count + "잔 준비되었습니다.");
		print();
	}

	public void isSale(int coin,int count)throws Exception{
		if(coin<PRICE*count){
			throw new Exception("동전이 부족합니다.");
		}
		if((coin-PRICE)/count>change){
			throw new Exception("거스름돈이 부족합니다.");
		}
		if(coffeeQuantity<CONTENT_COFFEE*count){
			throw new Exception("커피가 부족합니다.");
		}
		if(creamQuantity<CONTENT_CREAM*count){
			throw new Exception("프림이 부족합니다.");
		}
		if(sugarQuantity<CONTENT_SUGAR*count){
			throw new Exception("설탕이 부족합니다.");
		}
		processCoffee(coin,count);
	}

	//현재 자판기 정보 출력
	public void print(){
		System.out.println("===현재 자판기 정보===");
		System.out.println("커피양 : " + coffeeQuantity);
		System.out.println("프림양 : " + creamQuantity);
		System.out.println("설탕양 : " + sugarQuantity);
		System.out.println("거스름돈 보유금액 : " + change);
		System.out.println("누적금액 : " + amount);
	}
	public static void main(String[] args){
		CoffeeMain cm = new CoffeeMain();
		try {
			cm.input();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
