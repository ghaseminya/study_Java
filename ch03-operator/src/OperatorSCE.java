/*
SCE���� �������� ���� ���� ����
&&, ||�������� �������� ������� ������ ����

*/
class OperatorSCE
{
	public static void main(String[] args)
	{
		int num1=0, num2=0;
		boolean result;
		
		result = (num1+=10)<0 && (num2+=10)>0;
		//(num1+=10)<0 -> 10<0 -> false
		//(num2+=10)>0 -> 10>0 -> true
		// false && true
		//SCE������ ��������ν� ��������(num2+=10)�� ������ ����Ǿ� ���� �ʽ��ϴ�.
		System.out.println("result= "+result);
		System.out.println("num1= " + num1 + ", num2= " + num2);
		
		
		System.out.println("");
		result = (num1+=10)>0 || (num2+=10)>0;
		//(num1+=10)>0 -> 10>0 -> true
		//(num2+=10)>0 -> 10>0 -> true
		// false && true
		System.out.println("result= " + result);
		System.out.println("num1= " + num1 + ", num2= " + num2);
		//SCE������ ��������ν� �������� (num2+=10)�� ������ ����Ǿ� ���� �ʽ��ϴ�.
	}
}