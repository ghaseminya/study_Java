
public class ArrayEx08 {

	public static void main(String[] args) {
		// 2���� �迭 ����ó��
		
		//2���� �迭 ����/����/�ʱ�Ȯ
		int[][] score = {
				{99,99,99},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("==========================================");
		
		//�迭 ���
		for(int i=0; i < score.length; i++){
			
			int sum=0;
			
			System.out.print( (i+1) + "��\t");
			for(int j=0; j <score[i].length; j++){
				System.out.print( score[i][j] + "\t");		
				sum += score[i][j];				
			}
			System.out.print(sum + "\t");
			System.out.print(sum/score[i].length + "\t");
			System.out.println();
		
		}
	}
}
