/* //LAB
//break문 - 특정 조건일 때 반복문 탈출하기


제한사항
	• 0입력 전까지 입력받은 정수로 누적 합 구하기
	• 무한루프 , break활용

*/	
	
public class BreakEx03 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a =0; //반복할 변수
		int total = 0; //누적합계
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		
		while(true){ //무한루프
			
			System.out.print("누적할 정수 값을 입력하세요 > ");
			a = input.nextInt();
			
			//특정 조건일때 반복문 탈출
			if( a ==0){
				break;
			}else{
				total += a;
			}			
		}
		
		System.out.print("total = " + total);
		
		input.close();
	}
}
