/*
//확인 후 전체 주석처리
//객체 이해하기

//사과 마켓 분석(객체, 변수, 메소드 분석)
//				AppleSeller		AppleBuyer
//객체			사과판매자			사과구매자
//----------------------------------------
//변수			• 사과 개수			• 사과 개수
//(데이터, 속성)	• 사과 가격(금액)		• 보유 금액
//				• 판매 수익
//----------------------------------------
//메소드			사과를 판다			사과를 산다
//(기능, 행위)

public class AppleMarket01 {

	public static void main(String[] args) {
		
		//참조변수의 선언/생성 = 인스턴스 생성
		AppleSeller seller = new AppleSeller();
		AppleBuyer buyer = new AppleBuyer();
		
		//메소드 호출	: 메소드 호출을 통해 메시지 전달하는 것을 의미, 메소드 전달은 두 객체간의 대화방법입니다.
		buyer.buyApple(seller, 2000);	//사과 판매자에게 2,000원어치 사과 구매 요청
		
		System.out.println("사과 판매자의 현재 상태");
		seller.showSaleResult();
		System.out.println("사과 구매자의 현재 상태");
		buyer.showBuyResult();
	}
}

//사과 판매자
class AppleSeller{
	
	int numOfApple=30;	//사과 개수
	int myMoney=0;		//판매 수익
	//final		: 변수 -> 상수화
	final int APPLE_PRICE=1000;	//사과 가격(사과금액)
	
	//사과를 파는 기능
	public int saleApple(int money)	{
		int num=money/APPLE_PRICE;
		numOfApple = numOfApple-num; //numOfApple-=num;
		myMoney = myMoney + money; //myMoney+=money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("보유 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
}

//사과구매자
class AppleBuyer{
	int numOfApple=0;	//보유 사과 수
	int myMoney=10000;	//보유 금액
	
	//사과를 사는 기능
	public void buyApple(AppleSeller seller, int money)	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult()	{
		System.out.println("보유 금액: " + myMoney);
		System.out.println("사과 개수: " + numOfApple);		
	}
}
*/