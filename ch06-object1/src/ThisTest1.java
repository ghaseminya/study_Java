/* �⺻ ������ ȣ���� ���� �ʱ�ȭ
 * 
 */


public class ThisTest1 {

	//������
	public ThisTest1(){
		// this: ���� ����
		// (this) ��ü ������ ���� ��ü ����
		System.out.println("��ü ����: " + this);
	}	
	
	public static void main(String[] args) {
		// ��ü ����
		// (tt1) ��������: ��ü �ۿ��� ��ü ����
		ThisTest1 tt1 = new ThisTest1();
		
		// ��ü ���� �� 
		System.out.println("��ü ���� ��: " + tt1);
	}
}
