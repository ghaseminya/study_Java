
public class ForEx03 {

	public static void main(String[] args) {
		// for문 - 1부터 100까지의 누적 합 구하기
		
		int total = 0;
		for(int i=1; i<=100; i++){
			total += i;
			System.out.println("1부터 " + i + " 까지의 합은 " + total + " 입니다");
		}
	}
}
