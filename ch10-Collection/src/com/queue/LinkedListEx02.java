package com.queue;

import java.util.LinkedList;

public class LinkedListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] item = {"소나타","렉스톤","제규어"};
		LinkedList<String> q = new LinkedList<String>();
		for(String n : item)
		  q.offer(n); //요소 추가
		System.out.println("q의 크기:"+q.size());
		String data="";
		while((data = q.poll()) != null)
			System.out.println(data+"삭제!");
		System.out.println("q의 크기:"+q.size());
	}

}
