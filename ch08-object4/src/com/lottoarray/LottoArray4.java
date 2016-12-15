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
			//HashSet에 난수 삽입하기
			//난수 발생 (1~45)
			//0~44난수 발생하므로 +1
			if( hs.add( (int)(Math.random()*45+1) ) ){
//			if( hs.add(  (int)(Math.random()*10+1) ) ){ //난수 발생 (1~10)
					
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