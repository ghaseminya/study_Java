/*
��ü ����
*/

/*
public class AppleMarket01 {

	public static void main(String[] args) {
		
		//���������� ���� = �ν��Ͻ� ����
		AppleSeller seller = new AppleSeller();
		AppleBuyer buyer = new AppleBuyer();
		//�޼ҵ� ȣ��	: �޼ҵ� ȣ���� ���� �޽��� �����ϴ� ���� �ǹ�, �޼ҵ� ������ �� ��ü���� ��ȭ����Դϴ�.
		buyer.buyApple(seller, 2000);	//���� �Ǹ��ڿ��� 2,000����ġ ��� ���� ��û
		
		System.out.println("��� �Ǹ����� ���� ����");
		seller.showSaleResult();
		
		System.out.println("��� �������� ���� ����");
		buyer.showBuyResult();
	}

}

class AppleSeller{
	
	int numOfApple=30;
	int myMoney=0;
	//final		: ���� -> ���ȭ
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
*/