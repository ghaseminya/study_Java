
public class Ex02_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" for 1================");
		for(int i = 1; i < 10; i++)
			System.out.printf("%5d", i);
		System.out.println();	
		
		
		System.out.println(" while 1 ================");
		int ii=1;
		while(ii<10){
			System.out.printf("%5d", ii);
			ii++;
		}
		
		System.out.println();System.out.println();
		System.out.println(" for 2================");
		for(int iii = 10; iii >= 0; iii -= 3)
			System.out.printf("%5d", iii);
		System.out.println();
		
		
		System.out.println(" while 2 ================");
		int iiii=10;
		while(iiii >=0){
			System.out.printf("%5d", iiii);
			iiii -= 3;			
		}
	}
}
