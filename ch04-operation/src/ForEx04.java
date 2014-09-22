/*
단 입력 받은 후 구구단 출력하기
*/

public class ForEx04 {

	public static void main(String[] args) {
		
		int dan;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("단 입력하세요 > ");
		dan = input.nextInt();
		
		System.out.print("== " + dan + "단 == \n");
		
		for(int i=1; i<10; i++){
			System.out.println(dan + "X" + i + " = " + (dan*i));			
		}
	}
}
