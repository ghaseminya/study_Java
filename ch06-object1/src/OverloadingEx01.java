/* �޼��� �����ε�
 * 
 * */

public class OverloadingEx01 {	
	//�������
	int var1;	
	
	/*����޼���
	�޼��� �����ε�: ����� ���� �޼��带 ������ ���� �� �����
	- �޼��� ���� ���� ������ Ÿ���� �ٸ��� ���
	- Ÿ���� ������ ������ ������ �ٸ��� ���
	- ������ ������ ������ �ٸ��� ���*/
	public void getLength(int n){
					//int -> Sting
		String s = String.valueOf(n);
		getLength(s);		
	}
	
	//ERROR: Duplicate method getLength(int)in type OverloadingTest
	// ���ڸ��� ���Ƶ� ��������� �ڷ����� �޶�� �Ѵ�.
//	public void getLength(int a){
//	}
	
	public void getLength(float f){
					//float -> Sting
		String s = String.valueOf(f);
		getLength(s);
	}
	
	//�����ڸ� �ٸ��� �ϴ��� �޼��� �����ε������� �ٸ��� �ν� ���� �ʽ��ϴ�.
	/*void getLength(float f){
		//float -> Sting
		String s = String.valueOf(f);
		getLength(s);
	}*/	
	
	
	public void getLength(float f, int a ){
		String s = String.valueOf(f) + String.valueOf(a);
		getLength(s);
	}
	
	//���� ������ �帣�� �ٸ� ������ �ν��մϴ�.
	public void getLength(int a, float f ){
		String s = String.valueOf(f) + String.valueOf(a);
		getLength(s);
	}
	
	public void getLength(String str){		
		System.out.println("�Է��� ���� ����: " + str.length());		
	}
	
	public void getLength(String str, float f ){
		String s = str + String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(float f, String str ){
		String s = String.valueOf(f) + str;
		getLength(s);
	}
	
	public void getLength(int n, float f, String str ){
		String s = String.valueOf(n) + String.valueOf(f) + str;
		getLength(s);
	}
	
	
	/*private void getLength(String str){		
	System.out.println("�Է��� ���� ����: " + str.length());
	}	*/
	
	/*public int getLength(String str){		
		System.out.println("�Է��� ���� ����: " + str.length());
		return 0;
	}	*/
	

	public static void main(String[] args) {		
		
		//1000, 3.14F, "���ѹα�"
		
		OverloadingEx01 ot = new OverloadingEx01();
		ot.getLength(1000);		//1000		->	"1000"
		ot.getLength(3.14F);	//3.14F		->	"3.14"
		ot.getLength("���ѹα�");	//"���ѹα�"	->	"���ѹα�"
		ot.getLength(1000, 3.14F);
		ot.getLength(3.14F, 1000);
		ot.getLength("���ѹα�", 3.14F);
		ot.getLength(3.14F, "���ѹα�");
		ot.getLength(1000, 3.14F, "���ѹα�");
	}
}
