/*
�ѱ� ���� ���, ����ó�����α׷�, �����Ͱ���(�߿�), �Ҽ����ڸ� ��������
*/
public class Score {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int ���� = 0, ���� = 0, ���� = 0, ���� = 0;
		char  ����;
		float ���1;
		float ���2;		
		
		//���� ��ü�� üũ�ϱ�
		/*do{
			System.out.print("���� : ");
			���� = input.nextInt();
			
			System.out.print("���� : ");
			���� = input.nextInt();
			
			System.out.print("���� : ");
			���� = input.nextInt();
			
			
		}while(���� < 0 || ���� > 100  ||
				���� < 0 || ���� > 100 ||
				���� < 0 || ���� > 100);*/
		
		
		//���񺰷� ��ȿ�� ���� ���� üũ�ϱ�
		do{
			System.out.print("���� : ");
			���� = input.nextInt();
		}while(���� < 0 || ���� > 100);
		
		do{
			System.out.print("���� : ");
			���� = input.nextInt();
		}while(���� < 0 || ���� > 100);
		
		do{
			System.out.print("���� : ");
			���� = input.nextInt();
		}while(���� < 0 || ���� > 100);				
		
		���� = ���� + ���� + ����;
		
		//������ ���� (�߿�)
		//float = int / int;
		���1 = ����/3;			// int -> float ����ȯ (65 -> 65.0)
		���2 = (float)����/3.0F;	// int -> float ����ȯ (65 -> 65.0)
//		���2 = ����/3.0F;		// int -> float ����ȯ (65 -> 65.0)		
		
		System.out.println();
		System.out.println("���� = " + ����);
		System.out.println("���1 = " + ���1);
		System.out.println("���2 = " + ���2);	//��� �� �ٹٲ�
		System.out.printf("���2 = %.2f", ���2);	//����� �������� ���� ����, SDK ver5.0�̻�	
		
		switch((int)���2/10){
			case 10:
			case 9:{
				���� = 'A';
				break;
			}
			
			case 8:{
				���� = 'B';
				break;	
			}
			case 7:{
				���� = 'C';
				break;
			}
			case 6:{
				���� = 'D';
				break;
			}
			default:{
				���� = 'F';
				break;			
			}
		}
		System.out.println();
		System.out.println("���� = " + ����);
		
	}
}
