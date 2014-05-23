
public class Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=1;
		
		for( int i= 1; i <= 10; i++){
			
			if( i%2 == 0){
				result *= i;
			}			
		}
		System.out.println("1ºÎÅÍ 10±îÁöÀÇ Â¦¼öÀÇ °ö : " + result);
	}
}
