/* ��������� �������� �����ϱ�
 * 
 */

public class ThisTest2 {	
	String name;
	int age;
	
	/*public ThisTest2(String n, int a){
		name = n;
		age = a;		
	}*/	
	
	/*���������� ������������ ������ ��� ���������� �켱
	��������� ���������� �����ϱ� ����   this�� ���*/
/*	public ThisTest2(String name, int age){
		name = name;
		age = age;		
	}*/
	
	public ThisTest2(String name, int age){
		//�������	= ��������
		this.name 	= name;
		this.age 	= age;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest2 tt1 = new ThisTest2("��¡��",  25);
		System.out.println( tt1.name + " / " + tt1.age );
	}
}