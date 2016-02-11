/* 
FileInputSteam 영문 출력 - 파일정보를 한문자씩 읽은후 처리, 자원정리
  
 -----------------------------------------------------------------------
 자바 외적인 요소랑 연동할 경우 자원정리
 객체를 생성해서 접근
 객체를 생성한후 소멸을 못시키므로 파일연결후에도 파일연결가능상태가 계속 지속됨(이럴경우 부하가 발생할 수 있음)
 그래서, 객체와 파일과의 관계를 끊어 자원정리를 해줌
 
 */

package com.io1.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStreamEx01 {
	public static void main(String[] args){
		FileInputStream fis = null;
		int readbyte = 0;
		
		try{
			//파일을 읽어옮
			fis = new FileInputStream("file.txt");
			
			//파일의 정보를 한문자씩 읽어들여 아스키코드로 반환
			//영문이외의 문자는 깨짐			
			//-1이면 문서의 끝(EOF)이므로 while을 빠져나옴
			while( (readbyte=fis.read()) !=-1){
				//아스키값이기 때문에 (char)로 캐스팅
				System.out.print( (char)readbyte );
			}			
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
