
public class SwitchEx04 {

	public static void main(String[] args) {
		// JDK ver7.0부터  switch()문에 인자값으로 문자열 전달 가능
		// switch()문을 이용하여 사직 연산 수행
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int first =0, second=0, total=0;
		String operator;
		
		System.out.print("첫번째 숫자를 입력하세요 > ");
		first = input.nextInt();
		
		
		System.out.print("두번째 숫자를 입력하세요 > ");
		second = input.nextInt();
		
		System.out.print("수행할 연산자는( + - * / %) > ");
		operator = input.next();
		
		switch(operator){
			case "+":{
				total = first + second;			
				break;
			}
			case "-":{
				total = first - second;			
				break;
			}
			case "*":{
				total = first * second;			
				break;
			}
				
			case "/":{
				total = first / second;			
				break;
			}
			case "%":{
				total = first % second;			
				break;
			
			}
			default:{
				System.out.print("잘못된 연산자를 입력하였습니다. 프로그램을 종료합니다.");			
				System.exit(0);
			}
		}
		
		System.out.println();//한줄 줄 바꿈
		System.out.print(first + operator + second + " = " + total);

	}
}
