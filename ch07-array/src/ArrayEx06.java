// 성적처리하기

//1) 배열 선언
//2) 국어, 영어, 수학, 과학 성적입력
//3) 총점, 평균, 학점 구하기
//4) 출력 (국어 영어 수학	과학	총점	평균	학점)


public class ArrayEx06 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"국어","영어","수학","과학", "총점"}; //과목명 배열
		int[] score = new int[subname.length];	//과목별 점수와 총점 배열
		float average = 0.0F;	//평균	
		char grade = '?';	//학점, 기본값으로 ?문자 저장
		
		for(int i=0; i < score.length-1 ; i++){
			do{
				System.out.print(subname[i] + " 점수를 입력하세요 > ");
				score[i] = input.nextInt();	//과목별 점수 저장
				score[score.length-1] += score[i];	//점수 누적하여 총점 계산
				
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
		
		//평균
		average = score[score.length-1]/(subname.length-1);
		
		//제목 출력
		for(int i=0; i < score.length ; i++){
			System.out.print(subname[i] + "\t");					
		}
		System.out.print("평균 \t");
		System.out.print("학점");		
		
		//성적 출력
		System.out.println();
		for(int i=0; i < score.length ; i++){
			System.out.print(score[i] + "\t");					
		}
		System.out.print(average + "\t");
		System.out.print(grade);
		
		input.close();
	}
}
