/* ������ ȣ���� ���� �ʱ�ȭ 
 
 */

public class ThisTest3 {
	
	
	public ThisTest3(){
		//System.out.println("���ھ��� ������");
		
		//�����ڳ����� �� �ٸ� �����ڸ� ȣ���ϴ� �͵� �ʱ�ȭ �۾� ��
		//�ʱ�ȭ �۾� ���� ���๮�� ������ ERROR:Constructor call must be the first statement in a constructor
		//System.out.println("������ ȣ�� �� ���๮ ȣ��(ERROR)");
	
		//�����ڳ����� �� �ٸ� ������ ȣ��
		this("���ھ��� ������ ");
		System.out.println("������ ȣ�� �� ���๮ ȣ��(����)");
	}
	
	public ThisTest3(String msg){
		System.out.println(msg);
	}
	
	public ThisTest3(int a){
					//int -> String
		//String	s = String.valueOf(a);
		//System.out.println(s);
		this(String.valueOf(a));		
	}	

	public static void main(String[] args) {
		ThisTest3 tt1 = new ThisTest3();
		
		System.out.println("==================");
		ThisTest3 tt2 = new ThisTest3(1000);
		
		System.out.println("==================");
		ThisTest3 tt3 = new ThisTest3("���ѹα�");
	}
}
