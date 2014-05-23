/* HashMap - 특징 확인
 * 
 * 데이터 삽입후
 * 데이터 호출 
 * 키를 통해 데이터 호출 
 * 같은 키값으로 데이터 삽입 
 * key값으로 null사용
 * value값으로 null사용
 * 
 * -------------------------------
 * 내부적인 규칙으로 자동 정렬됨
 * key값의 중복은 허용안함
 * 
 * 일괄적으로 데이터 뽑아낸 후 특정값만 가져올 경우 사용
 * 
 * 환경설정시 많이 사용
 */

package com.map;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// 키와 벨류모두 Object 타입로 들어감
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("해리", new Integer(95));
		map.put("헤르미온느", new Integer(100));
		map.put("론", new Integer(85));
		map.put("드레이코", new Integer(93));
		map.put("네빌", new Integer(70));
		map.put("용", new Integer(20));
		
		//키의 중복은 허용하지 않음, 그래서 value값이 변경됨
		map.put("헤르미온느", new Integer(0));		
		
		System.out.println(map);		
		
		//키를 통해 데이터 호출
		Integer num = map.get("헤르미온느");
		System.out.println( "헤르미오느 의 성적은 "  + num);
		
		//key값으로 null사용 
		map.put(null,  new Integer(99));
		
		//key로 널사용 가능, null을 식별자 처럼 이용함
		System.out.println(map);	
		
		//value값으로 null사용 
		map.put("드레곤",  null);
		
		//value값으로 null사용가능
		System.out.println(map);		
	}
}
