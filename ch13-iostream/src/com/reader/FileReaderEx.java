/* FileReader
 * 
 * file.txt에 한글과 영문으로된 내용을 입력 
 * 파일명을 입력받아 FileReader 객체 생성
 * 파일로부터 데이터를 한 문자씩 읽어들여 유니코드로 반환
 * 유니코드를 char로 출력
 * 자원 관리 
 */

package com.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReaderEx {
	public static void main(String[] args){
		
		FileReader fr = null;
		int readChar;
		
		try{
			//파일명을 입력받아 FileReader 객체 생성
			fr = new FileReader("file.txt");
			
			//파일로부터 데이터를 한 문자씩 읽어들여 유니코드로 반환
			while( (readChar=fr.read()) != -1){
				System.out.print( (char)readChar );
			}			
		}catch(FileNotFoundException e){
			e.printStackTrace();			
		}catch(IOException e){
			e.printStackTrace();			
		}finally{	//자원관리
			if( fr != null) { try{fr.close(); }catch(IOException e){ e.printStackTrace();} }			
		}
	}
}