
public class Ex03_01 {
	
	
	String product;
	int unitPrise;
	int su;
	
	
	public void getSale(){
		
		System.out.print("상품명 입력 : " + product);
		System.out.println();
		
		System.out.printf("단가 입력 : %,d", unitPrise);
		System.out.println();
						
		System.out.printf("판매수량 : %,d", su);
		System.out.println();
		
		//할인률 15%적용한 값
		int tmp = (int)(unitPrise*su*0.85);
		
		System.out.printf( product + su + "대의 가격은  %,d", tmp );
		//System.out.print( product + su + "대의 가격은  " + tmp );
		
		System.out.println();
		
	
		
		return ;
	}

	public static void main(String[] args) {
/*		문제: 
			A전자 대리점에서는 그날 물건 판매액의 15%를 할인해 주기로 했습니다.
			판매한 상품명과 상품의 단가와 수량을 키보드로 입력받아 
			받을 금액을 출력시키는 프로그램 작성.
			(단. 출력시에는 소수이하는 절삭)
		출려예시:
			상품명 입력:			냉장고
			딘기 입력:				500000
			판매 수량:				3
			냉장고 3대의 가격은:	1,275,000원*/
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int[] num = new int[2];
		
		Ex03_01 ex = new Ex03_01();
		System.out.print("상품명 입력 >");
		ex.product = input.next();
//		System.out.println();
		
		System.out.print("단간 입력 >");
		ex.unitPrise = input.nextInt();
//		System.out.println();
		
		System.out.print("판매수량 입력 >");
		ex.su = input.nextInt();
		
		ex.getSale();
		
		
	}
}
