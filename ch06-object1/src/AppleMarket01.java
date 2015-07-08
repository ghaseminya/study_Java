/*
//객체 이해
*/


public class AppleMarket01 {

	public static void main(String[] args) {
		
		//참조변수의 선언 = 인스턴스 생성
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

class AppleSeller{
	
	int numOfApple=30;
	int myMoney=0;
	//final		: 변수 -> 상수화
	final int APPLE_PRICE=1000;
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("보유 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
}


class AppleBuyer
{
	int myMoney=10000;	//보유 금액
	int numOfApple=0;	//보유 사과 수
	
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
