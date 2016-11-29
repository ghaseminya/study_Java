//증감/비교/논리 연산자

public class OperatorEx05 {
	
	public static void main(String[] args){
		System.out.println("=========증감/비교/논리 연산자=========");
		
		System.out.println("논리 곱:");
		int a, b;
		a = b = 10;
		boolean c = (a++ >= ++b) && (++a > b++);
//					 10  >= 11   &&  11  > 10 => false && true
		System.out.println("a++ >= ++b && ++a > b++ : " + c); //a++ >= ++b && ++a : false
		System.out.println("a : " + a);	//a : 11
		System.out.println("b : " + b);	//b : 11
		
		
		System.out.println("");
		System.out.println("논리 합:");
		int d, e;
		d = e = 10;
		
		boolean f = ++d > e++ || d++ >= ++e;
//					11  > 10  || 10  >= 11 -> true || false
		System.out.println("++d > e++ || d++ >= ++e : " + f); //++d > e++ || d++ >= ++e : true
		System.out.println("d : " + d);	//d : 11
		System.out.println("e : " + e);	//e : 11
		
	}
}
