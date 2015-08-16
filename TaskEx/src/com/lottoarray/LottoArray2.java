/* 로또 프로그램 만들기 - 배열이용 - 방법2
 * 
 * 
 * */

package com.lottoarray;

public class LottoArray2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		// 2) 난수 발생 (1~45)
		//(int)(Math.random()*45) + 1;	//0~44난수 발생		
		
		// 3) 중복을 확인하면서 중복되지 않은 데이터만 배열에 삽입
	
		for(int i = 0; i < lotto.length; i++){	
			lotto[i] = (int)(Math.random()*45) + 1;	//배열에 난수 삽입(6번)
					
	
		   for(int j=0; j< i; j++){			   	
				if( lotto[i] == lotto[j]){
					System.out.println("중복값 발생:\t lott["+i+"]: " + lotto[i]);
					i--; 	//중복되면 i값 증가를 막는다
					break;	//이미 중복값을 확인했기 때문에 반복문 탈출					
				}				
				else{
				}
			}				   
		}		
	
		//출력		
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
		
		/*System.out.print("\nlott 당첨번호: ");
		for(int i =0; i < lotto.length; i++){
			System.out.print(lotto[i] + "  " );
		}*/
	}
}
