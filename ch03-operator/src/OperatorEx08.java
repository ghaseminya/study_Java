
public class OperatorEx08 {
	public static void main(String[] args){
		
		System.out.println("=========����(����) ������ 3=========");
		//�빮�� / �ҹ��� �����ϱ�
				
		char ch = 'b';
		String msg;		//���ڿ��� ������ �� �ִ� ���� ����
		
		msg = (ch >= 'A' && ch <= 'Z') ? "�빮���Դϴ�" : "�ҹ����Դϴ�";
		// A ~ Z (65 ~ 90) / a ~ z(97 ~ 122)
		System.out.println("msg : " + msg);
		System.out.println("ch : " + ch);		
		
	}
}
