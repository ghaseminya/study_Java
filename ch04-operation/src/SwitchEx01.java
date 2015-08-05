//switch문에서 정수 비교하기


public class SwitchEx01 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a;
		System.out.print("정수형 숫자를 입력하세요 > ");
		a = input.nextInt();
		
		switch(a){// JDK v6: long을 제외한 정수형(byte, short, int), char
		case 1:
			System.out.println("1 입력하였습니다.");
			break;
		case 2:
			System.out.println("2 입력하였습니다.");
			break;
		case 3:
			System.out.println("3 입력하였습니다.");
			break;
		case 4:
			System.out.println("4 입력하였습니다.");
			break;
		case 5:
			System.out.println("5 입력하였습니다.");
			break;
		default:
			System.out.println("1 ~ 5 숫자중에서 입력하세요.");
			break;
		
		}
		
		input.close();
	}
}
