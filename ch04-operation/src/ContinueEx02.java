/*
3�� ����� �ƴϰų� 7�� ����� �ƴ϶�� ����ϰ� ī��Ʈ ������Ű��
*/

public class ContinueEx02 {

	public static void main(String[] args) {

		int num=0;
		int count=0;
		
		while((num++)<100)
		{
			//3���� ������ 0�� �ƴ϶�� 7�� ������ 0�� �ƴ϶�� (3�� ����� �ƴϰų� 7�� ����� �ƴ϶��)
			if(num%3!=0 || num%7!=0)
				continue;	//���� �κ� �����ϰ� ���ǹ����� �̵�
			
			count++;
			System.out.println(num);
		}
		
		System.out.println("count: " + count);
		
	}

}
