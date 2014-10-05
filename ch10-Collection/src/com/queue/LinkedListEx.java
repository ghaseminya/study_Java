/* LinkedList
 *   
 * 
 * -------------------------
 * Queue구조 (FIFO확인)
 * '도로'에서 '차'가 움직인는 것과 같음
 * 
 */

package com.queue;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"장비","나팔꽃","무궁화","백합","목련","개나리", "할미꽃"};
		
		//Queue 생성
		LinkedList<String> stk = new LinkedList<String>();
		
		//Queue에 arr의 데이터 삽입
		for(int i=0; i<arr.length; i++){
			stk.offer(arr[i]);
		}
		System.out.println(stk);

		//데이터 뽑아내기		
		while(stk.peek()!= null){	//peek() 데이터 있는지만 검사
			System.out.println(stk.poll());	//데이터 빼내고 해당 데이터는 삭제
		}
		
		System.out.println("=====================");
		System.out.println(stk);
	}
}