/* Stack
String 객체 생성
객체의 요소를 스택에 넣기
스택의 마지막요소가 먼저 pop되면서 꺼지는 것 확인

//---------------


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


//---------------
스택과 큐의 데이터 추가후 데이터를 꺼낸 결과 비교하기 
스택에 "10", "20", "30"을 순서대로 넣고 꺼낸 결과입니다.
스택은 먼저 넣은 것이 나중에 꺼내지는 LIFO구조이기 때문에 데이터를 넣을 때의 순서와 반대로 데이터가 꺼내진것을 확인할 수 있습니다.

StackEx01.java vs QueueEx01.java
 */

package com.stack;

import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		Stack st = new Stack();
		
		st.push("10");
		st.push("20");
		st.push("30");

		System.out.println("Stack >>>");
		while(!st.empty()) {
			System.out.println(st.pop());
		}

	}
	
}

