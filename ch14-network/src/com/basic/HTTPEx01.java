//서버쪽에 있는 index.jsp의 정보를 POST방식으로 가져오는 프로그램


package com.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class HTTPEx01 {

	public static void main(String[] args) throws Exception {
		//한글의경우 인코딩을 해야 하며, 서버쪽에서 따로 디코딩을 할 필요는 없습니다.
		//하지만 스트링 객체 생성시 UTF-8로 인코딩을 변경해 주어야 합니다.
		//import java.net.URLEncoder; 운영체제마다  문자를 인식하는 방법이 달라 이를 해결하기 위한 클래스
		//encode(): 데이터를 웹 서버에서 요구하는 데이터 형식으로 바꾸는 기능하는 메소드
		String str = URLEncoder.encode("한글", "UTF-8");
		
		//import java.net.URL;
		//로컬에 톰켓 설치한 후 톰켓의 기본 페이지를 통해 테스트
//		URL url = new URL("http://localhost:8080/index.jsp");
		//Public 웹 서버를 통해 테스트
		URL url = new URL("http://www.hrd.go.kr/jsp/HRDP/main/index.jsp");

		//HttpURLConnection 객체 생성
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//입력스트림과 출력 스트림사용유무 설정
		conn.setDoInput(true); //입력상태 설정
		conn.setDoOutput(true); //출력상태 설정
		//캐시 사용유무 설정
		conn.setUseCaches(false);
		//Timeout설정, 20분후 타입아웃되도록 설정
		conn.setReadTimeout(20000); //20,000 밀리세컨드초(ms) = 20분
		//요청을 POST방식으로 처리
		conn.setRequestMethod("POST");
//		conn.setRequestMethod("GET");
		
		//POST(GET)요청에 대해 Request로 받아 데이터를 쓰기 위해
		//출력을 하기위한 출력 스트림 객체 생성
		OutputStream out = conn.getOutputStream();
		OutputStreamWriter writer = new OutputStreamWriter(out);
		
		writer.write("title: " + str);
		writer.write("&subTitle: " + str + "2");
		
		writer.close();
		out.close();
		
		
		//서버에에서 응답을 받는 부분
		
		StringBuffer stringBuffer = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		//BufferedReader로 라인을 읽어 들였을 때 그 라인에 null값이 있을 때 빠져나가도록 구현
		for(;;){
			//한라인씩 읽어서 저장
			String line = br.readLine();
			
			// null값이 있을 때 빠져나가도록 구현
			if(line==null)
				break;
			
			stringBuffer.append(line + "\n");
		}
		
		br.close();
		conn.disconnect();
		
		String getXml = stringBuffer.toString();
		System.out.println(stringBuffer.toString());
	} //main

} //HTTPEx01
