/*
//2차원 배열 성적처리

*/
public class ArrayEx08 {

	public static void main(String[] args) {
		
		//2차원 배열 선언/생성/초기화
		int[][] score = {
				{99,89,79},
				{58,68,78},
				{30,40,50},
				{66,77,88},
				{50,70,80}
		};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================");
		
		//배열 출력 (성적처리 결과 출력)
		for(int i=0; i < score.length; i++){
			
			int sum=0;
			
			System.out.print( (i+1) + "번\t");
			for(int j=0; j <score[i].length; j++){
				System.out.print( score[i][j] + "\t");		
				sum += score[i][j];				
			}
			System.out.print(sum + "\t");
			System.out.print(sum/score[i].length + "\t");
//			System.out.printf("%.2f\t", (float)sum/score[i].length); //66.67
			System.out.println();
		}
	}
}
