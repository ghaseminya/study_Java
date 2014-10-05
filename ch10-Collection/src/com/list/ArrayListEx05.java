/* ArrayList - 제네릭표현으로 객체 생성
 * 
 * Integer형 ArrayList객체 생성
 * add()메소드 통한 데이터 삽입
 *   
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(new Integer(10));	//명시적으로 boxing
		al.add(20);		//int -> Integer (Auto boxing)
		al.add(30);		//int -> Integer (Auto boxing)
		//Auto Boxing과 Auto Unboxing의 도움으로 정수 단위의 데이터 입출력이 매우 자연스럽게 이뤄질 수 있습니다.

		
		//확장 for문
		for(Integer num : al){
			System.out.println(num);
		}
	}
}