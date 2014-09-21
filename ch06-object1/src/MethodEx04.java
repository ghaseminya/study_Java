/* �������� : Variable Arguements 
 * */

public class MethodEx04 {
	
	/*�Ϲ����� �޼����  Ÿ�԰� ������ ������ ��ġ���Ѿ� �մϴ�.*/
	public void getNum(int num){
		System.out.println("���޵� ���� = " + num);		
	}
	
	/*�������� : Variable Arguements
	JDK v5.0�̻���� ��밡��*/	
	//Ÿ���� �����ϰ� ������ ������ ������
	public void argTest(int ... n){	//���������ϸ� �迭�� ������ �迭�� �����ϰ� �� �ּҰ��� n���� �Է¹޴´�.
		
		for(int i=0; i<n.length; i++){
			System.out.println("n[" + i+ "] :" + n[i]);			
		}	
		System.out.println("=========================");
	}	
	

	public static void main(String[] args) {		
		
		MethodEx04 m = new MethodEx04();
		m.getNum(50);

		//���޵Ǵ� ������ ���� ����ġ
//		m.getNum(50, 60); //Error:The method getNum(int) in the type MethodTest04 is not applicable for the arguments (int, int)
		
		//���޵Ǵ� ������ Ÿ���� ����ġ
//		m.getNum(5.6);	//ERROR: The method getNum(int) in the type MethodTest04 is not applicable for the arguments (double)
		m.getNum( (int)5.6);
		
		System.out.println();
		//�������ڸ� ����ϴ� �޼��� ȣ��
		m.argTest(50, 60, 70);
		m.argTest(22, 33);
		m.argTest(11);
		m.argTest(100, 200, 300, 400, 500, 600);
		m.argTest();
	}
}
