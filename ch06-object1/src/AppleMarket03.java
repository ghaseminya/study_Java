/*
//생성자 함수 정의 및 인스턴시 생성시 생성자 함수 호출

*/

/*
public class AppleMarket03 {
	public static void main(String[] args) {

		//인스턴스 생성시 생성자 호출하여 초기화 수행
		AppleSeller seller1 = new AppleSeller(0, 20, 2500);
		AppleSeller seller2 = new AppleSeller(0, 50, 1000);


		AppleBuyer buyer = new AppleBuyer();
		//메소드 호출	: 메소드 호출을 통해 메시지 전달하는 것을 의미, 메소드 전달은 두 객체간의 대화방법입니다.
		buyer.buyApple(seller1, 5000);	//사자 판매자1에게 5,000원어치 사과 구매 요청
		buyer.buyApple(seller2, 5000);	//사자 판매자2에게 5,000원어치 사과 구매 요청


		System.out.println("사과 판매자1의 현재 상태");
		seller1.showSaleResult();
		System.out.println("사과 판매자2의 현재 상태");
		seller2.showSaleResult();

		System.out.println("사과 구매자의 현재 상태");
		buyer.showBuyResult();
	}

}

class AppleSeller{
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;


//생성자 특징(조건)
//	1) 생성자의 이름은 클래스 명과 같아야 합니다.
//	2) return Type이 전혀 정의되지 않으며, 반환하지 않는 메소드 입니다
//	3) 인스턴스 생성시 생성자는 반드시 호출됩니다.
	
	//생성자 정의
	public AppleSeller(int money, int appleNumber, int price)
	{
		myMoney=money;
		numOfApple=appleNumber;
		APPLE_PRICE=price;
	}
	
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

*/