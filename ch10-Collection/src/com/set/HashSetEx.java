/* HashSet - Iterator인터페이스 이용
 * 
 * 자체 순서로 정렬 확인
 * 중복된 데이터가 제거된것 확인 (중요!!!! 중복값 허용하지 않음)
 * 겉으로 들어난 인덱스가 없음
 * iterator()를 통해 Iterator객체를 생성해서 hasNext()로 출력해 낸다.
 * 
 * 
 * 이터레이터 객체타입 생성한 후
 * 데이터 저장한 다음 
 * 데이터를 읽어와서 출력하기
 */

package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// 객체 생성
		String[] arr = {"자바", "JSP", "Android", "자바", "HTML5", "오라클", "JSP"};
		
		
		//Set인터페이스구현클래스인 HashSet클래스 생성
		HashSet<String> hs1 = new HashSet<String>();
		
		for(String n : arr){
			hs1.add(n);
		}
		System.out.println(hs1);
		
		// 이터레이터타입의 객체 생성 및 데이터 삽입
		Iterator<String> itr = hs1.iterator();
		
		while(itr.hasNext()){
			//데이터를 읽어와서 출력
			System.out.println(itr.next());
		}
	}

}
