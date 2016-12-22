/* HashMap - 키값 통해 일괄적으로 데이터 구하기 (Iterator 인터페이스 이용)

 * 키를 구하기 위해  Iterator에서 메소드 호출하여 데이터 구하기
 *
 * 객체생성
 * HashMap에 데이터 저장
 * 
//TODO: 단계별 로 반복자 가져오기(HashMap -> Set / Set -> Iterator) 
//TODO: 한꺼번에  반복자 가져오기(HashMap -> Set -> Iterator)
 * 
 * 
 * -------------------------------------
 * 내부적으로 정렬
 *  * 
 * Iterator 객체 생성후 이 객체에 데이터 저장
 */

package com.map;


import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapEx02 {

	public static void main(String[] args) {
		// 데이터 배열 생성
		String[] msg = {"Seoul", "New York", "London", "Paris", "Berlin", "Tokyo", "Hanoi"};
		
		//HashMap 객체 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//HashMap에 데이터 저장
		for(int i =0; i<msg.length; i++){
			//Map에 key, value 저장
			map.put(i,  msg[i]);
		}
		
		System.out.println(map);
		System.out.println();
		
		
		
		//Iterator 객체 생성후 이 객체의 데이터 출력하기
		//TODO: 단계별 로 반복자 가져오기(HashMap -> Set / Set -> Iterator)
		// 단계별 선언과정 
//		//HashMap -> Set
//		Set<Integer> s = map.keySet();
//		//Set -> Iterator
//		Iterator<Integer> keys = s.iterator();		
		
		//TODO: 한꺼번에  반복자 가져오기(HashMap -> Set -> Iterator)
		// 단계별 선언을 한 단계로 축약 
		//HashMap -> Set -> Iterator
		Iterator<Integer> keys = map.keySet().iterator();		
		
		//반복문을 통해 key값 한꺼번에 가져오기
		while(keys.hasNext()){
			Integer key = keys.next();
			System.out.println(key + ", " + map.get(key));
		}
	}
}
