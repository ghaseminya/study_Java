class Capsule{
	private int a;
	
	public void setA(int n){
		
		if( n >= 0){
			a = n;
		}else{
			System.out.println("������ ������ �ʽ��ϴ�.");
		}			
	}
	
	public int getA(){
		return a;
	}	
}

public class CapsuleMain {
	
	/*private int a;
	
	public void setA(int n){
		a = n;
	}
	
	public void getA(){
		return a;
	}*/
	

	public static void main(String[] args) {
		/*CapsuleMain csm = new CapsuleMain();
		
		//���� Ŭ���������� ȣ�Ⱑ���մϴ�.
		csm.a = 10;
		System.out.println(csm.a);
		
		csm.a = -10;
		System.out.println(csm.a);*/
		
		
		//����ȭ�� Ŭ���� ����
		Capsule cs = new Capsule();
		
		/*ERROR: The field Capsule.a is not visible
		���������ڰ� private�̸� ���� Ŭ���������� ȣ�� ����(����ȭ)*/
		/*cs.a = 10;
		System.out.println(cs.a);*/
		cs.setA(100);		
		System.out.println( cs.getA() );
		
		cs.setA(-200);		
		System.out.println( cs.getA() );
	}
}
