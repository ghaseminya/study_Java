
public class WhileEx03 {

	public static void main(String[] args) {
		//while�� - �Է°� �����ձ��ϱ� �� 0�Է½� ���α׷� �����ϱ�
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int num = 0;
		int total = 0;
		
		System.out.println("0������ �Է¹��� ������ �� ���ϱ�");
		System.out.print("������ ������ �Է��ϼ��� > ");
		
		while( (num=input.nextInt()) != 0 ){			
			
			total += num;
						
			System.out.println("�����հ� = " + total);
			System.out.print("������ �����͸�  �Է� > ");
			System.out.println();			
		}
		//System.out.println("�����հ� = " + total);
		System.out.println("���α׷� �����մϴ�");	

	}
}
