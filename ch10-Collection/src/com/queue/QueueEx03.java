package com.queue;

import java.util.LinkedList;

public class QueueEx03 {

	public static void main(String[] args) {
		String[] item = {"소나타","렉스톤","제규어"};
		LinkedList<String> q = new LinkedList<String>();
		
		//큐에 데이터 추가
		for(String n : item)
		  q.offer(n); //요소 추가
		System.out.println("q의 크기 : "+q.size());
		
		
		String data="";
		//큐에 데이터 추출하기
		while((data = q.poll()) != null)
			System.out.println(data+"삭제!");
		System.out.println("q의 크기 : "+q.size());
	}

}
