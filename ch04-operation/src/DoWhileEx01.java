
public class DoWhileEx01 {

	public static void main(String[] args) {		
		//do ~ while��, do~while�� while������ ����Ȯ���ϱ�
		int su = 0;
		int nu1, nu2;
		nu1 = nu2 = 1;
		
		String msg = "Java World!";
		
		System.out.println("===do~ while ������ ===");
		do{
			
			System.out.println(nu1 + " : " + msg);
			nu1 ++;
		}while(su++ < 5);
		
		
		System.out.println("");
		System.out.println("=== while ������===");		
		su = 0;
		while(su++ < 5 ){
			System.out.println(msg);
		}
	}
}
