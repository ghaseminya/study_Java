/* BufferedWriter
BufferedWriter 클래스를 이용하여 파일 생성 및 내용 추가하기

 * import
 * 객체 생성 
 * 저장이 버퍼에 저장됨
 * 줄바꿈 / 메서드를 통해 줄바꿈
 * 자원관리
 * 
 */
package com.buffered;

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
			//저장이 버퍼에 저장됨
			bw.write("BufferedWirter Test입니다.");
			//줄바꿈
			bw.newLine();
			//메서드를 통해 줄바꿈
			bw.write("안녕하세요" + System.getProperty("line.separator") + "Hello BufferedWriter");
			
			//close()메서드가 버퍼에 남아있는 내용을 파일에 전송하고 버퍼를 비움
			//bw.flush();
			System.out.println("파일생성 및 내용 기술");
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{	//자원관리 
				if( bw!=null ){ try{bw.close();}catch(IOException e){e.printStackTrace();} }
				if( fw!=null ){ try{fw.close();}catch(IOException e){e.printStackTrace();} }
		}
	}
}
