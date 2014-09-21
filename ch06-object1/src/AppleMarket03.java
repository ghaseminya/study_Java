/*
������ �Լ� ���� �� �ν��Ͻ� ������ ������ �Լ� ȣ��

*/

public class AppleMarket03 {
	public static void main(String[] args) {

		//�ν��Ͻ� ������ ������ ȣ���Ͽ� �ʱ�ȭ ����
		AppleSeller seller1 = new AppleSeller(0, 20, 2500);
		AppleSeller seller2 = new AppleSeller(0, 50, 1000);


		AppleBuyer buyer = new AppleBuyer();
		//�޼ҵ� ȣ��	: �޼ҵ� ȣ���� ���� �޽��� �����ϴ� ���� �ǹ�, �޼ҵ� ������ �� ��ü���� ��ȭ����Դϴ�.
		buyer.buyApple(seller1, 5000);	//���� �Ǹ���1���� 5,000����ġ ��� ���� ��û
		buyer.buyApple(seller2, 5000);	//���� �Ǹ���2���� 5,000����ġ ��� ���� ��û


		System.out.println("��� �Ǹ���1�� ���� ����");
		seller1.showSaleResult();
		System.out.println("��� �Ǹ���2�� ���� ����");
		seller2.showSaleResult();

		System.out.println("��� �������� ���� ����");
		buyer.showBuyResult();
	}

}

class AppleSeller{
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;


//������ Ư¡(����)
//	1) �������� �̸��� Ŭ���� ��� ���ƾ� �մϴ�.
//	2) return Type�� ���� ���ǵ��� ������, ��ȯ���� �ʴ� �޼ҵ� �Դϴ�
//	3) �ν��Ͻ� ������ �����ڴ� �ݵ�� ȣ��˴ϴ�.
	
	//������ ����
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
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
	}
	
}


class AppleBuyer
{
	int myMoney=10000;	//���� �ݾ�
	int numOfApple=0;	//���� ��� ��
	
	public void buyApple(AppleSeller seller, int money)
	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult()
	{
		System.out.println("���� �ݾ�: " + myMoney);
		System.out.println("��� ����: " + numOfApple);		
	}
}
