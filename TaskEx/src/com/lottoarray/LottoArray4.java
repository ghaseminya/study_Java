//로또 프로그램 만들기 - HashSet 이용
//중복제거 및 정렬 한꺼번에 수행하기

package com.lottoarray;

import java.util.HashSet;
import java.util.Iterator;

public class LottoArray4 {

	public static void main(String[] args) {
				
		HashSet<Integer> hs = new HashSet<Integer>();	
		
		for(int i=0; i<6; i++)
		{	
			//HashSet에 난수 삽입
			if( hs.add(  (int)(Math.random()*10+1) ) ){
					
			}
			else{
				i--;
//				System.out.println("중복");
			}
		}		
		
		Iterator<Integer> itr = hs.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());			
		}
	}
}