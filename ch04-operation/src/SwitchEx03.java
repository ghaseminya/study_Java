
public class SwitchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch()�� (���� ��� ó���ϱ�)
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.println("������ ������ �Է��ϼ��� > ");
		score = input.nextInt();
		
		switch(score/10){
		case 10:
		case 9:{
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
		
		System.out.println("���� : " + score);
		System.out.println("���: " + grade);
			
	}
}
