
public class OperatorEx02 {
	
	public static void main(String[] args){
		
		System.out.println("=========비교(관계) 연산자=========");
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a < b;
		System.out.println("a < b: " +result );
		
		result = a > b;
		System.out.println("a > b: " +result );
		
		result = a <= b;
		System.out.println("a =< b: " + result);
		
		result = a >= b;
		System.out.println("a >= b: " + result);
		
		result = a == b;
		System.out.println("a == b: " + result);
		
		result = a != b;
		System.out.println("a != b: " + result);
		
	}
}
