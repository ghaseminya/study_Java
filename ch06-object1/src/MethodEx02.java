/* ���� ���� ���: �� ȣ��(call by value)
 * 
 * */

public class MethodEx02 {
	
	
	//�������
	
	//���� ���� ���: �� ȣ��(call by value)
	public int increase(int n){
		++n;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ����
		int var1 = 100;
		MethodEx02 m = new MethodEx02();
		
		int var2 = m.increase(var1);


		System.out.println("var 1: " + var1);
		System.out.println("var 2: " + var2);

	}

}
