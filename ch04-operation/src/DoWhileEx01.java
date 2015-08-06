//do ~ while문, 
//do~while과  while실행결과 차이확인하기


public class DoWhileEx01 {

	public static void main(String[] args) {		
		
		int su = 0;	//초기식
		int nu1, nu2;
		nu1 = nu2 = 1;
		
		String msg = "Java World!";
		
		//do~while문
		System.out.println("===do~ while 실행결과 ===");
		do{
			System.out.println(nu1 + " : " + msg);
			nu1 ++;
		}while(su++ < 5);	//조건식/증감식, 선 연산 후 증가(증가값은 다음 행부터 적용)

		
		//while문
		System.out.println("");
		System.out.println("=== while 실행결과===");
		su = 0;
		while(su++ < 5 ){	//조건식/증감식
			System.out.println(nu2 + " : " + msg);
			nu2++;
		}
/*			
===do~ while 실행결과 ===
1 : Java World!
2 : Java World!
3 : Java World!
4 : Java World!
5 : Java World!
6 : Java World!

=== while 실행결과===
1 : Java World!
2 : Java World!
3 : Java World!
4 : Java World!
5 : Java World!
*/
	}
}
