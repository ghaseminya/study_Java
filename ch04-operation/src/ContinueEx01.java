
public class ContinueEx01 {

	public static void main(String[] args) {
		// Ư�������϶� continue������ ���� ȸ���� �ǳʶٱ�
		// 1~10����� �� 3�� ����� ������� �ʱ�
		
		for(int i =0; i<=10; i++){
		
			//Ư�� �����϶� �ڵ� ������ �ǳʶٰ� ���� ȸ���� �ǳʶڴ�.
			if( i%3 == 0)
				continue;
			System.out.println(i);
		}
	}
}
