package com.stringbufferex;
/*
//StringBuffer - 문자열 변경

//학습내용
//• 객체 생성
//• 특정 인덱스에 문자 삽입
//• 문자열 끝에 문자열 붙이기
//• 문자열 대체
//• 문자열 삭제
//• 문자열 변경완료후 스트링으로 저장하기


*/
public class StringBufferEx02 {

	public static void main(String[] args) {
		//자바     정말     쉽다!!
		//01 2 34 5 6789
		StringBuffer sb = new StringBuffer("자바 정말 쉽다!!");
		//자바  정말  쉽다!!
		//012 345 6789
		System.out.println("1: " + sb); //1: 자바 정말 쉽다!!
		
		//특정 인덱스에 문자 삽입
		sb.insert(2, '는'); //offset 위치에 char 데이터를 삽입합니다. 
		System.out.println("2: " +sb); //2: 자바는 정말 쉽다!!
		
		//문자열 끝에 문자열 붙이기
		sb.append("오라클은"); //문자열 데이터를 현재 문자열 끝에 추가합니다. 
		System.out.println("3: " +sb); //3: 자바는 정말 쉽다!!오라클은
				
		sb.append(" 재미있다");
		System.out.println("4: " +sb); //4: 자바는 정말 쉽다!!오라클은 재미있다
		
		//문자열 대체
		//StringBuffer replace(int start, int end, String str) : start에서 end(n-1)의 문자열을 str 문자열로 대체하여 반환합니다. 
		sb.replace(0,  3, "Android"); //start(n), end(n-1)
		System.out.println("5: " +sb); //5: Android 정말 쉽다!!오라클은 재미있다
		
		//문자열 삭제
		//Android 
		//01234567
		//StringBuffer delete(int start, int end): start에서 end(n-1)까지의 문자열 중에서 삭제한 문자열을 반환합니다. 
		sb.delete(0, 8); //start(n), end(n-1)
		System.out.println("6: " +sb); //6: 정말 쉽다!!오라클은 재미있다
		
		//문자열 변경완료후 스트링으로 저장하기
		String str = sb.toString();
		System.out.println("7: " +str); //7: 정말 쉽다!!오라클은 재미있다
		
	
	}
}
