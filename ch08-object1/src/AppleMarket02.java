/*
//확인 후 전체 주석처리

//서로 다른 인스턴스의 생성은, 
//매번 인스턴스 생성 후 인스턴스 변수를 초기화 해주어야하는 번거로운 문제가 발생합니다.
//
//해결방법
//	• 생성자 함수를 통해 인스턴스 생성시 초기화 수행
//	• AppleMarket03.java


public class AppleMarket02 {

	public static void main(String[] args) {
		
		//참조변수의 선언 = 인스턴스 생성
		AppleSeller seller1 = new AppleSeller();
		AppleSeller seller2 = new AppleSeller();
		
		//멤버변수 초기화하기 위한 함수 호출 (인스턴스 생성후 매번 초기화 해주어야 하는 문제 발생)
		seller1.initSeller(0, 20, 2500);
		seller2.initSeller(0, 50, 1000);
		
		
		AppleBuyer buyer = new AppleBuyer();
		//메소드 호출	: 메소드 호출을 통해 메시지 전달하는 것을 의미, 메소드 전달은 두 객체간의 대화방법입니다.
		buyer.buyApple(seller1, 5000);	//사과 판매자1에게 5,000원어치 사과 구매 요청
		buyer.buyApple(seller2, 5000);	//사과 판매자2에게 5,000원어치 사과 구매 요청
		
		
		System.out.println("사과 판매자1의 현재 상태");
		seller1.showSaleResult();
		System.out.println("사과 판매자2의 현재 상태");
		seller2.showSaleResult();
		System.out.println("사과 구매자의 현재 상태");
		buyer.showBuyResult();
	}
}

//사과 판매자
class AppleSeller{
	
	int numOfApple;	//사과 개수
	int myMoney;	//판매 수익
	int applePrice;	//사과 가격(사과금액)
	
	//사과 판매 메소드
	public int saleApple(int money)
	{
		int num=money/applePrice;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	
	public void showSaleResult()
	{
		System.out.println("보유 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
	
	//멤버변수를 초기화 하기 위한 함수
	public void initSeller(int money, int appleNumber, int price)
	{
		myMoney=money;
		numOfApple=appleNumber;	
		applePrice=price;
	}
}

//사과구매자
class AppleBuyer
{
	int myMoney=10000;	//보유 금액
	int numOfApple=0;	//보유 사과 수
	
	//사과 구매 메소드
	public void buyApple(AppleSeller seller, int money)
	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	
	public void showBuyResult()
	{
		System.out.println("보유 금액: " + myMoney);
		System.out.println("사과 개수: " + numOfApple);		
	}
}


//출력결과
//사과 판매자1의 현재 상태
//보유 사과: 18
//판매 수익: 5000
//사과 판매자2의 현재 상태
//보유 사과: 45
//판매 수익: 5000
//사과 구매자의 현재 상태
//보유 금액: 0
//사과 개수: 7


*/