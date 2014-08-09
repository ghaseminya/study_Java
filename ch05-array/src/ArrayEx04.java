
public class ArrayEx04 {

	public static void main(String[] args) {
		// 한명에 대한 성적처리 프로그램 (1차원 배열)
		
		//총점
		int sum=0;
		
		//평균
		float average1 = 0.0F;
		float average2 = 0.0F;
		
		int[] score = {100, 88, 88, 100, 90};
		
		for(int i=0; i < score.length; i++){
			
			sum += score[i];
		}
		
		average1 = sum/score.length;
		average2 = (float)sum/score.length;	// int -> float
		
		System.out.println("average1 : " + average1);
		System.out.println("average2 : " + average2);
		
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average2);	
	}
}
