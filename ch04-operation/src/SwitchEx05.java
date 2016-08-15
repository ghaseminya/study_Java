//switch~case문과 switch~case~ default레이블 유무 따른 출력결과 확인
//break; 문이 없을 때의 결과 확인
//default레이블 유무에 따른 결과 확인


public class SwitchEx05 {

	public static void main(String[] args) {

		int n=3;
//		int n=7;
//		int n=10;
		
		switch(n){
		case 1:
			System.out.println("First");
			//TODO : break; 문이 없을 때의 결과 확인
//			break;
		case 2:
			System.out.println("Second");
//			break;
		case 3:
			System.out.println("Thrid");
//			break;
		case 4:
			System.out.println("Fourth");
//			break;
		case 5:
			System.out.println("Fifth");
//			break;
		case 6:
			System.out.println("Sixth");
//			break;
		case 7:
			System.out.println("seventh");
//			break;
		
		//TODO : default레이블 유무에 따른 결과 확인
//		default:
//			System.out.println("Ordinal Number"); //서수
					
		}
		
		System.out.println("I love JAVA!");
	}
}
