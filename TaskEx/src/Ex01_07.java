
public class Ex01_07 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		int a;
		
		System.out.print("변수를 입력하세요 > ");
		a = input.nextInt();
		
		if( a%2 == 1 ){
			System.out.println("a는 홀수 입니다.");
		}else{
			System.out.println("a는 짝수 입니다.");
		}
	}
}
