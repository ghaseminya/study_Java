//정렬하기
//	• 난수 추출하여 배열에 저장하기
//	• 배열에 저장된 난수를 정렬하기
//	• java.util.Arrays.sort()

package com.lottoarray;

import java.util.Arrays;

public class LottoArray3 {

	public static void main(String[] args) {
		int[] lotto = new int[6];

		for(int i = 0; i < lotto.length; i++){	
			lotto[i] = (int)(Math.random()*45) + 1;	//배열에 난수 삽입


			//중복을 확인하면서 중복되지 않은 데이터만 배열에 삽입
			for(int j=0; j< i; j++){			   	
				if( lotto[i] == lotto[j]){
					System.out.println("중복값 발생 -> lott["+i+"]: " + lotto[i]);
					i--; 	//중복되면 i값 증가를 막는다
					break;	//이미 중복값을 확인했기 때문에 반복문 탈출					
				}				
				else{
				}
			}				   
		}		

		//정렬 전	출력
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}

		System.out.println("-----------------------");
		//정렬
		Arrays.sort(lotto);

		//정렬 후 출력
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
	}
}

/*//출력결과
중복값 발생 -> lott[5]: 22
lott[0]: 7
lott[1]: 21
lott[2]: 20
lott[3]: 45
lott[4]: 22
lott[5]: 12
-----------------------
lott[0]: 7
lott[1]: 12
lott[2]: 20
lott[3]: 21
lott[4]: 22
lott[5]: 45
*/