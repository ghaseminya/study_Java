
public class Ex01_06 {

	public static void main(String[] args) {
		
		int money_give = 10000;
		int money_moca = 3500;
		int su = 2;
		
		int prise;
		prise = money_moca * su;
		int tax = (int)(prise * 0.1);
		int prise_total=prise + tax;
		int money_back= money_give - prise_total;
		
		System.out.printf("지불한 돈 : %,d \n" , money_give );
		System.out.printf("카페 모카 단가 : %,d \n" , money_moca);
		System.out.printf("수량 : %,d \n" , su);
		System.out.printf("부가세 : %,d \n" , tax);
		System.out.printf("상품 총액 : %,d \n" ,  prise_total );
		System.out.printf("거스름돈 : %,d \n" , money_back);
		
		
		/*System.out.println("지불한 돈 : " + money_give);
		System.out.println("카페 모카 단가 : " + money_moca);
		System.out.println("수량 : " + su);
		System.out.println("부가세 : " + tax );
		System.out.println("상품 총액 : " +  prise_total);
		System.out.println("거스름돈 : " + money_back);*/
	}
}
