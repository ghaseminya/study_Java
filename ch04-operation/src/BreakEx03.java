
public class BreakEx03 {

	public static void main(String[] args) {
		// break�� - Ư�� ������ �� �ݺ��� Ż���ϱ�
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a =0;
		int total = 0;
		
		System.out.println("0������ �Է¹��� ������ �� ���ϱ�");
		
		while(true){
			
			System.out.print("������ ���� ���� �Է��ϼ��� > ");
			a = input.nextInt();
			
			//Ư�� �����϶� �ݺ��� Ż��
			if( a ==0){
				break;
			}else{
				total += a;
			}			
		}
		
		System.out.print("total = " + total);
		
	}
}
