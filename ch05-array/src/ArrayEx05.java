
public class ArrayEx05 {

	public static void main(String[] args) {
		// �Է��� ���� �� �迭�� ������ ���� ���� ó���ϱ�
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"����","����","����","����"};
		
		//�迭�� �������� ������ �Է��ϱ� ���� +1
		int[]	score = new int[subname.length + 1];
		float average = 0.0F;
			
		
		for( int i=0; i< subname.length; i++){
			do{
				System.out.print(subname[i] + " ������ �Է��ϼ��� > ");
				score[i] = input.nextInt();
							
			}while(score[i] < 0 || score[i] >100);
			
			//����
			score[score.length-1] += score[i];	
		}		
		
		average = (float)(score[score.length-1]) / score.length;
		
		System.out.println("���� : " + score[score.length-1]);
		System.out.printf("��� : %.2f", average);
				
	}
}
