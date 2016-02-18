package com.io02.filestream;
/* 
FileInputSteam - 영문 출력

 
TODO : 파일정보를 한문자씩 읽은후 처리
TODO : 자원정리

//-----------------------------------------------------------------------

FileInputStream
	• FileInputStream은 시스템에 있는 모든 파일을 읽을 수 있는 기능을 제공하는 클래스
	• 파일을 읽을 때는 파일의 경로와 파일 객체를 생성자의 매개 변수로 설정하여 FileInputStream객체를 생성할 수 있습니다.
	• 만약, 파일이 존재하지 않으면 FileNotFoundException을 발생하게 됩니다.

//-----------------------------------------------------------------------

 자바 외적인 요소랑 연동할 경우 자원정리 필요
• 객체를 생성해서 외부 자원에 접근
• 객체를 생성한후 소멸을 못시키므로 파일연결후에도 파일연결가능상태가 계속 지속되게 됩니다.(이럴경우 부하가 발생할 수 있음)
• 그래서, 객체와 파일과의 관계를 끊어 자원정리를 해줍니다 (close()메소드 사용)
 
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStreamEx01 {
	public static void main(String[] args){
		FileInputStream fis = null;
		int readbyte = 0;
		
		try{ //TODO : 파일정보를 한문자씩 읽은후 처리
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
		}finally{ //TODO : 자원 정리 Standard
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
