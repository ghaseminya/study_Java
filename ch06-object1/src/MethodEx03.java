/* ���� ���� ���: ���� ȣ��(call by reference)
 * 
 * */

public class MethodEx03 {
	
	//���� ���� ���: ���� ȣ��(call by reference)
	public void increase(int[] n){// n�� ���ڷ� �ּҰ� �Էµ˴ϴ�.
		for(int i=0; i<n.length; i++){
			n[i]++;
		}		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ref = {100, 200, 300};
		for(int i=0; i<ref.length; i++){
			System.out.println(ref[i]);
		}
		
		System.out.println();
		System.out.println("===============================");		
		MethodEx03 m = new MethodEx03();		
		m.increase(ref);	//�ּҸ� ���ڷ�����
		for(int i=0; i<ref.length; i++){
			System.out.println(ref[i]);
		}
	}
}
