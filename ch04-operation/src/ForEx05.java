/*
다중 for문 이용 구구단 짜기
(주의) 무한 루프 
*/

public class ForEx05 {

	public static void main(String[] args) {
		
		for( int dan = 1; dan <10; dan ++){			
			System.out.print(dan + "단:  ");
			for( int i = 1; i<10; i++){
				System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
			}
			System.out.println();
		}
		
		
		//(주의) 무한 루프 
		/*for( int dan = 1; 1 <10; dan ++){			
			System.out.print(dan + "단:  ");
			for( int i = 1; i<10; i++){
				System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
			}
			System.out.println();
		}*/
	}
}
