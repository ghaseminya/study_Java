package com.queue;

/*
큐(Queue) 자료 구조 생성하기

//---------------
스택과 큐의 데이터 추가후 데이터를 꺼낸 결과 비교하기 
큐에 "10", "20", "30"을 순서대로 넣고 꺼낸 결과입니다.
큐는 먼저 넣은 것이 먼저 꺼내지는 FIFO구조이기 때문에 데이터을 넣을 때와 같은 순서로 데이터가 꺼내집니다.

StackEx01.java vs QueueEx01.java

*/
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {

		// Queue인터페이스의 구현체인 LinkedList를 사용
		Queue q = new LinkedList(); 

		q.offer("10");
		q.offer("20");
		q.offer("30");

		System.out.println("Queue >>>");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
