
public class IfEx03 {

	public static void main(String[] args) {
		// ���ǹ� - ���� if�� ( ���� ��� ó��)
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.print("������ �Է��ϼ��� > ");
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
			System.out.println("������ �ٽ� �Է��ϼ���.");
		}
		
		System.out.println("���� : " + score);
		System.out.println("���: " + grade);

	}
}
