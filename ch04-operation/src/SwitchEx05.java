/*
switch~case문과 switch~case~ default레이블 유무 따른 출력결과 확인
*/
public class SwitchEx05 {

	public static void main(String[] args) {

		int n=3;
//		int n=7;
//		int n=10;
		
		switch(n)
		{
		case 1:
			System.out.println("First");
		case 2:
			System.out.println("Second");
		case 3:
			System.out.println("Thrid");
		case 4:
			System.out.println("Fourth");
		case 5:
			System.out.println("Fifth");
		case 6:
			System.out.println("Sixth");
		case 7:
			System.out.println("seventh");
			
		/*default:
			System.out.println("Ordinal Number");
			*/		
		}
		
		System.out.println("I love JAVA!");
	}

}
