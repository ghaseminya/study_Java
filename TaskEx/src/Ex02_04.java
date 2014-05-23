
public class Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//변수 선언 및 초기화
		int i, j, result;		
		i = j = result = 0;
		
		String oprt ="?";
		
		//정수 1 입력
		System.out.print("사칙연산을 수행합니다 >>>");
		System.out.print("정수 1 입력하세요 > ");
		do{
			i = input.nextInt();
					
		}while( i <0 || i>100);
		
		// 연산자 입력
		System.out.print("연사자를 입력하세요 > ");
		do{
			oprt = input.next();
			System.out.println("1");
					
		}while( oprt != "+" || oprt != "-" || oprt != "*" || oprt != "/");
		
		System.out.println("2");
		
		
		//정수 2 입력
		System.out.print("정수 2 입력하세요 > ");
		do{
			i = input.nextInt();
			
			if( oprt =="/" && i == 0){
				System.out.print("0으로 나눌 수 없습니다");			
			}			
		}while( i <0 || i>100);
		
		
		switch(oprt){
			case "+":{
				result = i + j;
				break;			
			}
			case "-":{
				result = i - j;
				break;			
			}
			case "*":{
				result = i * j;
				break;			
			}
			case "/":{
				result = i / j;
				break;			
			}
		}
		
		System.out.println(i + oprt + j + "=" + result);				
		
		
	}
}
