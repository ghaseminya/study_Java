
public class WhileEx01 {

	public static void main(String[] args) {
		// while문 - 후행/선행
		
		int i = 10;	//초기식
		
		//후행
		while( i >= 0){	//조건식
			System.out.println(i--);	//증감식			
		}		
		System.out.println("후행 후  i : " + i);
		
		
		//선행
		int j = 10;		
		while( j >= 0){	//조건식
			System.out.println(--j);	//증감식			
		}		
		System.out.println("선행 후  j : " + j);
	}

}
