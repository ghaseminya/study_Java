/* Stack
String 객체 생성
객체의 요소를 스택에 넣기
스택의 마지막요소가 먼저 pop되면서 꺼지는 것 확인

---------------


Stack
	• Stack은 객체를 후입선출(後入先出), last-in-first-out(LIFO) 합니다.
	• 객체의 저장시 push()메서드와 검출 시 사용하는 pop()과 Stack의 가장 위쪽 객체를 의미하는 peek()메서드 
	그리고 Stack이 비어있는지 판별해주는 empty()와 객체를 검색해주는 search()메서드들로 Vector라는 클래스를 확장 클래스입니다. 
	• Stack은 List구조이지만 입구가 하나라서 제일 먼저  넣은 물건(객체)이 가장 아래에  위치하므로 꺼낼 때는 가장 나중에 나오게 됩니다. (여행을 갈 때 가방에 짐을 싸는 구조와 비슷)



메소드명		설명

empty( )	Stack이 비었는지 비교하여 비어 있으면 true를 반환

peek( )		Stack의 가장 위쪽에 있는 객체를 반환

pop( )		Stack의 가장 위쪽에 있는 객체를 삭제하고 그 객체를 반환

push(E item)	Stack의 가장 위쪽에서 객체를 추가

search(Object o)	현재 Stack의 구조에서 인자로 전달받은 객체의 인덱스값을 반환
					(인덱스값은 1부터 시작)


 */

package com.stack;

import java.util.Stack;

import javax.print.DocFlavor.STRING;

public class StackEx01 {

	public static void main(String[] args) {
		//String 배열 생성
		String[] arr = {"서울","대전","대구","부산","찍고","광주","인천"};
		
		//String을 저장하는 Stack객체 생성
		Stack<String> stk = new Stack<String>();
		
		//객체의 요소를 스택에 넣기
		for(int i =0; i< arr.length; i++){
			//push()메소드를 이용하여 String데이터를 Stack에 넣기
			stk.push(arr[i]);
		}
		
		//Stack객체안의 내용 출력
		System.out.println(stk);
		
		System.out.println("===================================");
		
		while(!stk.isEmpty()){
			//현재 Stack에 저장된 객체를 꺼내 옴
			//스택의 마지막요소가 먼저 pop되면서 꺼지는 것 확인
			System.out.println(stk.pop()); //후입선출 확인, 세워져 있는 파이프와 같음
		}
		
		//현재 Stack이 비어있는지 확인
		//현재 Stack에 객체가 저장되어 있는지 확인
		System.out.println(stk);
	}
}


/*
[서울, 대전, 대구, 부산, 찍고, 광주, 인천]
===================================
인천
광주
찍고
부산
대구
대전
서울
[]

*/
