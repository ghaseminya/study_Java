
public class ArrayEx06 {

	public static void main(String[] args) {
		// ����ó���ϱ�		
	/*	1) �����Է�
		2) ����, ����, ����, ����
		3) ����, ���, ����
		4) ���
			����	����	����	����	����	���	����*/
		
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		String[] subname = {"����","����","����","����", "����"};	//�����
		int[] score = new int[subname.length];	//���� ������ ����
		float average = 0.0F;	//���	
		char grade = '?';	//����
		
		for(int i=0; i < score.length-1 ; i++){
			do{
				
				System.out.print(subname[i] + " ������ �Է��ϼ��� > ");
				score[i] = input.nextInt();
				score[score.length-1] += score[i];
				
			}while(score[i] <0 || score[i] > 100);			
		}
		
		//����
		switch((int)average/10){
		case 10:
		case 9:
			grade = 'A';
		case 8:
			grade = 'B';
		case 7:
			grade = 'C';
		case 6:
			grade = 'D';
		default:
			grade ='F';		
		}
		
		average = score[score.length-1]/(subname.length-1);
		
		for(int i=0; i < score.length ; i++){
			System.out.print(subname[i] + "\t");					
		}
		System.out.print("��� \t");
		System.out.print("����");		
		
		System.out.println();
		for(int i=0; i < score.length ; i++){
			System.out.print(score[i] + "\t");					
		}
		System.out.print(average + "\t");
		System.out.print(grade);		
		
	}
}
