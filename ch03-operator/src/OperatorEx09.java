
public class OperatorEx09 {
	
	public static void main(String[] args){
		
		System.out.println("=========���� ������=========");
		int a = 100;
		int b = 3;		
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		
		a += b;
		System.out.println("a +=b : " + a);
		System.out.println("a : " + a);	
		System.out.println("b : " + b);	
		
		a -= b;
		System.out.println("a -=b : " + a);
		
		a *= b;
		System.out.println("a *=b : " + a);
		
		a /= b;
		System.out.println("a /=b : " + a);
		
		a %= b;
		System.out.println("a %=b : " + a);
		System.out.println("");
	}
}
