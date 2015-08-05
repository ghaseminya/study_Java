//증감 연산자
//증감연산자 후행에서는 증가/감소값이 해당 연산 수행문에서는 적용이 되지 않고
//다음 문장 부터 적용이 되게 됩니다. (주의)

public class OperatorEx01 {
	public static void main(String[] args){
		
		System.out.println("=========증가 연산자=========");
		int i1=5;
		int i2=5;
		System.out.println("증가연산자 선행 : " + (++i1) );	//증가연산자 선행 : 6
		System.out.println("i1 : " + i1);	//i1 : 6
				
		System.out.println("증가연산자 후행 : "+ (i2++) );	//증가연산자 후행 : 5
		System.out.println("i2 : " + i2);	//i2 : 6
		
		System.out.println("\n=========감소 연산자=========");
		System.out.println("");
		int j1 = 10;
		int j2 = 10;
		System.out.println("감소연산자 선행 : "+ (--j1) );	//감소연산자 선행 : 9
		System.out.println("j1 : " + j1);	//j1 : 9
		
		System.out.println("감소연산자 후행 : "+ (j2--) );	//감소연산자 후행 : 10
		System.out.println("j2 : " + j2);	//j2 : 9
		
	}
}
