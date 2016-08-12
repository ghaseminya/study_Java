//while문 - 입력값 누적합구하기 및 0입력시 프로그램 종료하기

//제한사항
//WhileEx03.java를 break;구문을 사용하여 동일한 결과가 나오도록 완성하기


public class BreakEx05 {
	public static void main(String[]args){

		java.util.Scanner input = new java.util.Scanner(System.in);

		int i=0;
		int sum=0;

		while(true){

			System.out.println("정수형 숫자를 입력하세요 > ");
			i = input.nextInt();
			sum += i;

			System.out.println("누적 합:"+sum);

			if(i == 0){
				System.out.println("지뢰!");
				break;
			}
		}

		System.out.println("프로그램 종료됨.");
		
		input.close();
	}
}


//출력결과
//정수형 숫자를 입력하세요 > 
//7
//누적 합:7
//정수형 숫자를 입력하세요 > 
//10
//누적 합:17
//정수형 숫자를 입력하세요 > 
//4
//누적 합:21
//정수형 숫자를 입력하세요 > 
//0
//누적 합:21
//지뢰!
//프로그램 종료됨.