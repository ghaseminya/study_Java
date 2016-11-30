//while문 - 1부터 100까지의 누적 합 구하기


public class WhileEx02 {

	public static void main(String[] args) {
		
		int sum, su;
		sum = su = 0;		//초기식
		
		while(su <= 100){	//조건식
			
			sum += su;
			su++;			//증감식
		}
		System.out.println("1~100까지의 합 : " + sum); //1~100까지의 합 : 5050
		
	}
}
