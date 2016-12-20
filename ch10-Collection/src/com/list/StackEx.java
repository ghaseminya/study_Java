/* Stack
 * 
 * push()
 * pop()
 *  
 * String 객체 생성
 * 객체의 요소를 스택에 넣기
 * 스택의 마지막요소가 먼저 pop되면서 꺼지는 것 확인
 * 
 * ---------------
 * 후입선출 확인
 * 세워져 있는 파이프와 같음
 */

package com.list;

import java.util.Stack;

import javax.print.DocFlavor.STRING;

public class StackEx {

	public static void main(String[] args) {
		String[] arr = {"서울","대전","대구","부산","찍고","광주", "인천"};
		
		//String데이터를 Stack에 넣기
		Stack<String> stk = new Stack<String>();
		
		for(int i =0; i< arr.length; i++){
			stk.push(arr[i]);
		}
		System.out.println(stk);
		
		System.out.println("===================================");
		//현재 Stack이 비어있는지 확인
		while(!stk.isEmpty()){
			//현재 Stack에 저장된 객체를 꺼내 옴
			System.out.println(stk.pop());
		}
		
		//현재 Stack에 객체가 저장되어 있는지 확인
		System.out.println(stk);
	}
}
