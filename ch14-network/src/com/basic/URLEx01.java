package com.basic;
/* URL - URL의 다양한 정보 출력


URL 클래스
	• URL(Uniform Resource Locator)이란 인터넷에서 접근 가능한 자원의 주소를 표현하는 형식
	• URL을 이용하여 인터넷 상의 다양한 프로토콜과 자원을 표기할 수 있습니다.
	• URL 클래스는 URL을 추상화 하여 만든 클래스로 원격 서버 자원의 결과를 가져옵니다. 
	• 인터넷상의 자원을 경로로 지정하여 필요한 정보를 추출할 수 있게 해주는 클래스


[URL의 구성요소]
프로토콜://호스트주소:[포트번호]/파일#섹션
http://codedragon.tistory.com:80/member/mem.jsp?name=hong#content

형식			구성요소		URL주소
schema://	protocol	http://
authority	host		codedragon.tistory.com
port		port		:80
path?		path		/member/mem.jsp
query#		query		?name=hong#
fragment	reference	content


//----------------------------------------------
//출력결과 - 포트번호 명시안한 경우
프로토콜: http
호스트명: java.sun.com
포트번호: -1
default포트번호: 80
패스: /index.jap
요청한 파일자원 정보: /index.jap?name=hongjildong
쿼리: name=hongjildong
레퍼런스: content

//출력결과 - 포트번호 명시한 경우
프로토콜: http
호스트명: java.sun.com
포트번호: 80
default포트번호: 80
패스: /index.jap
요청한 파일자원 정보: /index.jap?name=kim
쿼리: name=kim
레퍼런스: content
 */


import java.net.URL;
import java.net.MalformedURLException;

public class URLEx01 {

	public static void main(String[] args) {
		
		try{
			//URL객체 생성
//			URL url = new URL("http://java.sun.com/index.jap?name=hongjildong#content");	
			URL url = new URL("http://java.sun.com:80/index.jap?name=kim#content");
			//형식이 안맞는 경우 ERROR 그러므로 try~catch()해 줘야 합니다. 
			//MalformedURLException import해주고 try~catch 감싸줍니다.
			//ERROR:Unhandled exception type MalformedURLException
			
			//URL 정보 출력
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트명: " + url.getHost());
			
			//포트번호 명시안한 형태에서 포트번호 출력
			//포트번호 명시후 포트번호 출력			
			System.out.println("포트번호: " + url.getPort());
			//default포트 표시
			System.out.println("default포트번호: " + url.getDefaultPort());
			
			System.out.println("패스: " + url.getPath());
			System.out.println("요청한 파일자원 정보: " + url.getFile());
			System.out.println("쿼리: " + url.getQuery()); 
			
			// 앵커포인트 = 레퍼런스 = 섹션번호
			System.out.println("레퍼런스: " + url.getRef());
			
			
		}catch(MalformedURLException e){ e.printStackTrace(); }
	}
}