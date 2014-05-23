
public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" for 1================");
		int i = 10;
		while(i >= 0){
			System.out.printf("%5d", i);
			i--;
		}
		System.out.println();
		
		
		System.out.println(" while 1 ================");
		for(i = 10; i>=0; i--){
			System.out.printf("%5d", i);			
		}
		System.out.println();

		System.out.println();
		System.out.println(" for 2================");
		int j = 0;
		while(j <= 10){
			if(j % 5 == 0)
				System.out.printf("%5d", j);
			j += 3;
		}
		System.out.println();
		/*	036911
			0314*/
				
		System.out.println(" while 2 ================");
		for(int jj=0; jj<=10; jj+=3){
			
			if(jj % 5 == 0)
				System.out.printf("%5d", jj);			
		}
	}
}
