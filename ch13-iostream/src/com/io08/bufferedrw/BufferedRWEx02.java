package com.io08.bufferedrw;
/* BufferedWriter
//BufferedWriter 클래스를 이용하여 파일 생성 및 내용 추가하기

import
객체 생성 
저장이 버퍼에 저장됨
줄바꿈 / 메서드를 통해 줄바꿈
자원관리

File Info
BufferedRWEx02.java			BufferedWriter 	소스 파일
bufferedWirter.txt			생성된 결과 파일


//------------------------------------------

BufferedWriter
	• 바이트 출력 스트림의 BufferedOutputStream과 동일한 기능을 제공하며,
	• 문자 출력 스트림의 효율적인 버퍼링을 기능을 제공합니다.

*/


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWEx02 {

	public static void main(String[] args) {		
		
		FileWriter fw  = null;
		BufferedWriter bw = null;
		
		try{
			//객체 생성
			fw = new FileWriter("bufferedWirter.txt");
			bw = new BufferedWriter(fw);
			
			//저장시 버퍼에 저장됩니다.
			bw.write("BufferedWirter Test입니다.");
			//줄바꿈
			bw.newLine();
			//메서드를 통해 줄바꿈
			bw.write("안녕하세요" + 
					System.getProperty("line.separator") + "Hello BufferedWriter");
			
			//flush()메서드가 버퍼에 남아있는 내용을 파일에 전송하고 버퍼를 비워줍니다.
			//bw.flush();
			System.out.println("파일생성 및 내용 기술");
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{ //자원관리 
				if( bw!=null ){ try{bw.close();}catch(IOException e){e.printStackTrace();} }
				if( fw!=null ){ try{fw.close();}catch(IOException e){e.printStackTrace();} }
		}
	}
}
