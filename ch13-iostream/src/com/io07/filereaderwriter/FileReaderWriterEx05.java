package com.io07.filereaderwriter;
/* FileWriter
//특정 문자열을 저장하는 텍스트 파일 생성하기 

*/

import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx05 {
	
	public static void main(String[] args){
		
		FileWriter fw = null;
		
		try{
			//객체 생성
			fw = new FileWriter("fileWriter.txt");
			
			String message = "FileWriter 테스트 중입니다.";
			//파일에 쓰기
			fw.write(message);
			System.out.println("파일 생성 및 내용 기술");
		}catch(IOException e){
			e.printStackTrace();			
		}finally{	//자원관리
			if( fw !=null ){ 
				try{ fw.close();}catch(IOException e){e.printStackTrace();}  }			
		}		
	}	
}
