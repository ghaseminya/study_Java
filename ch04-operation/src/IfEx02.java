
public class IfEx02 {

	public static void main(String[] args) {
		// ���ǹ� - ���� if (������ �Է� ���� �� ¦�� Ȧ�� �����ϱ�) 
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a;
		
		System.out.print("������ ������ �ϳ��� �Է� > ");
		a = input.nextInt();
				
		
		if(a%2 == 1){	//Ȧ�� üũ
			System.out.print("Ȧ�� �Դϴ�.");
			
		}else{	// ¦��
			System.out.print("¦�� �Դϴ�.");			
		}	
	}
}
