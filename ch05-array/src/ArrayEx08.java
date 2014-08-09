
public class ArrayEx08 {

	public static void main(String[] args) {
		// 2차원 배열 성적처리
		
		//2차원 배열 선언/생성/초기확
		int[][] score = {
				{99,99,99},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==========================================");
		
		//배열 출력
		for(int i=0; i < score.length; i++){
			
			int sum=0;
			
			System.out.print( (i+1) + "번\t");
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
