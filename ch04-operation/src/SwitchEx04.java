
public class SwitchEx04 {

	public static void main(String[] args) {
		// JDK ver7.0����  switch()���� ���ڰ����� ���ڿ� ���� ����
		// switch()���� �̿��Ͽ� ���� ���� ����
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int first =0, second=0, total=0;
		String operator;
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� > ");
		first = input.nextInt();
		
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� > ");
		second = input.nextInt();
		
		System.out.print("������ �����ڴ�( + - * / %) > ");
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
				System.out.print("�߸��� �����ڸ� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");			
				System.exit(0);
			}
		}
		
		System.out.println();//���� �� �ٲ�
		System.out.print(first + operator + second + " = " + total);

	}
}
