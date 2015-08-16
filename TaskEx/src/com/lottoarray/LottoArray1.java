/* 로또 프로그램 만들기 - 배열이용 - 방법1
 * 
 * 1) 6개의 숫자(배열) 저장
 * 2) 난수 발생 (1~45)
 * 3) 중복을 확인하면서 중복되지 않은 데이터만 배열에 삽입
 *  
 */

package com.lottoarray;

public class LottoArray1 {

	public static void main(String[] args) {
		// 1) 6개의 숫자(배열) 저장
		// 0 1 2 3 4 5 
		int[] lotto = new int[6];
		
		// 2) 난수 발생 (1~45)
		//(int)(Math.random()*45) + 1;	//0~44난수 발생		
		
		// 3) 중복을 확인하면서 중복되지 않은 데이터만 배열에 삽입
	
		for(int i = 0; i < lotto.length; i++){	//배열에 난수 삽입 (6번)
			//lotto[i] = (int)(Math.random()*45) + 1;
			
			int tmp = (int)(Math.random()*10) + 1;
			
			if(i == 0){
			   lotto[i] = tmp;			   
			}
			else{
			   for(int j=0; j< i; j++){				   	
				   	
					if( lotto[j] != tmp){
						lotto[i] = tmp;	
						//System.out.println("lotto[" +j +"]:"+lotto[j]+ "\t"+ "tmp:" +  tmp);
					}				
					else{
						//System.out.println("lotto[" +j +"]:"+lotto[j]+ "\t"+ "tmp:" +  tmp + "같습니다.");
						i--; break;
					}
				}						   
			}
			System.out.println("----------------------------");
		}
		
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
		
		System.out.print("\nlott 당첨번호: ");
		for(int i =0; i < lotto.length; i++){
			System.out.print(lotto[i] + "  " );
		}		
	}
}
