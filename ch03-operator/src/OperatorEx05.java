
public class OperatorEx05 {
	
	public static void main(String[] args){
		System.out.println("=========����/��/�� ������=========");
		
		
		System.out.println("�� ��:");
		int a, b;
		a = b = 10;
		boolean c = (a++ >= ++b) && (++a > b++);
		System.out.println("a++ >= ++b && ++a : " + c);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		System.out.println("");
		System.out.println("�� ��:");
		int d, e;
		d = e = 10;
		
		boolean f = ++d > e++ || d++ >= ++e;
		System.out.println("++d > e++ || d++ >= ++e : " + f);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		
	}
}
