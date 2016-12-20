/* Lotto 프로그램 - HashSet
 * 
 * 
 * 정렬하기
 */

package com.set;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class HashSetLotto {

	public static void main(String[] args) {
		// HashSet 객체 생성
		// HashSet <Integer> hs = new HashSet<Integer>();
		
		Set <Integer> set = new HashSet<Integer>();
		//초기에 Set타입으로 객체생성하여 데이터를 삽입함		
		
		while(set.size() < 6){
			// 1~45난수 발생
			//hs.add( (int)(Math.random()*45+1) );
			int num = (int)(Math.random()*45+1);
			set.add(new Integer(num));		
		}		
		System.out.println(set);		
		
		//정렬하기
		//Collections.sort(hs);	//ERROR: The method sort(List<T>) in the type Collections is not applicable for the arguments (HashSet<Integer>)
		//Collections.sort는 리스트타입이여서 set타입을 리스트 타입으로 반들어줘야 합니다.
				
		//Set -> Collection -> List
		//Set은 정렬을 못하므로 List타입으로 변환
		List<Integer> list = new ArrayList<Integer>(set);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("\n" + list);
	}
}
