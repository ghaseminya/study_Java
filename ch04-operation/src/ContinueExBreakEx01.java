/*
continue vs break

*/
public class ContinueExBreakEx01 {

	//continue�� ����
	public static void main(String[] args) {
		// Ư�������϶� continue������ ���� ȸ���� �ǳʶٱ�
		// continue�� ������ ���� �������� �ʰ� �ٽ� ���� �˻縦 ������
		
		for(int i =0; i<=10; i++){
		
			//Ư�� �����϶� �ڵ� ������ �ǳʶٰ� ���� ȸ���� �ǳʶڴ�(���� �˻�� �̵�).
			if( i == 7)
				continue;
			System.out.println(i);
		}
		
		System.out.println("�ݺ��� ���� �Ϸ�!");
	}
	

	
/*	
	//break�� ����
	public static void main(String[] args) {
		// Ư�������϶� break������ �ݺ����� ��������
		// �ݺ��� ���� ���� ����

		for(int i =0; i<=10; i++){

			//Ư�� �����϶� �ݺ����� ��������(for�� Ż��).
			if( i == 7)
				break;
			System.out.println(i);
		}

		System.out.println("�ݺ��� ���� �Ϸ�!");
	}
	*/
	
}
