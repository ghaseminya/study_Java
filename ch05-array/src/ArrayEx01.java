
public class ArrayEx01 {

	public static void main(String[] args) {
		// �迭 ���� �ܰ�: �迭 ����/�迭 ����/�迭 �ʱ�ȭ/�迭 ���
		// �迭���� ��� 1 2 3
		
		//�迭 ����
		char[] ch;
		
		//�迭 ����
		ch = new char[4];
		
//		�迭 �ʱ�ȭ
		ch[0]='J';
		ch[1]='A';
		ch[2]='V';
		ch[3]='A';
		
		//�迭�� ��� : char�迭�϶��� �������� �ƴ� �迭���� �����ش�. (�������� �迭������ �ѹ� �� �����ؼ� �����ش�)
		System.out.println(ch);
		
		//�迭�� index 0�� ���� ȣ��
		System.out.println(ch[0]);
		
		//�ݺ����� �̿��ؼ� �迭�� ���� ���
		System.out.println();
		for(int i=0; i < ch.length; i++ ){
			
			System.out.print("�迭 " + i + "��° ����Ÿ: ");
			System.out.println(ch[i]);			
		}
		
		
		//�迭���� ��� 1: �迭 ���� �� ����
		int i[] = new int[7];
		
		//�迭���� ��� 2: �迭 ���� �� ����, �ʱ�ȭ (����� �迭 ����)  
		char[] ch2 = new char[]{'H','E','L','L', 'O'};
		
		//�迭���� ��� 3: �迭 ���� �� ����, �ʱ�ȭ (�Ͻ��� �迭 ����)
		char[] ch3 = {'��', '��'};
		
	}
}
