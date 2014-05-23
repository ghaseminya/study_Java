
public class IfEx03 {

	public static void main(String[] args) {
		// 조건문 - 다중 if문 ( 성적 등급 처리)
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.print("성적을 입력하세요 > ");
		score = input.nextInt();
		
		if( score >= 90 && score <=100 ){
			grade ='A';
		}else if(score >= 80 && score <=89){
			grade ='B';
		}else if(score >= 70 && score <=79){
			grade ='C';
		}else if(score >=60 && score <=69){
			grade = 'D'; 
		}else if(score < 60){
			grade ='F';			
		}else{
			grade ='?';
			System.out.println("성적을 다시 입력하세요.");
		}
		
		System.out.println("성적 : " + score);
		System.out.println("등급: " + grade);
		

	}

}
