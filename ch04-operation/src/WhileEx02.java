
public class WhileEx02 {

	public static void main(String[] args) {
		// while�� - 1���� 100������ ���� �� ���ϱ�
		
		int sum, su;
		sum = su = 0;	//�ʱ��
		
		while(su <= 100){	//���ǽ�
			
			sum += su;
			su++;			//������
		}
		System.out.println("1~100������ �� : " + sum);
		
	}
}
