/*
���ڰ��� �ִ� �����ڸ� ���� �ʱ�ȭ
-�����ڸ� ���� ���ϴ� ������ �ʱ�ȭ
*/


public class ObjectEx03 {
	
	public static void main(String[] args)
	{
		//�ν��Ͻ� ����
		Number myNumber1=new Number(10);
		//new Number	: �ν��Ͻ� ���� �ǹ�
		//Number()		: �Ű�����10�� ���ڷ� �����Ͽ� �ʱ�ȭ�ϴ� �����ڸ� ȣ���Ͽ� �ν��Ͻ� ����
		Number myNumber2=new Number(20);
		
		System.out.println("myNumber1 �޼ҵ� ȣ�� �� ��: "+myNumber1.getNumber());
		instMethod(myNumber1);
		System.out.println("myNumber1 �޼ҵ� ȣ�� �� ��: "+myNumber1.getNumber());	
		
		System.out.println("myNumber2 �޼ҵ� ȣ�� �� ��: "+myNumber2.getNumber());
		instMethod(myNumber2);
		System.out.println("myNumber2 �޼ҵ� ȣ�� �� ��: "+myNumber2.getNumber());
	}

	public static void instMethod(Number number)
	{
		number.addNum(10);
	}		
	
}

//Ŭ���� ����(����)
class Number
{
	//������� = �ν��Ͻ� ����
	int num;
	
	//���ڰ��� �ִ� ������ ����
	public Number(int number)
	{
		num=number;
		System.out.println("������ ȣ���!");
		System.out.println("���޵� ���ڰ�: "+number);
	}
	
	//��� �޼ҵ� = �ν��Ͻ� �޼ҵ�
	public void addNum(int n)
	{
		num+=n;
	}
	public int getNumber()
	{
		return num;
	}
}