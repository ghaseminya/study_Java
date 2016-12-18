package com.stringbufferex;
/*
//StringBuffer클래스를 통한 문자열 추가
//	• 문자열 버퍼 객체
//	• 문자열 추가 변경 가능
//	• append() 메서드를 이용하여 문자(열) 추가

//--------------------
StringBuffer 클래스
	• 문자열 버퍼 객체
	• 문자열 추가 변경 가능
	• append() 메서드를 이용하여 문자(열) 추가
	
str.append("일지매");

*/
public class StringBufferEx01 {

	public static void main(String[] args) {

		//StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer("Code");
		
		//문자열 추가
		//sb1에 문자열이 추가되어도 참조값에는 변함이 없습니다.
		StringBuffer sb2 = sb1.append(" Dragon"); //sb1의 참조값을 sb2에 저장
		String str = null;
		
		if(sb1 == sb2)
			str = "sb1와 sb2는 서로 같습니다.";
		else
			str = "sb1와 sb2는 서로 다릅니다.";
		
		System.out.println(str); 		   //sb1와 sb2는 서로 같습니다.
		
		//StringBuffer 객체의 내용을 String으로 변환합니다. 
		str = sb1.toString();
		System.out.println("sb1: " + str); //sb1: Code Dragon
		
		str = sb2.toString();
		System.out.println("sb2: " + str); //sb2: Code Dragon

	}
}
