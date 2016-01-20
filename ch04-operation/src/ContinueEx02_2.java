
public class ContinueEx02_2 {
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
				System.out.print("지뢰!");
				break;
			}
		}

		System.out.println("프로그램 종료됨.");
		input.close();
	}
}
