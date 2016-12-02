//switch()문을 이용하여 사칙 연산 계산기 프로그램
//JDK ver7.0부터  switch()문에 인자값으로 문자열 전달 가능


public class LAB03 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int first =0, second=0, total=0;
		String operator;
		
		System.out.print("첫번째 숫자를 입력하세요 > ");
		first = input.nextInt();
		
		
		System.out.print("두번째 숫자를 입력하세요 > ");
		second = input.nextInt();
		
		//next(): 문자 또는 문자열을 공백을 기준으로 한단어 또는 한문자를 입력 받습니다
		//버퍼에 입력된 문자나 문자열에서 공백전까지의 단어 가져오기

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
				System.exit(0);	//프로그램 종료
			}
		}
		
		System.out.println();//한줄 줄 바꿈
		System.out.print(first + operator + second + " = " + total);
		
		input.close();

	}
}
