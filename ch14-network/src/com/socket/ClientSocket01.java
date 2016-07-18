/*
클라이언트 프로그램에서 임의의 서버로 데이터를 전송하여(ping 명령을 통해서) 응답이 돌아오기까지의 평균응답시간을 알아내기


//----------------------------------
Runtime 클래스
자바 버추얼 머신이 작동하는 시스템과의 인터페이스를 제공하는 클래스
자바 클래스가 아닌 운영체제 기반의 프로그램을 실행시키거나 운영체제에 대한 정보를 제공하는 클래스

런타임(Runtime) 오브젝트(object)라는 객체 존재
• 자바 버추얼 머신(JVM)이 작동하는 시스템과의 인터페이스를 제공하는 객체
• 자바 클래스가 아닌 운영체제 기반의 프로그램 실행하거나 운영체제에 대한 정보 제공

*/
package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientSocket01 {

	public static void main(String[] args) {
		
		//ping을 수행할 임의의 서버 지정
		String ip = "yahoo.com";
		//ping 명령 수행후 결과 저장할 문자열
		String pingResult ="";
		//ping 명령어 구문
		String pingCmd = "ping " + ip;
		
		try{
			//Runtime 오브젝트는 자바 프로그램이 실행되면 생성되는 객체이므로 new키워드를 통해 생성할 수 없으므로
			//static 클래스의 static메소드인 getRuntime()를 사용하여 Runtime 오브젝트를 생성합니다.
			Runtime runtime = Runtime.getRuntime();
			//ping 명령 수행되고 있는 프로세스 가져오기
			//exec()는 외부명령을 실행시켜줍니다, ping명령을 실행합니다.
			Process process = runtime.exec(pingCmd);
			//실행결과를 가져오기 위해 InputStream으로 가져오기
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String inputLine;
			//입력줄을 받았을 때 null이 아닌 동안 반복
			while( (inputLine=input.readLine())!=null ){

				System.out.println(inputLine);
				pingResult += inputLine;
			}

			//자원 정리
			input.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}


//출력결과
//Ping yahoo.com [206.190.36.45] 32바이트 데이터 사용:
//206.190.36.45의 응답: 바이트=32 시간=161ms TTL=48
//206.190.36.45의 응답: 바이트=32 시간=166ms TTL=48
//206.190.36.45의 응답: 바이트=32 시간=162ms TTL=48
//206.190.36.45의 응답: 바이트=32 시간=175ms TTL=48
//
//206.190.36.45에 대한 Ping 통계:
//    패킷: 보냄 = 4, 받음 = 4, 손실 = 0 (0% 손실),
//왕복 시간(밀리초):
//    최소 = 161ms, 최대 = 175ms, 평균 = 166ms
