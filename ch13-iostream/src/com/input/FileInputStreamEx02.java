/* FileInputStream - 영문/한글 출력 - byte[]배열 이용, 자원정리
 * 
 * 파일을 읽어옮
 * 한 바이트씩 읽어들이기 때문에 아스키코드로 저장되는 것 출력하여 확인/확인후 주석처리
 * 
 * byte[]을 String으로 파싱
 * 
 * 자원 정리 Standard
 * -----------------------------------------------------------------------
 * 자바 외적인 요소랑 연동할 경우 자원정리
 * 객체를 생성해서 접근
 * 객체를 생성한후 소명을 못시키므로 파일연결후에도 파일연결가능상태가 계속 지속됨(이럴경우 부하가 발생할 수 있음)
 * 그래서, 객체와 파일과의 관계를 끊어 자원정리를 해줌
 * 
 */

package com.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamEx02 {
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
			
			//한 바이트씩 읽어들이기 때문에 아스키코드로 저장하게됨
//			for(byte b : readArray){ System.out.print(b); System.out.println(); }
			
			//byte[]을 String으로 파싱
			//내부적으로 2byte로 처리하게 됨
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
