
public class ArrayEx06 {

	public static void main(String[] args) {
		// 성적처리하기		
	/*	1) 성적입력
		2) 국어, 영어, 수학, 과학
		3) 총점, 평균, 학점
		4) 출력
			국어	영어	수학	과학	총점	평균	학점*/
		
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		String[] subname = {"국어","영어","수학","과학", "총점"};	//과목명
		int[] score = new int[subname.length];	//과목별 점수와 총점
		float average = 0.0F;	//평균	
		char grade = '?';	//학점
		
		for(int i=0; i < score.length-1 ; i++){
			do{
				
				System.out.print(subname[i] + " 점수를 입력하세요 > ");
				score[i] = input.nextInt();
				score[score.length-1] += score[i];
				
			}while(score[i] <0 || score[i] > 100);			
		}
		
		//학점
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
		System.out.print("평균 \t");
		System.out.print("학점");		
		
		System.out.println();
		for(int i=0; i < score.length ; i++){
			System.out.print(score[i] + "\t");					
		}
		System.out.print(average + "\t");
		System.out.print(grade);		
		
	}
}
