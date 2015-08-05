//while문 - 입력값 누적합구하기 및 0입력시 프로그램 종료하기


public class WhileEx03 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int num = 0;
		int total = 0;
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		System.out.print("누적할 정수를 입력하세요 > ");
		
		while( (num=input.nextInt()) != 0 ){			
			
			total += num;
						
			System.out.println("누적합계 = " + total);
			System.out.print("누적할 데이터를  입력 > ");
			System.out.println();			
		}
		System.out.println("프로그램 종료합니다");
		
		input.close();
	}
}
