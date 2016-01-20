



public class ContinueEx02_1 {
	public static void main(String[] args){
		java.util.Scanner input= new java.util.Scanner (System.in);
		int i= 1;
		int sum = 0;
		System.out.println("더할 숫자를 입력해 주세요");

		while(i>0){
			i = input.nextInt();
			sum=sum+i;
			System.out.println("누적합계 : " + sum);
		}
		System.out.println("반복을 종료합니다");
	}
}
