/* 로또 프로그램 만들기 - HashSet 이용 (방법1)
 * 
 */

package com.lottoarray;

import java.util.HashSet;
import java.util.Iterator;

public class LottoArray4 {

	public static void main(String[] args) {
				
		HashSet<Integer> hs = new HashSet<Integer>();	
		
		for(int i=0; i<6; i++)
		{	
			if( hs.add(  (int)(Math.random()*10+1) ) ){
					
			}
			else{
				i--;
				//System.out.println("중복");
			}
		}		
		
		Iterator<Integer> itr = hs.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());			
		}
	}
}