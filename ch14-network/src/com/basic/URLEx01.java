/* URL - URL의 다양한 정보 출력
 *  
 */

package com.basic;

import java.net.URL;
import java.net.MalformedURLException;

public class URLEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try{
			//URL객체 생성
			URL url = new URL("http://java.sun.com/index.jap?name=hongjildong#content");	
			//URL url = new URL("http://java.sun.com:80/index.jap?name=kim#content");
			//형식이 안맞는 경우 ERROR 그러므로 try~catch()해 줘야 함, MalformedURLException import해주고 try~catch
			//ERROR:Unhandled exception type MalformedURLException
			
			//URL 정보 출력
			System.out.println("프로토콜:\t" + url.getProtocol());
			System.out.println("호스트:\t\t" + url.getHost());
			//포트번호 명시안한 형태에서 포트번호 출력
			//포트번호 명시후 포트번호 출력			
			System.out.println("포트번호:\t" + url.getPort());
			//default포트 표시
			System.out.println("default포트번호:" + url.getDefaultPort());
			
			System.out.println("패스:\t\t" + url.getPath());
			System.out.println("요청한 파일자원 정보:\t" + url.getFile());
			System.out.println("쿼리:\t\t" + url.getQuery()); 
			
			// 앵커포인트 = 레퍼런스
			System.out.println("레퍼런스:\t" + url.getRef());
			
			
		}catch(MalformedURLException e){ e.printStackTrace(); }
	}
}