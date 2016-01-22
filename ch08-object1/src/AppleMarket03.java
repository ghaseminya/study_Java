/*
//확인 후 전체 주석처리

//생성자 함수를 통한 초기화
//생성자 함수 정의 및 인스턴시 생성시 생성자 함수 호출
//AppleMarket02.java에서 매번 인스턴스 변수를 초기화 주어야 하는 문제 해결

public class AppleMarket03 {
	public static void main(String[] args) {

		//인스턴스 생성시 생성자 호출하여 초기화 수행 (AppleMarket02.java 문제 해결)
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

//사과 판매자
class AppleSeller{
	//멤버 변수
	int numOfApple;	//사과 개수
	int myMoney;	//판매 수익
	final int APPLE_PRICE;	//사과 가격(사과금액)


//생성자 특징(조건)
//	1) 생성자의 이름은 클래스 명과 같아야 합니다.
//	2) return Type이 전혀 정의되지 않으며, 반환하지 않는 메소드 입니다
//	3) 인스턴스 생성시 생성자는 반드시 호출됩니다.
	
	//생성자 정의
	//인스턴시 생성시 인자값 전달을 통해 초기화된 객체의 참조변수가 만들어집니다.
	public AppleSeller(int money, int appleNumber, int price){
		myMoney=money;
		numOfApple=appleNumber;
		
		//상수 초기화 (생성자 특징)
		APPLE_PRICE=price;
	}
	
	//사과 판매 메소드
	public int saleApple(int money)	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;	
		myMoney+=money;
		return num;
	}
	
	public void showSaleResult(){
		System.out.println("보유 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
}

//사과구매자
class AppleBuyer{
	int myMoney=10000;	//보유 금액
	int numOfApple=0;	//보유 사과 수
	
	//사과 구매 메소드
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