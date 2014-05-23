/* URL - URL.openStream()
 * 
 * URL을 통해 해당 서버 접근
 * Openstream호출해서 InputStream형태로 저장후
 * InputStreamReader에 넘길때 인코딩 방식 지정안하고 
 * readline()을 통해 출력
 * 
 * 
 * InputStreamReader에 넘길때 인코딩 방식 지정후
 * readline()을 통해 출력
 * ---------------------------------------------------------------------
 * 
 * 
 * 인코딩 방식이 맞지 않으면 데이터가 깨질수 있음
 * 방식이 다른 경우 명시적으로 지정해 줘야 합니다.
 * 
 */


package com.basic;

import java.net.URL;
import java.net.UnknownHostException;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class URLEx02 {	
	public static void main(String[] args){
		String address = "http://www.naver.com/index.html";
		URL url = null;
		BufferedReader input = null;		
		String line ="";
		
		try{
			//주소를 읽어옴
			url = new URL(address);
			//주소를 통해 URL을 읽어와 InputStream을 얻어오기위해 openStream()을 호출
			InputStream in =  url.openStream();
			//BufferedReader객체 생성
			//input = new BufferedReader(new InputStreamReader(in));
			//인코딩 방식 지정
			input = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			
			
			while( (line=input.readLine())!=null ){
				//줄바꿈
				System.out.println(line);
			}			
			
		}catch(MalformedURLException e){
			e.printStackTrace();		
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
			
		}finally{
			if( input!= null){ try{input.close();}catch(IOException e){e.printStackTrace();} }			
		}		
	}
}
