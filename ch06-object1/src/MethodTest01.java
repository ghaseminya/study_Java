/* �������� ���: ��ȯ�ϴ� ���ϰ��� �ִ� �޼���
 * 
 * */

public class MethodTest01 {
	//�޼��� ��������
	
	//�������� ���: ��ȯ�ϴ� ���ϰ��� �ִ� �޼���
	public int add(int a, int b){
		return a+b;
	}
	
	//��ȯ�ϴ� �����Ͱ� ���� �޼���
	public void print(){
		System.out.println("��ȯ�ϴ� �����Ͱ� ���� �޼���");
		
		//��ȯ�ϴ� �����Ͱ� ���� ��� �Ϲ������� ����
		return;	
	}
	
	
	public static void main(String[] args) {
		
		MethodTest01 m = new MethodTest01();
	
		//���ϰ��� �ִ� �޼ҵ� ȣ��
		System.out.println(m.add(10, 20));
		
		//���ϰ��� ���� �޼ҵ� ȣ��
		m.print();
	}
}
