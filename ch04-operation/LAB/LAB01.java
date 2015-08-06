//Switch~Case문에서 문자열 비교를 통해 요일 출력하기
//monday, tuesday, wednesday, thursday, friday, saturday, sunday
//LAB

public class LAB01 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("원하는 요일을 입력하세요(영문 소문자) > ");
		String str = input.nextLine();
		
		switch(str) {
		case "monday":
			System.out.printf("월요일\n");
			break;
		case "tuesday":
			System.out.printf("화요일\n");
			break;
		case "wednesday":
			System.out.printf("수요일\n");
			break;
		case "thursday":
			System.out.printf("목요일\n");
			break;
		case "friday":
			System.out.printf("금요일\n");
			break;
		case "saturday":
			System.out.printf("토요일 \n");
			break;
		case "sunday":
			System.out.printf("일요일\n");
			break;
		default:	//사용자의 잘못 입력을 처리하도록 처리
			System.out.printf("잘못 입력되었습니다.\n");
		}
		
		input.close();
	}
}
