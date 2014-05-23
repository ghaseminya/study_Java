
public class BreakEx02 {
	public static void main(String[] args){
		
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				
				if(j==3)
					//break가 포함된 
					break;
					
				System.out.println(i + " , " + j);
			}
				
		}
		
		
		System.out.println("=======================");
//		다중 반복문에서 break할 때 모든 반복문을 완전히 빠져나가게 하려면 break label문을 사용함.
		
		exit_for:	//break label설정
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				
				if(j==3)
					//break가 포함된 
					break exit_for;	// break label호출 
				
					
				System.out.println(i + " , " + j);
			}
				
		}
	}

}
