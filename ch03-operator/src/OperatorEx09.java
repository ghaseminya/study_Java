
//대입연산자, 복합대입 연산자

public class OperatorEx09 {
	
	public static void main(String[] args){
		
		System.out.println("=======대입 연산자=========");
		int a = 100;
		int b = 3;		
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		
		
		System.out.println("\n=======복합대입 연산자======");
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
