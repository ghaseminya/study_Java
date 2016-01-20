/*
//switch문에서 정수 비교하기


switch문
	• If문의 조건값은 boolean형인데 비해 
	• switch문의 조건값은 long형을 제외한 정수형(byte, short, int) 또는 char형이 올수 있습니다. 
	• 키워드 case, default를 가리켜 레이블이라고 합니다.
	• break문을 만나면 해당 switch문을 빠져나가게 됩니다. 
	• break문은 조건 값마다 넣어주는 것을 권장하며 만약없을 시에는 다음 break문을  만날 때까지 모든 수행문을 처리합니다.
	• (주의) case뒤에 오는 조건값은 중복되지 않아야 합니다. 
	     그렇지 않으면 case를 구분하는 값이 복제되어 중복되었다는 오류가 발생합니다.



*/
public class SwitchEx01 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a;
		System.out.print("정수형 숫자를 입력하세요 > ");
		a = input.nextInt();
		
		switch(a){// JDK v6: long을 제외한 정수형(byte, short, int), char
		case 1: // semicolon(;)이 아닌 colon(:) -> (주의)
			System.out.println("1 입력하였습니다.");
			break; // break문은 조건값마다 넣어주는 것을 권장하며 
				   // 만약 없을 시에는 다음 break문을  만날 때까지 모든 수행문을 처리합니다
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
		default: // 받은 인자값이 case문의 조건값1에서 조건값5까지 일치하는 것이 단 하나도 없다면 default레이블의 수행문을 처리합니다.
			System.out.println("1 ~ 5 숫자중에서 입력하세요.");
			break;
		
		}
		
		input.close();
	}
}
