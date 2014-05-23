/* HashTable 
 * 
 * -------------------------------------------
 * key, value에 null허용 안함 (run time시 에러)
 * 데이터 삽입시 null체크 해야 함
 * 
 * */

package com.set;

import java.util.Hashtable;

public class HashTableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Double> ht = new Hashtable<String, Double>();
		
		
		ht.put("이순신", new Double(173.2));
		ht.put("강감찬", new Double(181.8));
		ht.put("유관순", new Double(192));
		ht.put("광계토", new Double(165.9));
		
		System.out.println(ht);
		
		Double keynum = ht.get("유관순");
		System.out.println("유관순의 키는 " + keynum);
		
		
		//키의 중복을 허용하지 않음
		ht.put("유관순", new Double(111));
		keynum = ht.get("유관순");
		System.out.println("유관순의 키는 " + keynum);
		
		//key로 null 사용 불가 (컴파일시에는 오류가 나지 않지만 실행시 오류남)
		//ht.put(null, new Double(222));	//ERROR: java.lang.NullPointerException

		//value로 null 사용 불가 (컴파일시에는 오류가 나지 않지만 런타임시 오류남)
		//ht.put("오호라", null);	//ERROR:	//ERROR: java.lang.NullPointerException

	}

}
