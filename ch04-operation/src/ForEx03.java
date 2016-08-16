/*//LAB
//for문 - 1부터 100까지의 누적 합 구하기

[힌트]
5050
1+2+3+4+5+ ..... + 100
total = total+ i

*/

public class ForEx03 {

	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i=1; i<=100; i++){
			
			total += i; //total = total + i;
			
			System.out.println("1부터 " + i + " 까지의 합은 " + total + " 입니다");
		}
	}
}


//1부터 100 까지의 합은 5050 입니다