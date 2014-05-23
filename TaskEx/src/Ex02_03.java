
public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		java.util.Scanner input= new java.util.Scanner(System.in);
		
		int[] num = new int[3];		
		
		for(int i=0; i<3; i++){		
			
			do{
				System.out.print( (i+1) +" 번째 정수를 입력하세요 > ");
				num[i] = input.nextInt();				
			}while( i< 0 || i > 100);					
		}
		
		
		int min = num[0];
		
		System.out.print( "수 : \t");
		for(int j=0; j < num.length; j++){
			if( num[j] < min){
				min = num[j];
			}			
			System.out.print( num[j] + "\t");			
		}
		System.out.println();
		System.out.println( "세 개의 정수 중에서 가장 작은 값 : " + min);
	}
}
