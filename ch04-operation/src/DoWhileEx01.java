/*
do ~ while문, 
do~while과 while실행결과 차이확인하기
*/
public class DoWhileEx01 {

	public static void main(String[] args) {		
		
		int su = 0;
		int nu1, nu2;
		nu1 = nu2 = 1;
		
		String msg = "Java World!";
		
		//do~while문
		System.out.println("===do~ while 실행결과 ===");
		do{
			
			System.out.println(nu1 + " : " + msg);
			nu1 ++;
		}while(su++ < 5);
		
		//while문
		System.out.println("");
		System.out.println("=== while 실행결과===");		
		su = 0;
		while(su++ < 5 ){
			System.out.println(msg);
		}
	}
}
