/*
증감 연산자
*/
public class OperatorEx01 {
	public static void main(String[] args){
		
		System.out.println("=========증가 연산자=========");
		int i1=5;
		int i2=5;
		System.out.println("증가연산자 선행 : " + (++i1) );
		System.out.println("i1 : " + i1);
				
		System.out.println("증가연산자 후행 : "+ (i2++) );
		System.out.println("i2 : " + i2);
		
		System.out.println("\n=========감소 연산자=========");
		System.out.println("");
		int j1 = 10;
		int j2 = 10;
		System.out.println("감소연산자 선행 : "+ (--j1) );
		System.out.println("j1 : " + j1);
		
		System.out.println("감소연산자 후행 : "+ (j2--) );
		System.out.println("j2 : " + j2);
	}
}
