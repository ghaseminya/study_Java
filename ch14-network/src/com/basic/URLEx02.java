package com.basic;
/* URL - URL.openStream()
//접속한 URL에 대한 HTML 문서의 내용 출력하기
//URL 클래스와 스트림 클래스를 사용하여 해당 URL의 내용을 읽어오는 프로그램

TODO 1: URL을 통해 해당 서버 접근
Openstream호출해서 InputStream형태로 저장후
InputStreamReader에 넘길때 인코딩 방식 지정안하고 
readline()을 통해 출력

TODO 2: InputStreamReader에 넘길때 인코딩 방식 지정후
readline()을 통해 출력

TODO 1후 결과 확인한 것과 TODO 2후 결과확인한 결과는 동일
//---------------------------------------------------------------------
인코딩 방식이 맞지 않으면 데이터가 깨질수 있습니다. 
그러므로, 방식이 다른 경우 명시적으로 지정해 줘야 합니다.
*/


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
		String line =""; //행단위로 읽은 문자열 임시 저장
		
		try{
			//주소를 읽어와 URL 객체 생성
			url = new URL(address);
			
			//URL 객체로부터 스트림을 얻습니다.
			//주소를 통해 URL을 읽어와 InputStream을 얻어오기위해 openStream()을 호출
			InputStream in =  url.openStream();
			
			//BufferedReader객체 생성, (Reader 클래스이므로 문자단위 처리가 가능)
			//TODO 1: 스트림을 인자로 하여 BufferedReader클래스에 연결합니다. 
			//이 클래스는 문자단위 입출력이 가능하므로 스트림으로부터 얻어온 데이터를 문자열로 읽어낼 수 있습니다
			input = new BufferedReader(new InputStreamReader(in));
			
			//TODO 2: 인코딩 방식 지정
//			input = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			
			//행 단위로 문자열을 읽어 내용이 없을 때까지 반복하여 화면에 출력하기
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
			if( input!= null){ 
				try{input.close();}catch(IOException e){e.printStackTrace();} }			
		}		
	}
}
