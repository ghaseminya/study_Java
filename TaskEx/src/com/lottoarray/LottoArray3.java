/* 정렬하기
 * 
 * java.util.Arrays.sort()
 * 
 * */


package com.lottoarray;

import java.util.Arrays;

public class LottoArray3 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
	
		for(int i = 0; i < lotto.length; i++){	
			lotto[i] = (int)(Math.random()*45) + 1;	
					
	
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
		
		//정렬 전	
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
	
		System.out.println("\n -----------------------");
		//정렬
		Arrays.sort(lotto);
		
		//정렬 후
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
	}
}
