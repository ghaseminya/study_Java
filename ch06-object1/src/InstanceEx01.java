/*��ü ����/����/ȣ��*/

public class InstanceEx01 {

	//��� �ʵ�
	int var1;	//����
	final int NUM_TWO=2;	//���
	
	/*������: ��ü ������ ȣ�� �ǰ� ��������� �ʱ�ȭ�ϴ� ����
	�����ڸ� ȣ���ϸ�
	��� �ʵ�� ��� �޼ҵ尡 �����Ǿ� �޸𸮿� �ö� �� �ֵ��� ���ֳ�.*/
	public InstanceEx01(){}
	
	
	//��� �޼ҵ�
	public int sum(int a, int b){
		return a+b;
	}	
	
	//���� �޼ҵ�
	public static void main(String[] args) {
		//��ü ����
		InstanceEx01 me1;
		InstanceEx01 me2;
		
		System.out.println();
		//��ü ����
		me1 = new InstanceEx01();
		me2 = new InstanceEx01();
		
		System.out.println();
		//��ü ���(������)
		System.out.println(me1);
		System.out.println(me2);
		
//		���� ��ư Ŭ������ ������ ��ü�� �����ϰ� �Ǹ� ���� �������� ������?
		
		System.out.println();
		//��ü�� ��� ���� ���
		System.out.println(me1.var1);
		
		System.out.println();
		//��ü�� ��� ���� �����ϱ�
		me1.var1 = 10;
		System.out.println(me1.var1);
	
		
/*		��� ����� ������ �� �����Ƿ� ����� Error
		Error: The final field InstanceEx01.NUM_TWO cannot be assigned*/
//		��� ��� �����ϱ�
//		me1.NUM_TWO = 20;
		
		System.out.println();
		//��� �޼ҵ� ȣ��
		int result = me1.sum(20, 40);
		System.out.println("��� �޼ҵ� ȣ���� ��ȯ�� : " +  result );
		
	}
}
