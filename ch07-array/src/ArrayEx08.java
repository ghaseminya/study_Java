/*
//2차원 배열 성적처리

번호	국어	영어	수학	총점	평균
===========================
1번	99	89	79	267	89	
2번	58	68	78	204	68	
3번	30	40	50	120	40	
4번	66	77	88	231	77	
5번	50	70	80	200	66


[중요 포인트]
제목 출력 위치
sum 구하기 위한 변수의 선언 위치
점수 출력 위치
총점과 평균 출력 위치

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
		
		int sum=0; //총점 저장
		
		//제목 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================");
		
		//배열 출력 (성적처리 결과 출력)
		for(int i=0; i < score.length; i++){
			
			System.out.print( (i+1) + "번\t");
			for(int j=0; j <score[i].length; j++){
				System.out.print( score[i][j] + "\t");		
				sum += score[i][j];				
			}
			System.out.print(sum + "\t");
			System.out.print(sum/score[i].length + "\t"); //66
			//평균의 소수점 2째자리까지 표시하기
//			System.out.printf("%.2f\t", (float)sum/score[i].length); //66.67
			System.out.println();
		}
	}
}


//출력결과
//번호	국어	영어	수학	총점	평균
//===========================================
//1번	99	89	79	267	89	
//2번	58	68	78	204	68	
//3번	30	40	50	120	40	
//4번	66	77	88	231	77	
//5번	50	70	80	200	66	