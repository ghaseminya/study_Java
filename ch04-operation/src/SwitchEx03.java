/*
성적등급 처리하기
	• case레이블을 하나의 부류로 묶어서 처리하기
	• char형 조건값 비교하기
*/
public class SwitchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch()문 (성적 등급 처리하기)
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.println("정수형 성적을 입력하세요 > ");
		score = input.nextInt();
		
		switch(score/10){
		case 10:
		case 9:{
			// 10, 9레이블을 하나의 부류로 묶어서 처리하게 됩니다.
			grade ='A';
			break;
		}
		case 8:{
			grade ='B';
			break;
		}
		case 7:{
			grade ='C';
			break;
		}
		case 6:{
			grade ='D';
			break;
		}
		default:
			grade ='F';			
		}
		
		System.out.println("성적 : " + score);
		System.out.println("등급: " + grade);
			
	}
}
