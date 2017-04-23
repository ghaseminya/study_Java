package com.stack;

import java.util.Stack;

public class StackEx02 {
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
