/*
증감 연산자
*/
public class OperatorEx15 {

	public static void main(String[] args) {

		int n1=7;
		int result1=0;
		result1 = ++n1;
		System.out.println("++n : " + result1);
		
		
		int n2=7;
		int result2 =0;
		result2= --n2;
		System.out.println("--n : " + result2);
		
		
		int n3=7;
		int result3 =0;
		result3= n3++;
		System.out.println("n++ : " + result3);
		
		
		int n4=7;
		int result4 =0;
		result4= n4--;
		System.out.println("n-- : " + result3);
		//증감연산자 후행에서는 증가/감소값이 해당 연산 수행문에서는 적용이 되지 않고
		//다음 문장 부터 적용이 되게 됩니다.
		
	}
}
