/*
// 성적처리하기 (성적처리 프로그램)
//국어, 영어, 수학, 과학을 입력받아  총점,평균, 학점을 구해주는 성적처리 프로그램

TODO 1: 배열 선언, 변수 변언
	• 과목명 배열 (subname)
	• 과목별 점수와 총점 배열 (score)
	• 평균 저장 float형 변수 (average)
	• 학점 저장 문자형 변수, 기본값으로 ?문자 저장 (grade)
TODO 2: 국어, 영어, 수학, 과학 성적 입력받기
	• 반복문 사용하여 입력받기
	• 입력받을 과목을을 배열을 활용하여 출력해 주기 ( ? + " 점수를 입력하세요 > ")
	• 입벽받은 값 유효성 검사하기  0 < score < 100
TODO 3: 총점, 학점, 평균 구하기
	• 점수 입력시 총점 구하기
	• switch~case문으로 학점 구하기
	• 배열 길이로 평균하기 
TODO 4: 출력시 제목과 함께 점수 및 총점, 평균, 학점 출력하기 
	• 제목 출력 (국어 영어 수학	과학	총점	평균	학점)
	• 점수 및 총점 출력
	• 평균 출력
	• 학점 출력

최종 성적처리결과 화면
국어	영어	수학	과학	총점	평균 		학점
70	80	90	60	300	75.0	F

*/
public class ArrayEx06 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"국어","영어","수학","과학", "총점"}; //과목명 배열
		int[] score = new int[subname.length]; //과목별 점수와 총점 배열
		
		float average = 0.0F; //평균	
		char grade = '?'; //학점, 기본값으로 ?문자 저장

		
		//반복문 사용하여 입력받기
		for(int i=0; i < score.length-1 ; i++){
			do{
				//입력받을 과목을을 배열을 활용하여 출력해 주기 ( ? + " 점수를 입력하세요 > ")
				System.out.print(subname[i] + " 점수를 입력하세요 > ");
				score[i] = input.nextInt();	//과목별 점수 저장
				
				//총점 구하기
				score[score.length-1] += score[i]; //점수 누적하여 총점 계산
				
			}while(score[i] <0 || score[i] > 100); //입벽받은 값 유효성 검사하기
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
		System.out.print(average + "\t"); //평균 출력
		System.out.print(grade); //학점 출력
		
		input.close();
	}
}
