package com.io02.filestream;
/* 
FileInputStream - 영문/한글 출력
byte[]배열 이용, 자원정리


강의 내용
	• 파일을 읽어오기
	• 한 바이트씩 읽어들이기 때문에 아스키코드로 저장되는 것 출력하여 확인/확인후 주석처리
	• byte[]을 String으로 파싱
	• 자원 정리 Standard


-----------------------------------------------------------------------

 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileIOStreamEx02 {
	public static void main(String[] args){
		
		FileInputStream fis = null;
		byte readArray[];
		
		try{
			//byte처리를 하는 FileInputStream객체를 생성
			fis = new FileInputStream("file.txt");
		
			//영문이외의 문자도 처리가능하도록 처리 - 입력된 데이터를 byte배열에 저장한 후 String로 파싱
			//available()읽어들인 데이터를 자동적으로 인덱스 수를 반환
			readArray = new byte[fis.available()];
			
			//입력된 데이터를 읽어들여 byte[]에 저장
			//내부적으로 loop
			fis.read(readArray);
			
			//한 바이트씩 읽어들이기 때문에 내부적으로 아스키코드로 저장되어있어 한바이트씩 출력할 경우 
			//아스키코드로 출력됩니다. 
//			for(byte b : readArray){ 
//				System.out.print(b); System.out.println(); }
			
			//byte[]을 String으로 파싱하면
			//내부적으로 2byte로 처리하게 되어 정상적으로 문자열이 출력됩니다.
			System.out.println(new String(readArray));			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();			
		}catch(IOException e){
			e.printStackTrace();			
		}finally{	//자원 정리 Standard
			//객체가 있는지 체크
			if( fis != null ){
				//IOException발생할 수 있으므로 try~catch
				try{
					fis.close();					
				}catch(IOException e){
					e.printStackTrace();
				}
			}			
		}		
	}
}
