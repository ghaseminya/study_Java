/* Hashtab - Enumeration인터페이스 이용
 * 
 * 
 * 
 */

package com.map;

import java.util.Hashtable;
import java.util.Enumeration;


public class HashtableEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, Object> ht = new Hashtable<String, Object>();
		ht.put("name", "홍길동");
		ht.put("age", "27");
		ht.put("phone", "010-1234-5678");
		ht.put("address", "서울시");
		
		Enumeration<String> en = ht.keys();
		
		while(en.hasMoreElements()){
			String key = en.nextElement();
			System.out.println(key + "," + ht.get(key));
		}
		
		
	}

}
