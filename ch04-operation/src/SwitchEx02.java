
public class SwitchEx02 {

	public static void main(String[] args) {
		// switch���� ���� ��
		
		//char a = 'A';
		//char a = 'B';
		char a = 'C';
		//char a ='D';
		
		switch(a){	//char -> int ����ȯ ��(�ƽ�Ű �ڵ�� �νĵ�)
		case 'A':
			System.out.println("A ����Ͽ����ϴ�.");
			break;
		case 'B':
			System.out.println("B ����Ͽ����ϴ�.");
			break;
		case 'C':
			System.out.println("C ����Ͽ����ϴ�.");
			break;
		default:
			System.out.println("A, B, C�� �ƴ� ���� �Դϴ�.");		
		}
	}
}
