
public class Ex02_07 {

	public static void main(String[] args) {
		/*컴퓨터 개론, 영어, 일반수학, 자바 과목에 대한 성적을 입력하고 
		각 과목의 점수와 총점, 평균을 출력하는 프로그램을 작성하시오.
		(각 과목의 점수는 배열을 선언하고 배열에 보관)*/
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"컴퓨터 개론","영어","일반수학","자바"};
		int[] score = new int[subname.length];
		int total =0;
		float average =0.0F;
		
		for(int i=0; i < score.length; i++){
		
			System.out.print( subname[i] + " 의 점수는 > ");
			do{
				score[i] = input.nextInt();
				
			}while(i <0 || i>100);
			
			total += score[i];
		}
		
		average = total/score.length ;		
		
		for(int j=0; j < subname.length; j++){
			System.out.print( subname[j] + "\t");
		}
		System.out.print("총점\t");
		System.out.println("평균");
		
		for(int k=0; k < score.length; k++){
			System.out.print( score[k] + "\t");
			
		}
		System.out.print(total + "\t");
		System.out.println(average);
	}
}
