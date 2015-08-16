//로또 프로그램 만들기 - 배열이용 - 방법2


package com.lottoarray;

public class LottoArray2 {

	public static void main(String[] args) {
		// 1) 배열 생성
		int[] lotto = new int[6];
		
		// 2) 난수 발생 (1~45)
		//(int)(Math.random()*45) + 1;	//0~44난수 발생하므로 +1		
		
		// 3) 중복을 확인하면서 중복되지 않은 데이터만 배열에 삽입
		for(int i = 0; i < lotto.length; i++){	
			lotto[i] = (int)(Math.random()*45) + 1;	//배열에 난수 삽입(6번)
					
		   for(int j=0; j< i; j++){			   	
				if( lotto[i] == lotto[j]){ //중복인 경우
					System.out.println("중복값 발생 -> lotto["+i+"]: " + lotto[i]);
					i--; 	//중복되면 i값 증가를 막는다
					break;	//반복문 탈출					
				}				
				else{ //중복이 아닌 경우
				}
			}				   
		}		
	
		//출력		
		for(int i =0; i < lotto.length; i++){
			System.out.println("lotto["+i+"]: " + lotto[i]);
		}
		
		System.out.println("\nlotto 당첨번호: ");
		for(int i =0; i < lotto.length; i++){
			System.out.print(lotto[i] + "  " );
		}
	}
}


/*//출력결과
중복값 발생 -> lotto[5]: 9
lotto[0]: 37
lotto[1]: 9
lotto[2]: 26
lotto[3]: 3
lotto[4]: 19
lotto[5]: 34

lotto 당첨번호: 
37  9  26  3  19  34 
*/
