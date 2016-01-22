/*
//입력을 받은 후 배열에 저장한 다음 성적 처리하기
//"국어","영어","수학","과학" 점수를 입력받아 성적 출력하기
//LAB


제한사항
	• 1~100사이의 정수만 입력받도록 코딩
	• 입력받은 값는 순서대로 배열에 저장
	• 저장된 값을 통해 총점과 평균 출력
*/

public class ArrayEx05 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"국어","영어","수학","과학"};
		
		//배열의 마지막에 총점을 입력하기 위해 +1
		int[]	score = new int[subname.length + 1];
		float average = 0.0F;
			
		
		for(int i=0; i<subname.length; i++){
			
			//1~100사이의 정수만 입력가능
			do{
				System.out.print(subname[i] + " 점수를 입력하세요 > ");
				score[i] = input.nextInt();
							
			}while(score[i] < 0 || score[i] >100); //입력 받은 값의 유효성 체크
			
			//총점
			score[score.length-1] += score[i];	
		}		
		
//		average = (float)(score[score.length-1]) / score.length;
		//평균
		average = (float)(score[score.length-1]/subname.length);
		
		System.out.println("총점 : " + score[score.length-1]);
		System.out.printf("평균 : %.2f", average);
		
		input.close();
	}
}
