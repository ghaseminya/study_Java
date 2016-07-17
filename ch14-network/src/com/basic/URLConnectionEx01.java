//URLConnection객체 생성 및 정보 추출하는 프로그램

package com.basic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionEx01 {

	public static void main(String[] args) {

		//객체 선언
		URL url = null;
		URLConnection uc = null;
		
		try{
			//URL 객체 생성
			url = new URL("http://www.naver.com");
		}catch(MalformedURLException e){ //잘못된 형식의 URL 사용시 예외처리
			e.printStackTrace();
		}
		
		try{
			//URL객체의 openConnection()를 통해 URLConnection 객체 생성
			uc = url.openConnection();
			uc.connect();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//서버에 접속한 후 연결정보
		System.out.println("uc: " + uc.toString());
		//사용자와의 응답 설정
		System.out.println("Interaction: " + uc.getAllowUserInteraction());
		
		try{
			//응답부문의 미디어 타입 출력
			System.out.println("content: " + uc.getContent());
		}catch(IOException e){
			e.printStackTrace();
		}
		//인코딩되는 형식 확인
		System.out.println("encoding: " + uc.getContentEncoding());
		//컨텐츠의 길이 확인
		System.out.println("length: " + uc.getContentLength());
		//컨텐츠 타입 확인
		System.out.println("type: " + uc.getContentType());
		//날짜 확인, 언제 문서가 전송되었는지를 나타내는 long 타입을 반환하는 메소드
		//이 값은 그리니치 표준시, 1970년 1월 1일 이후로 문서가 전송된 시간까지를 밀리초로 나타낸 값입니다.
		System.out.println("date: " + uc.getDate());
		//문서 전송 시간, 날짜 형식으로 변환하여 다시 출력하기
		System.out.println("date(Date): " + new Date(uc.getDate()));
	}
}


//출력결과
//uc: sun.net.www.protocol.http.HttpURLConnection:http://www.naver.com
//Interaction: false
//content: sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@70dea4e
//encoding: null
//length: -1
//type: text/html; charset=UTF-8
//date: 1468724442000
//date(Date): Sun Jul 17 12:00:42 KST 2016
