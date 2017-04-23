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


HashMap
	• Hashtable과 거의 동일한 객체
	• Key와 Value를 하나의 쌍으로 저장되는 구조이며 저장되는 Value와 Key에 null을 허용합니다.
	• 하지만 key값의 중복은 허용하지 않으므로 null을 가지는 Key가 2개일 수 없습니다.
	• 내부 hash 값에 따라 키순서가 정해지므로 특정 규칙없이 출력됩니다.(내부적인 규칙으로 자동 정렬)
	• Hashtable과 다른 점은  Key와 Value에 있어 null을 허용한다는 점과 스레드 동기화를 지원하지 않는다는 점입니다.
	• 동기화가 포함되지 않았으므로 나중에 배우는 Multi-Thread환경에서의 구현이 아니라면 Hashtable에 비해서 처리 속도가 빠른 장점을 가지고 있습니다. 
	• 일괄적으로 데이터 뽑아낸 후 특정값만 가져올 경우 사용
	• 환경설정시 많이 사용
	


 */

package com.map;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		//HashMap 객체 생성
		// 키와 벨류 모두 Object 타입로 들어갑니다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//데이터 삽입
		map.put("나오미", new Integer(95));
		map.put("세레나", new Integer(100));
		map.put("린", new Integer(85));
		map.put("낸시", new Integer(93));
		map.put("올리비아", new Integer(70));
		map.put("용", new Integer(20));
		
		//맵안의 전체 내용 확인
		System.out.println(map);
		
		
		//TODO : 키를 통해 데이터 변경
		//키의 중복은 허용하지 않음, 그래서 value값이 변경됨
		map.put("올리비아", new Integer(0));		
		
		//TODO : 키를 통해 데이터 호출
		Integer num = map.get("올리비아");
		System.out.println( "올리비아 의 성적은 "  + num);
		
		//변경 후 맵안의 전체 내용 확인
		System.out.println(map);		
		
		
		
		//TODO : key값으로 null사용 
		map.put(null,  new Integer(99));
		
		//key로 널사용 가능, null을 식별자 처럼 이용함
		System.out.println(map);	
		
		
		
		//TODO : value값으로 null사용 
		map.put("드레곤",  null);
		
		//value값으로 null사용가능
		System.out.println(map);		
	}
}

/*
{린=85, 낸시=93, 나오미=95, 세레나=100, 올리비아=70, 용=20}
올리비아 의 성적은 0
{린=85, 낸시=93, 나오미=95, 세레나=100, 올리비아=0, 용=20}
{린=85, null=99, 낸시=93, 나오미=95, 세레나=100, 올리비아=0, 용=20}
{린=85, null=99, 낸시=93, 나오미=95, 세레나=100, 드레곤=null, 올리비아=0, 용=20}



*/
