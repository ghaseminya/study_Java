/* Lotto 프로그램 - ArrayList 
 * 
 * contains메소드를 이용해서 중복체크
 * Colloections.sort 메소드를 이용해서 정렬
 * 
 */

package com.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListLotto {

	public static void main(String[] args) {
		
		//ArrayList 객체 생성
		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();		
		
		//객체 생성 및 초기화
		Integer it = null;
		
		
		//조건 체크		
		while(list.size() < 6){
			it = new  Integer(random.nextInt(45)+1);	// 1~45
			//contains메소드를 이용해서 중복체크
			if(!list.contains(it)){
				list.add(it);
			}
		}
		
		//Colloections.sort 메소드를 이용해서 정렬
		Collections.sort(list);;
		
		//출력
		for(Integer i : list){
			System.out.println(i+ "\t");
		}
	}
}