/*
//break label설정
	• 다중 반복문에서 break할 때 모든 반복문을 완전히 빠져나가게 하려면 break label문을 사용합니다.
	• break와 break label출력결과 확인(차이 비교)


break label문
	• break label은 break문과 같지만 다중 반복문에서 한번에 바깥쪽 반복문을 탈출할 때  많이 쓰이는 제어문입니다. 
	• 둘 이상의 반복문을 벗어날 경우 break label을 사용할수 있지만 빈번한 사용은 바람직하지 않습니다.

*/

public class BreakEx02 {
	public static void main(String[] args){
		
// break ----------------------------		
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				
				if(j==3)
					//break 호출
					break;
					
				System.out.println(i + " , " + j);
			}
		}
		
// break label ----------------------		
		System.out.println("=======================");
		
		//다중 반복문에서 break할 때 모든 반복문을 완전히 빠져나가게 하려면 break label문을 사용함.
		exit_for:	//break label설정
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				
				if(j==3)
					break exit_for;	// break label호출 
					
				System.out.println(i + " , " + j);
			}
		}
	}
}
