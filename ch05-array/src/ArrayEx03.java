
public class ArrayEx03 {

	public static void main(String[] args) {
		// �ִ밪 �� �ּҰ� ���ϱ�
		
		//�Ͻ��� �迭 ����
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		//�迭���� ���� �������� �ؾ� �ִ밪/�ּҰ��� ��Ȯ�ϰ� ���� �� �ִ�.
		int max=score[0];
		int min=score[0];
		
		//�ִ밪, �ּҰ� ���ϱ�
		for( int i=1 ; i < score.length; i++){			
			if(score[i] > max){
				max = score[i];
			}
			if(score[i] < min){								
				min = score[i];
			}		
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
